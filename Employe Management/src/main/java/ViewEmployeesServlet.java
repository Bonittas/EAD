import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/viewEmployees")
public class ViewEmployeesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ViewEmployeesServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Employee> employees = new ArrayList<>();

        try {
            Connection connection = DBUtil.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM employees";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String designation = resultSet.getString("designation");
                double salary = resultSet.getDouble("salary");
                Employee employee = new Employee(id, name, designation, salary);
                employees.add(employee);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("employeeList", employees); // Update the attribute name to "employeeList"
        request.getRequestDispatcher("view_employees.jsp").forward(request, response);
    }
}
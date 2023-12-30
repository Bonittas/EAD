package Calculator;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/DivisionServlet")
public class DivisionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));

        if (num2 != 0) {
            double result = num1 / num2;
            request.setAttribute("result", result);
        } else {
            request.setAttribute("result", "Cannot divide by zero");
        }

        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
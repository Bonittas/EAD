package Calculator;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


//
//@WebServlet("/OperationServlet")
public class OperationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operation = request.getParameter("operation");

        if ("addition".equals(operation)) {
            request.getRequestDispatcher("/AdditionServlet").forward(request, response);
        } else if ("subtraction".equals(operation)) {
            request.getRequestDispatcher("/SubtractionServlet").forward(request, response);
        } else if ("multiplication".equals(operation)) {
            request.getRequestDispatcher("/MultiplicationServlet").forward(request, response);
        } else if ("division".equals(operation)) {
            request.getRequestDispatcher("/DivisionServlet").forward(request, response);
        }
    }
}
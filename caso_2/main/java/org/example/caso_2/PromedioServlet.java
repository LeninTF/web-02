package org.example.caso_2;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/PromedioServlet")
public class PromedioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double c1 = Double.parseDouble(request.getParameter("c1"));
        double c2 = Double.parseDouble(request.getParameter("c2"));
        double c3 = Double.parseDouble(request.getParameter("c3"));

        double promedio = (c1 + c2 + c3) / 3;

        String estado;
        if (promedio >= 11) {
            estado = "Aprobado";
        } else {
            estado = "Desaprobado";
        }

        request.setAttribute("promedio", promedio);
        request.setAttribute("estado", estado);

        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
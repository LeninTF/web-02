import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registro")
public class registro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String tema = request.getParameter("tema");
        String turno = request.getParameter("turno");
        String comentarios = request.getParameter("comentarios");

        if (comentarios == null || comentarios.trim().isEmpty()) {
            comentarios = "Sin comentarios adicionales";
        }

        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<title>Confirmación de registro</title>");

            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background: #f4f6f8; margin: 0; padding: 0; }");
            out.println(".contenedor { width: 70%; max-width: 800px; margin: 40px auto; background: white; padding: 30px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
            out.println("h1 { color: #198754; }");
            out.println("table { width: 100%; border-collapse: collapse; margin-top: 20px; }");
            out.println("th, td { border: 1px solid #ccc; padding: 10px; text-align: left; }");
            out.println("th { background: #f0f0f0; }");
            out.println("a { display: inline-block; margin-top: 20px; text-decoration: none; background: #0d6efd; color: white; padding: 10px 16px; border-radius: 6px; }");
            out.println("</style>");

            out.println("</head>");
            out.println("<body>");
            out.println("<div class='contenedor'>");
            out.println("<h1>Registro completado correctamente</h1>");
            out.println("<p>Gracias por registrarte al taller. Tus datos son los siguientes:</p>");

            out.println("<table>");
            out.println("<tr><th>Campo</th><th>Valor</th></tr>");
            out.println("<tr><td>Nombre completo</td><td>" + nombre + "</td></tr>");
            out.println("<tr><td>Correo electrónico</td><td>" + correo + "</td></tr>");
            out.println("<tr><td>Tema de interés</td><td>" + tema + "</td></tr>");
            out.println("<tr><td>Turno</td><td>" + turno + "</td></tr>");
            out.println("<tr><td>Comentarios</td><td>" + comentarios + "</td></tr>");
            out.println("</table>");

            out.println("<p><strong>Mensaje del sistema:</strong> Tu registro fue enviado exitosamente.</p>");
            out.println("<a href='index.html'>Volver al formulario</a>");

            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
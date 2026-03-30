
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/SaludoServlet")
public class SaludoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String nombre = request.getParameter("nombre");
        String carrera = request.getParameter("carrera");

        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Resultado</title></head>");
        out.println("<body>");

        out.println("<div style='width:350px;margin:auto;padding:20px;border:1px solid black;border-radius:10px;text-align:center;margin-top:50px;'>");
        out.println("<h2>Resultado</h2>");
        out.println("<p>Hola <b>" + nombre + "</b>, bienvenido a la carrera de <b>" + carrera + "</b></p>");
        out.println("<br><a href='index.html'>Volver</a>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}

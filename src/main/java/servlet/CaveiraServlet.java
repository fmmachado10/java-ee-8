package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/caveira/")
public class CaveiraServlet extends HttpServlet  {

    private int contador;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doGet(req, resp);

        System.out.println("ok FABRICIO MOREIRA ");

    }




    /*
    public void init() throws ServletException {

        message = "Hello World";

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>" + message + "</h1>");
    }

    public void destroy() {

    }

*/

}

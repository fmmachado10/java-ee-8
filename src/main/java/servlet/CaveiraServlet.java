package servlet;

import cdi.ApplicationBean;
import cdi.RequestBean;
import cdi.SessionBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/caveira/")
public class CaveiraServlet extends HttpServlet {

    private int contador;

    @Inject
    private ApplicationBean applicationBean;

    @Inject
    private SessionBean sessionBean;

    @Inject
    private RequestBean requestBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doGet(req, resp);

        System.out.println("------------------------------------------------");


        System.out.println("ApplicationBean:" + applicationBean.contador);
        System.out.println("SesseionBean" + sessionBean.contador);
        System.out.println("RequestBean" + requestBean.contador);


        System.out.println("------------------------------------------------");

    }



    /*
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>" + message + "</h1>");
    }

    public void destroy() {

    }

*/

}

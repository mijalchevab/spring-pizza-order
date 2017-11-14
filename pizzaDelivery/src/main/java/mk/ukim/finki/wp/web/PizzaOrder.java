package mk.ukim.finki.wp.web;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PizzaOrder.do")
public class PizzaOrder extends HttpServlet {
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
        response.setContentType("text/html");
        String size = request.getParameter("size");
        PrintWriter writer = response.getWriter();
        request.getSession().setAttribute("size", size);
        RequestDispatcher rd = request.getRequestDispatcher("deliveryInfo.html");
        rd.forward(request, response);

    }
}


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscount", value = "/ProductDiscount")
public class ProductDiscount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Depsciption = request.getParameter("description");
        float Price = Float.parseFloat(request.getParameter("price"));
        float Discount = Float.parseFloat(request.getParameter("discount"));

        double Amount = Price*Discount*0.01;

        PrintWriter printWriter = response.getWriter();
        printWriter.print("<html>"+Amount+"</html>");




    }
}

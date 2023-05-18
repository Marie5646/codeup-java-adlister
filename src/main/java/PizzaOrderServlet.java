import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "PizzaOrder", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza_order.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userCrustType =req.getParameter("crustType");
        String userSauceType =req.getParameter("sauceType");
        String userSizeType = req.getParameter("sizeType");
        String userToppings = req.getParameter("form-check-input");
        System.out.println(userCrustType);
        System.out.println(userSauceType);
        System.out.println(userToppings);
        System.out.println(userSizeType);
        resp.sendRedirect("/pizza-order");

    }
}

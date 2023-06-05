package controllers;

import dao.DaoFactory;
import models.Ad;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//The CreateAdServlet is hosting the create.jsp file which is fetched through our doGet , the doPost has functionality to create new Ad using Ad class its gets parameters such as user id, ad title and ad description from the create.jsp file and then displaying them on page ,as well as import those ads created into the Ads database using getAdsDAo method and the insertAd method created in our Users Interface //

@WebServlet (name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("user") == null) {
            resp.sendRedirect("/login");
            // add a return statement to exit out of the entire method.
            return;
        }

        req.getRequestDispatcher("/WEB-INF/ads/create.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User loggedInUser = (User) req.getSession().getAttribute("user");

        Ad ad = new Ad(
        loggedInUser.getId(),
        req.getParameter("title"),
        req.getParameter("description")
        );
        DaoFactory.getAdsDao().insertAd(ad);
        resp.sendRedirect("/ads");
    }
}

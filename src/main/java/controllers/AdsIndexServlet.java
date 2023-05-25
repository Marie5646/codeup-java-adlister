package controllers;

import dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "controllers.AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD:src/main/java/controllers/AdsIndexServlet.java
        try {
            request.setAttribute("ads", DaoFactory.getAdsDao().all());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
=======
        request.setAttribute("ads", DaoFactory.getAdsDao().all());
>>>>>>> jdbc-exercise:src/main/java/AdsIndexServlet.java
        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
    }
}

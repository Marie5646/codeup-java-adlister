package controllers;

import dao.DaoFactory;
import models.Ad;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
    @WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
    public class LoginServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            if (request.getSession().getAttribute("user") != null) {
                response.sendRedirect("/profile");
                return;
            }
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // TODO: find a record in your database that matches the submitted password
            // TODO: make sure we find a user with that username
            // TODO: check the submitted password against what you have in your database


            if (validAttempt) {
                request.getSession().setAttribute("user", username);



                response.sendRedirect("/profile");
            } else {
                response.sendRedirect("/login");
            }





        }


package dao;

import models.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServler", urlPatterns = "/register")

public class RegisterServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/users/register.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String passwordConfirmation = request.getParameter("confirm_password");

        String hashWord = BCrypt.hashpw(password, BCrypt.gensalt());

        
        boolean inputHasErrors =
        username.isEmpty();
        email.isEmpty();
        password.isEmpty();
        final boolean b = !password.equals(passwordConfirmation);

        if (inputHasErrors){
            response.sendRedirect("/register");
        }


        User user = new User(username,email,hashWord);
        DaoFactory.getUserDao().insertUser(user);
        response.sendRedirect("/login");
        
    }






}




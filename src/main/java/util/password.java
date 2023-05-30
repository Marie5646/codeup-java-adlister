package util;
import org.mindrot.jbcrypt.BCrypt;

public class password {
    private static final int ROUNDS = 12;

    public static String hash(String password){
        return BCrypt.hashpw(password, BCrypt.gensalt(ROUNDS));
    }
}

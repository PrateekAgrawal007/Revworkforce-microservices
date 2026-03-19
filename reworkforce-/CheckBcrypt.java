import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CheckBcrypt {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java CheckBcrypt <password> <hash>");
            System.exit(1);
        }
        String password = args[0];
        String hash = args[1];
        BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
        System.out.println(enc.matches(password, hash));
    }
}

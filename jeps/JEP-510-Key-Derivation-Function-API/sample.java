import javax.crypto.KDF;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

class Sample {
    public static void main(String[] args) throws Exception {
        char[] password = "secret".toCharArray();
        byte[] salt = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
        PBEKeySpec spec = new PBEKeySpec(password, salt, 10000, 256);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        SecretKey key = factory.generateSecret(spec);
        System.out.println(key.getAlgorithm());
    }
}

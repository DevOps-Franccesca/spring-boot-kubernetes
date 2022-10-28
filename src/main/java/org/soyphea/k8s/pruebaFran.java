import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

public class test {

    public static void main(String[] args) {
      try
      {
        Cipher c1 = Cipher.getInstance("DES"); 

      }
      catch(NoSuchAlgorithmException|NoSuchPaddingException e)
      {
      }
    }
}

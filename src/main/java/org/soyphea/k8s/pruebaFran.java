import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

public class test {

    public static void main(String[] args) {
      try
      {
        Cipher c1 = Cipher.getInstance("DES"); 
        Cipher c7 = Cipher.getInstance("DESede"); 
        Cipher c13 = Cipher.getInstance("RC2"); 
        Cipher c19 = Cipher.getInstance("RC4"); 
        Cipher c25 = Cipher.getInstance("Blowfish"); 

        NullCipher nc = new NullCipher();
      }
      catch(NoSuchAlgorithmException|NoSuchPaddingException e)
      {
      }
    }
}

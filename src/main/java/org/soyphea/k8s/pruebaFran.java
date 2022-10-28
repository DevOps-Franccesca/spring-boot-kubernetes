import java.security.*;
import java.util.*;
  
public class GFG1 {
    public static void main(String[] argv)
    {
        try {
            SecureRandom sr = new SecureRandom();
            sr.setSeed(123456L); 
            int v = sr.next(32);
        }
  
        catch (NoSuchAlgorithmException e) {
  
            System.out.println("Exception thrown : " + e);
        }
        catch (ProviderException e) {
  
            System.out.println("Exception thrown : " + e);
        }
    }
}

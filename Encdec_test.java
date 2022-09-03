import java.util.*;
class encrypton
{
    String encrypt(int g)
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("--------------------------ENCRYPTION PART-----------------------------------------");
        String code ="";
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the Encryption Message");
        String text = s.nextLine();
        for(int i=0;i<text.length();i++)
        {
            char j = (char)((int)(text.charAt(i))+g) ;
           code = code + j; 
        }
        System.out.println("Encrypted Message: "+code+" And Key is "+g);
        return code;


    }
}
class decryption
{
    void decrypt(String code,int g)
    {
        System.out.println("\n\n\n\n");
        System.out.println("--------------------------DECRYPTION PART-----------------------------------------");
        String message ="";
      
      
        for(int i=0;i<code.length();i++)
        {
            char j = (char)((int)(code.charAt(i))-g) ;
           message = message + j; 
        }
        System.out.println("Decrypted Message: "+message);


    }
} 
public class Encdec_test
{
    public static void main(String[] args) 
    {
        Random rn = new Random();
        int g = rn.nextInt(500);
        String code;
        encrypton ec = new encrypton();
        decryption dc = new decryption();
        code = ec.encrypt(g);
        dc.decrypt(code,g);   
    }
}
import java.util.Scanner;
import com.dylanisensee.encryption.Coder;
public class AppDriver {

	public static void main(String[] args) {
		Coder c = new Coder();
		//Scanner keyboard = new Scanner(System.in);
		
		String str = "Hello World";
		String encryptedMsg = c.encrypt(str);
		System.out.println(encryptedMsg);
		String decryptedMsg = c.decrypt(encryptedMsg);
		System.out.println(decryptedMsg);
	}

}

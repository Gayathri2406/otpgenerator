
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AutheticationTest {

	public AutheticationTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException{
		MyEmailClient mailClient=new MyEmailClient();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int randomNum = new Random().nextInt(9000) + 1000;
		String otp=randomNum+"";
		String userName="gayavaradharaj27434@gmail.com";
		String apiKey="9205F98F8400BE7F47519274E635DFBF58D6FAF5256A66809366C28810F593DFA2C425F9EB6DB24108AAC774113CBA24";
		String from="gayavaradharaj27434@gmail.com";
		String fromName="Gayathri"; 
		String subject="My Authentication";
		String body=otp;
		String isTransactional="True";
		
		System.out.println("Enter Your Email Address");
		String to=br.readLine();
		mailClient.Send(userName, apiKey, from, fromName, subject, body, to, isTransactional);
		System.out.println("An OTP has been sent your Mail ID");
		System.out.println("Please Enter the OTP");
		String enteredOTP=br.readLine();
		if(otp.equals(enteredOTP)) {
			System.out.println("200");
		}else {
			System.out.println("401");
		}
		
	}

}

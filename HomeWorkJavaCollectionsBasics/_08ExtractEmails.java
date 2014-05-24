import java.awt.PageAttributes;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _08ExtractEmails {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
			String email =
					//"[\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}";
					"(([-_.]){0,1}([A-Za-z0-9]+))*@"
					+ "[A-Za-z]+([.-]{0,1}[A-Za-z]+)([.][A-Za-z]{2,})+";
			Pattern pattern = Pattern.compile(email);
			Matcher matcher = pattern.matcher(str);
			
			while (matcher.find()) {
				System.out.println(matcher.group());
			}
		}
	}


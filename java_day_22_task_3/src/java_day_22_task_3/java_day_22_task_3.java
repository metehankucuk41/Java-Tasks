package java_day_22_task_3;
import java.util.Scanner;

public class java_day_22_task_3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String name = "Mike";
		String pass = "Abc1";
		
		int tekrar = 0;
		while(tekrar<3)
		{
			System.out.print("Kullanıcı adınızı giriniz: ");
			String nickname = scanner.nextLine();
			System.out.print("Şifrenizi giriniz: ");
			String password = scanner.nextLine();
			if(nickname.equals("") && password.equals(""))
			{
				System.out.println("Kullanıcı adı ve şifre alanları boş bırakılamaz!");
			}
			else if(nickname.equals(""))
			{
				System.out.println("Kullanıcı adı boş bırakılamaz!");
			}
			else if(password.equals(""))
			{
				System.out.println("Şifre boş bırakılamaz!");
			}
			else if(nickname.equalsIgnoreCase(name) && password.equals(pass))
			{
				System.out.println("Kullanıcı başarıyla giriş yaptı");
				break;
			}
			else
			{
				System.out.println("Kullanıcı adı veya şifre geçerli değil. Lütfen tekrar deneyiniz.");
			}
			tekrar++;
		}
		scanner.close();

	}

}

import java.util.*;

public class Program {
	
	public static void main(String[] args) {
		
		System.out.println("First Easy Manual Java Project from Notepad");
		System.out.println(Arrays.toString(args));
		System.out.println("Введите команду: ");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		System.out.println("Вы ввели: " + answer);

	}

}

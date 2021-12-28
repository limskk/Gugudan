import java.util.Scanner;

public class GuGu2 {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은 ? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : " + number + "단");
		
		if(number < 2) {
			System.out.println("2단 미만은 출력되지 않습니다.");
		} else if (number >9) {
			System.out.println("9단 초과는 출력되지 않습니다.");
		} else {
			for(int i=1;i<=9;i++) {
				System.out.println(number + " * " + i + " = " + number*i);
			}
		}
		
		
	}

}

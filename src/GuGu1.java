
public class GuGu1 {
	public static void main(String args[]) {
		
		int n=2;
		int i=1;
		int j=1;
		
		
		if(n==2) {
			System.out.println("구구단" +n+"단");
			for(i=1;i<=9;i++) {
				j= n*i;
				System.out.println(n+"*"+i+"="+j);
			} 
			n = n+1;
			System.out.println();
		} if(n==3) {
			System.out.println("구구단" +n+"단");
			for(i=1;i<=9;i++) {
				j= n*i;
				System.out.println(n+"*"+i+"="+j);
			} 			
		}
		
	}

}

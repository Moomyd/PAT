import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int a = scanner.nextInt();
	    int b = scanner.nextInt();
	    scanner.close();
	    int sum = a + b;
	    if(sum < 0) {
	    	System.out.print("-");
	    	sum = 0 - sum;
	    }
	    if(sum >= 1000000) {
	    	System.out.printf("%d,%03d,%03d",sum/1000000,sum%1000000/1000,sum%1000);
	    }else if(sum >= 1000) {
	    	System.out.printf("%d,%03d", sum/1000,sum%1000);
	    }else {
	    	System.out.println(sum);
	    }
	    
	}
}

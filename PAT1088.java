import java.util.Scanner;

public class PAT1088 {
    static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    static String print(double a, double b) {
        if (a < b) {
            return "cong";
        } else if (a == b) {
            return "ping";
        } else if (a > b) {
            return "gai";
        }
        return null;
    }


    public static void main(String[] args){
        int m=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        boolean find =false;
        for(int a=99;a>=10;a--){
            double b=a%10*10+a/10;
            double c=b/y;
            if(c!=Math.abs((a-b)/x)){
                continue;
            }else{
                find=true;
                System.out.print(a+" "+PAT1088.print(m,a)+" "+PAT1088.print(m,b)+" "+PAT1088.print(m,c));
                break;
            }
        }if(!find){
            System.out.println("No solution");
        }


    }

}

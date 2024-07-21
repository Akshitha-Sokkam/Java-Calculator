package Practice;
import java.util.Scanner;
class calc{
	int n;
	public void mult() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for multiplication table");
		int n=sc.nextInt();
		
		int i=1;
		while(i<=10) {
			int k=n*i;
			System.out.println(n+"*"+i+"="+k);
			i++;
		}
	}
	
}

public class MultiplicationTable {

	public static void main(String[] args) {
		calc p=new calc();
		
		p.mult();
		
	}

}

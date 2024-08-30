
import java.util.Scanner;
public class Um {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int v[] = new int [10];
		int primo = 0, i =0, d = 0, q=0,cont=0;
		for(i=0;i<10;i++) {
			v[i] = in.nextInt();
		}
		
		for(i = 0, d = 1;i<10; i++) {
			while(d<=v[i]) {
				if(v[i]%d==0) {
					q++;
					d++;
					
				}
				else {
					d++;
				}
			}
			
			if(q==2) {
				System.out.println(v[i] +" é Primo");
			}else {
				System.out.println("Não é");
			}
			q=0;
			d=1;
		}	
	}
}

package TabularOutput;

import java.util.Scanner;
	public class TabularOutput {
	
	Scanner input = new Scanner(System.in);
		public void print() {
				int sum =0;
				int count = 1;
		
				System.out.println( "N\tN*10\tN*100\tN*1000\n" );
				while(count<=5) {
				System.out.println( count+"\t"+ 10*count +"\t" + 100*count +"\t"+ 1000*count+"\n");
				count++;
				}
		
		}
		
	}



package lab;

public class Pattern {
	public static void main(String args[]) {
		int i=0,j=0,n=4;
		for(i=0;i<=n;i++){
			for(j=0;j<2*n+1;j++){
				if(j>n+i||j < n-i) {
					System.out.print(" ");
				}
				else {
					if(j<=n){
						System.out.print(j-n+2*(i)+1);
					}
					if(j>n){
						System.out.print(n-j+2*(i)+1);
					}
				}
			}
			System.out.println();
		}
	}
}

package lab;

public class transpose{
	
	
	public static void main(String args[]){
		even_odd a = new transpose().new even_odd();
		a.arrop();
		a.printarr();
		
		matrix b = new transpose().new matrix();
		b.arrop();
		b.printtrans();
	
		
	}
	public class matrix{
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int trans[][]= new int[3][3];
		public void arrop(){
			int i=0,j=0;
			for(i=0;i<arr.length;i++) {
				for(j=0;j<arr[0].length;j++) {
					trans[i][j] = arr[j][i];
				}
			}
		}
		public void printtrans() {
			System.out.println("Printing Transpose");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(trans[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	public class even_odd extends matrix{
	int array[]= {1,2,3,4,5,6,7,8,9};
	int even[] = new int[array.length/2+1];
	int eventop=0;
	int odd[] = new int[array.length/2+1];	
	int oddtop=0;
	public void arrop(){
		for(int i=0;i<9;i++){
			if(array[i]%2==0){
				even[eventop] = array[i];
				eventop++;
			}
			else {
				odd[oddtop] = array[i];
				oddtop++;
			}
		}
	}
	public void printarr() {
		System.out.println("Printing Even array");
		for(int i=0;i<even.length;i++) {
			System.out.print(even[i] + " ");
			System.out.println();
			
		}
		System.out.println("Printing Odd array");
		for(int i=0;i<even.length;i++) {
			System.out.print(odd[i] + " ");
			System.out.println();
			
		}
		System.out.println();
	}
	
	}
}

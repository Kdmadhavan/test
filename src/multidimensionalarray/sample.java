package multidimensionalarray;

public class sample {

	public static void main(String[] args) {
		int marks[][]= {{55,65,85,95,75},{65,35,45,85,95}, {55,66,44,77,99},{33,33,44,55,66}};
		
	//	int mark[]= {55,95,64};
		
		System.out.println(marks[2][3]);
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<5;j++) {
				System.out.println( "marks["+i+"]{"+j+"]="+marks[i][j]);
			}
		}
	/*	00 01 02 03 04
		10 11 12 13 14
		20 21 22 23 24 */
		}
	}



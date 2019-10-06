package array;

public class TwoDimentionalArray {

	public static void main(String[] args) {
	String data[][]=new String[5][2];

	//row1
	data[0][0]="Username";
	data[0][1]="Password";
	//row2
	data[1][0]="Username1";
	data[1][1]="Password1";
	//row3
	data[2][0]="Username2";
	data[2][1]="Password2";
	//row4
	data[3][0]="Username3";
	data[3][1]="Password3";
	//row5
	data[4][0]="Username4";
	data[4][1]="Password4";
	
	
	for (int r=0;r<data.length;r++)
		//you can use 'debug as' for step by step execution
		
	{	
		for(int c=0;c<data[r].length;c++)//for(int c=0;c<data[0].length;c++)
			{
			System.out.print(data[r][c]+" ");//use +" " for space between row & column
		}
		System.out.println();
	}
	}
	

}

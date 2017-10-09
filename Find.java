package test10_9;

public class Find {

	public static void main(String[] args) {
		int[][] testarray=new int[4][4];
		testarray[0][0]=1;
		testarray[0][1]=2;
		testarray[0][2]=8;
		testarray[0][3]=9;
		testarray[1][0]=2;
		testarray[1][1]=4;
		testarray[1][2]=9;
		testarray[1][3]=12;
		testarray[2][0]=4;
		testarray[2][1]=7;
		testarray[2][2]=10;
		testarray[2][3]=13;
		testarray[3][0]=6;
		testarray[3][1]=8;
		testarray[3][2]=11;
		testarray[3][3]=15;
		System.out.println(find(testarray, 100));

	}
	
	//从右上角开始查找
	public static boolean find(int [][] arry,int number) {
		if(arry==null) {
			return false;
		}
		int column =arry[0].length-1;//获取有列数   
		int row=0;
		
		while(row<arry.length&&column>=0) {
			if(arry[row][column]==number)
				return true;
			
			if(arry[row][column]>number)
				column--;
			else
				row++;
			
		}
		
		return false;
		
	}

}

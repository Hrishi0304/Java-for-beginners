public class Test{
	public static void main(String[] args){
		int [][] arr={{1,3,5},{2,4,6}};
		int i,j;
 		for(i=0;i<arr.length;i++){
			for(j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
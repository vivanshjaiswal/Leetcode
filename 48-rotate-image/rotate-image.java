class Solution {
    public void rotate(int[][] matrix) {
        //This is the only optimal Solution which i can think is to 
        //find transpose and take down the reverse of the matrix..!!
        
        //Find transpose of the given Matrix--
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Find the reverse of the given Matrix--
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
    }
}
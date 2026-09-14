class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        for(int i=0; i<n-1; i++){
            for(int j =i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0; i<n; i++){
            int lp = 0; 
            int rp = n-1;
            while(lp<rp){
                int temp = matrix[i][lp];
                matrix[i][lp]= matrix[i][rp];
                matrix[i][rp]= temp;
                lp++;
                rp--;
            }
        }
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix[0].length ==1 && matrix.length==1){
            return;
        }
        boolean isZero = true;
        if(matrix.length == 1){
            for(int i=0; i<matrix[0].length; i++){
                if(matrix[0][i] == 0){
                    isZero = false;
                }
            }
            if(isZero == false){
                for(int i=0; i<matrix[0].length; i++){
                    matrix[0][i]=0;
                }
                return;
            }
            else{
                return;
            }
        }
        int col0 = 1;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                col0=0;
                break;
            }
        }
        for(int i=1; i<matrix[0].length; i++){
            if(matrix[0][i]==0){
                matrix[0][0]=0;
                break;
            }
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[0][j]==0 || matrix[i][0] == 0){
                    matrix[i][j] =0;
                }
            }
        }
        for(int i=matrix[0].length-1; i>=1; i--){
            if(matrix[0][0]==0){
                matrix[0][i]=0;
            }
        }
        for(int i=matrix.length-1; i>=0; i--){
            if(col0==0){
                matrix[i][0]=0;
            }
        }
    }
}
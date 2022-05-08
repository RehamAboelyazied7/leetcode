class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] rowsCount = new int[mat.length];
        int[] weakestRowsIndex = new int[k];
        int min;
        int minIndex;
        
        for(int i=0; i<mat.length; i++){
            for(int j=0 ;j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    rowsCount[i]++;
                }else{
                    break;
                }
            }
        }
        for(int i=0; i<k; i++){
            min = rowsCount[0];
            minIndex =0;
            for(int j= 0; j<rowsCount.length; j++){
                if(rowsCount[j]<min){
                   minIndex = j;
                   min = rowsCount[j];   
                }    
            }
            rowsCount[minIndex] = Integer.MAX_VALUE;
            weakestRowsIndex[i] = minIndex;
        }
        return weakestRowsIndex;
    }
}
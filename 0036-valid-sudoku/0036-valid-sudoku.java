class Solution {
    public boolean isValidSudoku(char[][] arr) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(arr[i][j]!='.'){
                    int num=(int)(arr[i][j]);
                    if(!set.add(num+"at row"+i)||!set.add(num+"at col"+j)||!set.add(num+"in box"+(i/3)+" "+(j/3))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
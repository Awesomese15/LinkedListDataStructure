package com.home;

/*Given a m x n matrix, if an element is 0, set its entire row and column to 0. */
public class ReplaceZeroInMatrix {
    public static void main(String args[]) {
        int[][] multiArray = {{1, 0, 3}};

        boolean firstRow= false;
        boolean firstCol= false;


        for (int i = 0; i < multiArray[0].length; i++) {
                if(multiArray[0][i]==0){
                    firstRow=true;
                    break;
                }
        }

        for (int j = 0; j < multiArray.length; j++) {
            if(multiArray[j][0]==0){
                firstCol=true;
                break;
            }
        }

        for(int k=1; k< multiArray.length; k++){
            for(int l=1; l< multiArray[k].length; l++){
                if(multiArray[k][l]==0){
                    multiArray[k][0]=0;
                    multiArray[0][l]=0;
                }
            }
        }

        for(int m=1; m< multiArray.length; m++){
            for(int n=1; n< multiArray[0].length; n++){
                if(multiArray[m][0]==0 || multiArray[0][n]==0){
                    multiArray[m][n]=0;

                }
            }
        }

            if(firstRow){
                for(int o=0 ; o< multiArray[0].length; o++){
                    multiArray[0][o]=0;
                }
            }
            if(firstCol){
                for(int p=0; p< multiArray.length; p++){
                    multiArray[p][0]=0;
                }
            }

        System.out.println(multiArray);
    }
}

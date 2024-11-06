public class TwoDimArray {
    public static void main(String[] args) {
        int[][] matrix=new int[3][3];
        matrix[0][0]=0;
        matrix[0][1]=1;
        matrix[0][2]=2;
        matrix[1][0]=0;
        matrix[1][1]=1;
        matrix[1][2]=2;
        matrix[2][0]=0;
        matrix[2][1]=1;
        matrix[2][2]=2;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println(matrix[i][j]);
            }
                System.out.println();
        }
    }
}

package paixu.MaoPaoPaiXu;

/**
 * Created by long on 2018/8/14.
 */
public class MaoPaoPaiXu {
    public static void main(String[] args) {
        int array[] = {1,2,4,3,9,7,8,6};
        for( int i = 0;i < array.length - 1;i++ ){
            for( int j = 0;j < array.length - i - 1;j++ ){
                if( array[j] > array[j+1] ){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for( int i = 0 ; i < array.length ; i++ ){
            System.out.print(array[i]+" ");
        }
    }
}

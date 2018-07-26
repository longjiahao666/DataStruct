package paixu.ChaRuPaiXu;

/**
 * Created by KPL on 2018/6/29.
 */
public class ChaRuPaiXu {
    public static void main(String[] args) {
        int array[] = {1,2,4,3,9,7,8,6};
        ChaRuPaiXuFa(array);
        for( int i = 0 ; i < array.length ; i++ ){
            System.out.print(array[i]+" ");
        }
    }
    public static void ChaRuPaiXuFa(int[] array){
        int temp = 0;
        for( int i = 1;i < array.length;i++ ){
            //将当前元素插入到合适的位置
            for( int j = i ; j > 0 ; j-- ){
                //如果比前一个元素小，就交换
                if( array[j] < array[j-1] ){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                //如果已经放入了合适的位置了，直接跳出当前循环
                else{
                    break;
                }
            }
        }
    }
    public static void ChaRuPaiXuFa2(int[] array,int l,int r){
        int temp = 0;
        for( int i = l+1;i <= r;i++ ){
            int e = array[i];
            int j;
            //将当前元素插入到合适的位置
            for( j = i ; j > l&& array[j-1]>e ; j-- ){
                //如果比前一个元素小，就交换
               // if( array[j] < array[j-1] ){
                  //  temp = array[j];
                    array[j] = array[j-1];
                 //   array[j-1] = temp;
                }
                array[j] = e;

                //如果已经放入了合适的位置了，直接跳出当前循环
            }
        return;
    }
}

package paixu.XuZePaiXu;


/**
 * Created by KPL on 2018/6/29.
 */
public class XuanZePaiXu {
    public static void main(String[] args) {
        int minIndex = 0;
        int temp = 0;
        int array[] = {1,2,4,3,9,7,8,6};
        for(int i = 0;i < array.length;i++){
            //现假设最开始的元素为最小的元素
            minIndex = i;
            for( int j = i + 1;j < array.length;j++ ){
                //如果当前元素比最开始的元素小，就交换设当前元素为最小元素
                if( array[j] < array[minIndex] ){
                     minIndex = j;
                }
                //将此轮的最小元素和最开始的元素交换
                temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        for( int i = 0;i < array.length;i++ ){
            System.out.print(array[i]+" ");
        }
    }
}


package paixu.GuiBingPaiXu;


import paixu.ChaRuPaiXu.ChaRuPaiXu;

import java.util.Arrays;

/**
 * Created by KPL on 2018/6/29.
 */

/*
    k表示最终i和j比较之后最终需要放的位置
    i和j用来表示当前需要考虑的元素
    left表示最左边的元素
    right表示最右边的元素
    middle表示中间位置元素，放在第一个已经排好序的数组的最后一个位置
*/
public class GuiBingPaiXu {
    /*******************测试************************/
    public static void main(String[] args) {
          int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 , 9 , 19 ,12,16,14,12,22,33 };

          mergeSort(nums , 0 , nums.length - 1 );
          System.out.println(Arrays.toString(nums));
    }
    /********************算法************************/
    /*
        arr：要处理的数组
        l：开始位置
        r：结束位置
        递归对arr[ l ... r ]范围的元素进行排序
     */
    private static void mergeSort(int[] arr,int left,int right){
//        if( left >= right )    //表示已经排序完毕了
//            return;
        if( right - left <= 10 ){   //当数据很少的时候使用插入排序算法
            ChaRuPaiXu.ChaRuPaiXuFa2( arr , left ,right);
            return;
        }
        int middle = ( left + right ) / 2;  //计算中点位置
        mergeSort( arr , left , middle );   //不断地对数组的左半边进行对边分
        mergeSort( arr , middle+1 , right );   //不断地对数组的右半边进行对半分
        if( arr[middle] > arr[middle+1] )      //当左边最大的元素都比右边最小的元素还小的时候就不用归并了
            merge( arr , left , middle , right );     //最后将已经分好的数组进行归并
    }
    //将arr[ l... mid ]和arr[ mid ... r ]两部分进行归并
    /*
        |2, 7, 8, 3, 1  |  6, 9, 0, 5, 4|
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        int arr1[] = new int[ right - left + 1 ];   //定义临时数组
        for( int i = left ; i <= right ; i++ )      //将数组的元素全部复制到新建的临时数组中
            arr1[ i - left ] = arr[ i ];
        int i = left;
        int j = mid + 1;     //定义两个索引
        for( int k = left;k <= right ; k++){
             if( i > mid )   //如果左边都比较完了
             {
                 arr[ k ] = arr1[ j - left ];   //直接将右边的元素都放进去
                 j++;
             }
             else if( j > right ){   //右边都比较完了
                 arr[ k ] = arr1 [i - left ];   //直接将左边的元素放进去
                 i++;
             }
             else if( arr1[ i-left ] < arr1[ j-left ] ){
                 arr[ k ] = arr1[ i - left];
                 i++;
             }
            else
             {
                 arr[ k ] = arr1[ j - left];
                 j++;
             }
        }
    }
}



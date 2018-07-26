package paixu.KauiSuPaiXu;

import paixu.ChaRuPaiXu.ChaRuPaiXu;

import java.util.Random;

/**
 * Created by KPL on 2018/7/23.
 */
public class KuaiSuPaiXu {
    //arr[l...r]部分进行快速排序
    private static void quickSort(int[] arr,int l,int r){
        if( l >= r )  return;
        if(r - l <= 15)
            ChaRuPaiXu.ChaRuPaiXuFa2(arr,l,r);
        int p = partition(arr,l,r);  //找到中间位置
        quickSort(arr,l,p-1);
        quickSort(arr,p+1,r);
    }
    private static void quickSort2(int[] arr,int l,int r){
        if( l >= r )  return;
       // if(r - l <= 12)
            ChaRuPaiXu.ChaRuPaiXuFa2(arr,l,r);
        int p = partition2(arr,l,r);  //找到中间位置
        quickSort2(arr,l,p-1);
        quickSort2(arr,p+1,r);
    }
    //首先将第一个元素移动到排好序之后应该放的位置
    //使得p之前的元素都小一些，p之后的元素都大一些
    //返回p，使得arr[ l ... p-1 ] < arr[ p ]
    //arr[ p + 1 ... r] > arr[ p ]
    private static int partition(int[] arr,int l,int r){
        /****************添加代码**********************/
        //随机取出一个元素，然后交换
        Random rm = new Random();
        int rm1 = rm.nextInt( r - l + 1);
        swap(arr,l,rm1 + l);
        /*********************************************/
        int v = arr[l];   //取出第一个元素
        int j = l;        //j表示小于第一个元素和大于第一个元素的分界点
        //当前访问的元素称为i
        for( int i = l + 1;i <= r;i++ ){
            //将所有小于第一个元素的值的元素全部都放到它的左边
            if( arr[i] < v ){     //如果当前元素小于v，则交换
                swap(arr,i,j+1);
                j++;
            }
        }
        swap(arr,l,j);  //将第一个元素和中间的元素进行交换
        return j;
    }
    private static int partition2(int[] arr,int l,int r){
        //随机取出一个元素，然后交换
        Random rm = new Random();
        int rm1 = rm.nextInt( r - l + 1);
        swap(arr,l,rm1 + l);
        int v = arr[l];   //取出第一个元素
        int i = l + 1,j = r;
        while (true){
            while ( i <= r && arr[i] < v) i++;
            while ( j <= l + 1 && arr[j] > v) j--;
            if( i > j ) break;
            swap(arr,j,j);
            j++;
            j--;
        }
        swap(arr,j,l);
        return j;
    }
    public static void main(String[] args){
        int array[] = {1,2,4,3,9,7,8,6};
        quickSort2(array,0,array.length-1);
        for( int i = 0 ; i < array.length ; i++ ){
            System.out.print(array[i]+" ");
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

package com.kayson.algorithm;

/**
 * @auther kayson
 * @create 2020-07-16 20:26
 */
public class Sort {
    //冒泡排序
    void bubbleSort(int a[], int n)
    {
        for(int i =0 ; i< n-1; ++i)
        {
            for(int j = 0; j < n-i-1; ++j)
            {
                if(a[j] > a[j+1])
                {
                    int tmp = a[j] ;  //交换
                    a[j] = a[j+1] ;
                    a[j+1] = tmp;
                }
            }
        }
    }
    //选择排序
    int[] selectionSort(int[] arr) {
        int len = arr.length;
        int minIndex, temp;
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {     // 寻找最小的数
                    minIndex = j;                 // 将最小数的索引保存
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    //插入排序
    void InsertSort(int a[], int n)
    {
        for(int i= 1; i<n; i++){
            if(a[i] < a[i-1]){   //若第i个元素大于i-1元素，直接插入。小于的话，移动有序表后插入
                int j= i-1;
                int x = a[i];     //复制为哨兵，即存储待排序元素
                a[i] = a[i-1];           //先后移一个元素
                while(x < a[j]){   //查找在有序表的插入位置
                    a[j+1] = a[j];
                    j--;     //元素后移
                }
                a[j+1] = x;     //插入到正确位置
            }
                 //打印每趟排序的结果
        }

    }


}

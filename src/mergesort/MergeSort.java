package mergesort;

import java.util.Arrays;

/**
 * Created by jibbgh on 11/14/2016.
 */
public class MergeSort {

    //main method
    public static void main(String [] args)
    {
        int [] caseOne = {14, 7, 3, 12, 9, 11, 6, 2};
        int [] caseTwo = {2, 2, 2, 2, 1, 2};
        int [] caseThree = {};
        int [] caseFour = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        mergeSort(caseOne);
        mergeSort(caseTwo);
        mergeSort(caseThree);
        mergeSort(caseFour);

        System.out.println(caseOne);
        System.out.println(caseTwo);
        System.out.println(caseThree);
        System.out.println(caseFour);
    }

    public static void mergeSort(int[] array)
    {
        if(array.length > 1)
        {
            int[] subArray1 = Arrays.copyOfRange(array, 0,array.length/2 - 1);
            int[] subArray2 = Arrays.copyOfRange(array, array.length/2, array.length);

            mergeSort(subArray1);
            mergeSort(subArray2);
            merge(subArray1, subArray2);
        }
    }

    public static int [] merge(int[] subArray1, int[] subArray2)
    {
        int []mergedArray = new int[subArray1.length + subArray2.length];
        int i = 0;
        int j = 0;

        for(int counter = 0; counter < mergedArray.length; counter++)
        {
            if(subArray1[i]>= subArray2[j])
            {
                mergedArray[counter] = subArray2[j];
                j++;
            } else if(subArray1[i]<= subArray2[j])
            {
                mergedArray[counter] = subArray1[i];
                i++;
            }
        }

        return mergedArray;
    }
}

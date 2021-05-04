package TreeWork;

import java.util.Arrays;

public class BubbleSort
{
    private int[] newArray_int_400_toSort2;

    BubbleSort(int[] randomArray)
    {
        newArray_int_400_toSort2 = Arrays.copyOf(randomArray, randomArray.length);
    }

    public int[] BubbleSortingWork()
    {
        int counter1;
        int counter2;
        int tempInt;
        for (counter1 = newArray_int_400_toSort2.length - 1; counter1 > 0; counter1--)
        {
            for (counter2 = 1; counter2 <= counter1; counter2++)
            {
                if (newArray_int_400_toSort2[counter2] < newArray_int_400_toSort2[counter2 - 1])
                {
                    tempInt = newArray_int_400_toSort2[counter2];
                    newArray_int_400_toSort2[counter2] = newArray_int_400_toSort2[counter2 - 1];
                    newArray_int_400_toSort2[counter2 - 1] = tempInt;
                }
            }
        }
        return newArray_int_400_toSort2;
    }
}

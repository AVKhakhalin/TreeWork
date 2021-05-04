package TreeWork;

import java.util.Arrays;

public class InsertSort
{
    int[] newArray_int_400_toSort4;

    InsertSort(int[] randomArray)
    {
        newArray_int_400_toSort4 = Arrays.copyOf(randomArray, randomArray.length);
    }

    public int[] InsertSortingWork()
    {
        int counter1;
        int counter2;
        int counter3;
        int tempInt;
        for (counter1 = 1; counter1 < newArray_int_400_toSort4.length; counter1++)
        {
            for (counter2 = 0; counter2 < counter1; counter2++)
            {
                if (newArray_int_400_toSort4[counter1] <= newArray_int_400_toSort4[counter2])
                {
                    tempInt = newArray_int_400_toSort4[counter1];
                    for (counter3 = counter1; counter3 >= counter2 + 1; counter3--)
                    {
                        newArray_int_400_toSort4[counter3] = newArray_int_400_toSort4[counter3 - 1];
                    }
                    newArray_int_400_toSort4[counter3] = tempInt;
                    break;
                }
            }
        }
        return newArray_int_400_toSort4;
    }
}

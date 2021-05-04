package TreeWork;

import java.util.Arrays;

public class ChooseSort
{
    int[] newArray_int_400_toSort3;

    ChooseSort(int[] randomArray)
    {
        newArray_int_400_toSort3 = Arrays.copyOf(randomArray, randomArray.length);
    }

    public int[] ChooseSortingWork()
    {
        int counter1;
        int counter2;
        int firstPos;
        int tempInt;
        int minNumber_int;
        for (counter1 = 0; counter1 < newArray_int_400_toSort3.length; counter1++)
        {
            minNumber_int = newArray_int_400_toSort3[counter1];
            firstPos = counter1;
            for (counter2 = counter1; counter2 < newArray_int_400_toSort3.length; counter2++)
            {
                if (minNumber_int > newArray_int_400_toSort3[counter2])
                {
                    firstPos = counter2;
                    minNumber_int = newArray_int_400_toSort3[counter2];
                }
            }
            tempInt = newArray_int_400_toSort3[counter1];
            newArray_int_400_toSort3[counter1] = minNumber_int;
            newArray_int_400_toSort3[firstPos] = tempInt;
        }
        return newArray_int_400_toSort3;
    }
}

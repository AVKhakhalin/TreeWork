package TreeWork;

import java.util.Arrays;
import java.util.Random;

public class ConfluenceSearch
{
    int[] array;
    Random random = new Random();

    ConfluenceSearch(int sizeArray)
    {
        array = new int[sizeArray];
        boolean exitCikl;
        for (int i = 0; i < sizeArray; i++)
        {
            exitCikl = false;
            while(exitCikl == false)
            {
                exitCikl = true;
                array[i] = random.nextInt(sizeArray);
                for (int j = 0; j < i; j++)
                {
                    if (array[i] == array[j])
                    {
                        exitCikl = false;
                        break;
                    }
                }
            }
        }
        System.out.println("Массив для сортировки: " + Arrays.toString(array));
    }

    public int[] divideMergeArray(int[] initialArray)
    {
        int len = initialArray.length;
        if (len < 2)
        {
            return initialArray;
        }
        int middle = len / 2;
        return mergeArray(divideMergeArray(Arrays.copyOfRange(initialArray, 0, middle)), divideMergeArray(Arrays.copyOfRange(initialArray, middle, len)));
    }

    public int[] mergeArray(int[] firstHalfArray, int[] secondHalfArray)
    {
        int[] resultArray = new int[firstHalfArray.length + secondHalfArray.length];
        int firstHalfArray_Index = 0;
        int secondHalfArray_Index = 0;

        for (int i = 0; i < resultArray.length; i++)
        {
            resultArray[i] = firstHalfArray[firstHalfArray_Index] < secondHalfArray[secondHalfArray_Index] ?
                    firstHalfArray[firstHalfArray_Index++] : secondHalfArray[secondHalfArray_Index++];
            if (firstHalfArray_Index == firstHalfArray.length)
            {
                System.arraycopy(secondHalfArray, secondHalfArray_Index, resultArray, ++i, secondHalfArray.length - secondHalfArray_Index);
                break;
            }
            if (secondHalfArray_Index == secondHalfArray.length)
            {
                System.arraycopy(firstHalfArray, firstHalfArray_Index, resultArray, ++i, firstHalfArray.length - firstHalfArray_Index);
                break;
            }
        }

        return resultArray;
    }

    public int[] getArray()
    {
        return array;
    }

    public void setArray(int[] array)
    {
        this.array = array;
    }
}

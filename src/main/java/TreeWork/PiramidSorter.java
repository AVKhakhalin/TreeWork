package TreeWork;

import java.util.Arrays;
import java.util.Random;

public class PiramidSorter
{
    private static int heapSize; // Размер кучи, равный размеру массива
    private int[] array;

    PiramidSorter(int sizeArray)
    {
        Random random = new Random();
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
//        System.out.println("Массив для сортировки: " + Arrays.toString(array));
    }

    public static int[] sort(int[] a) // Сортировка кучи
    {
        buildHeap(a); // Строительство кучи
        while (heapSize > 1)
        {
            swap(a, 0, heapSize - 1); // Здесь могут нарушаться свойства кучи
            heapSize--;
            heapify(a, 0); 		  // Делается восстановления свойства кучи после метода swap
        }
        return a;
    }

    private static void buildHeap(int[] a) // Создание кучи
    {
        heapSize = a.length;
        for (int i = a.length / 2; i >= 0; i--)
        {
            heapify(a, i); // Восстановление свойств бинарной кучи
        }
    }

    private static void heapify(int[] a, int i) // метод "хипфи" для восстановления свойств бинарной пирамиды
    {
        int l = left(i);  // Определяем левого потомка
        int r = right(i); // Определяем правого потомка
        int largest = i;  // Устанавливаем наибольший наш элемент
        if (l < heapSize && a[i] < a[l])
        {
            largest = l;
        }
        if (r < heapSize && a[largest] < a[r])
        {
            largest = r;
        }
        if (i != largest) // Если i не наибольшее, то происходят замены
        {
            swap(a, i, largest);
            heapify(a, largest);
        }
    }

    private static int right(int i)
    {
        return 2 * i + 2;
    }

    private static int left(int i)
    {
        return 2 * i + 1;
    }

    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int[] getArray()
    {
        return array;
    }
}

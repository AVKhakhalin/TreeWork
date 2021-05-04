package TreeWork;

import java.util.PriorityQueue;
import java.util.Random;

public class GeneralMethods
{
    private long curTime;
    //region Методы для работы с приоритетной очередью
    public void priorityQueueAdd(PriorityQueue<Integer> curPriorityQueue, int[] randomArray)
    {
        if (randomArray.length == 0)
        {
            System.out.println("Ошибка: Элементы в приоритетную очередь не добавлены, потому что нужно указывать число элементов > 0.");
        }
        else
        {
            curTime = System.nanoTime();
            int tempInt;
            System.out.print("В ПРИОРИТЕТНУЮ ОЧЕРЕДЬ добавлены элементы: [");
            for (int i = 0; i < randomArray.length; i++)
            {
                tempInt = randomArray[i];
                if (curPriorityQueue.add(tempInt) == true)
                {
                    System.out.print(tempInt + (i < randomArray.length - 1 ? ", " : "]\n    На добавление элементов в ПРИОРИТЕТНУЮ ОЧЕРЕДЬ потрачено " + (System.nanoTime() - curTime) + " нс.\n"));
                }
                else
                {
                    if (i > 0)
                    {
                        System.out.print("]\n    На добавление элементов потрачено " + (System.nanoTime() - curTime) + " нс.\n");
                    }
                    System.out.println("Ошибка: Добавить элемент с индексом " + i + " в приоритную очередь не получилось.");
                    return;
                }
            }
        }
    }

    public void priorityQueueShow(PriorityQueue<Integer> curPriorityQueue)
    {
        if (curPriorityQueue.isEmpty() == true)
        {
            System.out.println("Приоритетная очередь пуста. Нечего выводить.");
        }
        else
        {
            curTime = System.nanoTime();
            System.out.print("Текущий вид ПРИОРИТЕТНОЙ ОЧЕРЕДИ: [");
            while(curPriorityQueue.isEmpty() == false)
            {
//                System.out.print(curPriorityQueue.poll() + (curPriorityQueue.isEmpty() == true ? "]\n   На вывод приоритетной очереди потрачено " + (System.nanoTime() - curTime) + " нс.\n" : ", "));
                System.out.print(curPriorityQueue.poll() + (curPriorityQueue.isEmpty() == true ? "]\n" : ", "));
            }
        }
    }
    //endregion
}

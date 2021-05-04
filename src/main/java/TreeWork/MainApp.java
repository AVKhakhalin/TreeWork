package TreeWork;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MainApp
{
    public static long curTime;

    public static void main(String[] args)
    {
        System.out.println("\nДомашняя работа №6 студента университета GeekBrains Хахалина Андрея Владимировича\n");

        //region Решение задания №6.1
        System.out.println("\nРешение задания №6.1\n");
        /* Задание 6.1
        Приведите пример использования древовидной структуры. */
        System.out.println("ОТВЕТ: древовидную структуру данных используют в справочниках для построения взаимосвязи между уровнями представления информации" +
                "\n(например: справочник подразделений организации)." +
                "\nПример древовидной структуры справочника: страна, регион, город, район, дом, квартира, житель.");
        //endregion----------------------------------------------

        //region Решение задания №6.2
        System.out.println("\nРешение задания №6.2\n");
        /* Задание 6.2
        Реализуйте класс узла дерева и базовый шаблон дерева с базовыми методами. */
        MyFirstTree myFirstTree = new MyFirstTree();
        //endregion----------------------------------------------

        //region Решение задания №6.3
        System.out.println("\nРешение задания №6.3\n");
        /* Задание 6.3
        Реализуйте методы поиска и вставки узла в дерево. */
        myFirstTree.insertKnot(new Dates(6, "Красная площадь", "Москва"));
        myFirstTree.insertKnot(new Dates(3, "Петергоф", "Санкт-Петербург"));
        myFirstTree.insertKnot(new Dates(5, "Озеро Байкал", "Иркутск"));
        myFirstTree.insertKnot(new Dates(2, "Долина Гейзеров", "Камчатка"));
        myFirstTree.insertKnot(new Dates(1, "Эрмитаж", "Санкт-Петербург"));
        myFirstTree.insertKnot(new Dates(4, "Мамаев курган", "Волгоград"));
        myFirstTree.insertKnot(new Dates(7, "Казанский кремль", "Казань"));

        myFirstTree.findKnot(4);
        myFirstTree.findKnot(3);
        myFirstTree.findKnot(1);
        myFirstTree.findKnot(8);
        //endregion----------------------------------------------

        //region Решение задания №6.4
        System.out.println("\nРешение задания №6.4\n");
        /* Задание 6.4
        Реализуйте базовые методы обхода дерева и метода дисплей.
        Реализуйте поиск максимума и минимума. */
        System.out.println("Минимальное значение в дереве:");
        myFirstTree.min(); // Здесь реализован поиск минимума
        System.out.println("Максимальное значение в дереве:");
        myFirstTree.max(); // Здесь реализован поиск максимума
        myFirstTree.show(); // Здесь реализован методы: дисплей, симметричный обход, прямой и обратный обходы
        //endregion----------------------------------------------

        //region Решение задания №6.5
        System.out.println("\nРешение задания №6.5\n");
        /* Задание 6.5
        Реализуйте метод удаления узла и выполните оценку времени базовых методов дерева с помощью System.nanoTime(). */
        myFirstTree.delete(2);
        myFirstTree.delete(3);
        myFirstTree.delete(1);
        myFirstTree.delete(4);
        myFirstTree.delete(5);
        System.out.println("Узлы 2, 3, 1, 4, 5 в дереве удалены.");
        myFirstTree.cutTree();
        System.out.println("Оставшееся дерево удалено.\n");

         // Оценка времени выполнения базовых методов
        curTime = System.nanoTime();
        myFirstTree.insertKnot(new Dates(1, "Долина Гейзеров", "Камчатка"));
        myFirstTree.insertKnot(new Dates(7, "Казанский кремль", "Казань"));
        myFirstTree.insertKnot(new Dates(5, "Озеро Байкал", "Иркутск"));
        System.out.println("На добавление 3 узлов в дерево потрачено " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        myFirstTree.findKnot(5);
        System.out.println("На поиск в дереве 1 узла потрачено " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        myFirstTree.symOrder(myFirstTree.getRootKnot());
        System.out.println("На симметричный обход дерева потрачено " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        myFirstTree.preOrder(myFirstTree.getRootKnot());
        System.out.println("На прямой обход дерева потрачено " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        myFirstTree.postOrder(myFirstTree.getRootKnot());
        System.out.println("На обратный обход дерева потрачено " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        myFirstTree.min();
        System.out.println("На поиск минимального узла в дереве потрачено " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        myFirstTree.max();
        System.out.println("На поиск максимального узла в дереве потрачено " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        myFirstTree.show();
        System.out.println("На отображение дерева с помощью трёх методов (симметричный, прямой и обратный) потрачено " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        myFirstTree.delete(1);
        System.out.println("На удаление 1 узла в дерево потрачено " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        myFirstTree.containsKnot(5);
        System.out.println("На установление есть ли в дереве узел потрачено " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        System.out.println("Текущее количество узлов в дереве = " + myFirstTree.countKnots());
        System.out.println("На определение текущего количества узлов в дереве потрачено " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        myFirstTree.cutTree();
        System.out.println("На удаление дерева потрачено " + (System.nanoTime() - curTime) + " нс.");
        //endregion----------------------------------------------

        //region Решение задания №6.6
        System.out.println("\nРешение задания №6.6\n");
        /* Задание 6.6
        Реализуйте на основе массива из задания 2.1 алгоритм пирамидальной сортировки с реализацией бинарной пирамиды.
        Выполните оценку алгоритма пирамидальной сортировки с помощью System.nanoTime() и сравните с предыдущими алгоритмами сортировки. */

        int sizeArray = 1000; // Установка размера массива
        ConfluenceSearch confluenceSearch = new ConfluenceSearch(sizeArray); // Создание массива случайных чисел от 0 до sizeArray
        int[] copyRandomArray = Arrays.copyOf(confluenceSearch.getArray(), confluenceSearch.getArray().length); // Создание копии исходного массива случайных чисел

        // Сортировка массива пирамидальной сортировкой
        PiramidSorter piramidSorter = new PiramidSorter(sizeArray);
        curTime = System.nanoTime();
        System.out.println("Отсортированный массив методом ПИРАМИДАЛЬНОЙ сортировки: " + Arrays.toString(piramidSorter.sort(confluenceSearch.getArray())));
        System.out.println("    Сортировка массива методом ПИРАМИДАЛЬНОЙ сортировки заняла " + (System.nanoTime() - curTime) + " нс.");

        // Сортировка массива слиянием
        confluenceSearch.setArray(copyRandomArray);
        curTime = System.nanoTime();
        System.out.println("Отсортированный массив методом СЛИЯНИЯ: " + Arrays.toString(confluenceSearch.divideMergeArray(confluenceSearch.getArray())));
        System.out.println("    Сортировка массива методом СЛИЯНИЯ заняла " + (System.nanoTime() - curTime) + " нс.");

        // Сортировка массива с помощью приоритетной очереди
        confluenceSearch.setArray(copyRandomArray);
        GeneralMethods generalMethods = new GeneralMethods();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // Создание приоритетной очереди
        generalMethods.priorityQueueAdd(priorityQueue, confluenceSearch.getArray()); // Добавление элементов в приоритетную очередь
        generalMethods.priorityQueueShow(priorityQueue); // Вид приоритетной очереди

        // Сортировка массива методом пузырька
        confluenceSearch.setArray(copyRandomArray);
        BubbleSort bubbleSort = new BubbleSort(confluenceSearch.getArray());
        curTime = System.nanoTime();
        System.out.println("Отсортированный массив методом ПУЗЫРЬКА: " + Arrays.toString(bubbleSort.BubbleSortingWork()));
        System.out.println("    Сортировка массива методом ПУЗЫРЬКА заняла " + (System.nanoTime() - curTime) + " нс.");

        // Сортировка массива методом выбора
        confluenceSearch.setArray(copyRandomArray);
        ChooseSort chooseSort = new ChooseSort(confluenceSearch.getArray());
        curTime = System.nanoTime();
        System.out.println("Отсортированный массив методом ВЫБОРА: " + Arrays.toString(chooseSort.ChooseSortingWork()));
        System.out.println("    Сортировка массива методом ВЫБОРА заняла " + (System.nanoTime() - curTime) + " нс.");

        // Сортировка массива методом вставки
        confluenceSearch.setArray(copyRandomArray);
        InsertSort insertSort = new InsertSort(confluenceSearch.getArray());
        curTime = System.nanoTime();
        System.out.println("Отсортированный массив методом ВСТАВКИ: " + Arrays.toString(insertSort.InsertSortingWork()));
        System.out.println("    Сортировка массива методом ВСТАВКИ заняла " + (System.nanoTime() - curTime) + " нс.");

        // Сортировка массива методом sort()
        confluenceSearch.setArray(copyRandomArray);
        curTime = System.nanoTime();
        Arrays.sort(confluenceSearch.getArray());
        System.out.println(" Отсортированный массив методом SORT(): " + Arrays.toString(confluenceSearch.getArray()));
        System.out.println("    Сортировка массива методом SORT() заняла " + (System.nanoTime() - curTime) + " нс.");
        //endregion----------------------------------------------

        //region Решение задания №6.7
        System.out.println("\nРешение задания №6.7\n");
        /* Задание 6.7
        Приведите пример сбалансированного дерева и его применения. */
        myFirstTree.cutTree();
        myFirstTree.insertKnot(new Dates(3, "Петергоф", "Санкт-Петербург"));
        myFirstTree.insertKnot(new Dates(5, "Озеро Байкал", "Иркутск"));
        myFirstTree.insertKnot(new Dates(1, "Эрмитаж", "Санкт-Петербург"));
        myFirstTree.insertKnot(new Dates(2, "Долина Гейзеров", "Камчатка"));
        myFirstTree.insertKnot(new Dates(4, "Мамаев курган", "Волгоград"));
        myFirstTree.insertKnot(new Dates(6, "Красная площадь", "Москва"));
        System.out.println("Пример идеально сбалансированного дерева " +
                "(для каждого его узла количество узлов в левом и правом поддеревьях различается не более, чем на 1):");
        myFirstTree.preOrder(myFirstTree.getRootKnot());
        System.out.println("\nПример использования идеально сбалансированного дерева (поиск узлов 1, 2, 3, 4, 5, 6):");
        myFirstTree.findKnot(1);
        myFirstTree.findKnot(2);
        myFirstTree.findKnot(3);
        myFirstTree.findKnot(4);
        myFirstTree.findKnot(5);
        myFirstTree.findKnot(6);
        System.out.println("\nЕЩЕ ПРИМЕР ПРИМЕНЕНИЯ СБАЛАНСИРОВАННЫХ ДЕРЕВЬЕВ" +
                "\n[Сенюкова О.В. Сбалансированные деревья поиска. Учебно-методическое пособие.\nМ.: Издательский отдел факультета ВМиК МГУ имени М.В. Ломоносова; МАКС Пресс, 2014. С. 65-66]:\n" +
                "\nРазличные виды сбалансированных деревьев поиска используются, в частности," +
                "\nв системном программном обеспечении, например, в ядрах операционных систем." +
                "\nВ статье [P. Bfaff. Performance Analysis of BSTs in System Software // SIGMETRICS Perform. Eval. vol. 32(1), pp. 410–411. 2004]" +
                "\nприведены результаты тестов, имитирующих некоторую реальную нагрузку на деревья поиска." +
                "\nУчитывая, что таблицы виртуальных адресов в Linux часто делаются на двоичных деревьях поиска," +
                "\nавторы инструментировали несколько приложений, чтобы получить последовательность их обращений к подсистемам виртуальной памяти," +
                "\nа затем использовали эти последовательности для эмуляции нагрузки на двоичные деревья в ядре операционной системы." +
                "\nТак, например, показано, что если при использовании браузером \"Mozilla\" виртуальной памяти менеджер виртуальной памяти" +
                "\nбудет использовать самопере-страивающиеся деревья, то преимущество этого вида деревьев по времени работы над АВЛ- и КЧ-деревьями" +
                "\nбудет минимум в 2, а максимум в 3.4 раза.");

        //endregion----------------------------------------------
    }
}

package TreeWork;

public class MyFirstTree
{
    private Knot rootKnot;
    private int countKnots = 0;

    public void insertKnot(Dates dates) // Метод, реализующий добавление узла в дерево
    {
        countKnots++; // Подсчёт добавленных узлов в дерево
        Knot knot = new Knot();
        knot.setdates(dates);
        if (rootKnot == null)
        {
            rootKnot = knot;
        }
        else
        {
            Knot current = rootKnot;
            Knot parent;
            while (true)
            {
                parent = current;
                if (dates.getID() < current.getdates().getID())
                {
                    current = current.getLeftChild();
                    if (current == null)
                    {
                        parent.setLeftChild(knot);
                        return;
                    }
                }
                else
                {
                    current = current.getRightChild();
                    if (current == null)
                    {
                        parent.setRightChild(knot);
                        return;
                    }
                }
            }
        }
    }

    public Knot findKnot(int ID)
    {
        if (countKnots == 0)
        {
            System.out.println("В пустом дереве поиск невозможен.");
            return null;
        }
        else
        {
            Knot current = rootKnot;
            while (current.getdates().getID() != ID)
            {
                if (ID < current.getdates().getID())
                {
                    current = current.getLeftChild();
                }
                else
                {
                    current = current.getRightChild();
                }
                if (current == null)
                {
                    System.out.println("В дереве узла с ID = " + ID + " нет.");
                    return null;
                }
            }
            current.show();
            return current;
        }
    }

    public boolean symOrder(Knot rootKnot) // Реализация симметричного обхода дерева
    {
        boolean answer = false;
        if (rootKnot != null)
        {
            symOrder(rootKnot.getLeftChild());
            rootKnot.show();
            symOrder(rootKnot.getRightChild());
            answer = true;
            return answer;
        }
        else
        {
            return answer;
        }
    }

    public boolean preOrder(Knot rootKnot) // Релизация прямого обхода дерева
    {
        boolean answer = false;
        if (rootKnot != null)
        {
            rootKnot.show();
            preOrder(rootKnot.getLeftChild());
            preOrder(rootKnot.getRightChild());
            answer = true;
            return answer;
        }
        else
        {
            return answer;
        }
    }

    public boolean postOrder(Knot rootKnot) // Реализация обратного обхода дерева
    {
        boolean answer = false;
        if (rootKnot != null)
        {
            postOrder(rootKnot.getLeftChild());
            postOrder(rootKnot.getRightChild());
            rootKnot.show();
            answer = true;
            return answer;
        }
        else
        {
            return answer;
        }
    }

    public Knot min() // Реализация поиска минимального узла на дереве
    {
        if (countKnots == 0)
        {
            System.out.println("В пустом дереве поиск минимального узла невозможен.");
            return null;
        }
        else
        {
            Knot current = rootKnot;
            Knot last = null;
            while (current != null)
            {
                last = current;
                current = current.getLeftChild();
            }
            last.show();
            return last;
        }
    }

    public Knot max() // Реализация поиска максимального узла на дереве
    {
        if (countKnots == 0)
        {
            System.out.println("В пустом дереве поиск максимального узла невозможен.");
            return null;
        }
        else
        {
            Knot current = rootKnot;
            Knot last = null;
            while (current != null)
            {
                last = current;
                current = current.getRightChild();
            }
            last.show();
            return last;
        }
    }

    public boolean delete(int ID) // Метод, реализующий удаление узла дерева
    {
        if (countKnots == 0)
        {
            System.out.println("Из пустого дерева удалить что-то невозможно.");
            return false;
        }
        else
        {
            Knot current = rootKnot;
            Knot parent = rootKnot;

            boolean isLeftChild = true;

            while (current.getdates().getID() != ID) // Поиск нашего удаляемого узла
            {
                parent = current;
                if (ID < current.getdates().getID())
                {
                    isLeftChild = true;
                    current = current.getLeftChild();
                }
                else
                {
                    isLeftChild = false;
                    current = current.getRightChild();
                }
                if (current == null)
                {
                    System.out.println("Удалить узел не получилось, потому что его в дереве нет.");
                    return false;
                }
            }

            countKnots--; // Уменьшение количества узлов дерева на 1

            if ((current.getLeftChild() == null) && (current.getRightChild() == null)) // Случай, когда нет потомков
            {
                if (current == rootKnot)
                {
                    rootKnot = null;
                }
                else if (isLeftChild == true)
                {
                    parent.setLeftChild(null);
                }
                else
                {
                    parent.setRightChild(null);
                }
            }
            else if (current.getRightChild() == null) // Есть только левый потомок
            {
//            if (current == null) // Здесь преподаватель ОШИБСЯ (проверьте: создайте дерево с ID: 1, 2, 3. Далее, удалите 1 узел и вы увидите дерево страшного сна с ожившим зомби-Буратиной)
                if (current == rootKnot) // Должно быть так
                {
                    rootKnot = current.getLeftChild();
                }
                else if (isLeftChild == true)
                {
                    parent.setLeftChild(current.getLeftChild());
                }
                else
                {
                    parent.setRightChild(current.getLeftChild());
                }
            }
            else if (current.getLeftChild() == null) // Есть только правый потомок
            {
//            if (current == null) // Здесь преподаватель ОШИБСЯ (проверьте: создайте дерево с ID: 1, 2, 3. Далее, удалите 1 узел и вы увидите дерево страшного сна с ожившим зомби-Буратиной)
                if (current == rootKnot) // Должно быть так
                {
                    rootKnot = current.getRightChild();
                }
                else if (isLeftChild == true)
                {
                    parent.setLeftChild(current.getRightChild());
                }
                else
                {
                    parent.setRightChild(current.getRightChild());
                }
            }
            else
            {
                Knot successor = getReceiver(current);
                if (current == rootKnot)
                {
                    rootKnot = successor;
                }
                else if (isLeftChild == true)
                {
                    parent.setLeftChild(successor);
                }
                else
                {
                    parent.setRightChild(successor);
                }
                successor.setLeftChild(current.getLeftChild());
            }
            return true;
        }
    }

    public Knot getReceiver(Knot knot) // Метод, возвращающий узел, являющийся преемником.
    {
        Knot successorParent = knot;
        Knot successor = knot;
        Knot current = knot.getRightChild();

        while (current != null)
        {
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }
        if (successor != knot.getRightChild())
        {
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(knot.getRightChild());
        }

        return successor;
    }

    public void show()
    {
        Knot current = rootKnot;
        System.out.println("Симметричный обход:");
        boolean result;
        result = symOrder(rootKnot);
        if (result == false)
        {
            System.out.println("Симметричный обход дерева невозможен, потому что дерево пустое.");
        }
        System.out.println("Прямой обход дерева:");
        result = preOrder(rootKnot);
        if (result == false)
        {
            System.out.println("Прямой обход дерева невозможен, потому что дерево пустое.");
        }
        System.out.println("Обратный обход дерева:");
        result = postOrder(current);
        if (result == false)
        {
            System.out.println("Обратный обход дерева невозможен, потому что дерево пустое.");
        }
    }

    public void cutTree() // Метод удаления дерева
    {
        rootKnot = null;
        countKnots = 0;
    }

    public boolean containsKnot(int ID) // Метод проверки наличия узла в дереве
    {
        if (countKnots == 0)
        {
            System.out.println("Узла с ID = " + ID + " в дереве нет, как и самого дерева.");
            return false;
        }
        else
        {
            Knot current = rootKnot;
            Knot parent = rootKnot;
            boolean contains = true;

            while (current.getdates().getID() != ID) // Реализация поиска нашего узла
            {
                parent = current;
                if (ID < current.getdates().getID())
                {
                    current = current.getLeftChild();
                }
                else
                {
                    current = current.getRightChild();
                }
                if (current == null)
                {
                    System.out.println("Узла с ID = " + ID + " в дереве нет.");
                    return false;
                }
            }
            return true;
        }
    }

    public int countKnots() // Реализация подсчёта количества узлов дерева
    {
        return countKnots;
    }

    public Knot getRootKnot()
    {
        return rootKnot;
    }
}

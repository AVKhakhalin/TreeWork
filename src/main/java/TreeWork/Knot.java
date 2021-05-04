package TreeWork;

public class Knot
{
    public Dates dates;
    public Knot leftChild;
    public Knot rightChild;

    public void show()
    {
        if ((leftChild == null) && (rightChild == null))
        {
            System.out.println("ID: " + dates.getID() + "; Достопримечательность: " + dates.getSightName() + "; Город: " + dates.getCity());
        }
        else if (leftChild == null)
        {
            System.out.println("ID: " + dates.getID() + "; Достопримечательность: " + dates.getSightName() + "; Город: " + dates.getCity() + "\n    ID правого потомка: " + rightChild.getdates().getID());
        }
        else if (rightChild == null)
        {
            System.out.println("ID: " + dates.getID() + "; Достопримечательность: " + dates.getSightName() + "; Город: " + dates.getCity() + "\n    ID левого потомка: " + leftChild.getdates().getID());
        }
        else
        {
            System.out.println("ID: " + dates.getID() + "; Достопримечательность: " + dates.getSightName() + "; Город: " + dates.getCity() + "\n    ID левого потомка: " + leftChild.getdates().getID() + "; ID правого потомка: " + rightChild.getdates().getID());
        }
    }

    public void setdates(Dates dates)
    {
        this.dates = dates;
    }

    public void setLeftChild(Knot leftChild)
    {
        this.leftChild = leftChild;
    }

    public void setRightChild(Knot rightChild)
    {
        this.rightChild = rightChild;
    }

    public Dates getdates()
    {
        return dates;
    }

    public Knot getLeftChild()
    {
        return leftChild;
    }

    public Knot getRightChild()
    {
        return rightChild;
    }
}

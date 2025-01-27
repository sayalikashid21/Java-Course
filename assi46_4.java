//  4.  Write a program which accept matrix and display addition of elements from each column.

import java.util.*;
import LB.Matrix;

class MyMatrix extends Matrix
{
    public MyMatrix(int A, int B)
    {
        super(A,B);
    }

    public void AddColumn()
    {
        int i=0, j=0, iSum=0;

        for(i=0; i<Arr.length; i++)
        {
            for(j=0; j<Arr[i].length; j++)
            {
                if(i>=j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
            System.out.println("Sum of Column element is: "+iSum);
        }
    }
}

class assi46_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;

        System.out.println("Enter number of rows: ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of Columns: ");
        iCol = sobj.nextInt();

        MyMatrix mobj = new MyMatrix(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        mobj.AddColumn();

        mobj = null;
        System.gc();
    }
}
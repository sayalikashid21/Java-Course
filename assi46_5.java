//  5.  Write a program which accept matrix and swap the content of consecutive rows.

import java.util.*;
import LB.Matrix;

class MyMatrix extends Matrix
{
    public MyMatrix(int A, int B)
    {
        super(A,B);
    }

    public void SwapRows()
    {
        int i=0, j=0, temp=0;

        for(i=0; i<Arr.length; i++)
        {
            for(j=0; j<Arr[i].length; j++)
            {
                temp = Arr[0][j];
                Arr[0][j]=Arr[i+1][j];
                Arr[i+1][j]=temp;
            }
            System.out.println(temp);
        }
        
    }
}

class assi46_5
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

        mobj.SwapRows();
        mobj.Display();

        mobj = null;
        System.gc();
    }
}
// 3. Write a program which accept matrix from user and reverse the contents of each column.

import java.util.*;
import LB.Matrix;

class MyMatrix extends Matrix
{
    public MyMatrix(int A, int B)
    {
        super(A,B);
    }

    public void Transpose()
    {
        int i=0, j=0, temp[][]=0;

        for(i=0; i<Arr.length; i++)
        {
            for(j=0; j<Arr[i].length; j++)
            {
                Arr[i][j] = Arr[j][i];
            }
        }
    }
}

class assi47_1
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

        mobj.Transpose();
        mobj.Display();

        mobj = null;
        System.gc();
    }
}
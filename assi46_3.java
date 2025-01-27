//  3.  Write a program which accept matrix and return largest number from both the diagonals.

import java.util.*;
import LB.Matrix;

class MyMatrix extends Matrix
{
    public MyMatrix(int A, int B)
    {
        super(A,B);
    }

    public int MaxDiagonal()
    {
        int i=0, j=0, iMax=Arr[0][0];

        for(i=0; i<Arr.length; i++)
        {
            for(j=0; j<Arr[i].length; j++)
            {
                if((i == j) && (Arr[i][j] > iMax))
                {
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;
    }
}

class assi46_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0, iRet = 0;

        System.out.println("Enter number of rows: ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of Columns: ");
        iCol = sobj.nextInt();

        MyMatrix mobj = new MyMatrix(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        iRet = mobj.MaxDiagonal();

        System.out.println("Maximum element from diagonal is: "+iRet);

        mobj = null;
        System.gc();
    }
}
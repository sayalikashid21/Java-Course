// 1.Write a java program which accept N number from user and return difference between summation of even elements and summation of odd elements.

import java.util.*;

class ArrayDemo
{
    public int Difference(int Brr[])
    {
        int iDiff =0, iESum=0, iOSum=0;
        int iCnt=0;

        for(iCnt=0; iCnt<Brr.length; iCnt++)
        {
            if((Brr[iCnt]%2) == 0)
            {
                iESum = iESum + Brr[iCnt];
            }
            else
            {
                iOSum = iOSum + Brr[iCnt];
            }
        }

        iDiff = iESum - iOSum;
        return iDiff;
    }
}

class assi33_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt=0, iRet=0;

        System.out.println("Enter size of Array: ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements of array: ");
        for(iCnt =0; iCnt<iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayDemo aobj = new ArrayDemo();
        
        iRet = aobj.Difference(Arr);

        System.out.println("Difference between even and odd number is: "+iRet);

        sobj.close();
    }
}
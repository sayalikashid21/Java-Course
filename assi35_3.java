// 3.Write a java program which accept N numbers from user and accept one another number as NO, return index of Last occurrence of that NO.

import java.util.*;

class Number
{
    public int LastOcc(int Brr[], int iNo)
    {
        int iCnt=0, iLast=0;
        iLast = -1;

        for(iCnt=0; iCnt<Brr.length; iCnt++)
        {
            if(Brr[iCnt] == iNo)
            {
                iLast = iCnt+1;
            }
        }
        return iLast;
    }
}

class assi35_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt=0, NO=0;
        int iRet=0;

        System.out.println("Enter size of Array: ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements of array: ");
        for(iCnt =0; iCnt<iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the number which you want to check: ");
        NO = sobj.nextInt();

        Number aobj = new Number();
        
        iRet = aobj.LastOcc(Arr, NO);

        if(iRet == -1)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println("First Occurrence is: "+iRet);
        }

        sobj.close();
    }
}
    
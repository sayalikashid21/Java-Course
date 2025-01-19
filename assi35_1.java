// 1.Write a java program which accept N number from user and accept one another number as NO, check whether NO is present or not.

import java.util.*;

class Number
{
    public boolean Check(int Brr[], int iNo)
    {
        int iCnt=0;
        boolean bFound = false;

        for(iCnt=0; iCnt<Brr.length; iCnt++)
        {
            if(Brr[iCnt] == iNo)
            {
                bFound = true;
            }
        }
        return bFound;
    }
}

class assi35_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt=0, NO=0;
        boolean iRet=false;

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
        
        iRet = aobj.Check(Arr, NO);

        if(iRet == true)
        {
            System.out.println(NO+" is Present in the array");
        }
        else
        {
            System.out.println(NO+" is not Present in the array");
        }

        sobj.close();
    }
}
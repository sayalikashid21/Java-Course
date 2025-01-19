// 4.Write a java program which accept N number from user and accept range , Display all elements from that range.

import java.util.*;

class Number
{
    public void Display(int Brr[], int iNo1, int iNo2)
    {
        int iCnt=0;
       
        for(iCnt=0; iCnt<Brr.length; iCnt++)
        {
            if((Brr[iCnt]>iNo1) && (Brr[iCnt] < iNo2))
            {
                System.out.print(Brr[iCnt]);
            } 
        }   
    }
}

class assi35_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt=0, iStart=0, iEnd=0;

        System.out.println("Enter size of Array: ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements of array: ");
        for(iCnt =0; iCnt<iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the number which you want to check: ");
        iStart = sobj.nextInt();

        System.out.println("Enter the number which you want to check: ");
        iEnd = sobj.nextInt();

        Number aobj = new Number();
        
        aobj.Display(Arr, iStart, iEnd);
       
        sobj.close();
    }
}
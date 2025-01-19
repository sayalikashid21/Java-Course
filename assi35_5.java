// 5.Write a java program which accept N number from user and return product of all odd elements.

import java.util.*;

class Number
{
    public int Product(int Brr[])
    {
        int iCnt=0, iMul =0;
        iMul = 1;
       
        for(iCnt=0; iCnt<Brr.length; iCnt++)
        {
            if((Brr[iCnt] %2) != 0)
            {
                iMul = iMul * Brr[iCnt];
            } 
        }   
        return iMul;
    }
}

class assi35_5
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

        Number aobj = new Number();
        
        iRet = aobj.Product(Arr);
       
        System.out.println("Product of number is: "+iRet);

        sobj.close();
    }
}
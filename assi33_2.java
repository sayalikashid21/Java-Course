// 2.Write a java program which accept N number from user and Display all such elements which are divisible by 5;

import java.util.*;

class ArrayDemo
{
    public void Display(int Brr[])
    {
        int iCnt=0;

        System.out.println("Number which are divisible by 5: ");
        for(iCnt=0; iCnt<Brr.length; iCnt++)
        {
            if((Brr[iCnt]%5) == 0)
            {
                System.out.println(Brr[iCnt]);
            }
        }
    }
}

class assi33_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt=0;

        System.out.println("Enter size of Array: ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements of array: ");
        for(iCnt =0; iCnt<iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayDemo aobj = new ArrayDemo();

        aobj.Display(Arr);

        sobj.close();
    }
}
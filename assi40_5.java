// 5. Write a program which accepts one number from user and range of position from user. toggle all bits from that range.


import java.util.*;

class Number
{
    public int ToggleBits(int iNo, int iStart, int iEnd)
    {
        
        int iResult = 0, iCnt=0;

        for(iCnt = iStart; iCnt<=iEnd; iCnt++)
        {
            int iMask = 0x00000001;
            iMask = (iMask << (iCnt-1));
            iResult = iNo ^ iMask;
            iNo = iResult; 
        }
        return iNo;
    }
}

class assi40_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iValue1 = 0, iValue2 = 0, iRet=0;

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        System.out.println("Enetr the start point: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enetr the end point: ");
        iValue2 = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.ToggleBits(iNo, iValue1, iValue2);

        System.out.println("After toggle the Bits number is: "+iRet);

        sobj.close();
    }
}
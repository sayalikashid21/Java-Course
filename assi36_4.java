//  4.  Accept string from user and reverse the contents of that string by toggling the case.

import java.util.*;

/*class StringDemo
{
    public String StrRev(String str)
    {
        char Arr[] = str.toCharArray();
        int i = 0;
        String str1 = null;

        for(i=Arr.length-1; i>=0; i--)
        {
            str1 = Arr[i];
        }
        return str1;
    }
}
*/
class assi36_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int i=0;

        System.out.println("Enter string: ");
        String str = sobj.nextLine();

        str = str.toLowerCase();
        str = str.toUpperCase();
        System.out.println(str);

        char Arr[] = str.toCharArray();

       for(i=Arr.length-1; i>=0; i--)
        {
            System.out.print(Arr[i]); 
        }
        System.out.println();
        
       /* StringDemo aobj = new StringDemo();

        sRet = aobj.StrRev(str);


        System.out.println(sRet);*/

        sobj.close();
    }
}


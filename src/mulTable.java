import java.util.Scanner;
public class mulTable {
    //to display the matrix, we need its maximum number of elements in row or column (cubic matrix)
    void mul(int max){
        int [] arr = new int[max*max];
        //carries the first element in each row 1,2,3,4
        int cnt=0;
        //carries other elements
        int cnt2=0;
        for(int i=0;i<max*max;i++)
        {
            //to catch the first element
            if(i%max==0)
            {
                cnt++;
                cnt2=cnt;
                arr[i]=cnt2;
            }
            //to catch other elements
            else{
                cnt2+=cnt;
                arr[i]=cnt2;
            }
        }
        //to display
        for(int i=0; i<max*max;i++)
        {
            //to go to new row
            if(i%max==0)
            {
                System.out.println();
                System.out.print(arr[i]);
            } //columns
            else{
                System.out.print(' ');
                System.out.print(arr[i]);

            }
        }
        //end of table
        System.out.println();
    }

}

package Loops;
import java.util.Scanner;

public class ap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // AP series: 4,10,16,22,28....
        int a = 4,d=6;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a +=d; //a = a + d
        }
    }
}
  /*
 In an AP (Arithmetic Progression):

a = first term → here, a = 4

d = common difference → here, d = 6

General formula for AP:

  [n th term = a+(n-1)*d]

For this series:

1st term → 4

2nd term → 4 + 6 = 10

3rd term → 10 + 6 = 16

4th term → 16 + 6 = 22
... and so on.

  Initialization → int i = 1

Starts from i = 1 since you are printing the first term as term #1.

Condition → i <= n

Loop will keep running until i becomes greater than n.

If n = 5, it runs for i = 1, 2, 3, 4, 5.

Update → i++

After each iteration, i is incremented by 1.

  */
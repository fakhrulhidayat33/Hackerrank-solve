// Link:

import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        
        // I edit from here
        double a,b;
        String tes;
        
        for (int i = 0; i <n-1; i++){
            a = new BigDecimal(s[0]).doubleValue();
            for (int j = 1; j < n-i; j++){
                b = new BigDecimal(s[j]).doubleValue();
                if (a<b){
                    tes = s[j];
                    s[j] = s[j-1];
                    s[j-1] = tes;
                }else if (a>b){
                    a = b;
                }
            }
        }
        // until here
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}

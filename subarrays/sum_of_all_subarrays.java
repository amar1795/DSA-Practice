package subarrays;

public class sum_of_all_subarrays {
    //using contribution technique we can calculate the sum of subararys with TC (n);

   public int sum(){
       int sum=0;
       for(int i=0;i<n;i++)
       {
           //(i+1)(N-i)
           sum+=arr[i]*(i+1)*(N-1);

       }
       return sum;
   }
}

public class While {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int i=1;
        // while loop
      /*  while (i<=n){
            sum+=i;
            i++;
        }*/
        // do while loop
        do {
            sum+=i;
            i++;
        }while (i<=n);
        System.out.println("the sum of number :"+sum);
    }
}

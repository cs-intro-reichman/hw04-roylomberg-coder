public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;
        int count = 0;
        int z;
         System.out.println("Prime numbers up to " + n + ":");

        for(int i = 2; i <= n; i++){
            if(arr[i] == false){
                for(int k = i * 2; k <=n; k +=i)
                    arr[k] = true;
                System.out.println(i);
                count++;
            }   
        


            
        }
        z = (100 * count) / n;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + z + "% are primes)");


   
        
}
}
                  
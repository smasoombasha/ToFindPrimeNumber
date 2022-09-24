public class toFindPrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(5));
        int count=0 ;
        for(int i=10;i<=50;i++){
            if(isPrime(i)){
                // here the method isPrime calculates the i value. if i value
                // is equal to true then it prints i value bcoz it is prime number
                // else it didn't print anything.
                System.out.println("This Prime Number "+i);
                count++;
                if(count ==3){
                    System.out.println("Exiting the for loop.");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int number){
        if(number ==1){
            return false;
        }for(int i=2;i<= number/2;i++){
            if(number %2 ==0){
                return false;
            }
        }return true;
    }
}

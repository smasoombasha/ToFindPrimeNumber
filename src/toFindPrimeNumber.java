public class toFindPrimeNumber {
    public static void main(String[] args){
        System.out.println("math.sqrt of 5 "+ Math.sqrt(28));
        System.out.println(isPrime(5));
        int count=0 ;
        for(int i=1;i<=50;i++){

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
        }for(int i=2;i<= Math.sqrt(number);i++){
            /*  And here we have two methods 1.for(int i=2;i<= number/2;i++). let number value is 28. Then 28/2= 14 and
             i++ = 15 then here 2<=14 the loops runs when the i=14. And 2.for(int i=2;i<= Math.sqrt(number);i++). Here
              also number 28 but the number is going to square root then it's value is 5.2 something so, the loop runs i=5.
              so we here 1. i=14 and 2. i=5. 2 method is better because the no of loops is less than method 1(one).*/
            System.out.println("looping "+i);
            if(number %2 ==0){
                return false;
            }
        }return true;
    }
}

public class sumOdd {
    public static void main(String[] args){
        System.out.println(isOdd(-1));
        System.out.println("sum of OddNumbers "+ sumOdd(1,20));
    }
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }return (number %2 !=0)?true :false;
    }
    public static int sumOdd(int start, int end){
        if((end >= start)&&(start >0 && end >0)){
            int sum =0;
            for (int i= start;i<=end;i++){
                if(isOdd(i)){
                    sum +=i;
                    System.out.println(i);
                }
            }return sum;
        }return -1;
    }
}

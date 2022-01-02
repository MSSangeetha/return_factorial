public class ReturnFactorial {
    public static void main (String[] args){
        factorial(6);
    }

    public static void factorial(int a){
        int answer = 1;
        if(a>0){
//
////            answer = a*(a-1)!;

            for(int i=1;i<=a;i++){
                answer = answer * i;
                System.out.println(answer);
            }

            System.out.println(answer);
        }
        else{
            System.out.println("Please enter a number greater than 0");
        }
    }
}

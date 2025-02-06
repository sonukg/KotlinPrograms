public class PrimeNumberCheck {
    public static void main(String[] args){
        int num=21, i=2;
        boolean flag=false;
        primeNumberUsingForLoop(num,i,flag);
        primeNumberUsingWhileLoop(num,i,flag);

    }

    private static void primeNumberUsingForLoop(int num, int i,boolean flag) {
        for (;i<=num/2;i++){
            if (num % i==0){
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println(num+" "+":is Prime Number");
        }else {
            System.out.println(num+" "+":is not Prime Number");
        }
    }

    private static void primeNumberUsingWhileLoop(int num, int i,boolean flag) {
        while (i<num/2){
            if (num % i==0){
                flag=true;
                break;
            }
            i++;
        }
        if (!flag){
            System.out.println(num+" "+":is Prime Number");
        }else {
            System.out.println(num+" "+":is not Prime Number");
        }
    }
}

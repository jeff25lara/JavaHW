package Class15HW;

public class prime {
    boolean isPrime(int num){
        int count=0;
        for (int i = 1; i <=num; i++) {
            if (num%i==0){
                count++;
            }
        }if (count==2){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        prime num=new prime();
        System.out.println(num.isPrime(7));
    }
}

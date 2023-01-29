package Class15HW;

public class larger {
    int numLarger(int num, int num1){
        if (num>num1) {
            return num;
        }else {
            return num1;
        }
    }

    public static void main(String[] args) {
        larger nums=new larger();
        System.out.println(nums.numLarger(14,17));

    }
}

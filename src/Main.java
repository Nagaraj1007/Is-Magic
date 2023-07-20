
public class Main {

    public static int sod(int number){
        int sum = 0;
        while(number > 0){
            sum += (number % 10);
            number /= 10;
        }
        if(sum == 0){
            return 0;
        }
        if(sum == 1){
            return 1;
        }
        if(sum > 1 && sum <10){
            return 0;
        }
        return sod(sum);
    }

    public static void main(String[] args) {
        System.out.println(sod(3));
    }
}
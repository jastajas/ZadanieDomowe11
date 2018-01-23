public class Numbers {
    public static void main (String[] args){
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int sum = 0;
        for(int n = 0 ; n < numbers.length ; n++ ){
            if(n%2 != 0){
                continue;}
            sum = sum + numbers[n];
        }
        System.out.println(sum);
    }
}


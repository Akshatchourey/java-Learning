public class ArrayExample{
    public static void main(String[] args){
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        int sum = 0;
        for (int num : numbers) sum += num;
        System.out.println("Sum of array elements: " + sum);
    }
}

public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        //To prevent the exception, you need to check if i is within the bounds of the array before attempting to access arr[i]
        if (args.length > 0 && Integer.parseInt(args[0]) >= 0 && Integer.parseInt(args[0]) < arr.length){
            System.out.println(arr[Integer.parseInt(args[0])]);
        }else{
            System.out.println("Index out of bounds");
        }
    }
}
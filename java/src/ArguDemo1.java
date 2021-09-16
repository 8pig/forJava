public class ArguDemo1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {

        }



        int[] arr = {11, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }


        int number = 100;
        System.out.println("before" + number);
        changeNum(number);
        System.out.println("after" + number);
    }
    public static void changeNum(int number) {
        number = 200;
    }




}

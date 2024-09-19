package sept.ex_18092024;

public class Task2 {


    public static void main(String[]args){

        int a = 10;
        System.out.println(  --a + a --  + a--);
        System.out.println(a);
        //A a   9 9
        //B a   9 8
        //C a   8 7
        //Output 9+9+8=26 a value is 7

        int b = 10;
        System.out.println(  --b + b++ + b--);
        System.out.println(b);
        //A b   9 9
        //B b   9 10
        //C b   10 9
        //Output 9+9+10=28 b value is 7


        int c = 10;
        System.out.println(  c-- + c --  + c --);
        System.out.println(c);
        //A c 10 9
        //B c 9 8
        //C c 8 7
        //Output 10+9+8=27 c value is 7


    }
}

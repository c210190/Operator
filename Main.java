public class Main {

    public static void main(String[] args) {
        int answer;
        boolean isTrue;

        /***********************************
         *  算術演算子
         ***********************************/

        // Q1 : 「2」と表示するよう演算子を変更しよう
        answer = 16 + 6;
        System.out.println("Q1: " + answer);

        // Q2 : 「0」と表示するよう演算子を変更しよう
        answer = 16 + 4;
        System.out.println("Q2: " + answer);

        // Q3 : 「4」と表示するよう演算子を変更しよう
        answer = 16 + 6;
        System.out.println("Q3: " + answer);

        // Q4 : 「10」と表示するよう演算子を変更しよう
        answer = 16 + 2 + 3;
        System.out.println("Q4: " + answer);

        // Q5 : 「4」と表示するよう演算子を変更しよう
        answer = 16 + 2 + 3;
        System.out.println("Q5: " + answer);


        /***********************************
         *  関係演算子・論理演算子
         ***********************************/
        int a, b, c;

        // Q6 : 「true」と表示するようa, bに代入する値を変更しよう
        a = 0;
        b = 0;
        isTrue = a * b > 1;
        System.out.println("Q6: " + isTrue);

        // Q7 : 「true」と表示するようa, bに代入する値を変更しよう
        a = 0;
        b = 0;
        isTrue = a * a == b + 1;
        System.out.println("Q7: " + isTrue);

        // Q8 : 「true」と表示するようa, bに代入する値を変更しよう
        a = 0;
        b = 0;
        isTrue = a != 0 && a * a == a && b * b == b + 2;
        System.out.println("Q8: " + isTrue);

        // Q9 : 「true」と表示するようa, b, cに代入する値を変更しよう
        a = 0;
        b = 0;
        c = 0;
        isTrue = a == 0 && b != c;
        System.out.println("Q9: " + isTrue);

        // Q10 : 「true」と表示するようa, b, cに代入する値を変更しよう
        a = 0;
        b = 0;
        c = 0;
        isTrue = a > 0 && false || b + 1 == 3 && c == 5;
        System.out.println("Q10: " + isTrue);

        /***********************************
         *  代入演算子
         ***********************************/

        // Q11 : 「10」と表示するようaに代入する値を変更しよう
        a = 0;
        answer = (b = a) + 2;
        answer += b;
        System.out.println("Q11: " + answer);

        // Q12 : 「10」と表示するようa, b, cに代入する値を変更しよう
        a = 0;
        answer = (b = a) + (c = a * 2);
        answer += b - c;
        System.out.println("Q12: " + answer);
    }
}
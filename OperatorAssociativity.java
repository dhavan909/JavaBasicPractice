public class OperatorAssociativity {
    public static void main(String[] args) {
        //Lets discuss regarding operators associativity in java
        int a = 10;
        int b = 20;
        int c = 30;
        String s1 = "The first expression : a + b * c";
        // * -> high associativity && + -> low associativity. so its right to left
        System.out.println(s1);
        System.out.println(a+b*c);
        String s2 = "The second expression : (a + b) * c";
        // () -> high associativity && * -> low associativity. so its left to right
        System.out.println(s2);
        System.out.println((a+b)*c);
        String s3 = "The third expression : a++ + ++b";
        // ++ -> high associativity && + -> low associativity. so its right to left
        System.out.println(s3);
        System.out.println(a++ + ++b);
    }
}

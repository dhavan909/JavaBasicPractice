public class LiteralTypesDemo {
    public static void main(String [] args){
        //byte : value ranges from  -128 to 127
        byte b = 100;
        System.out.println("Byte value: " + b);
        //short : value ranges from -32768 to 32767
        short s = 10000;
        System.out.println("Short value: " + s);
        //float : value ranges are not specifically defined
        float f = 10.1f;
        System.out.println("Float value: " + f);
        //double : value ranges are not specifically defined
        double d = 10.1;
        System.out.println("Double value: " + d);
        //long : value ranges from -9223372036854775808 to 9223372036854775807
        long l = 100000000L;
        System.out.println("Long value: " + l);
        //int : value ranges from -2147483648 to 2147483647
        int a = 123;
        System.out.println("Integer value: " + a);
        //char : value ranges from 0 to 65535
        char c = 'a';
        System.out.println("Character value: " + c);
    }
    
}

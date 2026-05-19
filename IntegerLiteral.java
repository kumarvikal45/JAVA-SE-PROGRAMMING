public class IntegerLiteral {
    public static void main(String[] args) {
        int a=104; //Decimal Integer literal
        int b=0150; //Octal Integer literal
        int c=0x68; //Hexa Integer literal
        int d=0b1101000; //Binary Integer literal
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int x=6__85_____42_147;
        //int x=_68542147_; //error
        System.out.println(x);
    }
}

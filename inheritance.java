package session3;

public class inheritance {


   // Task 3: Write a Java Program

   // a) Three different classes should be defined and A should be inheited in B  & B should be inheited in C
    //b) All class should contain different method name should return values with formal parameter
    //ex: public int display (int a, int b)

    //c) call the method via object with actual parameter.
    //Ex: int s=obj.display(5,6)

//(Hint: Inheritance and Value passing)
}
class a{
    public int r(int a){
        System.out.println(a);
        return a;
    }
    int s = 3;
}
class b extends a
{
    public int k(int b){
        System.out.println(b);
        return b;
    }
    String SV = "SanV";
}
class c extends b
{
    public int o(int c){
        System.out.println(c);
        return c;
    }
    float san = 215.2f;

    public static void main(String[] args) {
        c asd = new c();
        System.out.println(asd.s);
        System.out.println(asd.SV);
        System.out.println(asd.san);
        asd.r(2);
        asd.k(3);
        asd.o(4);
    }
}

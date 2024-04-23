class Sum{
    int a=0,b=0;      //instence variables
    Sum (int a , int b){
        this.a= a;
        this.b = b;
    }
    void getSum(){
        System.out.println("total sum = "+(a+b));
    }
}
class Mul{
    int a=0,b=0;
    Mul(int a, int b){
        this.a =a;
        this.b =b;
    }
    void getMul(){
        System.out.println("Mul :"+(a*b));

    }
}
class Calc {
    
    public static void main(String[] args) {
        Sum s1 = new Sum(11,11);
        // Sum s2 = new Sum(22,22);
        Mul m1 = new Mul(5, 6);
        s1.getSum();
        m1.getMul();
        // s2.getSum();
    }
}

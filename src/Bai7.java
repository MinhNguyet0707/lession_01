public class Bai7 {
    public static void main(String[] args) {
        double x1,x2;
        int a =2;
       int b=1;
       int c=-1;
        double delta=(b*b)-(4*a*c);
        x1 =(-b-( Math.sqrt(delta))/(2*a));
        x2 =(-b+( Math.sqrt(delta))/(2*a));
        System.out.println("Phương TRình Bạc Hai Có Nghiệm x1=: "+x1);
        System.out.println("Phương TRình Bạc Hai Có Nghiệm x2="+x2);
}
}
public class LineComparision{
 
    static final int x1=2;
    static final int x2=4;
    static final int y1=5;
    static final int y2=7;
    static final int x3=4;
    static final int x4=6;
    static final int y3=9;
    static final int y4=11;
    public static void main(String[]args){
        System.out.println("Welcome To Line Comparison Computation");
        double length1=0;
        double length2=0;
        double x=Math.pow((x2-x1),2);
        double y=Math.pow((y2-y1),2);
        double p=Math.pow((x4-x3),2);
        double q=Math.pow((y4-y3),2);
        length1 = Math.sqrt(x+y);
        length2 = Math.sqrt(p+q);
        String obj1 = String.valueOf(length1);
        String obj2 = String.valueOf(length2);
        boolean res=obj1.equals(obj2);
        if(res == true ){
            System.out.println("The Two Lines Are Equal");
        } else {
            System.out.println("The Two Lines Are Not Equal");
        }
    }
}

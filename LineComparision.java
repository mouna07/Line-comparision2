public class LineComparision{
  static final int x1=2;
  static final int x2=4;
  static final int y1=5;
  static final int y2=7;
  public static void main(String[]args){
  System.out.println("Welcome To Line Comparision Computation");

    double length1=0;
    double x=Math.pow((x2-x1),2);
    double y=Math.pow((y2-y1),2);
    length1 = Math.sqrt(x+y);
    System.out.println("length of the line: "+  length1);
 }
}

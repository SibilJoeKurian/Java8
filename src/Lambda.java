/**
 * Lambda function using interface
 * This class contains a small program of lambda function
 */
public class Lambda {
    public static void main(String[] args){
     add addFucntion=(int a)-> a+a;
     divide divide=(int a)->a/a;
    }

}
interface add{
 int addFucntion(int a);

}
interface divide{
    int divide(int a);
}
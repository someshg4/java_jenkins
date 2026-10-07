
public class Main {

    public static int sum(int start, int end){
        if(end>start){
            return end +sum(start , end-1);
        }else{
            return end;
        }
    }

    public static void count(int n){
        if(n > 0){
            System.out.print( n + " ");
            count(n -1);
        }
    }

    public static void main(String[] args) {
        count(10);
        int result = sum(5,10);

        System.out.println(result);
    }
}
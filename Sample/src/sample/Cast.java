package sample;

public class Cast {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        
        //キャストなし
        System.out.println(a/b);
        
        //キャストあり（doubleで定義）
        System.out.println((double)a/b);
        System.out.println((double)(a/b));
    }

}

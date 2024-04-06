package sample;

public class IfSample {

    public static void main(String[] args) {
            var score = 100;//成績
            
            //条件式が真（true）の場合、このブロックの処理が実行されます
            if(score == 100) {
                System.out.println("満点です！");
            
            //条件式が真（true）の場合、このブロックの処理が実行されます
            }else if(score >= 80) {
                System.out.println("よくできました！");
                
            //条件式が真（true）の場合、このブロックの処理が実行されます
            }else if(score >=60) {
                System.out.println("合格です！");
            
            //どの条件も満たされない場合、このブロックの処理が実行されます
            }else {
                System.out.println("赤点です。。。");
            }

    }

}

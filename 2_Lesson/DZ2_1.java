

public class DZ2_1 {
    public static void main(String[] args) {
        int count = 3;
        CreateTowers(count, 'A', 'B', 'C');
     }
     public static void CreateTowers(int topN, char from,
     char inter, char to) {
        if (topN == 1){
           System.out.println("Диск 1 снять с "
           + from + " положить на " + to);
        }else {
           CreateTowers(topN - 1, from, to, inter);
           System.out.println("Диск "
           + topN + " снять с " + from + " положить на " + to);
           CreateTowers(topN - 1, inter, from, to);
        }
     }
}


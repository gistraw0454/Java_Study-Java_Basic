package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils(){
        //instance 생성 막기
    }


    public static int sum(int[] values){
        int total =0;
        for (int value : values){
            total += value;
        }
        return total;
    }
    public static double average(int[] values){
        return (double)sum(values) /  values.length;
    }
    public static int max(int[] values){
        int max = values[0];
        for (int value : values){
            if (value > max){
                max = value;
            }
        }
        return max;
    }
    public static int min(int[] values){
        int min = values[0];
        for (int value : values){
            if (value < min){
                min = value;
            }
        }
        return min;
    }

}

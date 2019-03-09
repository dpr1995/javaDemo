import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MianShiLo {
    public static void main(String[] args) {
        Date date = new Date();
        dateFormat(date);

    }

    public static int[] maopao(int[] arr){
        int c ;
        for (int a = 0;a<arr.length-1;a++){
            for (int b = 0;b<arr.length-a-1;b++){
                if (arr[b] > arr[b+1]){
                    c = arr[b];
                    arr[b] = arr[b+1];
                    arr[b+1] = c;
                }
            }
        }
        return  arr;
    }

    public static int[] xuanze(int[] arr){
        for (int a = 0;a<arr.length;a++){
            int temp,index = a;
            temp = arr[a];
            for (int b = a;b<arr.length;b++){
                if (arr[b]<temp){
                    index = b;
                    temp = arr[index];
                }
            }
            temp = arr[index];
            arr[index] = arr[a];
            arr[a] = temp;
        }
        return arr;
    }

    public static void xiaoshu(double one){
        BigDecimal decimal = new BigDecimal(one);
        decimal = decimal.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(decimal);
    }

    public static void dateFormat(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd:HH-mm-ss");
        String dateStr = simpleDateFormat.format(date);
        System.out.println(dateStr);
    }
}

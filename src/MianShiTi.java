import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MianShiTi {
    /**
     * 如何获取小数点前两位，并四舍五入？
     */
    public void roundTest(){
        double a = 3.56889;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setRoundingMode(RoundingMode.HALF_DOWN);//设置舍的方式（四舍五入啥的）
        System.out.printf(decimalFormat.format(a));
    }

    /**
     * 如何获取年月日时秒分？
     */
    public void getDateTest(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date now = new Date();
        System.out.printf(format.format(now));

    }

    /**
     * 写一个方法，让一串字符发生反转？
     */
    public void fanzhuanString(String str){
        char[] charArr = str.toCharArray();
        for (int a = 0;a<(charArr.length)/2;a++){
            int b = charArr.length-1-a;
            char temp = charArr[a];
            charArr[a] = charArr[b];
            charArr[b] = temp;
        }
        for (char item : charArr){
            System.out.printf(String.valueOf(item));
        }

    }

    /**
     * 写一个方法，让一串字符转换大小写？
     * @param str
     */
    public void daxieString(String str){
//        System.out.printf(str.toUpperCase());
//        System.out.printf(str.toLowerCase());
        //下面是大写转小写 小写转大写的写法
        char[] arr = str.toCharArray();
        for (int a =0 ;a<arr.length;a++){
            if (Character.isUpperCase(arr[a])){
                arr[a] = Character.toLowerCase(arr[a]);
            }else {
                arr[a] = Character.toUpperCase(arr[a]);
            }
        }
        System.out.printf(String.valueOf(arr));
    }
}

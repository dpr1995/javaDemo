import java.io.*;

public class IODemo {
    public static void main(String[] args) throws IOException{
        File dir = new File("G:\\demo");
        String dirname = "G:\\demo2\\";
        File[] files = dir.listFiles();
        for (File item : files){
            if (item.isFile()){
                System.out.println("准备复制"+item.getName()+"!!!");
                FileInputStream fs = new FileInputStream(item);
                File fileTemp = new File(dirname+item.getName());
                FileOutputStream fo = new FileOutputStream(fileTemp);
                byte[] temp = new byte[512];
                while (fs.read(temp)!=-1){
                    fo.write(temp);
                }
                fs.close();
                fo.close();
                System.out.println("复制结束！！！");
            }
        }
    }
}

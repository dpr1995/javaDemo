public class PaiXu {
    public int[] xuanze(int[] ints) {
        int size = ints.length;
        for (int j = 0;j<size;j++){
            int temp = ints[j];
            int xiabiao = j;
            for(int k = j;k<size;k++){
                if (temp>ints[k]){
                    xiabiao = k;
                    temp = ints[xiabiao];
                }
            }
            int a = ints[xiabiao];
            ints[xiabiao] = ints[j];
            ints[j] = a;
        }
        return ints;
    }

    public int[] maopao(int[] ints){
        int size = ints.length;
        for (int j = 0;j<size-1;j++){
            for (int k = 0;k<size-j-1;k++){
                if (ints[k]>ints[k+1]){
                    System.out.printf(k+"和"+(k+1)+"换\n");
                    int temp = ints[k];
                    ints[k] = ints[k+1];
                    ints[k+1] = temp;
                }
            }
        }
        return ints;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_20 {
    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請輸入5個人的分數");
        int test[] =new int[5];

        for(int i=0;i<test.length;i++){
            String str = br.readLine();
            test[i] =Integer.parseInt(str);
        }

        for(int i=1;i< test.length;i++){
            for(int j=0;j< test.length-i;j++){
                if(test[j]<test[j+1]){
                    int temp = test[j];
                    test[j] = test[j+1];
                    test[j+1] =temp;
                }
            }
        }

        for (int i = 0;i<test.length;i++) {
            System.out.println("第"+(i+1)+"名的分數是"+test[i]);
        }
    }
}

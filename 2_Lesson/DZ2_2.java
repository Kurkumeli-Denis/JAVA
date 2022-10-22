import java.util.Arrays;

public class DZ2_2 {
    public static void main(String[] args) {
        int [] arr = {4, 7, 1, 9, 1, 0, 5, 8};
        for(int i = 0; i < arr.length; i++)
        {
            int x = arr[i];
            int j = i - 1;
            for(; j >= 0; j--)
            {
                if(x < arr[j])
                {
                    arr[j + 1] = arr[j];
                }
                else
                {
                    break;
                }
            }
            arr[j + 1] = x;
            System.out.println(Arrays.toString(arr));
        }
    }
}
  


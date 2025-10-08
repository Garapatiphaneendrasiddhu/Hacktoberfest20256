import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int passCount = 0;
        int failCount = 0;
        
        for(int i = 0; i<n; i++)
        {
            if(arr[i] >= 40)
            {
                passCount++;
            }
            else
            {
                failCount++;
            }
        }
        
        System.out.println("Passed students: " + passCount);
        System.out.println("Failed students: " + failCount);
    }
}

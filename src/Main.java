import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //evenAvg(new int[] {1,4,6,2,5,7,9});
        try {
            Employee employee1 = new Employee("luka","ushveridze","IT","DBA",-5000);
        }catch (EmployeeException e){
            System.out.println(e.getMessage());
        }
    }

    static void evenAvg(int[] arr) throws IOException {
        FileWriter myWriter = new FileWriter("luka.txt");
        int count = 0;
        int sum = 0;
        for (int i = 0;i< arr.length;i++){
            if(arr[i]%2!=0){
                sum+= arr[i];
                count++;
            }
        }
        float avg = (float) sum/count;
        String avgtext = String.valueOf(avg);
        myWriter.write(avgtext);
        myWriter.close();
    }
}
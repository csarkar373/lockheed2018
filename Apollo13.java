import java.io.File;
import java.util.Scanner;

public class Apollo13 {
    public static void main(String[] args) throws Exception {
        File file = new File("ApolloInput.txt");
        //Scanner scan = new Scanner(file);
        Scanner scan = new Scanner(System.in);
        int trials = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < trials; i++) {
            String line = scan.nextLine();
            String[] tokens = line.split(" ");
            for (int j = 0; j < tokens.length; j++) {
                long num = Math.round(Double.parseDouble(tokens[j])*100);
               // System.out.println(num);
                if (num < 18000) {
                    num += 18000;
                } else {
                    num -= 18000;
                }
                String output = "000" + num/100.00 + "00";
                //System.out.println(output);
                int index = output.indexOf(".");
                output = output.substring(index - 3, index + 3);
                System.out.print(output);
                if (j != tokens.length-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

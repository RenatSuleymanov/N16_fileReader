import java.io.*;
class txtFileReader {
    public static void main(String args[]){
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("src/test.txt")))
        {
            while ((s = br.readLine()) != null) {
            System.out.println(s);
            }
        } catch (IOException exc) {
        System.out.println("Error IO: " + exc);
        }
    }
}

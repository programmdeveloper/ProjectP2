import java.io.*;

public class ProjectP2 {



    public static void main(String[] args) {

        //Schreiben in ein File -- FileOutputStream
        OutputStream os = null;
        DataOutputStream dos = null;
        String filename = "test.txt";
        try {

            os = new FileOutputStream(filename);
            dos = new DataOutputStream(os);

            PrintStream ps = new PrintStream(os);
            ps.println("Hello Stream");
            //String text = "Hallo HTW";
            //byte[] textAsByte = text.getBytes();

           /* try {
                //os.write(textAsByte);
                dos.writeInt(42);
            } catch (IOException ex){
                System.err.println("couldn't write data");
                System.exit(0);
            } */
        } catch (FileNotFoundException ex) {
           System.err.println("couldn't open file");
           System.exit(0);
        }



        InputStream is = null;

        try {
            is = new FileInputStream(filename);

        } catch (FileNotFoundException ex){
            System.err.println("couldn't open file");
            System.exit(0);
        }
        /*byte[] readBuffer = new byte[100];
        try {
            is.read(readBuffer);
        } catch (IOException ex){
            System.err.println("couldn't read String");
            System.exit(0);
        }
        String readString = new String(readBuffer);
        System.out.println("read something: " + readString);*/
        //DataInputStream dis = new DataInputStream(is);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String readString = null;
        int readIntValue = 0;
        try {
            //readIntValue = dis.readInt();
            readString = br.readLine();
            System.out.println("read: " + readString);
        } catch (IOException ex){
            System.err.println("couldn't read data");
            System.exit(0);
        }
        //System.out.println("read Integer: " + readIntValue);
    }

}

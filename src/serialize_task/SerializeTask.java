package serialize_task;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeTask {
    public static void main(String[] args) {
        try {
            Terminal terminal = new Terminal(args);
            System.out.println(terminal);

            FileOutputStream fileOut = new FileOutputStream("terminal.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(terminal);

            out.close();
            fileOut.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

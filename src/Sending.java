import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Sending {
    JTextField outgoing;
    PrintWriter writer;
    Socket socket;

    public void go(){
        JFrame frame = new JFrame("Chat");
        JPanel myPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendBatton = new JButton("Send");
        sendBatton.addActionListener(new SendButtonListener());
        myPanel.add(outgoing);
        myPanel.add(sendBatton);
        frame.getContentPane().add(BorderLayout.CENTER, myPanel);
        setUpNetworking();
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
    public void setUpNetworking(){
        try {
            socket = new Socket("127.0.0.1", 5000);
            writer= new PrintWriter(socket.getOutputStream());
            System.out.println("netWorking");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public class SendButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            try {
                writer.println(outgoing.getText());
                writer.flush();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public static void main(String[] args) {
        new Sending().go();
    }
}

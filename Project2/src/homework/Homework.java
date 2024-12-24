package homework;

public class Homework {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                // Create an instance of LoginBox and set it visible
                new LoginBox().setVisible(true);
            }
        });
    }
}

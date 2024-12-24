import javax.swing.JOptionPane;

/**
 * DialogBox class that provides a simple GUI calculator.
 * 
 * @author Rashik Timalsina
 */
public class DialogBox extends javax.swing.JFrame {

    /**
     * Creates new form DialogBox.
     */
    public DialogBox() {
        initComponents();
    }

    /**
     * Initializes the form components.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        N1 = new javax.swing.JLabel();
        N2 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        btnAddition = new javax.swing.JButton();
        btnSubtraction = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        N1.setText("N1");

        N2.setText("N2");

        btnAddition.setText("Addition");
        btnAddition.addActionListener(evt -> performOperation(evt, "addition"));

        btnSubtraction.setText("Subtraction");
        btnSubtraction.addActionListener(evt -> performOperation(evt, "subtraction"));

        btnMultiplication.setText("Multiplication");
        btnMultiplication.addActionListener(evt -> performOperation(evt, "multiplication"));

        btnDivision.setText("Division");
        btnDivision.addActionListener(evt -> performOperation(evt, "division"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(N1)
                                                        .addComponent(N2)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnMultiplication)
                                                        .addComponent(btnAddition))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnDivision)
                                        .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtN2, javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                                .addComponent(btnSubtraction, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtN1, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addContainerGap(66, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(N1)
                                        .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(N2)
                                        .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAddition)
                                        .addComponent(btnSubtraction))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnDivision)
                                        .addComponent(btnMultiplication))
                                .addGap(51, 51, 51)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Performs the selected arithmetic operation and displays the result.
     * 
     * @param evt       the event triggered by the button
     * @param operation the operation to perform ("addition", "subtraction",
     *                  "multiplication", or "division")
     */
    private void performOperation(java.awt.event.ActionEvent evt, String operation) {
        try {
            int a = Integer.parseInt(txtN1.getText());
            int b = Integer.parseInt(txtN2.getText());
            int result = 0;

            switch (operation) {
                case "addition":
                    result = a + b;
                    break;
                case "subtraction":
                    result = a - b;
                    break;
                case "multiplication":
                    result = a * b;
                    break;
                case "division":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Cannot divide by zero", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }

            JOptionPane.showMessageDialog(rootPane, "Result: " + result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Please enter valid numbers", "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            resetFields();
        }
    }

    /**
     * Resets the input fields.
     */
    private void resetFields() {
        txtN1.setText("");
        txtN2.setText("");
    }

    /**
     * Main method to launch the application.
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new DialogBox().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel N1;
    private javax.swing.JLabel N2;
    private javax.swing.JButton btnAddition;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnSubtraction;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    // End of variables declaration//GEN-END:variables
}

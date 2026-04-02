 import javax.swing.*;
import java.awt.event.*;


 class Calc1 {
    public static int add(int[] numbers) {
       int sum = 0;
       for (int n : numbers) {
           sum += n;
       }
       return sum;
   }

   public static int sub(int[] numberss) {
       int sum = numberss[0];
       for (int i = 1; i < numberss.length; i++) {
           sum -= numberss[i];
       }
       return sum;
   }

   public static int mul(int[]numbermul){
       int sum = 1;
       for (int n : numbermul) {
           sum *= n;
       }
       return sum;
       }

       public static double div(double[] numbers){
       double sum=numbers[0];
       for(int i=1;i<numbers.length;i++){
           if(numbers[i]==0){
               System.out.println("divisible by 0 is not possible.....");
           }else{
           sum/=numbers[i];

           }
       }
       return sum;
    }

   
}

public class calc {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Addition Calculator");
        frame.setSize(500, 300);
        frame.setLayout(null);

        // Instruction label
        JLabel label = new JLabel("Enter numbers (space-separated):");
        label.setBounds(30, 30, 300, 30);
        frame.add(label);

        // Input field
        JTextField inputField = new JTextField();
        inputField.setBounds(30, 70, 300, 30);
        frame.add(inputField);

        // Add button
        JButton addButton = new JButton("Add");
        addButton.setBounds(30, 110, 80, 30);
        frame.add(addButton);

        JButton subButton = new JButton("Sub");
        subButton.setBounds(120, 110, 80, 30);
        frame.add(subButton);

        JButton mulButton = new JButton("mul");
        mulButton.setBounds(210, 110, 80, 30);
        frame.add(mulButton);

        JButton divButton = new JButton("div");
        divButton.setBounds(300, 110, 80, 30);
        frame.add(divButton);

        JButton refreshButton=new JButton("Refresh");
        refreshButton.setBounds(390, 110, 80, 30);
        frame.add(refreshButton);       


       // Result label
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(30, 150, 300, 30);
        frame.add(resultLabel);

        // Button action
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String input = inputField.getText();
                    String[] parts = input.trim().split("\\s+");
                    int[] numbers = new int[parts.length];
                    for (int i = 0; i < parts.length; i++) {
                        numbers[i] = Integer.parseInt(parts[i]);
                    }

                    int result = Calc1.add(numbers);  // Call your method
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Enter only numbers.");
                }
            }
        });
subButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){

          try {
                    String input = inputField.getText();
                    String[] parts = input.trim().split("\\s+");
                    int[] numbers = new int[parts.length];
                    for (int i = 0; i < parts.length; i++) {
                        numbers[i] = Integer.parseInt(parts[i]);
                    }

                    int result = Calc1.sub(numbers);  // Call your method
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Enter only numbers.");
                }

      }
});

mulButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){

  try {
                    String input = inputField.getText();
                    String[] parts = input.trim().split("\\s+");
                    int[] numbers = new int[parts.length];
                    for (int i = 0; i < parts.length; i++) {
                        numbers[i] = Integer.parseInt(parts[i]);
                    }

                    int result = Calc1.mul(numbers);  // Call your method
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Enter only numbers.");
                }
            }
    });

    divButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
      try {
                    String input = inputField.getText();
                    String[] parts = input.trim().split("\\s+");
                    double[] numbers = new double[parts.length];
                    for (int i = 0; i < parts.length; i++) {
                        numbers[i] = Integer.parseInt(parts[i]);
                    }

                    double result = Calc1.div(numbers);  // Call your method
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Enter only numbers.");
                }

      }
    });
   
refreshButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
         inputField.setText("");          
        resultLabel.setText("Result: "); 

      }
    });



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

import javax.swing.jOptionPane;
import java.util.ArrayList;

public class TransactionManeger{
    public static void main(String[]args){
        ArrayList<Double>trans=new ArrayList<>();
        double balance=0.0;
        while(true){
            Sting input=jOptionPane.showinputDialog("Please enter positive amount of deposit and 
            negative for withdraw./n(enter'q'if you want to quite.)");
            
            if(input.equalsIgnoreCase("q")){
                break;
            }
            double amount=Double.parseDouble(input);
            trans.add(amount);
            balance+=amount;
            if(balance<0){
                jOptionPane.showMessageDialog(null,"Warning:insufficent balance.");
            }
        }
        jOptionPane.showMessageDialog(null,"Total balance= " +balance);
    }
}
import javax.swing.JOptionPane;

public class HelloWorld{
  public static void main(String[] args)
  {
    //System.out.println("Hello World!");
    JOptionPane.showMessageDialog(
	null, 
	"Welcome to Java!", 
	"Hello World!",
	JOptionPane.INFORMATION_MESSAGE);
  }
}

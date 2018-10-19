import javax.swing.JOptionPane;
public class Test {
public static void main(String[] args) {

Dog robin = new Dog("Robin",2);
robin.setBreed("Border Collie");
robin.setIsMammal(true);

robin.getAll();

Animal betsy = new Animal("Betsy",6);
betsy.setBreed("Bengal Cat");
betsy.setIsMammal(true);

JOptionPane.showMessageDialog(null, "Animal name = "+betsy.getName()
+ "\n Animal Age = " +betsy.getAge()
+ "\n Animal Breed = " + betsy.getBreed()
+ "\n Animal is Mammal = "+betsy.getIsMammal());





}

}

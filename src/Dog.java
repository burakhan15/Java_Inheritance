import javax.swing.JOptionPane;
/**
*
* @author MUH-ENG
*/
public class Dog extends Animal {

private String breed;
private String name;
private int age;

public Dog(){

}

public Dog(String name, int age){

super(name,age);
this.name = name;
this.age = age;

}

public void setBreed (String value){
this.breed = value;
}

public void getAll(){

JOptionPane.showMessageDialog(null, 
"Dog Name = "+this.name + "\n"
+ "Dog Age = " + this.age + "\n"
+ "Dog Breed = " + this.breed + "\n"
+ "Dog is Mammal = " + this.isMammal );
}

}

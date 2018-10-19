public class Animal {

protected String breed = "no breed";
protected int age;
protected String name;
protected boolean isMammal = true;

public Animal(){}

public Animal(String name, int age){
this.name = name;
this.age = age;
}

public void setBreed (String value){
this.breed = value;
}

public void setIsMammal (boolean value){
this.isMammal = value;
}

public String getName(){
return this.name;
}

public int getAge(){
return this.age;
}

public String getBreed(){
return this.breed;
}

public boolean getIsMammal(){
return this.isMammal;
}

}

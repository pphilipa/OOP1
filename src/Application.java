import java.util.ArrayList;
import java.util.List;

public class Application {
	// Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Animal animal1 = new Animal();
//		animal1.setLegs(2);
//		animal1.setName("Kangeroo");
		
		Cat cat1 = new Cat();
		cat1.setLegs(4);
		cat1.setName("Tiger");
		cat1.Properties(); 
		
		Bear bear1 = new Bear();
		bear1.setLegs(3);
		bear1.setName("Winnie de Poo");
		bear1.Properties();
		bear1.Smell();
		
		Dog dog1 = new Dog();
		dog1.setLegs(5);
		dog1.setName("puck");
		dog1.Smell();
		
		List<Animal> animals = new ArrayList<>();
		animals.add(cat1);
		animals.add(new Cat());
		
		animals.forEach(animal -> {
			animal.makeSound();
			
		});
	}

}

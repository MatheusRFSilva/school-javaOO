
public class Main {
	
	public static void main(String[] args) {
		
		Person person = new Person("Matheus",26);
		
		//person.name = "Matheus";
		//person.age = 26;
		//person.cpf = "000000012";
		person.setAge(26);
		//person.say();
		
	//	System.out.println(Person.walk());
		Car car1 = new Car("Blue",220.00);
		//car1.setColor("blue");
		//car1.setTopSpeed(220.00);
		car1.setShifts(5);
		
		System.out.println(car1.getColor()+" "+ car1.getShifts());
		System.out.println("Sua idade é :"+person.getAge());
	}

}

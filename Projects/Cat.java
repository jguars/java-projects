public class Cat {

	private String name;
	private int age;

	public Cat()
	{
		this.name = "Unknown";
		this.age = 0;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public static void main(String[] args) {
		Cat myCat = new Cat();

		System.out.println("Cat's name: " + myCat.getName());
		System.out.println("Cat's age: " + myCat.getAge());
	}
}

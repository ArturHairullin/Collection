
interface Voice {

	void voice();
}

class Cow implements Voice{
	public void voice(){
		System.out.println("Moo");
	}
}

class Cat implements Voice{
	public void voice(){
		System.out.println("Meow");
	}
}

class  Dog implements Voice{
	public void voice(){
		System.out.println("Wuf");
	}
}

class Program {

	public static void main(String[] args) {
		
		Voice cow=new Cow();
		Voice cat=new Cat();
		Voice dog=new Dog();
		
		cat.voice();
		cow.voice();
		dog.voice();
		

	}

}

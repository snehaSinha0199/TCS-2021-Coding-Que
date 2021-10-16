package testpractice;

public class Dog extends Animal {
 void eat(String s) throws Exception {
	System.out.println("Dog eats "+s);
}
 public static void main(String[] args) throws Exception {
	Animal a=new Dog();
	Dog d=(Dog)a;
	a.eat();
	d.eat("Meat");
	StringBuilder sb=new StringBuilder("aAcCeEbB");
sb.insert(sb.lastIndexOf("E"), true);
	System.out.println(sb);
}
}

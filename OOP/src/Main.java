/**
 * Created by Lee Li Wei on 6/19/2017.
 */
import java.util.Scanner;
 class Person {
private String name;
private int age;
public Person(){
    this.name = "";
    this.age  = 0;
}
public Person(String name, int age){
    this.name = name;
    this.age = age;
}
public String getName(){
    return this.name;
}
public void setName(String name){
   this.name = name;
}
}

public class Main {

            public static void main(String[] args){

                Person person1 = new Person();
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the name:");
                String name = input.nextLine();
                person1.setName(name);
                System.out.println( person1.getName());
    }
}

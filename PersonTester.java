/**
 * Name: Zohaib Rahim | Student ID:230155884
 * It is Person Tester file which has a story about a group of friends and a murder case of one of te friend.
 * It uses a Person class which is present in the same package and it uses all the methods present in the Person Class.
 */
package Assignment_2;
public class PersonTester {
  //  private static void lifeStatus(){
   //     final boolean aliveOrDead = Person.isAlive();
 //   }
    private static void printCount ()
    {
        final int livingCount = Person.numberLiving();
        final int deadCount = Person.numberDead();
        final int totalCount = livingCount + deadCount;
        System.out.print("The number of people is " + totalCount);
        if (deadCount > 0)
            System.out.println(String.format(", but %d of them are dead!%n", deadCount));
        else
            System.out.println(".");
    }
    public static void main (String[]args){
        Person elice = new Person("Elice");
        System.out.println("Elice says \"Hi\"");
        elice.sayHello();
        printCount();

        Person candice = new Person("Candice");
        System.out.println("Candice says \"Hi\"");
        candice.sayHello();
        printCount();

        Person salman = new Person("Salman");
        System.out.println("Salman says \"Hi\"");
        salman.sayHello();
        printCount();

        Person shahrukh = new Person("Shahrukh");
        System.out.println("Shahrukh says \"Hi\"");
        shahrukh.sayHello();
        printCount();
        Person.allSayHello();

        System.out.println("Elice: Hi Salman and Shahrukh");
        System.out.println("Shahrukh: Hi Elice");
        System.out.println("Salman: Heyyyy");
        System.out.println("Elice: How are you guys");
        System.out.println("Salman and Shahrukh: Good. What about you?");
        System.out.println("Elice: I am good too. Do you know where is Candice");
        System.out.println("Salman: No, I haven't seen her for too long.");
        System.out.println("Shahrukh: Leave her, she already have got anger issues so it's better she isn't here!");
        System.out.println("*Everyone laughs and jokes about her*");
        System.out.println("*Candice behind them and listened everything and went away from there without meeting them*");
        System.out.println("(Due to Candice's anger and mental health issues, she decided to kill any one of them.)");
        System.out.println("(Elise's home)");
        candice.murder(elice);
        printCount();
        System.out.println("(After killing Elise, Candice's got cooled down and ran away from her home without leaving any trace.");
    }

}

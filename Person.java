/**
 * Name: Zohaib Rahim | Student ID:230155884
 * This is a Person Class which has all the methods for the story of a murder case.
 * It creates all the persons mentioned in the story in the PersonTester class. And does all the essential things required
   as per the story like murdering, dying, saying hello with their name, counting.
 */
package Assignment_2;

import java.util.ArrayList;

public class Person {
    private static int living=0;
    private static int dead=0;
    private static boolean alive;
    private static String na;
    private static ArrayList<String> people_name = new ArrayList<String>();
    private static ArrayList<Person> thePeople = new ArrayList<Person>();
    Person killer = null;
    public Person(String n){ //Creates a living person with name n.
        thePeople.add(this);
        living++;
        this.alive= true;
        this.na=n;
        people_name.add(n);
    }
    public Person murderer(){//Returns the Person that murdered this person. Returns null if this person has not been murdered.
       Person murderer_name=this.killer;
        return murderer_name;
    }
    public String name(){ //Returns this person’s name. Should end with ", deceased" if the person is dead.

        if (this.alive==false) {
            String dead= this.na+ ", deceased";
            return dead;
        }
        else
            return this.na;
    }
    public boolean isAlive(){
        return this.alive;
    }
    public void die(){ //Causes this Person to die, unless they are already dead,when it has no effect.
        this.alive=false;
        dead++;
        living--;
    }
    public void murder(Person victim){ //Causes victim to die, and the murderer to be known to the victim
        victim.killer=this;
        victim.die();
    }
    public void sayHello(){ //causes this Person to print "Hello, I’m name." on System.out .
        System.out.printf("Hello, I'm %s \n", name());
    }
    public static int numberLiving(){
        return living;
    }
    public static int numberDead(){
        return dead;
    }
    public static void allSayHello(){ //causes every living person to say hello as described above.
        for (int c=0; c< thePeople.size();c++) {
           Person identity= thePeople.get(c);
            if (identity.alive == true)
                System.out.printf("Hello, I'm %s \n", people_name.get(c));
        }
    }

}

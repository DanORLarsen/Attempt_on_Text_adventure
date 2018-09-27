import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String Go, Fight, Eat, Hide, Run, Take, Use, Fight1, Fight2, leave, Walk, Start;




    System.out.println("Hello Player! Wanna play? 'yes' or 'no'");
        System.out.print("->");
    Start = sc.next();


    if (Start.equalsIgnoreCase("no"))
    {System.out.println("THE END");}
    else if (Start.equalsIgnoreCase("yes"))
    {System.out.println("You're in a creepy abandoned Asylum. Do you wanna go 'upstairs', 'leave' or 'stay' on the ground floor");
        System.out.print("->");}

    Go = sc.next();

        if (Go.equalsIgnoreCase("leave"))
        {System.out.println("As you open the door to leave the Asylum a man stabs you, and then proceeds to watch you bleed to death");
        System.out.println("THE END");}

        if (Go.equalsIgnoreCase("stay"))
        {System.out.println("You hear someone by the door trying to break in and you wanna defend yourself.");
        System.out.println("on the table in front of you, there is a 'banana' and a 'crowbar'. Which of these items do you pick?");
            System.out.print("->");
        Take = sc.next();

        if (Take.equalsIgnoreCase("banana"))
        {System.out.println("You take the banana and try to fight the intruder with it, it is not very effective and you get stabbed, he then proceeds to watch you bleed to death");
        System.out.println("THE END");}

        if (Take.equalsIgnoreCase("crowbar"))
        {System.out.println("You take the crowbar and hit the intruder in the face as he enters. Which results in him dieing.");
        System.out.println("");
        System.out.println("Do you wanna 'leave' or 'stay'");
        leave = sc.next();

        if (leave.equalsIgnoreCase("leave"))
        {System.out.println("You ran out of the Asylum and never looked back");
        System.out.println("");
        System.out.println("Congratulations you survived the Asylum.");
        System.out.println("You achieved 1 out of x 'happy endings'");}

        if (leave.equalsIgnoreCase("stay"))
        {System.out.println("You decide to stay, you have two options, either go in to the 'visiting' room or go into the 'torture' room. " +
                "What will you do?");}

        }}



        {if (Go.equalsIgnoreCase("upstairs"))
    {System.out.println("You went upstairs, you hear someone walking downstairs. you see a 'closet' and a 'Cleaning' room. Where do you hide?");}
        Hide = sc.next();

        if (Hide.equalsIgnoreCase("closet"))
        {System.out.println("You hide in the closet, and you hear someone walking around close to you. but after a while the noise stops");
        System.out.println("What do you do? Hide a little 'longer' or do you 'leave' the closet?");
        Go = sc.next();
        if (Go.equalsIgnoreCase("leave"))
        {System.out.println("As you leave the closet, the intruder stabs you in the back, as he was hiding beside the closet.");
        System.out.println("THE END");}
        if (Go.equalsIgnoreCase("longer"))
        {System.out.println("You wait a bit, and suddenly the door is opened, and the intruder stabs you with his knife");
        System.out.println("THE END");}}

        if (Hide.equalsIgnoreCase("cleaning"))
        {System.out.println("You hide in the cleaning room, with all the cleaning supplies. You hear someone walking around on your floor. after a while you hear" +
                " the intruder opens a closet, and then proceed to sigh as he tells himself that it was nothing after all, and then walks downstairs");
        System.out.println("You leave the cleaning room and decide if you wanna follow the intruder 'downstairs' or walk further down the 'hallway' ");
        Walk = sc.next();
        if (Walk.equalsIgnoreCase("hallway"))
        {System.out.println("You walk down the hallway, you eventually reach the end");
        System.out.println("You go through a door, and find a pistol(with one mag in it) do you 'take' the gun or 'leave' it?");}}






    }}}

import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // asking for the persons name 
        String persons_name;
        System.out.println("Enter Your Name: ");
        persons_name = scanner.nextLine();

        //asking for the persons age
        int persons_age;
        System.out.println("Enter Your Age: ");
        persons_age = scanner.nextInt();

        //asking for the persons weight
        float persons_weight;
        System.out.println("Enter Your Weight: ");
        persons_weight = scanner.nextFloat();

        //asking for the person if they are a smoker
        boolean smoker;
        System.out.println("Do You Smoke (true for yes, false for no): ");
        smoker = scanner.nextBoolean();

        // learned about the ? conditional because i did not like how my code was originally 
        // i first had it say " and based on theit answer their on if they are a smoker is equals "answer" "
        // i thought that looked dumb so i learned about the ? conditional 
        String smoker_answer = smoker ? "they are a smoker." : "they are not a smoker.";
    
        // i will now print out the values given 
        System.out.println(persons_name + " is "+persons_age + " and they weigh "+ persons_weight + " pounds and "+ smoker_answer);

	}
}

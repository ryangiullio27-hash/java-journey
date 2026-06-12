import java.util.Scanner;

public class TrainingSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to the Training Program!"); 
        System.out.println("Please select a day of the week (1-7) to see your training for that day.");
        Scanner scanner = new Scanner(System.in);
        
        int day = scanner.nextInt();
        String training;

        switch (day) {
            case 1:
                training = "Cardio";
                break;
            case 2:
                training = "Strength Training";
                break;
            case 3:
                training = "Yoga";
                break;
            case 4:
                training = "Pilates";
                break;
            case 5:
                training = "CrossFit";
                break;
            case 6:
                training = "Swimming";
                break;
            case 7:
                training = "Rest Day";
                break;
            default:
                training = "Invalid day";
        }

        System.out.println("Today's training: " + training);
    }
    
}

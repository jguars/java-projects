public class KitchenHelper {
    // Write the method signature here
    public  static double calculateIngredientQuantity(
            int servings, double originalQuantity) {

        // Your code here!
        // Calculate the adjusted ingredient quantity
        double adjustedQuantity = originalQuantity * servings;
        // replace 0.0 with the adjusted quantity
        return adjustedQuantity;
    }
    public static void spiceUpDish (int spiceLevel) {
        switch (spiceLevel) {
            case 1:
                System.out.println("Add more salt.");
                break;
            case 2:
                System.out.println("Add more paprika and cumin.");
                break;
            case 3:
                System.out.println("Add some chili powder.");
                break;
            case 4:
                System.out.println("Add some cayenne pepper.");
                break;
            case 5:
                System.out.println("Add some ghost pepper and habanero pepper.");
                break;
            default:
                System.out.println("Invalid spice level. Please enter a number between 1 and 5.");
                break;

        }
    }
    public static void greetGuest(String name, String timeOfDay) {
        switch (timeOfDay) {
            case "morning":
                System.out.println("Good Morning " + name + "!");
                break;
            case "afternoon":
                System.out.println("Good Afternoon " + name + "!");
                break;
            case "evening":
                System.out.println("Good Evening " + name + "!");
                break;
            default:
                System.out.println("Please enter proper time of the day!");
                break;
        }
    }


    public static void main(String[] args) {
        // Calling the method
        // Replace the arguments with your own values
        greetGuest("Mr.Jumayev", "evening");
        spiceUpDish(3);
        double newQuantity = calculateIngredientQuantity(4, 2.5);
        System.out.println("The adjusted ingredient quantity is: " + newQuantity);

    }
}

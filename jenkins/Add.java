public class Add {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Please provide two numbers as arguments.");
      return;
    }
    
    // Convert the command-line arguments from String to int
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    
    // Calculate the sum
    int sum = x + y;
    
    // Print the sum
    System.out.println("Sum is: " + sum);
  }
}

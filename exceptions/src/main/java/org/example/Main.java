import org.example.Calculator;
import org.example.NegativeNumberError;

void main() {
    Scanner scanner = new Scanner(System.in);

    do {
        System.out.println("""
                What do you want to calculate?
                1) add
                2) subtract
                3) multiply
                4) divide
                5) squareRoot
                6) power
                """);

        String inputCalculation = scanner.nextLine();
        switch (inputCalculation) {
            case "1" -> {
                System.out.println("You chose 'add':");

                System.out.println("Enter number 1:");
                double n1 = scanner.nextDouble();
                System.out.println("Enter number 2:");
                double n2 = scanner.nextDouble();

                System.out.println("Calculator.add(n1, n2) = " + Calculator.add(n1, n2));
            }

            case "2" -> {
                System.out.println("You chose 'subtract':");

                System.out.println("Enter number 1:");
                double n1 = scanner.nextDouble();
                System.out.println("Enter number 2:");
                double n2 = scanner.nextDouble();

                System.out.println("Calculator.subtract(n1, n2) = " + Calculator.subtract(n1, n2));
            }

            case "3" -> {
                System.out.println("You chose 'multiply':");

                System.out.println("Enter number 1:");
                double n1 = scanner.nextDouble();
                System.out.println("Enter number 2:");
                double n2 = scanner.nextDouble();

                System.out.println("Calculator.multiply(n1, n2) = " + Calculator.multiply(n1, n2));
            }

            case "4" -> {
                System.out.println("You chose 'divide':");

                System.out.println("Enter number 1:");
                double n1 = scanner.nextDouble();
                System.out.println("Enter number 2:");
                double n2 = scanner.nextDouble();

                System.out.println("Calculator.divide(n1, n2) = " + Calculator.divide(n1, n2));
            }

            case "5" -> {
                System.out.println("You chose 'squareRoot':");

                System.out.println("Enter number 1:");
                double n = scanner.nextDouble();

                try {
                    System.out.println("Calculator.squareRoot(n) = " + Calculator.squareRoot(n));
                } catch (NegativeNumberError e) {
                    System.out.println(e.getMessage());
                    scanner.nextLine();
                }
            }

            case "6" -> {
                System.out.println("You chose 'power':");

                System.out.println("Enter number 1:");
                double n1 = scanner.nextDouble();
                System.out.println("Enter number 2:");
                int n2 = scanner.nextInt();

                System.out.println("Calculator.power(n1, n2) = " + Calculator.power(n1, n2));
            }

            case ":q!" -> {
                System.out.println("Ending the program..");
                return;
            }

            default -> System.out.println("Invalid input! Try again:");
        }

        scanner.nextLine();
    } while (true);
}
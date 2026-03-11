public class StackPalindromeChecker {

        public static boolean isPalindrome(String str) {
            Stack<Character> stack = new Stack<>();

            // Push characters onto stack
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }

            // Build reversed string
            String reversed = "";
            while (!stack.isEmpty()) {
                reversed += stack.pop();
            }

            // Compare original and reversed
            return str.equals(reversed);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("The string is a Palindrome.");
            } else {
                System.out.println("The string is NOT a Palindrome.");
            }

            scanner.close();
        }
    }
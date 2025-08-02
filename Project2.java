import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of books you want to add");
        int n = sc.nextInt();
        sc.nextLine();

        String[] Title = new String[n];
        String[] Author = new String[n];
        String[] Status = new String[n];
        int choice;
        int count = 0;

        while (true) {
            System.out.println("\n------library menu-------");
            System.out.println("1 Add Books");
            System.out.println("2 Search a Book");
            System.out.println("3 Show Availability");
            System.out.println("4 Mark as issued");
            System.out.println("5 Exit");
            System.out.println("Enter the choice you want to do");
            choice = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.println("\n Enter the title");
                System.out.print(i + 1 + ":");
                Title[count] = sc.nextLine();

                System.out.println("Enter the Author");
                System.out.print(i + 1 + ":");
                Author[count] = sc.nextLine();

                Status[count] = "avilable";
                count++;

            }

            System.out.println("\n-----Show available books-------");
            for (int i = 0; i < n; i++) {
                if (Status[i].equals("--avaliable--")) {
                    System.out.println((i + 1) + "" + Title[i] + "by" + Author[i]);
                }
            }

            System.out.println("--Search the book through title--");
            String search = sc.nextLine().toLowerCase();
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (Title[i].toLowerCase().contains(search)) {
                    System.out.println("Available" + Title[i] + "by" + Author[i]);
                    System.out.println("Status" + Status[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Book not Available");
            }

            System.out.println("\nEnter exact title to marks book");
            String issueTitle = sc.nextLine().toLowerCase();
            boolean issuefound = false;
            for (int i = 0; i < n; i++) {
                if (Title[i].toLowerCase().equals(issueTitle)) {
                    if (Status[i].equals("Available")) {
                        Status[i] = "issues";
                        System.out.println("Book Marked as issued");
                    } else {
                        System.out.println("Already issued");

                    }

                    issuefound = true;
                    break;
                }
            }

            if (!issuefound) {
                System.out.println("book  not found");
            }

        }

    }

}

import java.sql.*;
import java.util.Scanner;

public class Bookings {

    Scanner sc = new Scanner(System.in);
    String profile;
    int inputNo;
    String clientName;
    String phoneNumber;

    public void connection() {

        System.out.println("Are you a client or an admin? Press 1 for client or 2 for admin?: ");
        String profile = sc.nextLine();

        if (profile.equals("1"))
        {
            System.out.println("hello dear client!");
            System.out.println("Please enter your name");
            clientName = sc.nextLine();
            System.out.println("Please enter your phoneNumber");
            phoneNumber = sc.nextLine();
            System.out.println("Dear, " + clientName + "! Thank you for your appointment booking. We will call you back, to number " + phoneNumber);

        }
        else if (profile.equals("2")) {
            System.out.println("hello admin!");
        } else {
            System.out.println("Wrong input");
        }

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datafirst", "root", "Kaposts22");
        } catch (SQLException e) {
            for (Throwable ex : e) {
                System.err.println("Error occurred " + ex);
            }
            e.printStackTrace();
        }

        if (connection != null) {
            System.out.println("Connected to database!");
        } else {
            System.out.println("Failed to make connection!");
        }

        try {
            Statement stmt = connection.createStatement();
            String query = "select * from clients ;";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("press 1 to see all inputs to search press 2  ");
            int input = sc.nextInt();


            switch (input) {
                case 1:
                    while (rs.next()) {
                        inputNo = (int) rs.getObject(1);
                        clientName = rs.getObject(2).toString();
                        phoneNumber = rs.getObject(3).toString();
                        System.out.println(inputNo + " " + clientName + " " + phoneNumber);
                    }
                    break;
                case 2:
                    System.out.println("Enter search value (client name or phone number):");
                    String searchInput = sc.nextLine();
                    while (rs.next()) {

                        if (searchInput.equals(clientName) || searchInput.equals(phoneNumber)) {
                            System.out.println("Found: " + inputNo + " " + clientName + " " + phoneNumber);
                        } else {
                            System.out.println("No match");
                            break;
                        }

                    }
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }

        catch (SQLException e) {
            e.printStackTrace();
            for (Throwable ex : e) {
                System.err.println("Error occurred " + ex);
            }
            System.out.println("Error in fetching data");
        }

    }

}



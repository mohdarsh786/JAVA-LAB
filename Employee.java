import java.util.*;
class invalidempwork extends Exception 
{
    public invalidempwork(String msg) 
    {
        super(msg);
    }
}

class Employee {
    public static void main(String[] st) 
    {
        int emp_id, dept_id;
        String name;
        Scanner data = new Scanner(System.in);
        try {
            System.out.print("Enter Employee id: ");
            emp_id = data.nextInt();

            System.out.print("Enter Department id: ");
            dept_id = data.nextInt();
            data.nextLine();

            System.out.print("Enter Name: ");
            name = data.nextLine();

            if (!Character.isUpperCase(name.charAt(0))) 
            {
                throw new invalidempwork("First letter of the name should be capital.");
            }

            if (dept_id < 1 || dept_id > 5) 
            {
                throw new invalidempwork("Department ID must be between 1 and 5.");
            }

            if (emp_id < 2001 || emp_id > 5001) 
            {
                throw new invalidempwork("Employee ID must be between 2001 and 5001.");
            }
            System.out.println("\n--- Employee Details ---");
            System.out.println("Employee ID: " + emp_id);
            System.out.println("Employee Name: " + name);
            System.out.println("Department ID: " + dept_id);
        } catch (invalidempwork e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
 
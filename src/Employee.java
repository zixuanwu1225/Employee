public class Employee {
    private int currentID = 101;
    private static int mostRecentID = 101;
    private static int ID;
    private String firstName = "";
    private String lastName = "";
    private static int employees;
    public Employee(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        currentID = mostRecentID;
        employees++;
        ID = mostRecentID;
        mostRecentID++;
    }
    public String fullName(){
        String name = firstName+" "+lastName;
        return name;
    }
    public int currentEmployeeID(){
        return currentID;
    }
    public int recentEmployeeID(){
        return ID;
    }
    public int employeeAmount(){
        return employees;
    }
}

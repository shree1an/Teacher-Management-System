/**
 * The Teacher class encapsulates essential details such as Teacher ID, name, address, working type, employment status, and working hours.
 * Providing a foundational structure for generic educator information.
 * @author (Shreejan Giri)
 * @version (15.01.2024)
 */
//creating a parent class Teacher
public class Teacher 
{
    // Declaration of instance variables 
    private int teacherID;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    // Constructor that initialize an instance variables
    public Teacher(int teacherID, String teacherName, String address, String workingType,String employmentStatus)
    {
        // initializing instance variables with given parameters
        this.teacherID = teacherID;     // 'this.' refers to the instance variables
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }
    
    //Corresponding accessor method for each attribute.
    //accessor method for teacherID;
    public int getTeacherID() 
    {
        return this.teacherID; //returns the value of instance variable teacherID
    }
    
    //accessor method for teacherID;
    public String getTeacherName()
    {
        return this.teacherName; //returns the value of instance variable teacherID
    }
    
    //accessor method for teacherID;
    public String getAddress()
    {
        return this.address; //returns the value of instance variable teacherID
    }
    
    //accessor method for teacherID;
    public String getWorkingType()
    {
        return this.workingType; //returns the value of instance variable teacherID
    }
    
    //accessor method for teacherID;
    public String getEmploymentStatus()
    {
        return this.employmentStatus; //returns the value of instance variable teacherID
    }
    
    //accessor method for teacherID;
    public int getWorkingHours()
    {
        return this.workingHours; //returns the value of instance variable teacherID
    }
    
    //mutator method for working hour.
    public void setWorkingHours(int workingHours)
    {
        this.workingHours = workingHours; //set instance variable named as workingHours to parameter workingHours
    }
    
    //display method to print teacher information
    public void display()
    {
        System.out.println("Teacher ID: "+this.getTeacherID()); //returns the value of instance variable teacherID from accessor method 
        System.out.println("Teacher Name: "+this.getTeacherName());
        System.out.println("Address: "+this.getAddress());
        System.out.println("Working Type: "+this.getWorkingType());
        System.out.println("Employment Status: "+this.getEmploymentStatus());  
        
        // checking if working hours are assigned or not and printing suitable comment.
        if(this.getWorkingHours() > 0) {
            System.out.println("Working Hours: "+this.getWorkingHours()); //returns the value of instance variable workingHours from accessor method
        }
        else if (this.getWorkingHours() <= 0) {
            System.out.println("Working Hours: Not assigned!!");
        }
    }
}

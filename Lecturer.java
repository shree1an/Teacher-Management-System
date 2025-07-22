/**
 * The Lecturer class extends the Teacher class 
 * specalize in grading the assignment submitted by student 
 * @author (Shreejan Giri)
 * @version (16.01.2024)
 */
//creating a child class Lecturer which extends Teacher
public class Lecturer extends Teacher
{
    // Declaratoin of instance variables
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    private char grade;
    
    // Constructor that initialize an instance variables
    public Lecturer(int teacherID, String teacherName, String address, String workingType, String employmentStatus, int workingHours,
                    String department, int yearsOfExperience, int gradedScore)
    {
        //calling the value of instance variables from the parent class
        super(teacherID, teacherName, address, workingType,employmentStatus); 
        super.setWorkingHours(workingHours); // calls mutator method from parent class with the parameter workingHours
        // initializing instance variables with given parameters
        this.department = department; // 'this.' refers to the instance variables
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;   //instance variable gradedScore is set to 0
        this.hasGraded = false; //instance variable hasGraded is set to false   
 
    }
    
    //corresponding accessor method for each attribute.
    public String getDepartment()
    {
        return this.department; //returns the value of instance variable department
    }
    
    public int getYearsOfExperience()
    {
        return this.yearsOfExperience; //returns the value of instance variable yearsOfExperience
    }
    
    public int getGradedScore()
    {
        return this.gradedScore; //returns the value of instance variable gradedScore 
    }
    
    public boolean getHasGraded()
    {
       return this.hasGraded; //returns the value of instance variable hasGraded
    }
    
    public char getGrade() {
        return this.grade;
    }
    
    //mutator method for gradedScore
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore = gradedScore; //set instance variable named as gradedScore to parameter gradedScore
    }
    
    /*instance method to grade assignments of students who have submitted their assignments.
     * the method accepts gradeScore, department and YearsOfExperience.
     */
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience) 
    {
        //checking ig yearsOfExperience and department of lecturer is eligible or not for grading assignment
        if (yearsOfExperience >= 5 && this.getDepartment().equals(department))
        {
            
            this.gradedScore = gradedScore; //set instance variable named as gradedScore to parameter of gradedScore
            System.out.println("Graded Score: "+this.getGradedScore());
            
            if (this.gradedScore >= 70) {
                this.grade = 'A'; //sets value of grade to 'A'
            } 
            else if (this.gradedScore >= 60) {
                this.grade = 'B'; //sets value of grade to 'B'
            } 
            else if (this.gradedScore >= 50) {
                this.grade = 'C'; //sets value of grade to 'C'
            } 
            else if (this.gradedScore >= 40) {
                this.grade = 'D'; //sets value of grade to 'D'
            } 
            else {
                this.grade = 'E'; //sets value of grade to 'E'
            }
            this.hasGraded = true; //sets instance variable hasGrade to true.
            System.out.println("Assignment graded successfully!"+"\n"+"Grade of the Student: "+this.grade);
        } 
        else {
            System.out.println("Lecturer is not eligible to grade!");
        }
    } 
    
    //display method to print Lecturer information
    public void display()
    {
        //calls the display method of the parent class
        super.display();
        System.out.println("Lecturer Department: "+this.getDepartment()); //returns the value of instance variable from accessor method
        System.out.println("Years Of Experience: "+this.getYearsOfExperience());
        System.out.println("Graded Score: "+this.getGradedScore());
        
        //checking if has graded or not
        if(this.hasGraded) {
            System.out.println("Grade of the Student: "+this.grade); //returns the value of instance variable garde
        }
        else {
            System.out.println("Assignment not graded yet!!");
        }
    }
}

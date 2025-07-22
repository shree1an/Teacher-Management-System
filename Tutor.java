/**
 * The Tutor class extends the Teacher class and represents a turor in an institute
 * specalize set the salary according to appraisal if Tutor certified and removing Tutor if not Certified 
 * @author (Shreejan Giri)
 * @version (17.01.2024)
 */
//creating a child class Tutor which extends Teacher
public class Tutor extends Teacher {
    // Declaratoin of instance variables
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    // Constructor that initialize an instance variables
    public Tutor(int teacherId, String teacherName, String address, String workingType,String employmentStatus, 
                int workingHours, int salary, String academicQualifications, int performanceIndex) 
    {
        //calling the value of instance variables from the parent class
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours); // calls mutator method from parent class with the parameter workingHours

        this.salary = salary;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false; //instance variable isCertified is set to false
    }

   
    //corresponding accessor method for each attribute.
    public double getSalary() {
        return this.salary; //returns the value of instance variable salary 
    }

    public String getSpecialization() {
        return this.specialization; //returns the value of instance variable specialization
    }

    public String getAcademicQualifications() {
        return this.academicQualifications; //returns the value of instance variable academicQualification
    }

    public int getPerformanceIndex() {
        return this.performanceIndex; //returns the value of instance variable performanceIndex
    } 

    public boolean getIsCertified() {
        return this.isCertified; //returns the value of instance variable isCertified
    }

    //creating a mutator method with the parameter salary and performanceIndex
    public void setSalary(double salary, int performanceIndex) 
    {
        if (performanceIndex > 5 && this.getWorkingHours() > 20) {
            float appraisalPercentage; //decalring appraisalPercentage as float
            if (performanceIndex > 5 && performanceIndex <= 7) {
                appraisalPercentage = 0.05F; //5%
            }
            else if (performanceIndex >=8 && performanceIndex <= 9) {
                appraisalPercentage = 0.10F; //10%
            }
            else {
                appraisalPercentage = 0.20F; //20%
            }
            this.salary = salary + appraisalPercentage * salary;
            System.out.println("New Salary of Tutor after appraisal: "+this.getSalary());
            this.isCertified = true; //instance variabele isCertified is set to true.
        }
        else {
            System.out.println("Salary cannot be approved. Tutor is not eligible for appraisal.");
        }
    }
    
    //instance method to remove method of tutor who is not certified.
    public void removeTutor() 
    {
        //chaecking if Tutor is certified or not.
        if (this.getIsCertified()) {
            System.out.println("Tutor is certified!! Tutor cannot be removed.");
        }
        else {
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
            System.out.println("Tutor is not certified Tutor is removed!!");
        }
    }    
    
    //display method to print tutor information
    public void display() 
    {
        //calls the display method of the parent class
        super.display();
        /*checking if isCertified is true or not
         * if true it will display
         */
        if (this.isCertified) {
            System.out.println("Salary: "+this.getSalary());
            System.out.println("Specialization: " +this.getSpecialization());
            System.out.println("Academic Qualifications: " +this.getAcademicQualifications());
            System.out.println("Performance Index: " +this.getPerformanceIndex());
        }
    }
    
    
}

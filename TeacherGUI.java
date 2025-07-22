import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TeacherGUI {
    // Teacher list
    private ArrayList<Teacher> teacherList;
    
    //GUI components
    private JFrame frame;
    private JPanel topPanel, lecturerPanel, tutorPanel;
    private JLabel title;
    private JButton LecturerBtn, TutorBtn;

    //Lecture components
    private JLabel LteacherIDLabel, LteacherNameLabel, LaddressLabel, LworkingTypeLabel, LemploymentStatusLabel,LworkingHoursLabel,
                LecturerLabel,departmentLabel, yearsOfExperienceLabel, lecturerDepartment, lecturerYearsOfExperience, lectureGradedScore;

    private JTextField LteacherIdTxt, LteacherNameTxt, LaddressTxt, LworkingTypeTxt, LemploymentStatusTxt, LworkingHoursTxt, 
                departmentTxt, yearsOfExperienceTxt, gradedScoreTxt, lecturerDepartmentTxt, lecturerYearsOfExperienceTxt, lectureGradedScoreTxt;

    private JButton addLecturerBtn, gradeAssignmentBtn, lecturerDisplayBtn, lecturerClearBtn; 
    
    // Tutor components 
    private JLabel TteacherIDLabel, TteacherNameLabel, TaddressLabel, TworkingTypeLabel, TemploymentStatusLabel,TworkingHoursLabel,
                    TutorLabel, salaryLabel, specializationLabel, academicLabel, performanceLabel, newSalaryLabel, newPerformanceLabel;

    private JTextField TteacherIdTxt, TteacherNameTxt, TaddressTxt, TworkingTypeTxt, TemploymentStatusTxt, TworkingHoursTxt,
                    salaryTxt, specializationTxt, academicTxt, performanceTxt, newSalaryTxt, newPerformanceTxt;
                    
    private JButton addTutorBtn, setSalaryBtn,removeBtn,tutorDisplayBtn, tutorClearBtn;

    // Constructor
    public TeacherGUI(){
        teacherList = new ArrayList<>(); 
        
        // Frame setup
        frame = new JFrame("Teacher System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1200, 800);

        // Top panel setup
        topPanel = new JPanel();
        topPanel.setBounds(0, 0, 1200, 150);
        topPanel.setBackground(new Color(65, 68, 138));
        topPanel.setLayout(null);
        title = new JLabel("Teacher System");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.WHITE);
        title.setBounds(500, 20, 300, 40);
        topPanel.add(title);

        // Lecturer button setup
        LecturerBtn = new JButton("Lecturer");
        LecturerBtn.setBounds(400, 80, 150, 50);
        topPanel.add(LecturerBtn);
        LecturerBtn.addActionListener(new ActionListener() { //adding function to add action when the button is pressed
            public void actionPerformed(ActionEvent e) {//and now creating it
                lecturerPanel.setVisible(true);//panel1 is set to be visible
                tutorPanel.setVisible(false);//panel2 is set to be invisible
            }
        });

        // Tutor button setup
        TutorBtn = new JButton("Tutor");
        TutorBtn.setBounds(700, 80, 150, 50);
        topPanel.add(TutorBtn);
        TutorBtn.addActionListener(new ActionListener() { //adding function to add action when the button is pressed
            public void actionPerformed(ActionEvent e) {//and now creating it
                lecturerPanel.setVisible(false);//panel1 is set to be visible
                tutorPanel.setVisible(true);//panel2 is set to be invisible
            }
        });
    
        // Adding components to frame
        frame.add(topPanel);

        // lecturer panel 
        lecturerPanel = new JPanel();
        lecturerPanel.setBounds(0, 160, 1200, 600);
        lecturerPanel.setLayout(null);
        lecturerPanel.setVisible(true);
        frame.add(lecturerPanel);
        
        
        
        LecturerLabel = new JLabel(">------- Lecturer -------<");
        LecturerLabel.setBounds(500,0,200,30);
        lecturerPanel.add(LecturerLabel);
        
        //1st column
        LteacherIDLabel = new JLabel("Teacher ID : ");
        LteacherIDLabel.setBounds(100, 50, 130, 30);
        lecturerPanel.add(LteacherIDLabel);
        
        LteacherIdTxt = new JTextField();
        LteacherIdTxt.setBounds(260, 50, 300, 30);
        lecturerPanel.add(LteacherIdTxt);
        
        LteacherNameLabel = new JLabel("Teacher Name : ");
        LteacherNameLabel.setBounds(100, 100, 130, 30);
        lecturerPanel.add(LteacherNameLabel);
        
        LteacherNameTxt = new JTextField();
        LteacherNameTxt.setBounds(260, 100, 300, 30);
        lecturerPanel.add(LteacherNameTxt);
        
        LaddressLabel = new JLabel("Address : ");
        LaddressLabel.setBounds(100, 150, 130, 30);
        lecturerPanel.add(LaddressLabel);
        
        LaddressTxt = new JTextField();
        LaddressTxt.setBounds(260, 150, 300, 30);
        lecturerPanel.add(LaddressTxt);
        
        LworkingTypeLabel = new JLabel("Working Type : ");
        LworkingTypeLabel.setBounds(100, 200, 130, 30);
        lecturerPanel.add(LworkingTypeLabel);
        
        LworkingTypeTxt = new JTextField();
        LworkingTypeTxt.setBounds(260, 200, 300, 30);
        lecturerPanel.add(LworkingTypeTxt);

        LworkingHoursLabel = new JLabel("Working Hours : ");
        LworkingHoursLabel.setBounds(100, 250, 130, 30);
        lecturerPanel.add(LworkingHoursLabel);
        
        LworkingHoursTxt = new JTextField();
        LworkingHoursTxt.setBounds(260, 250, 300, 30);
        lecturerPanel.add(LworkingHoursTxt);
        
        LemploymentStatusLabel = new JLabel("Employment Status : ");
        LemploymentStatusLabel.setBounds(100, 300, 160, 30);
        lecturerPanel.add(LemploymentStatusLabel);
        
        LemploymentStatusTxt = new JTextField();
        LemploymentStatusTxt.setBounds(260, 300, 300, 30);
        lecturerPanel.add(LemploymentStatusTxt);
        
        departmentLabel = new JLabel("Department : ");
        departmentLabel.setBounds(100, 350, 160, 30);
        lecturerPanel.add(departmentLabel);
        
        departmentTxt = new JTextField();
        departmentTxt.setBounds(260, 350, 300, 30);
        lecturerPanel.add(departmentTxt);
        
        yearsOfExperienceLabel = new JLabel("Years Of Experience : ");
        yearsOfExperienceLabel.setBounds(100, 400, 160, 30);
        lecturerPanel.add(yearsOfExperienceLabel);
        
        yearsOfExperienceTxt = new JTextField();
        yearsOfExperienceTxt.setBounds(260, 400, 300, 30);
        lecturerPanel.add(yearsOfExperienceTxt);
        
        addLecturerBtn = new JButton("Add Lecturer");
        addLecturerBtn.setBounds(100, 450, 130, 30);
        lecturerPanel.add(addLecturerBtn);
        addLecturerBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (LteacherIdTxt.getText().isBlank() || LteacherNameTxt.getText().isBlank() || LaddressTxt.getText().isBlank() || 
                LworkingHoursTxt.getText().isBlank() || LworkingTypeTxt.getText().isBlank() || LemploymentStatusTxt.getText().isBlank() || 
                departmentTxt.getText().isBlank() || yearsOfExperienceTxt.getText().isBlank()) {
                JOptionPane.showMessageDialog(addLecturerBtn, "Some fields contain no information", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    int teacherId = Integer.parseInt(LteacherIdTxt.getText());
                    String teacherName = LteacherNameTxt.getText();
                    String address = LaddressTxt.getText();
                    int workingHours = Integer.parseInt(LworkingHoursTxt.getText());
                    String workingType = LworkingTypeTxt.getText();
                    String employmentStatus = LemploymentStatusTxt.getText();
                    String department = departmentTxt.getText();
                    int gradedScore = 0;
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceTxt.getText());
                    
                    // Create a new Lecturer object with the provided information
                    Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus, workingHours, department, yearsOfExperience, gradedScore);
                    
                    // Add the lecturer object to your teacher list
                    teacherList.add(lecturer);
                    
                    JOptionPane.showMessageDialog(addLecturerBtn, "Lecturer added successfully!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(addLecturerBtn, "Please insert valid numbers for Teacher ID, Working Hours, and Years of Experience");
                }
            }
        }
        });


        // button to display the lecturer details
        lecturerDisplayBtn = new JButton("Display Lecturer");
        lecturerDisplayBtn.setBounds(250, 450, 130, 30);
        lecturerPanel.add(lecturerDisplayBtn);
        lecturerDisplayBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String lecturerDetails = "";
                // Iterate through the teacherList
                for(Teacher teacher : teacherList) {
                    // Check if the teacher is an instance of Lecturer
                    if(teacher instanceof Lecturer) {
                        // Cast the teacher to Lecturer
                        Lecturer lecturer = (Lecturer) teacher;
                        
                        // Display lecturer details in a message dialog
                        lecturerDetails += "Lecturer Details :\n" +
                                    "Teacher ID: " + lecturer.getTeacherID() + "\n" +
                                    "Teacher Name: " + lecturer.getTeacherName() + "\n" +
                                    "Address: " + lecturer.getAddress() + "\n" +
                                    "Working Type: " + lecturer.getWorkingType() + "\n" +
                                    "Employment Status: " + lecturer.getEmploymentStatus() + "\n" +
                                    "Graded Score: " + lecturer.getGradedScore() + "\n" +
                                    "Years Of Experience: " + lecturer.getYearsOfExperience() + "\n" +
                                    "Department: " + lecturer.getDepartment() + "\n\n";
                    }
                }  
                JOptionPane.showMessageDialog(frame, lecturerDetails, "Lecturer Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        //button to clear the textfield
        lecturerClearBtn = new JButton("Clear All");
        lecturerClearBtn.setBounds(400, 450, 130, 30);
        lecturerPanel.add(lecturerClearBtn);
        lecturerClearBtn.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
             LteacherIdTxt.setText("");
             LteacherNameTxt.setText("");
             LaddressTxt.setText("");
             LworkingTypeTxt.setText("");
             LworkingHoursTxt.setText("");
             LemploymentStatusTxt.setText("");
             departmentTxt.setText("");
             yearsOfExperienceTxt.setText("");
             gradedScoreTxt.setText(""); 
             }
        });
    
        
        // second column
        lecturerDepartment = new JLabel("Department : ");
        lecturerDepartment.setBounds(700, 50, 130, 30);
        lecturerPanel.add(lecturerDepartment);
        
        lecturerDepartmentTxt = new JTextField(); 
        lecturerDepartmentTxt.setBounds(850, 50, 300, 30); 
        lecturerPanel.add(lecturerDepartmentTxt); 

        
        lecturerYearsOfExperience = new JLabel("Years Of Experience : ");
        lecturerYearsOfExperience.setBounds(700, 100, 130, 30);
        lecturerPanel.add(lecturerYearsOfExperience);
        
        lecturerYearsOfExperienceTxt = new JTextField();
        lecturerYearsOfExperienceTxt.setBounds(850, 100, 300, 30);
        lecturerPanel.add(lecturerYearsOfExperienceTxt);
        
        lectureGradedScore = new JLabel("Graded Score : ");
        lectureGradedScore.setBounds(700, 150, 130, 30);
        lecturerPanel.add(lectureGradedScore);
        
        lectureGradedScoreTxt = new JTextField();
        lectureGradedScoreTxt.setBounds(850, 150, 300, 30);
        lecturerPanel.add(lectureGradedScoreTxt);

        
        // setup action to grade assignment button to grade the assignment
        gradeAssignmentBtn = new JButton("Grade Assignment");
        gradeAssignmentBtn.setBounds(830, 200, 250, 30);
        lecturerPanel.add(gradeAssignmentBtn);
        gradeAssignmentBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
                if (lecturerDepartmentTxt.getText().isEmpty() || lectureGradedScoreTxt.getText().isEmpty() || lecturerYearsOfExperienceTxt.getText().isEmpty() || LteacherIdTxt.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please Enter in All fields", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    int gradeId = Integer.parseInt(LteacherIdTxt.getText());
                    int gradedScore = Integer.parseInt(lectureGradedScoreTxt.getText());
                    int yearsOfExperience = Integer.parseInt(lecturerYearsOfExperienceTxt.getText());
                    String department = lecturerDepartmentTxt.getText();
                    
        
                    for (Teacher teacher : teacherList) {
                        if (teacher instanceof Lecturer) {
                            Lecturer lecturer = (Lecturer) teacher;
                            if (lecturer.getTeacherID() == gradeId && lecturer.getDepartment().equals(department)) {
                                if (yearsOfExperience >= 5) {
                                    lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                                    char grade = lecturer.getGrade();
                                    JOptionPane.showMessageDialog(frame, "ASSIGNMENT GRADED SUCCESSFULLY !!" + "\n" +
                                            "Graded Score : " + gradedScore + "\n"+"Grade: "+ grade);
                                } else {
                                    JOptionPane.showMessageDialog(frame, " !! YEARS OF EXPERIENCE NOT MET OR DOES NOT BELONG TO THE SAME DEPARTMENT !!", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "INVALID INPUT !! PLEASE ENTER CORRECT VALUES !!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });





        // tutor panel 
        tutorPanel = new JPanel();
        tutorPanel.setBounds(0, 160, 1200, 600);
        tutorPanel.setLayout(null);
        tutorPanel.setVisible(false);
        frame.add(tutorPanel);
        
        TutorLabel = new JLabel(">------- Tutor -------<");
        TutorLabel.setBounds(500,0,200,30);
        tutorPanel.add(TutorLabel);
        
        //1st column
        TteacherIDLabel = new JLabel("Teacher ID : ");
        TteacherIDLabel.setBounds(100, 50, 130, 30);
        tutorPanel.add(TteacherIDLabel);
        
        TteacherIdTxt = new JTextField();
        TteacherIdTxt.setBounds(260, 50, 300, 30);
        tutorPanel.add(TteacherIdTxt);
        
        TteacherNameLabel = new JLabel("Teacher Name : ");
        TteacherNameLabel.setBounds(100, 100, 130, 30);
        tutorPanel.add(TteacherNameLabel);
        
        TteacherNameTxt = new JTextField();
        TteacherNameTxt.setBounds(260, 100, 300, 30);
        tutorPanel.add(TteacherNameTxt);
        
        TaddressLabel = new JLabel("Address : ");
        TaddressLabel.setBounds(100, 150, 130, 30);
        tutorPanel.add(TaddressLabel);
        
        TaddressTxt = new JTextField();
        TaddressTxt.setBounds(260, 150, 300, 30);
        tutorPanel.add(TaddressTxt);
        
        TworkingTypeLabel = new JLabel("Working Type : ");
        TworkingTypeLabel.setBounds(100, 200, 130, 30);
        tutorPanel.add(TworkingTypeLabel);
        
        TworkingTypeTxt = new JTextField();
        TworkingTypeTxt.setBounds(260, 200, 300, 30);
        tutorPanel.add(TworkingTypeTxt);

        TworkingHoursLabel = new JLabel("Working Hours : ");
        TworkingHoursLabel.setBounds(100, 250, 130, 30);
        tutorPanel.add(TworkingHoursLabel);
        
        TworkingHoursTxt = new JTextField();
        TworkingHoursTxt.setBounds(260, 250, 300, 30);
        tutorPanel.add(TworkingHoursTxt);
        
        TemploymentStatusLabel = new JLabel("Employment Status : ");
        TemploymentStatusLabel.setBounds(100, 300, 160, 30);
        tutorPanel.add(TemploymentStatusLabel);
        
        TemploymentStatusTxt = new JTextField();
        TemploymentStatusTxt.setBounds(260, 300, 300, 30);
        tutorPanel.add(TemploymentStatusTxt);
        
        salaryLabel = new JLabel("Salary: ");
        salaryLabel.setBounds(100, 350, 160, 30);
        tutorPanel.add(salaryLabel);
        
        salaryTxt = new JTextField();
        salaryTxt.setBounds(260, 350, 300, 30);
        tutorPanel.add(salaryTxt);
        
        specializationLabel = new JLabel("specialization : ");
        specializationLabel.setBounds(100, 400, 160, 30);
        tutorPanel.add(specializationLabel);
        
        specializationTxt = new JTextField();
        specializationTxt.setBounds(260, 400, 300, 30);
        tutorPanel.add(specializationTxt);
        
        academicLabel = new JLabel("Academic Level : ");
        academicLabel.setBounds(100, 450, 160, 30);
        tutorPanel.add(academicLabel);
        
        academicTxt = new JTextField();
        academicTxt.setBounds(260, 450, 300, 30);
        tutorPanel.add(academicTxt);
        
        performanceLabel = new JLabel("Performance Index : ");
        performanceLabel.setBounds(100, 500, 160, 30);
        tutorPanel.add(performanceLabel);
        
        performanceTxt = new JTextField();
        performanceTxt.setBounds(260, 500, 300, 30);
        tutorPanel.add(performanceTxt);

        // tutor 1st column button
        
        //adding tutor setup
        addTutorBtn = new JButton("Add Tutor");
        addTutorBtn.setBounds(100, 550, 130, 30);
        tutorPanel.add(addTutorBtn);
        addTutorBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (TteacherIdTxt.getText().isBlank() || TteacherNameTxt.getText().isBlank() || TaddressTxt.getText().isBlank() || 
                TworkingHoursTxt.getText().isBlank() || TworkingTypeTxt.getText().isBlank() || TemploymentStatusTxt.getText().isBlank() || 
                salaryTxt.getText().isBlank() || specializationTxt.getText().isBlank() || performanceTxt.getText().isBlank()) {
                JOptionPane.showMessageDialog(addTutorBtn, "Some fields contain no information", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    int teacherId = Integer.parseInt(TteacherIdTxt.getText());
                    String teacherName = TteacherNameTxt.getText();
                    String address = TaddressTxt.getText();
                    int workingHours = Integer.parseInt(TworkingHoursTxt.getText());
                    String workingType = TworkingTypeTxt.getText();
                    String employmentStatus = TemploymentStatusTxt.getText();
                    int salary = Integer.parseInt(salaryTxt.getText());
                    String specialization = specializationTxt.getText();
                    int performanceIndex = Integer.parseInt(performanceTxt.getText());
                    
                    // Create a new Tutor object with the provided information
                    Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, performanceIndex);
                    
                    // Add the tutor object to your teacher list
                    teacherList.add(tutor);
                    
                    JOptionPane.showMessageDialog(addTutorBtn, "Tutor added successfully!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(addTutorBtn, "Please insert valid numbers for Teacher ID, Working Hours, Salary, and Performance Index");
                }
            }
        }
        });
        
        
        // Tutor display details setup
        tutorDisplayBtn = new JButton("Display Tutor");
        tutorDisplayBtn.setBounds(250, 550, 130, 30);
        tutorPanel.add(tutorDisplayBtn);
        tutorDisplayBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tutorDetails = "";
                for (Teacher teacher : teacherList) {
                    if (teacher instanceof Tutor) {
                        Tutor tutor = (Tutor) teacher;
                        tutorDetails += "TUTOR DETAILS :-\n" +
                                "Teacher ID : " + tutor.getTeacherID() + "\n" +
                                "Teacher Name : " + tutor.getTeacherName() + "\n" +
                                "Address : " + tutor.getAddress() + "\n" +
                                "WorkingType : " + tutor.getWorkingType() + "\n" +
                                "Employment Status : " + tutor.getEmploymentStatus() + "\n" +
                                "Working Hours : " + tutor.getWorkingHours() + "\n" +
                                "Salary : " + tutor.getSalary() + "\n" +
                                "Specialization : " + tutor.getSpecialization() + "\n" +
                                "Academic Qualification : " + tutor.getAcademicQualifications() + "\n" +
                                "Performance Index: " + tutor.getPerformanceIndex() + "\n";
                    }
                }
                JOptionPane.showMessageDialog(frame, tutorDetails, "tutor Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        tutorClearBtn = new JButton("Clear All");
        tutorClearBtn.setBounds(400, 550, 130, 30);
        tutorPanel.add(tutorClearBtn);
        tutorClearBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                TteacherIdTxt.setText("");
                TteacherNameTxt.setText("");
                TaddressTxt.setText("");
                TworkingTypeTxt.setText("");
                TworkingHoursTxt.setText("");
                TemploymentStatusTxt.setText("");
                salaryTxt.setText("");
                specializationTxt.setText("");
                performanceTxt.setText(""); 
            }
        });

    
        // second column

        newSalaryLabel = new JLabel("Salary : ");
        newSalaryLabel.setBounds(680, 50, 130, 30);
        tutorPanel.add(newSalaryLabel);
        
        newSalaryTxt = new JTextField(); 
        newSalaryTxt.setBounds(850, 50, 300, 30); 
        tutorPanel.add(newSalaryTxt); 

        
        newPerformanceLabel = new JLabel("New Performance Index: ");
        newPerformanceLabel.setBounds(680, 100, 170, 30);
        tutorPanel.add(newPerformanceLabel);
        
        newPerformanceTxt = new JTextField();
        newPerformanceTxt.setBounds(850, 100, 300, 30);
        tutorPanel.add(newPerformanceTxt);


        // button for 2nd column
        setSalaryBtn = new JButton("Set Salary");
        setSalaryBtn.setBounds(700, 150, 200, 30);
        tutorPanel.add(setSalaryBtn);
        setSalaryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the entered values from text fields
                String teacherIdStr = TteacherIdTxt.getText();
                String newSalaryStr = newSalaryTxt.getText();
                String newPerformanceStr = newPerformanceTxt.getText();
        
                // Check if any field is empty
                if (teacherIdStr.isBlank() || newSalaryStr.isBlank() || newPerformanceStr.isBlank()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                try {
                    // Parse the entered values
                    int teacherId = Integer.parseInt(teacherIdStr);
                    double newSalary = Double.parseDouble(newSalaryStr);
                    int newPerformance = Integer.parseInt(newPerformanceStr);
        
                    // Search for the tutor with the entered ID
                    for (Teacher teacher : teacherList) {
                        if (teacher instanceof Tutor && teacher.getTeacherID() == teacherId) {
                            // Update salary and performance index using the setSalary method
                            Tutor tutor = (Tutor) teacher;
                            tutor.setSalary(newSalary, newPerformance);
                            JOptionPane.showMessageDialog(frame, "Salary set successfully for Tutor with ID: " + teacherId, "Success", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
        
                    // If tutor with entered ID not found
                    JOptionPane.showMessageDialog(frame, "Tutor with ID " + teacherIdStr + " not found", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input for salary or performance index", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
        

        //adding action in button to remove the tutor 
        removeBtn = new JButton("Remove Tutor");
        removeBtn.setBounds(900, 150, 200, 30);
        tutorPanel.add(removeBtn);
        removeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int teacherId = Integer.parseInt(TteacherIdTxt.getText());
                    boolean found = false; // Flag to track if tutor with given ID is found
        
                    // Iterate through the teacherList
                    for (Teacher teacher : teacherList) {
                        if (teacher instanceof Tutor && teacher.getTeacherID() == teacherId) {
                            teacherList.remove(teacher); // Remove the tutor
                            found = true;
                            JOptionPane.showMessageDialog(frame, "Tutor with ID : " + teacherId + " removed successfully !!");
                            break; // Exit the loop once the tutor is removed
                        }
                    }
        
                    if (!found) {
                        JOptionPane.showMessageDialog(frame, "Please enter a registered teacher ID !!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "INVALID INPUT !! PLEASE ENTER CORRECT VALUES !!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        
        //Display the frame
        frame.setVisible(true);
    }

    //main method
    public static void main(String []args){
        new TeacherGUI();
    }
}

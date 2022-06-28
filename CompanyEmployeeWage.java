public class CompanyEmployeeWage {
    static final int EMP_IS_PRESENT = 1;
    public static void main(String[] args) {
        display();
        CompanyEmployeeWage attendenceCheck = new CompanyEmployeeWage();
        attendenceCheck.attendanceCheck();
    }

    public static void display() {
        System.out.println("Welcome to Employee Wage Calculation");
    }

    public void attendanceCheck() {

        int empRandomCheck = (int) (Math.random() * 2);

        if (empRandomCheck == EMP_IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
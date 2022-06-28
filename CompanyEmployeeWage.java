public class CompanyEmployeeWage {
    static final int EMP_IS_PRESENT = 1;
    static final int FULL_TIME_WORKING_HRS = 8;

    public static void main(String[] args) {
        display();
        CompanyEmployeeWage attendenceCheck = new CompanyEmployeeWage();
        int workingHrsPerDay = attendanceCheck();
        attendenceCheck.dailyWage(workingHrsPerDay);
    }

    public static void display() {
        System.out.println("Welcome to Employee Wage Calculation");
    }

    public static int attendanceCheck() {

        int empRandomCheck = (int) (Math.random() * 2);

        int workingHrsPerDay;
        if (empRandomCheck == EMP_IS_PRESENT) {
            System.out.println("Employee is Present");
            workingHrsPerDay = FULL_TIME_WORKING_HRS;
        } else {
            System.out.println("Employee is Absent");
            workingHrsPerDay = 0;
        }
        return workingHrsPerDay;
    }

    public int dailyWage(int workingHrPerDay) {

        int WAGE_PER_HRS = 20;

        int dailyWage = WAGE_PER_HRS * workingHrPerDay;
        System.out.println("Daily wage: " + dailyWage);

        return dailyWage;
    }

}
public class CompanyEmployeeWage {
    static final int EMP_IS_PRESENT = 1, IS_PART_TIME_PRESENT = 2;
    static final int FULL_TIME_WORKING_HRS = 8, PART_TIME_WORKING_HRS = 4,
                    WORKING_DAY_FOR_MONTH = 20, TOTAL_WORKING_HRS = 100;

    public static void main(String[] args) {
        display();
        CompanyEmployeeWage attendenceCheck = new CompanyEmployeeWage();
        int workingHrsPerDay = attendenceCheck.switchCase();
        attendenceCheck.dailyWage(workingHrsPerDay);
        int monthlyWage = attendenceCheck.monthlyWage();
        System.out.println("Employee Monthly Wage : " + monthlyWage);
    }

    public static void display() {
        System.out.println("Welcome to Employee Wage Calculation");
    }

    public static int attendanceCheck() {

        int empRandomCheck = (int) (Math.random() * 3);

        int workingHrsPerDay;
        if (empRandomCheck == EMP_IS_PRESENT) {
            System.out.println("Employee is Present");
            workingHrsPerDay = FULL_TIME_WORKING_HRS;
        } else if (empRandomCheck == IS_PART_TIME_PRESENT) {
            System.out.println("Employee is Part Time Present");
            workingHrsPerDay = PART_TIME_WORKING_HRS;
        } else {
            System.out.println("Employee Absent");
            workingHrsPerDay = 0;
        }
        return workingHrsPerDay;
    }
    public int switchCase() {

        int workingHrPerDay;
        int rand = (int) (Math.random() * 3);

        switch (rand) {

            case EMP_IS_PRESENT:
                System.out.println("Employee is full time Present");
                workingHrPerDay = FULL_TIME_WORKING_HRS;
                break;

            case IS_PART_TIME_PRESENT:
                System.out.println("Employee is part time Present");
                workingHrPerDay = PART_TIME_WORKING_HRS;
                break;

            default:
                System.out.println("Employee is absent");
                workingHrPerDay = 0;
        }
        return workingHrPerDay;
    }
    public int monthlyWage() {
        CompanyEmployeeWage monthlyWageCalculator = new CompanyEmployeeWage();

        int monthlyWage = 0, workingHrsPerMonth = 0;

        for (int i = 1; i <= WORKING_DAY_FOR_MONTH; i++) {
            System.out.println("Day-" + i);
            if (workingHrsPerMonth >= TOTAL_WORKING_HRS)
                break;;
            int workingHrsPerDay = monthlyWageCalculator.attendanceCheck();
            int dailyWage = monthlyWageCalculator.dailyWage(workingHrsPerDay);

            monthlyWage += dailyWage;
            workingHrsPerMonth += workingHrsPerDay;
        }
        System.out.println("Employee Hrs :" + workingHrsPerMonth);
        return monthlyWage;
    }


    public int dailyWage(int workingHrPerDay) {

        int WAGE_PER_HRS = 20;

        int dailyWage = WAGE_PER_HRS * workingHrPerDay;
        System.out.println("Daily wage: " + dailyWage);

        return dailyWage;
    }

}
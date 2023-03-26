import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        //Declaring the array for storing the number of hours worked on each in a week.
        int[] workedHoursOnEachDayInAWeek =  new int[7];

        //Taking input from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of hours Jeevitha worked on each day from Sunday to Saturday");
        for(int iterator=0;iterator<7;iterator++)
        {
            workedHoursOnEachDayInAWeek[iterator] = scan.nextInt();
        }

        int weeklySalary = 0;
        int weekDaysTotalHours = 0;
        for(int iterator=1;iterator<6;iterator++)
        {
            weeklySalary += workedHoursOnEachDayInAWeek[iterator]*100;
            if(workedHoursOnEachDayInAWeek[iterator] > 8)
            {
                weeklySalary += (workedHoursOnEachDayInAWeek[iterator]-8)*15;
            }
            weekDaysTotalHours += workedHoursOnEachDayInAWeek[iterator];
        }

        if(weekDaysTotalHours > 40)
        {
            weeklySalary += (weekDaysTotalHours-40)*25;
        }

        weeklySalary += (workedHoursOnEachDayInAWeek[0]*150) + (workedHoursOnEachDayInAWeek[6] * 125);

        //printing weeklySalary
        System.out.println(weeklySalary);
    }
}
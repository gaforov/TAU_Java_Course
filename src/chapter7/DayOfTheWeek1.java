package chapter7;

public class DayOfTheWeek1 {

    public static void main(String[] args) {
        System.out.println(getWeek(2));
        System.out.println(getWeek("Friday"));
    }

    public static String getWeek(int week){
        switch (week){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid week. Please enter a value between 1 and 7.";
        }
    }

    public static int getWeek(String week){
        switch (week){
            case "Monday": return 1;
            case "Tuesday": return 2;
            case "Wednesday": return 3;
            case "Thursday": return 4;
            case "Friday": return 5;
            case "Saturday": return 6;
            case "Sunday": return 7;
            default: return -1;
        }
    }
}

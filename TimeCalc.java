public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutes_to_add = Integer.parseInt(args[1]);
        int total_minutes = hours*60 + minutes + minutes_to_add;
        int total_hours = total_minutes/60;
        int new_hours = total_hours % 24;
        int new_minutes = total_minutes - (total_hours*60);

        String displayHours = (new_hours < 10) ? "0" + new_hours : String.valueOf(new_hours);
        String displayMinutes = (new_minutes < 10) ? "0" + new_minutes : String.valueOf(new_minutes);

        System.out.println(displayHours + ":" + displayMinutes);




    }
}

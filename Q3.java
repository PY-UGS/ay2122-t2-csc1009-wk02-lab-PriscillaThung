public class Q3 {
    
    public static void main (String[] args)
    {
        float totalMiliseconds = System.currentTimeMillis();
        float totalSeconds = totalMiliseconds/ 1000;
        int currSeconds = (int)totalSeconds % 60;
        float totalMinutes = totalSeconds / 60;
        int currMinute = (int)totalMinutes % 60;
        float totalHours = totalMinutes /60;
        int currHour = (int)totalHours %24;
        System.out.println("Current time is " + currHour + ":" + currMinute + ":" + currSeconds + " GMT");
    }   
}

package Lab10;

public class Timezone {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        String formattedTime = convertMillis(time);
        System.out.println("Current time (GMT+7) (h:m:s): " + formattedTime);
    }

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;

        long seconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long minutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        
        long hours = (totalHours + 7) % 24;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

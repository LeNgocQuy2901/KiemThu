
public class Grade {
    public static char getGrade(int score) {
        if (score < 0 || score > 10) {
            return 'I';
        } else if (score >= 9) {
            return 'A';
        } else if (score >= 8) {
            return 'B';
        } else if (score >= 7) {
            return 'C';
        } else if (score >= 5) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
package homework_15;

public class SubjectMark {
    private int math;
    private int biology;

    public SubjectMark(int biology, int math) {
        this.biology = biology;
        this.math = math;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }
}

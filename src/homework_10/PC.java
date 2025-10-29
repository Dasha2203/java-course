package homework_10;

public class PC {
    private String os;
    private int ram;

    PC(String os, int ram) {
        this.os = os;
        this.ram = ram;
    }


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}

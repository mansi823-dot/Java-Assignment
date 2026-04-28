class TimeHM {
    int h, m;

    TimeHM(int h, int m) {
        this.h = h;
        this.m = m;
    }

    void add(TimeHM t) {
        int min = this.m + t.m;
        int hourCarry = min / 60;
        min %= 60;

        int hour = this.h + t.h + hourCarry;

        System.out.println("Time = " + hour + ":" + min);
    }

    public static void main(String[] args) {
        TimeHM t1 = new TimeHM(2, 50);
        TimeHM t2 = new TimeHM(1, 30);
        t1.add(t2);
    }
}
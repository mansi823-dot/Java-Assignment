class TimeFull {
    int h, m, s;

    TimeFull(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void add(TimeFull t) {
        int sec = this.s + t.s;
        int minCarry = sec / 60;
        sec %= 60;

        int min = this.m + t.m + minCarry;
        int hourCarry = min / 60;
        min %= 60;

        int hour = this.h + t.h + hourCarry;

        System.out.println("Time = " + hour + ":" + min + ":" + sec);
    }

    public static void main(String[] args) {
        TimeFull t1 = new TimeFull(2, 45, 50);
        TimeFull t2 = new TimeFull(1, 20, 30);
        t1.add(t2);
    }
}
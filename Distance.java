class Distance {
    int m, cm, mm;

    Distance(int m, int cm, int mm) {
        this.m = m;
        this.cm = cm;
        this.mm = mm;
    }

    void add(Distance d) {
        int mmSum = this.mm + d.mm;
        int cmCarry = mmSum / 10;
        mmSum %= 10;

        int cmSum = this.cm + d.cm + cmCarry;
        int mCarry = cmSum / 100;
        cmSum %= 100;

        int mSum = this.m + d.m + mCarry;

        System.out.println("Total Distance = " + mSum + "m " + cmSum + "cm " + mmSum + "mm");
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(2, 50, 5);
        Distance d2 = new Distance(3, 60, 7);
        d1.add(d2);
    }
}
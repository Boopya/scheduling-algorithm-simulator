public class SJFAttributes {
    String p;
    double bt;

    public void setProcessLabel(String p) {
        this.p = p;
    }

    public String getProcessLabel() {
        return p;
    }

    public void setBurstTime(double bt) {
        this.bt = bt;
    }

    public double getBurstTime() {
        return bt;
    }

    public static SJFAttributes[] sortBurstTime(SJFAttributes[] sjfObjects, int SJF_ARRAY_LENGTH) {
        SJFAttributes sjfTempObjectStorage;

        for(int i = 0; i < SJF_ARRAY_LENGTH; i++) {
            for(int j = 0; j < SJF_ARRAY_LENGTH-i-1; j++) {
                if(sjfObjects[j].getBurstTime() > sjfObjects[j+1].getBurstTime()) {
                    sjfTempObjectStorage = sjfObjects[j];
                    sjfObjects[j] = sjfObjects[j+1];
                    sjfObjects[j+1] = sjfTempObjectStorage;
                }
            }
        }

        return sjfObjects;
    }
}

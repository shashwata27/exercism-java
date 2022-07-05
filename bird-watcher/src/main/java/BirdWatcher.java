
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] arr={0, 2, 5, 3, 7, 8, 4};
        return arr;
    }

    public int getToday() {
        if(birdsPerDay.length==0){
            return 0;
        }
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]+=1;
    }

    public boolean hasDayWithoutBirds() {
        for(int cnt:birdsPerDay){
            if(cnt==0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        Integer cnt=0;
        numberOfDays=numberOfDays > 7 ? 7:numberOfDays;
        for(int i=0;i<numberOfDays;i++){
            cnt+=birdsPerDay[i];
        }
        return cnt;
    }

    public int getBusyDays() {
        int busyDays=0;
        for(int bird:birdsPerDay){
            if(bird>=5){
                busyDays+=1;
            }
        }
        return busyDays;
    }
}

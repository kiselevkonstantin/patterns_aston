package strategy;

public class Student {
    public Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.doActivity();
    }
}

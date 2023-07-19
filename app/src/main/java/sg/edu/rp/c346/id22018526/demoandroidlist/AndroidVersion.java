package sg.edu.rp.c346.id22018526.demoandroidlist;

public class AndroidVersion {

    private String name;

    private double version;

    public AndroidVersion (String name,double version) {
        this.name = name;
        this.version = version;
    }
    public String getName(){
        return name;
    }
    public double getVersion(){
        return version;
    }
    @Override
    public String toString() {
        return name +'\n' + version;
    }
}

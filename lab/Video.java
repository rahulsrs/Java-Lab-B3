package lab;

public class Video {
    String mName;
    boolean status;
    double rating;

    public Video(String mName, boolean status, double rating) {
        // super();
        this.mName = mName;
        this.status = status;
        this.rating = rating;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
         this.rating = rating;
        
    }
}

package prac3;

public abstract class MediaItem {
    private String title;
    private double lengthsec;

    public MediaItem(String title, double lengthsec) {
        this.title = title;
        this.lengthsec = lengthsec;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLengthsec() {
        return lengthsec;
    }

    public void setLengthsec(double lengthsec) {
        this.lengthsec = lengthsec;
    }

    public String summary(){
        return (this.title + "(" + this.lengthsec + ")");
    }

    public abstract void  play();

    @Override
    public String toString() {
        return "MediaItem{" +
                "title='" + title + '\'' +
                ", lengthsec=" + lengthsec +
                '}';
    }
}

package prac3;

public class Song extends MediaItem implements Downloadable, Rateable {
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Song(String title, double lengthsec, String genre) {
        super(title, lengthsec);
        this.genre = genre;
    }


    @Override
    public void Rate(int x) {
       if (x>0 && x<5) {
           System.out.println(this.getTitle() + " rated " + x + "/5");
       }
    }

    @Override
    public String download() {
        return this.getClass() +" downloaded "+ this.getTitle();
    }

    @Override
    public double sizeinMB() {
        return getLengthsec()*0.04;
    }

    @Override
    public String toString() {
        return "Song{" +
                "genre='" + genre + '\'' +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Playing music:" + getTitle() + this.genre);
    }


}

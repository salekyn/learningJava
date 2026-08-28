package prac3;

public class liveStream extends MediaItem implements Rateable {
    private String gametype;

    public String getGametype() {
        return gametype;
    }

    public void setGametype(String gametype) {
        this.gametype = gametype;
    }

    public liveStream(String title, double lengthsec, String gametype) {
        super(title, lengthsec);
        this.gametype = gametype;
    }

    @Override
    public void Rate(int x) {

    }

    @Override
    public void play() {
        System.out.println("Playing stream:" + getTitle() + this.gametype);
    }


}

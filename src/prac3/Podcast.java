package prac3;

public class Podcast extends MediaItem implements Downloadable{
    private String topic;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Podcast(String title, double lengthsec, String topic) {
        super(title, lengthsec);
        this.topic = topic;
    }

    @Override
    public String download() {
        return this.getClass() +" downloaded "+ this.getTitle();
    }

    @Override
    public double sizeinMB() {
        return (this.getLengthsec()*0.02);
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "topic='" + topic + '\'' +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Playing podcast:" + getTitle() + this.topic);
    }


}

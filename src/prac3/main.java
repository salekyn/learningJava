package prac3;

public class main {
    static void main() {

        MediaItem marr[] = new MediaItem[3];

        marr[0] = new Podcast("title", 3, "topic");
        marr[1] = new Song("String title", 5, "String genre");
        marr[2] = new liveStream("String title", 6, "String gametype");

        marr[0].play();
        marr[1].play();
        marr[2].play();

        System.out.println(((Downloadable)marr[0]).sizeinMB()); // typecasting is imp
        System.out.println(((Downloadable)marr[1]).sizeinMB());

        ((Rateable)marr[1]).Rate(1);
        ((Rateable)marr[2]).Rate(3);

        System.out.println(marr[1]);
        System.out.println(marr[2]);
        System.out.println(marr[0]);

    }

}

package Tugas01PBO;

abstract class MediaAudio {
    public abstract void putarAudio();
}

class Lagu extends MediaAudio {
    private String judul;

    public Lagu(String judul) {
        this.judul = judul;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar lagu: " + judul);
    }
}

class Podcast extends MediaAudio {
    private String judul;

    public Podcast(String judul) {
        this.judul = judul;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar podcast: " + judul);
    }
}

class Audiobook extends MediaAudio {
    private String judul;

    public Audiobook(String judul) {
        this.judul = judul;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar audiobook: " + judul);
    }
}

public class no10b {
    public static void main(String[] args) {
        MediaAudio[] playlist = {
            new Lagu("Lagu Favorit"),
            new Podcast("Cerita Teknologi"),
            new Audiobook("Buku Digital")
        };

        for (MediaAudio media : playlist) {
            media.putarAudio();
        }
    }
}

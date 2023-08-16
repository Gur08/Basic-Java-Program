package August12;

public abstract class MediaPlayer {
    public abstract void play();
    public abstract void pause();
    public abstract void stop();

    public void name(){
        //statement
    }
}
class Videoplayer extends MediaPlayer{

    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void pause() {
        System.out.println("Video is pause");
    }

    @Override
    public void stop() {
        System.out.println("Video is stopped");
    }
}
class Audioplayer extends MediaPlayer{

    @Override
    public void play() {
        System.out.println("Audio is playing");
    }

    @Override
    public void pause() {
        System.out.println("Audio is paused");
    }

    @Override
    public void stop() {
        System.out.println("Audio is Stopped");
    }
}
class Applepod extends MediaPlayer{

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {
        System.out.println("Music Stopped");
    }

    public void replay(){

    }
}

class main{
    public static void main(String[] args) {
        Videoplayer videoplayer = new Videoplayer();
        videoplayer.play();
        videoplayer.stop();
        videoplayer.pause();
        Audioplayer audioplayer = new Audioplayer();
        audioplayer.play();
        audioplayer.play();
        audioplayer.stop();


    }
}
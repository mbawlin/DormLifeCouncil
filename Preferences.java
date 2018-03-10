public class Preferences {
 
 
        public int QuietTime; 
        public int music;
        public int reading; 
        public int chatting;
 
        public Preferences (int Quiet, int Music, int Reading, int Chatting) 
        { 
        this.QuietTime = Quiet;
        this.music = Music;
        this.reading = Reading;
        this.chatting= Chatting;
        }
 
 
public int Compability (Preferences pref) {
    return Math.abs (QuietTime-pref.QuietTime) + Math.abs (reading-pref.reading) +Math.abs (chatting-pref.chatting)+Math.abs (music-pref.music);
}
 
}
package MediaLib121;

public class LoopingMediaLib {
        public static void main()
        {
            String songInfo =  MediaFile.readString();
            while(songInfo != null) {
                System.out.println(songInfo);
                songInfo =  MediaFile.readString();
        }

}}

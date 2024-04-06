package com.example.cumminscampusconnect10;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class festDetails extends AppCompatActivity {

    private TextView fest, des;
    MediaPlayer mp1=null;
    VideoView videoView1=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fest_details);


        fest = findViewById(R.id.tv);
        des = findViewById(R.id.tv2);

        String getFest = getIntent().getStringExtra("fest");
        fest.setText(getFest);

        videoView1 = findViewById(R.id.video);
        String videoPath="";

        int imageResourceId=0;
        switch (getFest) {
            case "Gandhaar":
                //final
                imageResourceId = R.drawable.gandhaar;
                mp1 = MediaPlayer.create(festDetails.this, R.raw.gandhaaraud);
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.gand;

                des.setText("Gandhaar is the annual cultural fest at the College." +
                        "Its a week full of culture, grace and colours."+
                        "Themes all around and colours all around!");
                break;
            case "Innovation":
                //video change
                imageResourceId = R.drawable.innovation;
                mp1 = MediaPlayer.create(festDetails.this, R.raw.mars);
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.dandiya;
                des.setText("Innovation is the annual technical fest at Cummins. We are techies of course" +
                        " All the students wait for this event to compete with their unbelievable " +
                        "technical skills. ");
                break;
            case "Pentacle":
                //final
                imageResourceId = R.drawable.pentacle; // Use the appropriate image resource
                mp1 = MediaPlayer.create(festDetails.this, R.raw.zinda);
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.pent;
                des.setText("Pentacle is the annual sports fest at Cummins. An inter-college event that consists of" +
                            " different colleges competing with each other with sports man spirit.");
                break;
            case "Dandiya":
                //final
                imageResourceId = R.drawable.dandiya;
                mp1 = MediaPlayer.create(festDetails.this, R.raw.dandiyaaud);
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.dandiya;
                des.setText("The Diva Dandiya is one of the most awaited" +
                        "festivals in Cummins. The Student Panel arranges this event every year." +
                        "A festival full of decorations and fun!");
                break;
            case "Dahi Handi":
                //final
                mp1 = MediaPlayer.create(festDetails.this, R.raw.radhe);
                imageResourceId = R.drawable.dahihandi; // Use the appropriate image resource
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.dahihandi;
                des.setText("Dahi Handi," + "The birth of Lord Krishna celebrated all over " +
                        "Cummins filled with pots of 'makhan' and all the " +
                        "departments compete with each other. ");
                break;
            default:
                break;
        }

        ImageView dynamicImageView = findViewById(R.id.festimg);
        dynamicImageView.setImageResource(imageResourceId);

        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                // When the audio reaches the end, reset and start it again
                mediaPlayer.seekTo(0);
                mediaPlayer.start();
            }
        });

        // Start playing the audio
        videoView1.setVideoURI(Uri.parse(videoPath));

        videoView1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                videoView1.seekTo(0);
                videoView1.start();
            }
        });
        mp1.start();
        videoView1.start();




    }
    protected void onDestroy() {
        super.onDestroy();

        // Release the MediaPlayer when the activity is destroyed
        if (mp1 != null) {
            mp1.release();
            mp1 = null;
        }
        if (videoView1 != null) {
            videoView1.stopPlayback();
        }
    }
}
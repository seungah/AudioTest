package starbloom0128.kr.hs.emirim.audiotest;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch switchMusic;
    MediaPlayer musicPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchMusic = (Switch)findViewById(R.id.switch_music);
        musicPlayer=MediaPlayer.create(this, R.raw.open);
        switchMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switchMusic.isChecked())
                    musicPlayer.start(); //true면 재생
                else
                    musicPlayer.pause(); //일시정지
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        musicPlayer.stop();
    }

}

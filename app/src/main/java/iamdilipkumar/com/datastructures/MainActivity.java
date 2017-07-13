package iamdilipkumar.com.datastructures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements DownloadTask.UpdateProgress {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progress);
        progressBar.setMax(100);
        progressBar.setProgress(0);

        DownloadTask downloadTask = new DownloadTask();
        downloadTask.execute(this);
    }

    @Override
    public void updateProgressBar(int progress) {
        progressBar.setProgress(progress);
    }
}

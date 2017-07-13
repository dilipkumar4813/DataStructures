package iamdilipkumar.com.datastructures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import iamdilipkumar.com.datastructures.services.DownloadTask;

public class MainActivity extends AppCompatActivity implements DownloadTask.UpdateProgress {

    ProgressBar progressBar;
    TextView tvDownload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDownload = (TextView) findViewById(R.id.tv_download);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        progressBar.setMax(100);
        progressBar.setProgress(0);

        DownloadTask downloadTask = new DownloadTask();
        downloadTask.execute(this);
    }

    @Override
    public void updateProgressBar(int progress) {
        progressBar.setProgress(progress);

        if(progress==100){
            tvDownload.setVisibility(View.VISIBLE);
            progressBar.setVisibility(View.GONE);
        }
    }
}

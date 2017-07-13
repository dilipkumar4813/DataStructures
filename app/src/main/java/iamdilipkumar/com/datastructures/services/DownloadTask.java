package iamdilipkumar.com.datastructures.services;

import android.os.AsyncTask;

/**
 * Created on 13/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */
public class DownloadTask extends AsyncTask<DownloadTask.UpdateProgress, Integer, Void> {

    private UpdateProgress updateProgress;

    public interface UpdateProgress {
        void updateProgressBar(int progress);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(UpdateProgress... params) {
        updateProgress = params[0];

        try {
            publishProgress(5);
            Thread.sleep(1000);
            publishProgress(21);
            Thread.sleep(2000);
            publishProgress(50);
            Thread.sleep(3000);
            publishProgress(76);
            Thread.sleep(4000);
            publishProgress(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        updateProgress.updateProgressBar(values[0]);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}

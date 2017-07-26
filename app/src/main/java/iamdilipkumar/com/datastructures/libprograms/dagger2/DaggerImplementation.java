package iamdilipkumar.com.datastructures.libprograms.dagger2;

/**
 * Created on 26/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class DaggerImplementation {

    public static void main(String[] args) {
        GameSession session = new GameSession();
        DaggerGameComponent.create().inject(session);
        System.out.println(session.data.hello);
    }
}

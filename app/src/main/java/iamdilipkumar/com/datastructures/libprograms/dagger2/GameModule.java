package iamdilipkumar.com.datastructures.libprograms.dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created on 26/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

@Module
public class GameModule {

    @Provides
    GameData providesGameData() {
        return new GameData();
    }
}

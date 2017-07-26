package iamdilipkumar.com.datastructures.libprograms.dagger2;

import dagger.Component;

/**
 * Created on 26/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

@Component(modules = GameModule.class)
public interface GameComponent {
    void inject(GameSession obj);
}

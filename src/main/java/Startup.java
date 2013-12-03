import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class Startup {

    public void onWeldInitialized(@Observes ContainerInitialized event, @Parameters List<String> parameters) {
        System.out.println("Startup success!");
    }

}
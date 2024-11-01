import org.junit.jupiter.api.Test;
import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
class AppLauncherTest {
    @Test
    public void testAppLauncherGUIVisible() {
        SwingUtilities.invokeLater(() -> {
            WeatherAppGui app = new WeatherAppGui();
            app.setVisible(true);
            assertTrue(app.isVisible(), "WeatherAppGui should be visible after launching");
            app.dispose(); // Clean up resources after the test
        });
    }
}

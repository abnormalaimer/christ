package CodeJavaVolume.FirstVolume.Part13.preferences;

import javax.swing.*;
import java.util.prefs.Preferences;

public class PreferencesTest {
}
class PreferencesFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private Preferences root=Preferences.userRoot();
    private Preferences node=root.node("/CodeJavaVolume/Part13/preferences");
    


}

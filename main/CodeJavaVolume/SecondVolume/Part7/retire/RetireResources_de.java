package CodeJavaVolume.SecondVolume.Part7.retire;

import java.awt.*;
import java.util.ListResourceBundle;

public class RetireResources_de extends ListResourceBundle {
    private static final Object[][] contents={
            {"colorPre", Color.yellow},{"colorGain", Color.BLACK},{"colorLoss", Color.red}
    };
    @Override
    protected Object[][] getContents() {
       return contents;
    }
}

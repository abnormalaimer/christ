package CodeJavaVolume.SecondVolume.Part7.retire;

import java.awt.*;
import java.util.ListResourceBundle;

public class RetireResources_en extends ListResourceBundle {
    private static final Object[][] contents={
            {"colorPre", Color.BLUE},{"colorGain", Color.white},{"colorLoss", Color.red}
    };
    @Override
    protected Object[][] getContents() {
       return contents;
    }
}

package CodeJavaVolume.SecondVolume.Part7.retire;

import java.awt.*;

public class FontInstaller {
    public static void main(String[] args) {
        Font[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
      
        boolean installed = false;
        for (Font font : fonts) {
            if (font.getName().equals("宋体")) {
                installed = true;
                break;
            }
        }
      
        if (installed) {
            System.out.println("中文字体已成功安装！");
        } else {
            System.out.println("中文字体未安装或安装失败！");
        }
    }
}
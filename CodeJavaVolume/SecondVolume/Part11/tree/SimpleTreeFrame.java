package CodeJavaVolume.SecondVolume.Part11.tree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class SimpleTreeFrame extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{

            // 创建一个窗口
            SimpleTreeFrame frame = new SimpleTreeFrame();
            frame.setTitle("树");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=300;
    public SimpleTreeFrame(){
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        var root = new DefaultMutableTreeNode("World");
        var country=new DefaultMutableTreeNode("Usa");
        root.add(country);
        var state=new DefaultMutableTreeNode("California");
        country.add(state);
        var city=new DefaultMutableTreeNode("San Francisco");
        state.add(city);
        city=new DefaultMutableTreeNode("Cupertino");
        state.add(city);
         state=new DefaultMutableTreeNode("Michigan");
        country.add(state);
        city=new DefaultMutableTreeNode("Ann Arbor");
        state.add(city);
         country=new DefaultMutableTreeNode("Germany");
        root.add(country);
        state=new DefaultMutableTreeNode("Schleswing");
        country.add(state);
        city=new DefaultMutableTreeNode("Kiel");
        state.add(city);
        var tree=new JTree(root);
        add(new JScrollPane(tree));
    }
}

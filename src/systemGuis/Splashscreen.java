package systemGuis;

import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

//https://stackoverflow.com/questions/17665089/making-a-loading-screen-in-netbeans

public class Splashscreen {
    
    
    WelcomeMenu window = new WelcomeMenu();
    MenuChooser menu = new MenuChooser();


    public void start() {
        //window.setSize(400, 410);
        // window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        new StartWorker().execute();
    }

    private class StartWorker extends SwingWorker<Void, Void> {

        @Override
        protected Void doInBackground() throws Exception {
            // Do background process
            Thread.sleep(5000);
            return null;
        }

        @Override
        protected void done() {
            JFrame frame = menu;
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            //frame.setSize(390, 150);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            // Dispose window when background process is finished
            window.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Splashscreen().start();
            }
        });
    }
}
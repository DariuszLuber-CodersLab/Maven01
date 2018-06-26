package pl.coderslab;


import org.apache.log4j.Logger;

public class App {

    static Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
        log.error("Some error");
    }

}

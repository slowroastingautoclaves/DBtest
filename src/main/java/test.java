/**
  * Created by Blaze on 1/29/2016.
  */

public class test {

        public static void main(String[] arg) {
            String message = "fill a message";
            try {
                SSHDriver.go();
            } catch (Exception e) {
                e.printStackTrace();
            }
            DBdriver x = new DBdriver();
        x.sendUpdate("INSERT INTO testing VALUES ('" + message +"');");
            x.closeConnection();
    }


            }

package exceptions;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UnknownHostExample {

  private static final Logger LOGGER = LogManager.getLogger(UnknownHostExample.class.getName());

  public static void main(String[] args) {

    try {
      String hostname = "www.google.com";
      InetAddress address = InetAddress.getByName(hostname);
      System.out.println(address.getHostName());
    } catch (UnknownHostException e) {
      LOGGER.error(e);
    }

    try {
      String hostname = "www.notexisthostname.com";
      InetAddress address = InetAddress.getByName(hostname);
      System.out.println(address.getHostName());
    } catch (UnknownHostException e) {
      LOGGER.error(e);
    }
  }

}

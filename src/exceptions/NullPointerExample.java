package exceptions;

import org.apache.log4j.Logger;

public class NullPointerExample {

  private static final Logger LOGGER = Logger.getLogger(NullPointerExample.class);

  public static void main(String[] args) {

    try {
      String word = null;
      LOGGER.debug(word.length());
    } catch (NullPointerException ex) {
      LOGGER.error(ex.getMessage());
    }

    try {
      String word = null;
      LOGGER.debug(word);
    } catch (NullPointerException ex) {
      LOGGER.error(ex.getMessage());
    }

  }
}

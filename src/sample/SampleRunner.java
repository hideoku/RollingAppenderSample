package sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SampleRunner {

    private static final Log logger = LogFactory.getLog(SampleRunner.class);

    public static void main(String[] args) {
        new SampleRunner().execute();
    }

    private void execute() {
        logger.info("start execute()");

        logger.info("ローテーション直前1");
        rotate();
        logger.info("ローテーション直後1");

        logger.info("ローテーション直前2");
        rotate();
        logger.info("ローテーション直後2");

        logger.info("end execute()");
    }

    private void rotate() {
      logger.info("手動ローテーションするよ。");
    }
}

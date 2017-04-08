package future.priceAnalysis.job;

import future.common.utils.SinaPriceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuartzJob2 {

    private static final Logger LOG = LoggerFactory.getLogger(QuartzJob2.class);

    public void run() {
        LOG.info(SinaPriceUtil.getDailyPrice("P1705").toString());
    }
}

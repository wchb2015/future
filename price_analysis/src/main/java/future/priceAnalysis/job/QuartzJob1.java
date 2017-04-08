package future.priceAnalysis.job;

import future.common.model.FutureDailyPriceDO;
import future.common.utils.SinaPriceUtil;
import future.priceAnalysis.service.IFutureDailyPriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class QuartzJob1 implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(QuartzJob1.class);

    @Autowired
    private IFutureDailyPriceService dailyPriceService;

    public void run() {
        LOG.info("---------$$$QuartzJob1    Run!!!");
        try {
            FutureDailyPriceDO dailyPrice = SinaPriceUtil.getDailyPrice("P1705");
            dailyPriceService.saveFutureDailyPrice(dailyPrice);
        } catch (Exception e) {
            LOG.error("保存每日价格信息出错,Exception:{}", e.getMessage());
        }

    }
}
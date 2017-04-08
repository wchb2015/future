package future.priceAnalysis.service;

import future.common.model.FutureDailyPriceDO;

public interface IFutureDailyPriceService {

    /**
     * 保存每日价格信息
     *
     * @param dailyPrice
     * @return
     */
    boolean saveFutureDailyPrice(FutureDailyPriceDO dailyPrice);

}

package future.priceAnalysis.dao;

import future.common.model.FutureDailyPriceDO;

public interface FutureDailyPriceDao {

    boolean insertFutureDailyPrice(FutureDailyPriceDO dailyPrice);

}
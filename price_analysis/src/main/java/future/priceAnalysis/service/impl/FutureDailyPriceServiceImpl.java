package future.priceAnalysis.service.impl;

import future.common.model.FutureDailyPriceDO;
import future.priceAnalysis.dao.FutureDailyPriceDao;
import future.priceAnalysis.service.IFutureDailyPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FutureDailyPriceServiceImpl implements IFutureDailyPriceService {

    @Autowired
    private FutureDailyPriceDao futureDailyPriceDao;

    public boolean saveFutureDailyPrice(FutureDailyPriceDO dailyPrice) {
        return futureDailyPriceDao.insertFutureDailyPrice(dailyPrice);
    }

}

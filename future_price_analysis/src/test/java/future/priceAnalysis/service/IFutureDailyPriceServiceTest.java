package future.priceAnalysis.service;

import future.common.utils.SinaPriceUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/application-context.xml"})
public class IFutureDailyPriceServiceTest {

    @Autowired
    private IFutureDailyPriceService dailyPriceService;

    @Test
    public void saveFutureDailyPrice() throws Exception {
        //        dailyPriceService.saveFutureDailyPrice(SinaPriceUtil.getDailyPrice("P1709"));

    }

}
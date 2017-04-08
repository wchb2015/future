package future.priceAnalysis.utils;

import future.common.utils.Bootstrap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;

public class ApplicationBootstrap extends Bootstrap {

    private static Logger LOG = LoggerFactory.getLogger(ApplicationBootstrap.class);

    public static void main(String[] args) {
        initApplicationContext("classpath:spring/application-context.xml");
    }

    private static void initApplicationContext(String... configLocations) throws BeansException {
        Bootstrap.main(configLocations);
    }

}

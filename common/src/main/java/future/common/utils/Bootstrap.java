package future.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Bootstrap {
    private static Logger LOG = LoggerFactory.getLogger(Bootstrap.class);

    private static ApplicationContext context;

    public static void main(String[] args) {
        try {
            if (args == null || args.length == 0) {
                LOG.info("spring server bootstrap use config file : application-context.xml under the classpath.");
                context = new ClassPathXmlApplicationContext("classpath:spring/application-context.xml");
            } else {
                context = new ClassPathXmlApplicationContext(args);
            }
        } catch (Throwable t) {
            LOG.error("Throwable Occurs in Bootstrap!", t);
            System.exit(-1);
        }
        LOG.info("***************Start Success!!!!**********************");
        LOG.info("***************Start Success!!!!********************** init beans count :{}", context.getBeanDefinitionCount());
        LOG.info("***************Start Success!!!!********************** init beans :{}", Arrays.toString(context.getBeanDefinitionNames()));
    }

}

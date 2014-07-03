package com.telenav.wzone.database;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;

import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GuiceMyBatis {

    private final static Logger logger = Logger.getLogger(GuiceMyBatis.class.getName());
    private final static String resource_ttx = "SqlMapConfig-ttx.xml";


    private volatile static boolean isInital = false;

    private static Injector ttxInject = null;


    private final static GuiceMyBatis guiceMyBatis = new GuiceMyBatis();

    protected GuiceMyBatis() {

    }
    
    public static final void init() {
        if (isInital) {
            return;
        }
        logger.info("inital DB Connection...");
        try {
            final Properties properties = new Properties();
            InputStream resource = GuiceMyBatis.class.getResourceAsStream("/config/jdbc.properties");
            if (resource == null) {
                resource = GuiceMyBatis.class.getResourceAsStream("/jdbc_default.properties");
            }
            properties.load(resource);
            ttxInject = Guice.createInjector(new XMLMyBatisModule() {
                @Override
                protected void initialize() {
                    setEnvironmentId("default");
                    setClassPathResource(resource_ttx);
                    addProperties(properties);
                }
            });
            isInital = true;
            logger.info("finished");
        } catch (Throwable t) {
            logger.log(Level.SEVERE, "Can't initialize MapperFactory.", t);
        }

    }

    public static GuiceMyBatis getInstance() {
        return guiceMyBatis;
    }

    public Injector getTtxInject() {
        return ttxInject;
    }

}

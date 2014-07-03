package com.telenav.wzone;

import com.telenav.wzone.database.GuiceMyBatis;
import com.telenav.wzone.processor.CarpoolOfferDataProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 5/30/14
 * Time: 4:28 PM
 * Launcher
 */
public class Launcher {

    public static void main(String[] args){

        GuiceMyBatis.init();
        CarpoolOfferDataProcessor carpoolOfferDataProcessor = new CarpoolOfferDataProcessor();
        carpoolOfferDataProcessor.run();
    }
}

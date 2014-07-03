package com.telenav.wzone.processor;

import com.telenav.wzone.database.GuiceMyBatis;
import com.telenav.wzone.database.dto.CarpoolOffer;
import com.telenav.wzone.database.dto.CarpoolOfferExample;
import com.telenav.wzone.database.dto.CarpoolOfferLocation;
import com.telenav.wzone.database.dto.CarpoolOfferLocationExample;
import com.telenav.wzone.database.mapper.CarpoolOfferLocationMapper;
import com.telenav.wzone.database.mapper.CarpoolOfferMapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 5/30/14
 * Time: 4:32 PM
 * CarpoolOfferDataProcessor
 */
public class CarpoolOfferDataProcessor extends AbstactProcessor{


    @Override
    public void run() {
        CarpoolOfferMapper carpoolOfferMapper = GuiceMyBatis.getInstance().getTtxInject().getProvider(CarpoolOfferMapper.class).get();
        CarpoolOfferLocationMapper carpoolOfferLocationMapper = GuiceMyBatis.getInstance().getTtxInject().getProvider(CarpoolOfferLocationMapper.class).get();
        List<CarpoolOffer> carpoolOfferList = carpoolOfferMapper.selectByExample(new CarpoolOfferExample());
        for (CarpoolOffer carpoolOffer : carpoolOfferList) {
            CarpoolOfferLocationExample carpoolOfferLocationExample = new CarpoolOfferLocationExample();
            carpoolOfferLocationExample.createCriteria().andOfferIdEqualTo(carpoolOffer.getId());
            List<CarpoolOfferLocation> carpoolOfferLocationList = carpoolOfferLocationMapper.selectByExample(carpoolOfferLocationExample);
            if (carpoolOfferLocationList != null && !carpoolOfferLocationList.isEmpty()) {
                continue;
            }
            if (carpoolOffer.getFromStop() != null && carpoolOffer.getFromStopLat() != null && carpoolOffer.getFromStopLon() != null) {
                CarpoolOfferLocation carpoolOfferLocation = new CarpoolOfferLocation();
                carpoolOfferLocation.setOfferId(carpoolOffer.getId());
                carpoolOfferLocation.setType("ORGI");
                carpoolOfferLocation.setAddress(carpoolOffer.getFromStop());
                carpoolOfferLocation.setLat(carpoolOffer.getFromStopLat().doubleValue());
                carpoolOfferLocation.setLon(carpoolOffer.getFromStopLon().doubleValue());
                carpoolOfferLocation.setCreateTime(carpoolOffer.getCreateTime());
                carpoolOfferLocationMapper.insertWithLocation(carpoolOfferLocation);
            }
            if (carpoolOffer.getToStop() != null && carpoolOffer.getToStopLat() != null && carpoolOffer.getToStopLon() != null) {
                CarpoolOfferLocation carpoolOfferLocation = new CarpoolOfferLocation();
                carpoolOfferLocation.setOfferId(carpoolOffer.getId());
                carpoolOfferLocation.setType("DEST");
                carpoolOfferLocation.setAddress(carpoolOffer.getToStop());
                carpoolOfferLocation.setLat(carpoolOffer.getToStopLat().doubleValue());
                carpoolOfferLocation.setLon(carpoolOffer.getToStopLon().doubleValue());
                carpoolOfferLocation.setCreateTime(carpoolOffer.getCreateTime());
                carpoolOfferLocationMapper.insertWithLocation(carpoolOfferLocation);
            }
        }
    }
}

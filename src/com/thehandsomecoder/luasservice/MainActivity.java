package com.thehandsomecoder.luasservice;

import javafx.scene.control.Tab;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MainActivity
{

    public static void main(String[] args)
    {

        HashMap<String, LuasStation> stations = AppValues.getStations();
         /*Some comments go here*/

         for(Map.Entry<String, LuasStation> entry :  stations.entrySet())
         {
             System.out.println(entry.getValue().toString());
             entry.getValue().updateTramInformation();
             System.out.println("Inbound");
             for(TramInformation i : entry.getValue().getInboundTrams())
             {
                 System.out.println(i.toString());
             }
             System.out.println("Outbound");
             for(TramInformation i : entry.getValue().getOutboundTrams())
             {
                 System.out.println(i.toString());
             }
             System.out.println("");
         }



    }
}

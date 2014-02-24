package com.thehandsomecoder.luasservice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Scott on 23/01/14.
 */
public class LuasStation
{
    final private String url = "http://luasforecasts.rpa.ie/xml/get.ashx?encrypt=false&stop=%s&action=forecast";
    private String shortName;
    private String displayName;
    private String irishDisplayName;
    private String line;
    private boolean cycleRack;
    private boolean carPark;
    private double latitude;
    private double longitude;
    private String status;
    private ArrayList<TramInformation> inboundTrams;
    private ArrayList<TramInformation> outboundTrams;

    public LuasStation()
    {
    }

    public LuasStation(String shortName, String displayName, String irishDisplayName, String line, boolean cycleRack, boolean carPark, double latitude, double longitude)
    {
        setShortName(shortName);
        setDisplayName(displayName);
        setIrishDisplayName(irishDisplayName);
        setLine(line);
        setCycleRack(cycleRack);
        setCarPark(carPark);
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public ArrayList<TramInformation> getOutboundTrams()
    {
        return outboundTrams;
    }

    public void setOutboundTrams(ArrayList<TramInformation> outboundTrams)
    {
        this.outboundTrams = outboundTrams;
    }

    public ArrayList<TramInformation> getInboundTrams()
    {
        return inboundTrams;
    }

    public void setInboundTrams(ArrayList<TramInformation> inboundTrams)
    {
        this.inboundTrams = inboundTrams;
    }

    public String getShortName()
    {
        return shortName;
    }

    public void setShortName(String shortName)
    {
        this.shortName = shortName;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public String getIrishDisplayName()
    {
        return irishDisplayName;
    }

    public void setIrishDisplayName(String irishDisplayName)
    {
        this.irishDisplayName = irishDisplayName;
    }

    public String getLine()
    {
        return line;
    }

    public void setLine(String line)
    {
        this.line = line;
    }

    public boolean isCycleRack()
    {
        return cycleRack;
    }

    public void setCycleRack(boolean cycleRack)
    {
        this.cycleRack = cycleRack;
    }

    public boolean isCarPark()
    {
        return carPark;
    }

    public void setCarPark(boolean carPark)
    {
        this.carPark = carPark;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }

    public void updateTramInformation()
    {
        try
        {
            Document doc = Jsoup.connect(String.format(url, getShortName())).get();
            Element stopinfo = doc.select("stopinfo").first();

            String status = stopinfo.select("message").first().text();
            ArrayList<TramInformation> inboundTrams = new ArrayList<TramInformation>();
            ArrayList<TramInformation> outboundTrams = new ArrayList<TramInformation>();

            Elements inbound = stopinfo.select("direction[name=Inbound] tram");
            for (Element i : inbound)
            {
                TramInformation tram = new TramInformation();
                tram.setDirection("Inbound");
                tram.setDestination(i.attributes().get("destination"));
                tram.setDueTime(i.attributes().get("duemins"));
                inboundTrams.add(tram);
            }
            setInboundTrams(inboundTrams);

            Elements outbound = stopinfo.select("direction[name=Outbound] tram");
            for (Element i : outbound)
            {
                TramInformation tram = new TramInformation();
                tram.setDirection("Outbound");
                tram.setDestination(i.attributes().get("destination"));
                tram.setDueTime(i.attributes().get("duemins"));
                outboundTrams.add(tram);
            }
            setOutboundTrams(outboundTrams);
        }
        catch (IOException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String toString()
    {
        String placeholder = "Shortname: %s\tDisplayname: %s\tIrish Displayname: %s\tLine: %s\tCycle Rack: %s\tCar Park: %s\tLatitude: %s\tLongitude: %s\t";
        placeholder = String.format(placeholder, shortName, displayName, irishDisplayName, line, cycleRack, carPark, latitude, longitude);
        return placeholder;
    }

}


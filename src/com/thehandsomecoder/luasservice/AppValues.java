package com.thehandsomecoder.luasservice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Scott on 20/02/14.
 */
public class AppValues
{
    private static final HashMap<String, LuasStation> stations;
    static
    {
        stations = new HashMap<String, LuasStation>();
        //Green Line Stations
        stations.put("STS", new LuasStation("STS","St. Stephen's Green","Faiche Stiabhna","Green",false,false,53.339072,-6.261333));
        stations.put("HAR", new LuasStation("HAR","Harcourt Street","Sráid Fhearchair","Green",true,false,53.333358,-6.26265));
        stations.put("CHA", new LuasStation("CHA","Charlemont","Charlemont","Green",true,false,53.330669,-6.258683));
        stations.put("RAN", new LuasStation("RAN","Ranelagh","Raghnallach","Green",true,false,53.326433,-6.256203));
        stations.put("BEE", new LuasStation("BEE","Beechwood","Coill na Feá","Green",true,false,53.320822,-6.254653));
        stations.put("COW", new LuasStation("COW","Cowper","Cowper","Green",true,false,53.316467,-6.253447));
        stations.put("MIL", new LuasStation("MIL","Milltown","Baile an Mhuilinn","Green",true,false,53.309917,-6.251728));
        stations.put("WIN", new LuasStation("WIN","Windy Arbour","Na Glasáin","Green",true,false,53.301558,-6.250708));
        stations.put("DUN", new LuasStation("DUN","Dundrum","Dún Droma","Green",true,false,53.292358,-6.245117));
        stations.put("BAL", new LuasStation("BAL","Balally","Baile Amhlaoibh","Green",true,true,53.286106,-6.236772));
        stations.put("KIL", new LuasStation("KIL","Kilmacud","Cill Mochuda","Green",true,false,53.283008,-6.223886));
        stations.put("STI", new LuasStation("STI","Stillorgan","Stigh Lorgan","Green",true,true,53.279311,-6.209919));
        stations.put("SAN", new LuasStation("SAN","Sandyford","Áth an Ghainimh","Green",true,true,53.279311,-6.204678));
        stations.put("CPK", new LuasStation("CPK","Central Park","An Pháirc Láir","Green",false,false,53.27015,-6.203764));
        stations.put("GLE", new LuasStation("GLE","Glencairn","Gleann an Chairn","Green",true,true,53.266336,-6.209942));
        stations.put("GAL", new LuasStation("GAL","The Gallops","An Eachrais","Green",true,false,53.261164,-6.206022));
        stations.put("LEO", new LuasStation("LEO","Leopardstown Valley","Gleann Bhaile na Lobhar","Green",true,false,53.257996,-6.197485));
        stations.put("BAW", new LuasStation("BAW","Ballyogan Wood","Coill Bhaile Uí Ógáin","Green",false,false,53.255047,-6.184475));
        stations.put("CCK", new LuasStation("CCK","Carrickmines","Carraig Mhaighin","Green",true,true,53.254033,-6.169908));
        stations.put("LAU", new LuasStation("LAU","Laughanstown","Baile an Locháin","Green",false,false,53.250606,-6.155006));
        stations.put("CHE", new LuasStation("CHE","Cherrywood","Coill na Silíní","Green",false,false,53.245333,-6.145853));
        stations.put("BRI", new LuasStation("BRI","Brides Glen","Gleann Bhríde","Green",true,false,53.242075,-6.142886));

        //Red Line Station
        stations.put("TPT", new LuasStation("TPT","The Point","Iosta na Rinne","Red",false,false,53.34835,-6.229258));
        stations.put("SDK", new LuasStation("SDK","Spencer Dock","Duga Spencer","Red",false,false,53.348822,-6.237147));
        stations.put("MYS", new LuasStation("MYS","Mayor Square (NCI)","Cearnóg an Mhéara - CNÉ","Red",false,false,53.349247,-6.243394));
        stations.put("GDK", new LuasStation("GDK","George's Dock","Duga Sheoirse","Red",false,false,53.349528,-6.247575));
        stations.put("CON", new LuasStation("CON","Connolly","Conghaile","Red",true,false,53.350922,-6.249942));
        stations.put("BUS", new LuasStation("BUS","Bus Áras","Busáras","Red",false,false,53.348589,-6.258172));
        stations.put("ABB", new LuasStation("ABB","Abbey Street","Sráid na Mainistreach","Red",true,false,53.348589,-6.258172));
        stations.put("JER", new LuasStation("JER","Jervis","Jervis","Red",true,false,53.347686,-6.265333));
        stations.put("FOU", new LuasStation("FOU","The Four Courts","Na Ceithre Cúirteanna","Red",false,false,53.346864,-6.273436));
        stations.put("SMI", new LuasStation("SMI","Smithfield","Margadh na Feirme","Red",true,false,53.347133,-6.277728));
        stations.put("MUS", new LuasStation("MUS","Museum","Ard-Mhúsaem","Red",false,false,53.347867,-6.286714));
        stations.put("HEU", new LuasStation("HEU","Heuston","Heuston","Red",true,false,53.346647,-6.291808));
        stations.put("JAM", new LuasStation("JAM","James'","Ospidéal San Séamas","Red",false,false,53.341942,-6.293361));
        stations.put("FAT", new LuasStation("FAT","Fatima","Fatima","Red",true,false,53.338439,-6.292547));
        stations.put("RIA", new LuasStation("RIA","Rialto","Rialto","Red",false,false,53.337908,-6.297242));
        stations.put("SUI", new LuasStation("SUI","Suir Road","Bóthar na Siúire","Red",true,false,53.336617,-6.307211));
        stations.put("GOL", new LuasStation("GOL","Goldenbridge","An Droichead Órga","Red",true,false,53.335892,-6.313569));
        stations.put("DRI", new LuasStation("DRI","Drimnagh","Droimeanach","Red",false,false,53.335361,-6.318161));
        stations.put("BLA", new LuasStation("BLA","Blackhorse","An Capall Dubh","Red",false,false,53.334258,-6.327394));
        stations.put("BLU", new LuasStation("BLU","Bluebell","An Cloigín Gorm","Red",true,false,53.329297,-6.33396));
        stations.put("KYL", new LuasStation("KYL","Kylemore","An Chill Mhór","Red",false,false,53.326656,-6.343444));
        stations.put("RED", new LuasStation("RED","Red Cow","An Bhó Dhearg","Red",true,true,53.316833,-6.369872));
        stations.put("KIN", new LuasStation("KIN","Kingswood","Coill an Rí","Red",true,false,53.303694,-6.36525));
        stations.put("BEL", new LuasStation("BEL","Belgard","Belgard","Red",true,false,53.299286,-6.374886));
        stations.put("COO", new LuasStation("COO","Cookstown","Baile an Chócaigh","Red",true,false,53.293506,-6.384397));
        stations.put("HOS", new LuasStation("HOS","Hospital","Ospidéal Thamhlachta","Red",false,false,53.289369,-6.37885));
        stations.put("TAL", new LuasStation("TAL","Tallaght","Tamhlacht","Red",true,true,53.287494,-6.374589));
        stations.put("FET", new LuasStation("FET","Fettercairn","Fothair Chardain","Red",true,false,53.293519,-6.395554));
        stations.put("CVN", new LuasStation("CVN","Cheeverstown","Baile an tSíbhrigh","Red",true,true,53.290982,-6.406849));
        stations.put("CIT", new LuasStation("CIT","Citywest Campus","Campas Gnó Iarthar na Cathrach","Red",true,false,53.287833,-6.418915));
        stations.put("FOR", new LuasStation("FOR","Fortunestown","Baile Uí Fhoirtcheirn","Red",true,false,53.284251,-6.424602));
        stations.put("SAG", new LuasStation("SAG","Saggart","Teach Sagard","Red",true,false,53.284679,-6.43776255));
    }

    public static HashMap<String, LuasStation> getStations()
    {
        return stations;
    }

}

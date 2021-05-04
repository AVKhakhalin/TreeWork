package TreeWork;

public class Dates
{
    public int ID;
    public String sightName;
    public String city;

    Dates(int _ID, String _sightName, String _city)
    {
        ID = _ID;
        sightName = _sightName;
        city = _city;
    }

    public int getID()
    {
        return ID;
    }

    public String getSightName()
    {
        return sightName;
    }

    public String getCity()
    {
        return city;
    }
}

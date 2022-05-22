package com.systembrain;

public class DataSourceFactory {

    public IngestData getInstance(String source){
        if (source.equals("API")) return new SourceDataFromAPI();
        else if (source.equals("DATABASE")) return new SourceDataFromDatabase();
        else if (source.equals("FILE")) return new SourceDataFromFile();
        return null;
    }
}

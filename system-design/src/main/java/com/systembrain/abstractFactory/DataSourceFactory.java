package com.systembrain.abstractFactory;

public class DataSourceFactory {

    public IngestData getInstance(String source) {
        switch (source) {
            case "API":
                return new SourceDataFromAPI();
            case "DATABASE":
                return new SourceDataFromDatabase();
            case "FILE":
                return new SourceDataFromFile();
            default:
                return null;
        }
    }
}

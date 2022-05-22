package com.systembrain;

public class SourceDataFromAPI implements IngestData{
    @Override
    public void dataIngest() {
        System.out.println("Data ingested from API");
    }
}

package com.systembrain;

public class SourceDataFromDatabase implements IngestData{
    @Override
    public void dataIngest() {
        System.out.println("Ingest data from database");
    }
}

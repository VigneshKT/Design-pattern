package com.systembrain.abstractFactory;

public class SourceDataFromFile implements IngestData{
    @Override
    public void dataIngest() {
        System.out.println("Ingest data from File");
    }
}

package com.systembrain.abstractFactory;

public class DataIngestionService {

    private DataSourceFactory dataSourceFactory = new DataSourceFactory();

    public void dataIngestion(String source){
        IngestData dataSource = dataSourceFactory.getInstance(source);
        dataSource.dataIngest();
    }
}

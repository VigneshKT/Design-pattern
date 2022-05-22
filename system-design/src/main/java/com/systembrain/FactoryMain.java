package com.systembrain;

public class FactoryMain {

    public static void main(String[] args){
        DataIngestionService dataIngestionService = new DataIngestionService();
        dataIngestionService.dataIngestion("FILE");
    }

}

package com.systembrain.abstractFactory;

public class FactoryMain {

    public static void main(String[] args){
        DataIngestionService dataIngestionService = new DataIngestionService();
        dataIngestionService.dataIngestion("FILE");
    }

}

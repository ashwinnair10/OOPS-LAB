import java.util.*;
import java.util.stream.Stream;
class DistributedDataProcessor{
    String name;
    List<String> batch;
    DistributedDataProcessor(String n,List<String> b){
        name=n;
        batch=b;
    }
    DistributedDataProcessor(String n){
        name=n;
    }
    void loadData(){
        System.out.println("Loading data...\nLoaded");
    }
    void processData(){
        System.out.println("Processing batch...\nProcessed");
    }
    void processData(Stream<String> s){
        System.out.println("Processing stream...\nProcessed");
    }
    void aggregateData(){
        System.out.println("Aggregating data...\nAggregated");
    }
}
class StockProcessor extends DistributedDataProcessor{
    StockProcessor(String n,List<String> b){
        super(n,b);
    }
    StockProcessor(String n){
        super(n);
    }
    @Override
    void processData(){
        System.out.println("Processing batch for Stock processing:");
        for(int i=0;i<batch.size();i++){
            System.out.println("--"+batch.get(i));
        }
    }
    @Override
    void processData(Stream<String> s){
        System.out.println("Processing stream for Stock processing:");
        s.parallel().forEach(System.out::println);
    }
    void aggregateData(String s){
        System.out.println("Aggregating "+s+" data for stock processing...");
        System.out.println("Aggregated");
    }
}
class TransactionProcessor extends DistributedDataProcessor{
    TransactionProcessor(String n,List<String> b){
        super(n,b);
    }
    TransactionProcessor(String n){
        super(n);
    }
    @Override
    void processData(){
        System.out.println("Processing batch for Transaction processing:");
        for(int i=0;i<batch.size();i++){
            System.out.println("--"+batch.get(i));
        }
    }
    @Override
    void processData(Stream<String> s){
        System.out.println("Processing stream for Transaction processing:");
        s.parallel().forEach(System.out::println);
    }
    void aggregateData(String u){
        System.out.println("Aggregating "+u+"'s data...");
        System.out.println("Aggregated");

    }
    void aggregateData(String u,String t){
        System.out.println("Aggregating "+u+"'s transactions for checking ("+t+")...");
        System.out.println("Aggregated");
    }
}
class CryptoProcessor extends DistributedDataProcessor{
    CryptoProcessor(String n,List<String> b){
        super(n,b);
    }
    CryptoProcessor(String n){
        super(n);
    }
    @Override
    void processData(){
        System.out.println("Processing batch for Crypto processing:");
        for(int i=0;i<batch.size();i++){
            System.out.println("--"+batch.get(i));
        }
    }
    @Override
    void processData(Stream<String> s){
        System.out.println("Processing stream for Crypto processing:");
        s.parallel().forEach(System.out::println);
    }
    @Override
    void aggregateData(){
        System.out.println("Aggregating data based on currency...\nAggregated");
    }
}
public class Q3{
    public static void main(String[] args) {
        List<String> stockBatch = List.of("AAPL", "GOOGL", "TSLA");
        StockProcessor stockProcessor = new StockProcessor("StockMarket", stockBatch);
        stockProcessor.loadData();
        stockProcessor.processData();
        stockProcessor.aggregateData("Daily");
        Stream<String> stockStream = Stream.of("AAPL", "AMZN", "TSLA");
        stockProcessor.processData(stockStream);
        List<String> transactionBatch = List.of("TXN1", "TXN2", "TXN3");
        TransactionProcessor transactionProcessor = new TransactionProcessor("BankTransactions", transactionBatch);
        transactionProcessor.loadData();
        transactionProcessor.processData();
        transactionProcessor.aggregateData("User123", "High Risk");
        List<String> cryptoBatch = List.of("BTC", "ETH", "XRP");
        CryptoProcessor cryptoProcessor = new CryptoProcessor("CryptoExchange", cryptoBatch);
        cryptoProcessor.loadData();
        cryptoProcessor.processData();
        cryptoProcessor.aggregateData();
    }
}
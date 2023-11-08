package com.example;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import java.io.IOException;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Web3j web3 = Web3j
                .build(new HttpService("https://rpc.dev.buildbear.io/spiritual-wicket-systri-warrick-f9c2771d"));
        // Web3j web3 = Web3j.build(new
        // HttpService("YOUR_QUICKNODE_HTTP_PROVIDER_URL"));

        try {
            BigInteger blockNumber = web3.ethBlockNumber().send().getBlockNumber();
            System.out.println("Latest Ethereum block number: " + blockNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
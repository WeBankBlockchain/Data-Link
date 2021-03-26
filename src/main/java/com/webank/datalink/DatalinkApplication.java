package com.webank.datalink;

import com.webank.datalink.service.HelloWorldService;
import com.webank.wedpr.crypto.CryptoResult;
import com.webank.wedpr.crypto.NativeInterface;
import org.fisco.bcos.sdk.BcosSDK;
import org.fisco.bcos.sdk.client.Client;
import org.fisco.bcos.sdk.transaction.manager.AssembleTransactionProcessor;
import org.fisco.bcos.sdk.transaction.manager.TransactionProcessorFactory;
import org.fisco.bcos.sdk.transaction.model.dto.TransactionResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DatalinkApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DatalinkApplication.class);
		/*
		BcosSDK bcosSDK = BcosSDK.build("conf/config.toml");
		Client client = bcosSDK.getClient(1);

		AssembleTransactionProcessor processor = TransactionProcessorFactory.createAssembleTransactionProcessor(client, client.getCryptoSuite().getCryptoKeyPair());
		TransactionResponse response = processor.deployAndGetResponse(HelloWorldService.ABI, HelloWorldService.BINARY, Arrays.asList());
		String contract = response.getContractAddress();

		for(int i=0;i<10000;i++){
			TransactionResponse r = processor.sendTransactionAndGetResponse(contract, HelloWorldService.ABI, "set", Arrays.asList("n"));
			//System.out.println(r.getTransactionReceipt().getStatus());
		}

		System.out.println("Finished. Exiting");
		System.exit(0);
		*/


	}

}

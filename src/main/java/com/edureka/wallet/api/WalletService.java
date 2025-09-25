package com.edureka.wallet.Impl;

import com.edureka.wallet.api.WalletService;
import com.edureka.wallet.model.PaymentTransactionDto;
import com.edureka.wallet.model.WalletDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

    private static final Logger logger = LoggerFactory.getLogger(WalletServiceImpl.class);

    @Override
    public WalletDto doTransaction(PaymentTransactionDto transaction) {
        logger.info("Processing transaction: " + transaction);
        // existing transaction logic
        return new WalletDto(); // placeholder
    }

    @Override
    public WalletDto getBalance(String emailId) {
        logger.info("Getting balance for: " + emailId);
        // existing balance retrieval logic
        return new WalletDto(); // placeholder
    }
}

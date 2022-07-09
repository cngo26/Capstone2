package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfer;
import com.techelevator.tenmo.model.TransferDTO;


import java.math.BigDecimal;
import java.util.List;

public interface TransferDao {

    List<TransferDTO> findAll();

    TransferDTO findByTransferID(int id);

//    TransferDTO findByTransferType(int id);

    TransferDTO findByTransferType(int id);

    TransferDTO findByStatusId(int id);

    TransferDTO findByTransferStatusDesc(String status);

//    TransferDTO findByAccountFrom(int id);
//
//    TransferDTO findByAccountTo(int id);
//
//    TransferDTO getTransferAmount(BigDecimal transferBalance);

    Integer createTransfer(int status_id, int account_from, int account_to, BigDecimal amount);

    List<TransferDTO> findByTransferType();

    List<TransferDTO> findByAccountID(int id);

//    Transfer createTransfer();
}

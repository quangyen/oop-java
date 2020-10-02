package vds.service.online;

import vds.dto.deposit.DepositFromMobileRequest;
import vds.dto.output.DepositResponse;
import vds.dto.output.TransferMoneyResponse;
import vds.dto.request.ActiveAccountRequest;
import vds.dto.request.DepositFromBankRequest;
import vds.dto.request.RegisterAccountRequest;
import vds.dto.request.TransferMoneyByMobileNumberRequest;
import vds.dto.transfer.MoneyByUserIDRequest;
import vds.infrastructure.events.Publisher;
import vds.spi.AccountService;
import vds.spi.DepositCredit;
import vds.spi.TransferCredit;

public class OnlineBankingService implements AccountService {
    DepositCredit depositServiceDelegation;
    TransferCredit transferServiceDelegation;

    Publisher pubsub;

    public OnlineBankingService(DepositCredit depositServiceDelegation, TransferCredit transferServiceDelegation, Publisher pubsub) {
        this.depositServiceDelegation = depositServiceDelegation;
        this.transferServiceDelegation = transferServiceDelegation;
        this.pubsub = pubsub;
    }

    @Override
    public Error RegisterAccount(RegisterAccountRequest request) {
        return null;
    }

    @Override
    public Error ActiveAccount(ActiveAccountRequest request) {
        return null;
    }

    @Override
    public DepositResponse DepositFromBank(int currentUser, DepositFromBankRequest request) {
        return null;
    }

    @Override
    public DepositResponse DepositFromMobileCard(int currentUser, DepositFromMobileRequest request) {
        return null;
    }

    @Override
    public TransferMoneyResponse TransferMoneyByUserID(int senderID, MoneyByUserIDRequest request) {
        return null;
    }

    @Override
    public TransferMoneyResponse TransferMoneyByMobileNumber(int senderID, TransferMoneyByMobileNumberRequest request) {
        return null;
    }
}

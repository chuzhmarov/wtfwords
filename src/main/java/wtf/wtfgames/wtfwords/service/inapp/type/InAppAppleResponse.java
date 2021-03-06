package wtf.wtfgames.wtfwords.service.inapp.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InAppAppleResponse {
    private int status;
    private InAppAppleReceipt receipt;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public InAppAppleReceipt getReceipt() {
        return receipt;
    }

    public void setReceipt(InAppAppleReceipt receipt) {
        this.receipt = receipt;
    }
}
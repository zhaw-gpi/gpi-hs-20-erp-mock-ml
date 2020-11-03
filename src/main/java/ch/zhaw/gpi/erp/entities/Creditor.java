package ch.zhaw.gpi.erp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Creditor {
    @Id
    private Long creditorId;
    private String creditorName;
    private Integer creditorOrderCount;
    private Integer creditorInvoiceReclamationCount;

    public Long getCreditorId() {
        return creditorId;
    }

    public void setCreditorId(Long creditorId) {
        this.creditorId = creditorId;
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName;
    }

    public Integer getCreditorOrderCount() {
        return creditorOrderCount;
    }

    public void setCreditorOrderCount(Integer creditorOrderCount) {
        this.creditorOrderCount = creditorOrderCount;
    }

    public Integer getCreditorInvoiceReclamationCount() {
        return creditorInvoiceReclamationCount;
    }

    public void setCreditorInvoiceReclamationCount(Integer creditorInvoiceReclamationCount) {
        this.creditorInvoiceReclamationCount = creditorInvoiceReclamationCount;
    }    
}

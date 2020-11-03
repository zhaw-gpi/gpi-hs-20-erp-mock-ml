package ch.zhaw.gpi.erp.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "order_table")
public class Order {
    @Id
    private Long orderNr;
    private Long orderAmount;
    private String costCenterMgr;
    private Long referenceNr;
    @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "invoice_nr", referencedColumnName = "invoice_nr")
    private Invoice invoice;
    @ManyToOne
    private Creditor creditor;

    public Long getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(Long orderNr) {
        this.orderNr = orderNr;
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCostCenterMgr() {
        return costCenterMgr;
    }

    public void setCostCenterMgr(String costCenterMgr) {
        this.costCenterMgr = costCenterMgr;
    }

    public Long getReferenceNr() {
        return referenceNr;
    }

    public void setReferenceNr(Long referenceNr) {
        this.referenceNr = referenceNr;
    }

    public Creditor getCreditor() {
        return creditor;
    }

    public void setCreditor(Creditor creditor) {
        this.creditor = creditor;
    }

    
}
package hu.bme.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Delivery implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String item;
    private Long sender;
    private Long receiver;
    private Long runner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setSender(Long sender) {
        this.sender = sender;
    }

    public Long getReceiver() {
        return receiver;
    }

    public void setReceiver(Long receiver) {
        this.receiver = receiver;
    }

    public Long getRunner() {
        return runner;
    }

    public void setRunner(Long runner) {
        this.runner = runner;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 19 * hash + (this.item != null ? this.item.hashCode() : 0);
        hash = 19 * hash + (this.sender != null ? this.sender.hashCode() : 0);
        hash = 19 * hash + (this.receiver != null ? this.receiver.hashCode() : 0);
        hash = 19 * hash + (this.runner != null ? this.runner.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Delivery other = (Delivery) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        /*if ((this.dataProperty == null) ? (other.dataProperty != null) : !this.dataProperty.equals(other.dataProperty)) {
            return false;
        }*/
        return true;
    }

    @Override
    public String toString() {
        return "Delivery{" + "id=" + id + "item=" + item + ", sender=" + sender
	+ ", receiver=" + receiver + ", runner=" + runner +  '}';
    }


    
}

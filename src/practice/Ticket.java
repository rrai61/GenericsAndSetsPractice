/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author ritu
 */
public class Ticket { // how to compare Ticket objects for uniqueness? add a unique property
    private String garageName;
    private static int counter; // to generate unique ticket id
    private int ticketId; // equality checking needs unique property

    public Ticket(String garageName) {
        this.garageName = garageName;
        counter++;
        ticketId = counter;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.ticketId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ticket other = (Ticket) obj;
        if (this.ticketId != other.ticketId) {
            return false;
        }
        return true;
    }

    
    public String getGarageName() {
        return garageName;
    }

    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }
    
    
}

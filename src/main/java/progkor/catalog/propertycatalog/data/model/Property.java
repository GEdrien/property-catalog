package progkor.catalog.propertycatalog.data.model;

import java.util.Objects;

/**
 * Model class for properties/houses.
 */
public class Property {
    private Long id;
    private String address;
    private String owner;
    private Long price;
    private Long area;
    private Roof roof;

    public Property(){

    }

    public Property(Long id, String address, String owner, Long price, Long area, Roof roof){
        this.id = id;
        this.address = address;
        this.owner = owner;
        this.price = price;
        this.area = area;
        this.roof = roof;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public Long getArea(){
        return area;
    }

    public void setArea(Long area){
        this.area = area;
    }

    public Long getPrice(){
        return price;
    }

    public void setPrice(Long price){
        this.price = price;
    }

    public Roof getRoof(){
        return roof;
    }

    public void setRoof(Roof roof){
        this.roof = roof;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Property property = (Property) o;

        if(!Objects.equals(id, property.id)) {
            return false;
        }
        if(!Objects.equals(address, property.address)){
            return false;
        }
        if(!Objects.equals(owner, property.owner)){
            return false;
        }
        if(!Objects.equals(price, property.price)){
            return false;
        }
        if(!Objects.equals(area, property.area)){
            return false;
        }
        return roof == property.roof;
    }

    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = price != null ? price.hashCode() : 0;
        result = area != null ? area.hashCode() : 0;
        result = 31 * result + (roof != null ? roof.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "Property{"
                + "id" + id
                + ", address=" + address + '\''
                + ", owner=" + owner + '\''
                + ", price=" + price + '\''
                + ", area=" + area + '\''
                + ", roof=" + roof + '\''
                + '}';
    }
}
package design;

import java.util.ArrayList;
import java.util.List;

public class Floors implements Building{
    private int totalfloors;
    private String Address;
    private int flooar_area;
    private String Description;
    private List<Building> floor=new ArrayList<Building>();

    public Floors(String address, String description) {
        Address = address;
        Description = description;
    }

    public void add_flat(flat flat){
        this.floor.add(flat);
    }
    @Override
    public int getid() {
        return 0;
    }
    @Override
    public String getname() {
        return null;
    }
    @Override
    public int getTotalfloors() {
          return floor.size();
    }
    @Override
    public int getArea() {
        int total=0;
        for(Building flat:floor){
            total+=flat.getArea();
        }
        return total;
    }
    @Override
    public int get_total_rooms() {
        return 0;
    }
    @Override
    public String getAddress() {
        return this.Address;
    }
    @Override
    public String getDescription() {
        return this.Description;
    }
    @Override
    public String toString(){
        String output="-------------FLATS INFORMATION--------------\n";
        for(Building flat:floor){
            output+=flat+"\n";

        }
        output+="Address: "+this.getAddress()+"\n";
        output+="total floors: "+this.getTotalfloors()+"\n";
        output+="Description:"+this.getDescription()+"\n";
        output+="floorArea:"+this.getArea()+"\n";
        return output;
    }
}

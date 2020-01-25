package design;

import java.awt.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class flat implements Building {
    private int total_rooms;
    private int flat_area;
    private String Description;
    private int flat_no;
    private String flat_name;
    private List<Building>rooms=new ArrayList<Building>();
    public flat(int flat_no,String flat_name,String Description){
        this.flat_name=flat_name;
        this.flat_no=flat_no;
        this.Description=Description;
    }
    public flat() {
        super();
    }
    public void add_room(Room room){
        this.rooms.add(room);
    }
    @Override
    public int getid() {
        return this.flat_no;
    }
    @Override
    public String getname() {
        return this.flat_name;
    }
    @Override
    public int getTotalfloors() {
        return 0;
    }
    @Override
    public int getArea() {
        int Area=0;
        for(Building room:rooms) {
            Area += room.getArea();
        }
        return Area;
    }
    @Override
    public String getAddress() {
        return null;
    }
    @Override
    public String getDescription() {
        return this.Description;
    }
    @Override
    public int get_total_rooms() {
        return this.rooms.size();
    }
    @Override
    public String toString(){
        String output="-----------------ROOMS INFORMATION------------------";
        for(Building room:rooms){
            output+=room+"\n";

        }
        output+="Area of the flat= "+this.getArea()+" \n";
        output+="total rooms = "+this.get_total_rooms()+" \n";
        output+="Description= "+this.getDescription()+ "\n";
        output+="Name= "+this.getname()+"\n";
        output+="Flat no: "+this.flat_no+"\n";
        return output;
    }
}

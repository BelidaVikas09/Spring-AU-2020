package design;

public class Room implements Building{
    private int room_no;
    private String Name;
    private int area;
    private String Description;
    public Room(int room_no, String name, int area, String description) {
        this.room_no = room_no;
        Name = name;
        this.area = area;
        Description = description;
    }
    public Room(){

    }

    @Override
    public int getid() {
        return this.room_no;
    }
    @Override
    public String getname() {
        return this.Name;
    }

    @Override
    public int getTotalfloors() {
        return 0;
    }

    @Override
    public int getArea() {
        return this.area;
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
        return 0;
    }

    @Override
    public String toString(){
        return "\n RoomType= "+this.Name+"\n"+"  "+" Room_no= "+this.room_no+"\n   area= "+this.area+" \n Description= "+this.Description+"\n";
    }
}

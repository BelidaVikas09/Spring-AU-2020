package design;

public class Construction {
    public static void main(String args[]){
        Room r1=new Room(1,"Hall",100,"well Furnished with marbles");
        Room r2=new Room(2,"Kitchen",110,"Kitchen is fully equipped with modern kitchen instruments");
        Room r3=new Room(3,"Master Bed Room",200,"Luxury Bedroom");
        Room r4=new Room(4,"Bed room",100,"well Furnished with marbles");
        Room r5=new Room(5,"Pooja Room",50,"well Furnished");
        flat fl=new flat(101,"Vikas","luxurious flat");
        fl.add_room(r1);
        fl.add_room(r2);
        fl.add_room(r3);
        fl.add_room(r4);
        fl.add_room(r5);
        Room r11=new Room(1,"Hall",300,"well Furnished with marbles");
        Room r12=new Room(2,"Kitchen",200,"Kitchen is fully equipped with modern kitchen instruments");
        Room r13=new Room(3,"Master Bed Room",200,"Luxury Bedroom");
        Room r14=new Room(4,"Bed room",200,"well Furnished with marbles");
        Room r15=new Room(5,"Pooja Room",100,"Fully Equiped with latest Pooja Saman");
        flat f2=new flat(102,"Virat","luxurious flat");
        f2.add_room(r11);
        f2.add_room(r12);
        f2.add_room(r13);
        f2.add_room(r14);
        f2.add_room(r15);
        Floors floor=new Floors("Jublee Hills, Hyderbad","Best Flats");
        floor.add_flat(fl);
        floor.add_flat(f2);
        System.out.println(floor);
    }
}

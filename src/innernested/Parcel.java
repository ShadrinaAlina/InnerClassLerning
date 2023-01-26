package innernested;

public class Parcel {
    public String recepient;
    private int mass;

    class Destination{
        public String street;
        private int homeNumber;
        private int roomNumber;
        public void doSmth(){
            System.out.println(mass);
        }

    }
}

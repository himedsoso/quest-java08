public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    public void takeOff() {
        if(!isFlying()) {
            this.flying = !this.flying;
            System.out.println(this.getName() + " takes off in the skies");
        }else {
        System.out.println(this.getName() +" is already in the air!");

        }
    }
    public void ascend(int meters) {
        if(isFlying()) {
            this.altitude = this.altitude + meters;
            System.out.println(this.getName() + " flies upward and goes to altitude : " + this.altitude);
        }else {
        System.out.println(this.getName()+ " have to take off!");

        }
    }
    public void glide() {
        if(isFlying()){
            System.out.println("It glides in the air!");
        }else {
            System.out.println(this.getName() + " glides his face on the ground!");
        }
        
    }
    public void descend(int meters) {
        if(isFlying() && getAltitude()>0){
            this.altitude = this.altitude - meters;
            System.out.println(this.getName() + " flies downward and goes to altitude: " + this.getAltitude());
        }

    }
    public void land(){
        if (isFlying() && this.getAltitude()<=1){
            this.altitude = 0;
            System.out.println(this.getName() + " lands on the ground...");
        }else {
            System.out.println(this.getName() + " is too high!");
        }
    };

}
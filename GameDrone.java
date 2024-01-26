package dasar;
public class GameDrone {
    public static void main(String[] args) {
        
        //membuat objek drone
        Drone honda = new Drone ();
        
        // mengisi atribut drone
        
        honda.energi = 11;
        honda.kecepatan = 300;
        honda.merek = "honda";
        honda.ketinggian = 2;
        
        // menjalankan method
        
        honda.turun();

    }
}

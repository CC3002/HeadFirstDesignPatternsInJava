package headfirst.combined.djview;
  
public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        new HeartController(heartModel);
    }
}

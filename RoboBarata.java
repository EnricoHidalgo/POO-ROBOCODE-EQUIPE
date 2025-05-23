package pdoAER;
import robocode.*;

public class CHARLES extends Robot
{
	public void run() {
	while(true){
		ahead(400);
		
		}
	}
	public void onHitWall(HitWallEvent event){
		setDebugProperty("Angulo da colisao", String.valueOf(event.getBearing()));
		while(true){
		turnLeft(1);
		ahead(800);
		}
	}
}

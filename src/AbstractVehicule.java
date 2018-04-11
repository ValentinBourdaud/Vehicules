
public abstract class AbstractVehicule implements Vehicule {

	
		private Position position;
		private float direction;
		private float speed;
		
		private float nord;
		private float sud;
		private float ouest;
		private float est;
		
		private float poids;
		private String couleur;
		private String marque;
		private String modele;
		
		
		public AbstractVehicule () {
			this.nord=0;
			this.sud=0;
			this.ouest=0;
			this.est=0;
			
			this.speed=0;
			this.poids=0;
			this.couleur="";
			this.marque="";
			this.modele="";
			
			
		}
		
		public Position getPosition() {
			return this.position;
		}
		
		
		public void setDirection(float nord, float sud, float ouest, float est) {
			this.nord = nord;
			this.sud = sud;
			this.ouest = ouest;
			this.est = est;
		}
		
		public void setSpeed(float speed) {
			this.speed = speed;
		}
		
		
}

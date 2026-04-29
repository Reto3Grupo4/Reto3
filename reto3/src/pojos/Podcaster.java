package pojos;

public class Podcaster extends Artista{
	
	public String idPodcaster;
	
	
	public Podcaster(String idPodcaster) {
		this.idPodcaster = idPodcaster;
	}

	public Podcaster() {
		
	}

	/**
	 * @return the idPodcaster
	 */
	public String getIdPodcaster() {
		return idPodcaster;
	}

	/**
	 * @param idPodcaster the idPodcaster to set
	 */
	public void setIdPodcaster(String idPodcaster) {
		this.idPodcaster = idPodcaster;
	}
}

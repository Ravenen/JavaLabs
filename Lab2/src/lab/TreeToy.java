package lab;

public class TreeToy extends Decoration {
	private String form;
	private int volumeInCmCube;

	public TreeToy(String color, double priceInHryvnas, DecorationType type, String form, int volumeInCmCube) {
		super(color, priceInHryvnas, type);
		this.form = form;
		this.volumeInCmCube = volumeInCmCube;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public int getVolumeInCmCube() {
		return volumeInCmCube;
	}

	public void setVolumeInCmCube(int volumeInCmCube) {
		this.volumeInCmCube = volumeInCmCube;
	}

	@Override
	public String toString() {
		return "TreeToy [form=" + form + ", volumeInCmCube=" + volumeInCmCube + ", color=" + color + ", priceInHryvnas="
				+ priceInHryvnas + ", type=" + type + "]";
	}

}

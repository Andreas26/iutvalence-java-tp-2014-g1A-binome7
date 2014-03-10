public class Mine {
	private final static int nbMine = 10;

	public enum mine {
		MINE,

		VIDE;

		public String toString() {
			if (this.mine == MINE)
				return "M";
			else
				return "V";
		}
	}
}
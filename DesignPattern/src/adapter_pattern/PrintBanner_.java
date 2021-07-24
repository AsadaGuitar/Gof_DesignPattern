package adapter_pattern;

public class PrintBanner_ extends PrintAbs{

	private Banner banner;
	
	public PrintBanner_(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}

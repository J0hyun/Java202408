package ex07;

public class FactoryCam extends Camera implements Detectable, Reportable{
	public Detectable detector;
	public Reportable reporter;
	
	public void setDetector(Detectable detector) {
		this.detector = detector;
	}
	
	public void setReporter(Reportable reporter) {
		this.reporter = reporter;
	}
	
	
	@Override
	public void showMainFeature() {
		System.out.println("화재 감지");
	}

	@Override
	public void detect() {
		detector.detect();
	}
	
	@Override
	public void report() {
		reporter.report();
	}


	

}

package ex07;

public class _01_Interface {
	public static void main(String[] args) {
		Reportable normalReporter = new NormalReporter();
		normalReporter.report();
		
		
		VideoReporter videoReporter = new VideoReporter();
		videoReporter.report();
		
		
		System.out.println("--------------------------");
		
		Detectable fireDetector = new FireDetector();
		fireDetector.detect();
		
		
		Detectable advancedFireDetector = new AdvancedFireDetector();
		advancedFireDetector.detect();
		
		System.out.println("--------------------------");
		
		FactoryCam factoryCam = new FactoryCam();
		factoryCam.setDetector(advancedFireDetector);
		factoryCam.setReporter(normalReporter);
		
		factoryCam.detect();
		factoryCam.report();
	}
}

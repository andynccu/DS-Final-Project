import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter your height and weight: ");
		String text = buf.readLine();
		String[] data = text.split(" ");
		double res = getBMI(data);
		String dia = getDiagnosis(res);
		System.out.println(dia + " BMI: " + res);

	}

	public static double getBMI(String[] data) {
		// calculate the bmi
		// return 0;
		double height = Double.parseDouble(data[0]) * 0.01;
		double weight = Double.parseDouble(data[1]);
		double BMI = weight / Math.pow(height, 2);
		BMI = Math.round(BMI * 100) / 100.0;
		//BMI = Math.round(BMI);
		return BMI;
	}

	public static String getDiagnosis(double bmi) {
		// give comments depending on bmi
		// return "";
		if (bmi < 20.0) {
			return "You are undershape.";
		}

		else if (bmi >= 20.0 && bmi < 26.0) {
			return "You are in shape.";
		}

		else if (bmi >= 26.0 && bmi < 30.0) {
			return "To be honest, you are not in shape.";
		}

		else {
			return "You are not in shape. Actually, you are not even close.";
		}
	}
}
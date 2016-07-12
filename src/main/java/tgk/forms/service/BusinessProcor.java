package tgk.forms.service;

public class BusinessProcor {
	public boolean validateAge(String strAge, int type) {
		int age = -1;
		if (strAge != null && strAge.length() > 0) {
			try {
				age = Integer.parseInt(strAge);
				if (age < 19 && type > 3) {
					return false;
				}
				return true;

			} catch (Exception e) {
				// iggy
			}
		}
		return false;

	}
}
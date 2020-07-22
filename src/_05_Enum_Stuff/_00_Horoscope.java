package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	public void getYourZodiac(Zodiac zodiac) {
		Zodiac display = Zodiac.ARIES;
		switch(zodiac) {
			case TAURUS:{
				display = Zodiac.TAURUS;
			}
			case GEMINI:{
				display = Zodiac.GEMINI;
			}
			case CANCER:{
				display = Zodiac.CANCER;
			}
			case LEO:{
				display = Zodiac.LEO;
			}
			case VIRGO:{
				display = Zodiac.VIRGO;
			}
			case LIBRA:{
				display = Zodiac.LIBRA;
			}
			case SCORPIO:{
				display = Zodiac.SCORPIO;
			}
			case SAGITTARIUS:{
				display = Zodiac.SAGITTARIUS;
			}
			case CAPRICORN:{
				display = Zodiac.CAPRICORN;
			}
			case AQUARIUS:{
				display = Zodiac.AQUARIUS;
			}
			case PISCES:{
				display = Zodiac.PISCES;
			}
			//TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES
		}
		
		JOptionPane.showMessageDialog(null, "You are an " + display);
			
	}
		
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope scope = new _00_Horoscope();
		scope.getYourZodiac(Zodiac.ARIES);
	}

	
}

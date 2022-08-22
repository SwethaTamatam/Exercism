public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
	public int expectedMinutesInOven() {
		return 40;
	}
    // TODO: define the 'remainingMinutesInOven()' method
	public int remainingMinutesInOven(int theMinutesLasagnaInOven) {
		return expectedMinutesInOven()-theMinutesLasagnaInOven;
	}
    // TODO: define the 'preparationTimeInMinutes()' method
	public int preparationTimeInMinutes(int noOfLevels) {
		return 2*noOfLevels;
	}
    // TODO: define the 'totalTimeInMinutes()' method
	public int totalTimeInMinutes(int noOfLevels,int theMinutesLasagnaInOven) {
		
		return (noOfLevels*2)+theMinutesLasagnaInOven;
	}
}

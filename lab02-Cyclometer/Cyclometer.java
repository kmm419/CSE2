//Kimberly Mejia
//February 5, 2016
//CSE 002
//bicycle cylometer (meant to measure speed, distance, etc.). It records two kinds of data: time elasped (s) and number of rotations of the front wheel
//prints results for: number of minutes for each trip, number of counts for each trip, distance of each trip in miles, distance for the two trips combined
//
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
        int secsTrip1=480; //number of seconds in the first trip
        int secsTrip2=3220; //number of seconds in the second trip
        int countsTrip1=1561; //number of rotations of the front wheel during the first trip
        int countsTrip2=9037; //nummber of rotations of the front wheel during the second trip
        double wheelDiameter=27.0, //diameter of the front wheel being measured for rotations
            PI=3.14159, //pi constant used for the distance travelled
            feetPerMile=5280, //used for conversion for feet to mile
            inchesPerFoot=12, //used for conversion for inches to foot
            secondsPerMinute=60; //used for conversion for second to minutes
        double distanceTrip1, distanceTrip2, totalDistance; //converting double into integer
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+ " counts.");
        totalDistance=countsTrip1*wheelDiameter*PI; //distance of the trip in inches. the distance is the the diameter in inches times PI times to number of wheel rotations
        distanceTrip1=inchesPerFoot*feetPerMile; //converts inches to feet, feet to miles. Gives distance in miles
        distanceTrip2=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
        totalDistance=distanceTrip1+distanceTrip2; //adding both distance numbers together for a total distance
        //Print out output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+"miles");
        
        
        
        
        
    } //end of main method
} //end of class


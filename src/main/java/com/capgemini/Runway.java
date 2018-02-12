package com.capgemini;

public class Runway {

    // Properties
    // als er al een vliegtuig land of opstijgt vanaf deze baan
    private boolean isOccupied;

    // als er een gat in de weg zit
    private boolean isBroken;

    // windkracht, of de baan bevroren is, etc.
    private boolean goodWeatherCondition;

    private EWindDirection windDirection;

    public Runway (EWindDirection windDirection, boolean isBroken, boolean isOccupied) {
        this.windDirection = windDirection;
        this.isBroken = isBroken;
        this.isOccupied = isOccupied;
    }




}

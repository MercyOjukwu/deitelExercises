package Kata;

public enum Region {
    NE( "Bariga",  "Ketu"),
    SE( "Iyanapaja", "Ikot Ishie", "Sabo"),
    SW( "Gombe", "Katsina", "Somolu"),
    NC( "Mowe", "Abia", "Lagos"),
    SS( "Somolu", "Ikeja"),
    NW("Abuja");

    private String states[];

    Region(String... states){
        this.states = states;

    }

}

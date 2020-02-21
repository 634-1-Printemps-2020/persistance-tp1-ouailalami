package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    public UpperLimitedPositiveCounter (int nbMin, int nbMax) throws CounterException {
        if (nbMin < 0 || nbMax < 0) {throw new CounterException();}
        super.nbMin = nbMin;
        super.nbMax = nbMax;
        super.nbVal = nbMin;}

    public String toString(){
        return "de : " + nbMin + " a : " + nbMax + ", valeur actuel : "+ nbVal;
    }

    public void inc() throws CounterException {
        if (nbVal++ > nbMax) {throw new CounterException();}
        nbVal++;
    }

    public void add(int step) throws CounterException { // je laisse le user mettre -x pour baisser le nbVal mais pas moins que 0
        if ((nbVal+= step) > nbMax || (nbVal += step) < 0) {throw new CounterException();}
        nbVal+=step;
    }


    public int getValue() {
        return nbVal;
    }
}

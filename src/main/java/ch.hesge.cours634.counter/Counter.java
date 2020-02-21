package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    protected int nbMax, nbMin, nbVal;

    public Counter (int nbMin, int nbMax) {
        this.nbMin = nbMin;
        this.nbMax = nbMax;
        this.nbVal = nbMin;}

    public String toString(){
        return "de : " + nbMin + " a : " + nbMax + ", valeur actuel : "+ nbVal;
    }

    @Override
    public void inc() throws CounterException {
        nbVal++;
    }

    @Override
    public void add(int step) throws CounterException {
        nbVal+=step;
    }

    @Override
    public int getValue() {
        return nbVal;
    }

}

package sort;
import structs.Generics;

public abstract class Sorter {
    protected String name;
    protected long vector_size;
    protected long comparisons;
    protected long movements;
    protected long startTime;
    protected long endTime;

    public Sorter(){
        this.comparisons = 0;
        this.movements = 0;
    }

    public long getComparisons() {
        return this.comparisons;
    }

    public long getMovements(){
        return this.movements;
    }

    public void setStartTime(){
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTime(){
        this.endTime = System.currentTimeMillis();
    }

    public long getExecutionTime(){
        return this.endTime - this.startTime;
    }

    public String getName(){
        return this.name;
    }

    public long getVector_size() {
        return this.vector_size;
    }

    public abstract void sort(Generics<?, ?>[] vector );

    public abstract void invertedSort( Generics<?, ?>[] vector );

    public void sort( Generics<?, ?>[] vector, boolean inverted ){
        if ( inverted ){
            this.invertedSort( vector );
        } else {
            this.sort( vector );
        }
    }
}

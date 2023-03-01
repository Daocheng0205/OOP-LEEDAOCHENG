public class Marks {
    // Section A: marks
    private float marks[];
    private int numdata;

    // Section B: operation
    public void createData(int numdat) {
        marks = new float[numdat];   // an array
        for (int i=0; i<numdat; i++) {
            marks[i] =  0;
        }
        numdata = numdat;
    }

    public float calcAvg() {
        float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
        }
        float avg = sum / numdata;
        return avg;
    }

    public void setMark(int mark, int index) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        
        if (mark < 0) 
        {
        throw new IllegalArgumentException("Mark cannot be negative");
        }

    
        if (index < 0 || index >= marks.length) 
        {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        
          marks[index] = mark;
    }
    
    public float getMark(int index) {
        return marks[index];
    }
}

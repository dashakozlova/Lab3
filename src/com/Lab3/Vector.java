package com.Lab3;

public class Vector {
    private int array[];
    private int dim;

    /**
     *
     * @param dim dimension size of array
     */
    public Vector(int dim){
        this.dim=dim;
        array=new int[dim];
    }

    /**
     *
     * @param array values for new array
     */
    public Vector(int... array) {
        this(array.length);

        for (int i = 0; i < dim; i++) {
            this.array[i] = array[i];
        }
    }

    /**
     *
     * @param index index of element what you want
     * @return element of index what you want
     */
    public int getElem(int index){
       return this.array[index];
    }

    /**
     *
     * @param index index of element what you want change
     * @param value value of element
     */
    public void setElem(int index, int value){
        this.array[index]=value;
    }

    /**
     *
     * @param second second vector
     * @return new object with added values
     */
    public Vector add(Vector second){
        Vector result=new Vector(dim);
        for (int i = 0; i < dim; i++) {
            result.array[i] = this.array[i] + second.array[i];
        }
        return result;

    }

    /**
     *
     * @param second second vector
     * @return new object with multiplied values
     */
    public Vector multiply(Vector second){
        Vector result=new Vector(dim);
        for (int i = 0; i < dim; i++) {
            result.array[i] = this.array[i] * second.array[i];
        }
        return result;
    }

    /**
     *
     * @param second second vector
     * @return new object with deducted values
     */
    public Vector deduct(Vector second){
        Vector result=new Vector(dim);
        for (int i = 0; i < dim; i++) {
            result.array[i] = this.array[i] - second.array[i];
        }
        return result;
    }

    /**
     *
     * @return string value of vector
     */
    public String toString() {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < this.dim; i++) {
            if (i != dim - 1) {
                string.append(this.array[i] + ", ");
            } else {
                string.append(this.array[i]);
            }
        }
        return string.toString();
    }


    public void print() {
        System.out.println("Your array: "+this.toString());
    }
}

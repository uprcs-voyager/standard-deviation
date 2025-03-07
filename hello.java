public class hello {
    public static void main(String[] args) {
        
        double data[] = {600,470,170,430,300};


        //// rata - rata
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        double mean = sum/5;
       
        // mengurangi nilai setiap data dengan rata-rata
        double[] newData = new double[data.length];
        for (int i = 0; i < data.length; i++) { 
            newData[i] = data[i]-mean;
        }
        
        // meng-kuadratkan setiap data
        double[] kuadrat = new double[newData.length];
        for (int i=0; i < newData.length; i++ ) {
            kuadrat[i] = newData[i]*newData[i];
        }

        // sum of kuadrat dan dibagi dengan jumlah data
        double newSum = 0;
        for (int i = 0; i < kuadrat.length; i++) {
            newSum +=kuadrat[i];
        }   
        double kuadratSum = newSum/5;
        double result = Math.sqrt(kuadratSum);

         System.out.println((result));
        

         // adding a comment
    }

}

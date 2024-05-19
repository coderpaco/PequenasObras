package systemGuis;

public class Foreman {
        // class atributes
        private String name;
        private String id;
        private String adress;
        private int yearHired;
    
        // Constructor to initialize atributes
        public Foreman(String name, String id, String adress, int yearHired) {
            this.name = name;
            this.id = id;
            this.adress = adress;
            this.yearHired = yearHired;
        }
    
        // getter and setter for each atribute.
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getId() {
            return id;
        }
    
        public void setId(String id) {
            this.id = id;
        }
    
        public String getAdress() {
            return adress;
        }
    
        public void setAdress(String adress) {
            this.adress = adress;
        }
    
        public int getYearHired() {
            return yearHired;
        }
    
        public void setAnoYearHired(int yearHired) {
            this.yearHired = yearHired;
        }
    
        @Override
        public String toString() {
            return "Foreman{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    ", adress='" + adress + '\'' +
                    ", yearHired=" + yearHired +
                    '}';
        }
    }

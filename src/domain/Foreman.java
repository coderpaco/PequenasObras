package domain;

public class Foreman {
        // class atributes
        private String name;
        private String id;
        private String address;
        private int yearHired;
    
        // Constructor to initialize atributes
        public Foreman(String name, String id, String address, int yearHired) {
            this.name = name;
            this.id = id;
            this.address = address;
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
            return address;
        }
    
        public void setAdress(String address) {
            this.address = address;
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
                    ", address='" + address + '\'' +
                    ", yearHired=" + yearHired +
                    '}';
        }
    }

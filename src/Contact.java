public class Contact {
    private String name;
    private String street;
    private String telephone;
    private String email;

    public Contact (String name, String street, String telephone, String email) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.street = street;
    }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getStreet () {
            return street;
        }

        public void setStreet (String street){
            this.street = street;
        }

        public String getTelephone () {
            return telephone;
        }

        public void setTelephone (String telephone){
            this.telephone = telephone;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }
    }

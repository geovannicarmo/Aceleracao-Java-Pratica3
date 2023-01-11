public class Students {
   private String name;
   private String email;
   
   DataSchool dataSchool = new DataSchool();
    
     String getName(){
        return this.name;
   }

   void setName(String name){
    this.name = name;
   }

   String getEmail(){
    return this.email;
    }

    void setEmail(String email){
    this.email = email;
    }
}

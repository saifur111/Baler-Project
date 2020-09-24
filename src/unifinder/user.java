package unifinder;

class user {
    private String name,type,location,link,adress;
    
    public user(String name,String type,String location,String link,String adress){
        this.name=name;
        this.type=type;
        this.location=location;
        this.link=link;
        this.adress=adress;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public String getLocation(){
        return location;
    }
    public String getLink(){
        return link;
    }
    public String getAdress(){
        return adress;
    }
}

package org.omnera.Blog.util.constants;

public enum Privillages {

    RESET_ANY_USER_PASSWORD(1l, "RESET_ANY_USER_PASSWORD"),
    ACCESS_ADMIN_PANEL(2l, "ACCESS_ADMIN_PANEL");

    private final Long Id;
    private final String privillage;
    private Privillages(Long Id,String privillage){
        this.Id=Id;
        this.privillage=privillage;
    }
    public Long getId(){
        return Id;
    }

    public String getPrivillage(){
        return privillage;
    }
    
}

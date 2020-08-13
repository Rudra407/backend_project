package tech.codingclub.helix.entity;

public class LoginResponse {

    public long id;
    public Boolean is_logined;
    public String message;

    public LoginResponse()
    {

    }

    public LoginResponse(long id, Boolean is_logined, String message) {
        this.id = id;
        this.is_logined = is_logined;
        this.message = message;
    }



}
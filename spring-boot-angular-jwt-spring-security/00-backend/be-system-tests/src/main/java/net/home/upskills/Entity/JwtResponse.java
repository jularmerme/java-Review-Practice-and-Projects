package net.home.upskills.Entity;

public class JwtResponse {

    private String toke;

    public JwtResponse() {
    }

    public JwtResponse(String toke) {
        this.toke = toke;
    }

    public String getToke() {
        return toke;
    }

    public void setToke(String toke) {
        this.toke = toke;
    }
}

package model;

public enum RedSocial {
    // intagram, facebook, twitter
    INSTAGRAM("Instagram"), FACEBOOK("Facebook"), TWITTER("Twitter");

    private String redSocial;

    private RedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public String getRedSocial() {
        return redSocial;
    }
}

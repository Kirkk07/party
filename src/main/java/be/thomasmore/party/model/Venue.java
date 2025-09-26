package be.thomasmore.party.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Venue {
    @Id
    private Integer id;
    private String venueName;
    private String linkMoreInfo;
    private String appName;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }



    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getLinkMoreInfo() {
        return linkMoreInfo;
    }

    public void setLinkMoreInfo(String venueLinkMoreInfo) {
        this.linkMoreInfo = venueLinkMoreInfo;
    }



    }


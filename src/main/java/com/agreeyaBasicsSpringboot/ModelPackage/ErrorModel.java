package com.agreeyaBasicsSpringboot.ModelPackage;

import java.util.Date;

public class ErrorModel {
    private String mesg;
    private String MsgDetails;
    private Date TimeStamp;

    public ErrorModel() {
    }

    public ErrorModel(String mesg, String msgDetails, Date timeStamp) {
        this.mesg = mesg;
        MsgDetails = msgDetails;
        TimeStamp = timeStamp;
    }

    public String getMesg() {
        return mesg;
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }

    public String getMsgDetails() {
        return MsgDetails;
    }

    public void setMsgDetails(String msgDetails) {
        MsgDetails = msgDetails;
    }

    public Date getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        TimeStamp = timeStamp;
    }
}

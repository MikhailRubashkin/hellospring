package by.pvt.service;

public enum MessageType {

    INVITATION_MESSAGE ( "You are invited to course", "You"),
        CENCEL_MESSAGE("jkl;aj", "Me");

    private String body;
    private String subject;

    public void setBody ( String body ){
        this.body = body;
    }

    public String getSubject (){
        return subject;
    }

    public void setSubject ( String subject ){
        this.subject = subject;
    }

    MessageType ( String body, String subject ){
        this.body = body;
        this.subject = subject;
    }

    public String getBody (){
        return body;
    }
}

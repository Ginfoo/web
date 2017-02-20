package party.infoo.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by infoo on 2017/2/20.
 */
public class Message {
    private long messageId;
    private String messageText;
    private User messageSendUser;
    private User messageReceiveUser;
    private Set<User> messageReceiveUsers=new HashSet<User>();
    private Date messageSendDate;
    private boolean messageIsRead;

    public Message() {
        super();
    }

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public User getMessageSendUser() {
        return messageSendUser;
    }

    public void setMessageSendUser(User messageSendUser) {
        this.messageSendUser = messageSendUser;
    }

    public User getMessageReceiveUser() {
        return messageReceiveUser;
    }

    public void setMessageReceiveUser(User messageReceiveUser) {
        this.messageReceiveUser = messageReceiveUser;
    }

    public Date getMessageSendDate() {
        return messageSendDate;
    }

    public void setMessageSendDate(Date messageSendDate) {
        this.messageSendDate = messageSendDate;
    }

    public boolean isMessageIsRead() {
        return messageIsRead;
    }

    public void setMessageIsRead(boolean messageIsRead) {
        this.messageIsRead = messageIsRead;
    }
}

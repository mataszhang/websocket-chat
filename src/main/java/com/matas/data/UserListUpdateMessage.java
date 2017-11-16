package com.matas.data;

import java.util.List;

public class UserListUpdateMessage extends StructuredMessage {

    public UserListUpdateMessage(List<String> usernames) {
        super(ChatMessage.USERLIST_UPDATE, usernames);
    }

    public List<String> getUserList() {
        return super.dataList;
    }

}

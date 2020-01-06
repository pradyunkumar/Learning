package pradyunjava;

import java.util.ArrayList;
import java.util.List;

public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message){
        String[] wordsplit = message.split(":");
        machineId = wordsplit[0];
        description = wordsplit[1];

    }
    public boolean containsWord(String keyword){
        return (machineId+":"+description).contains(keyword);
    }

    public String getMachineId(){
        return machineId;
    }
    public String getDescription(){
        return description;
    }
}

class SystemLog{
    private List<LogMessage> messageList;

    public List<LogMessage> removeMessages(String keyword){
        List<LogMessage> removedMessages = new ArrayList<LogMessage>();
        for(LogMessage logMessage : messageList){
            if((logMessage.getMachineId()+":"+logMessage.getDescription()).
                    contains(keyword)){
                messageList.remove(logMessage);
                removedMessages.add(logMessage);
            }
        }
        return removedMessages;
    }
}

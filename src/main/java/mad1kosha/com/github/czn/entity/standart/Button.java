package mad1kosha.com.github.czn.entity.standart;

import lombok.Data;
import mad1kosha.com.github.czn.entity.enums.Language;

@Data
public class Button {

    private int      id;
    private String   name;
    private int      commandId;
    private String   url;
    private Language langId;
    private boolean  requestContact;
    private int      messageId;


}

package mad1kosha.com.github.czn.entity.standart;

import lombok.Data;
import mad1kosha.com.github.czn.entity.enums.FileType;
import mad1kosha.com.github.czn.entity.enums.Language;

@Data
public class Message {

    private long id;
    private String name;
    private String Photo;
    private long keyboardMarkUpId;
    private String file;
    private FileType fileType;
    private Language language;

    public void setFile(String file, FileType fileType){
        this.file = file;
        this.fileType = fileType;
    }

}

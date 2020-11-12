package mad1kosha.com.github.czn.entity.standart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mad1kosha.com.github.czn.entity.enums.Language;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageUser {

    private long     chatId;
    private Language language;

}

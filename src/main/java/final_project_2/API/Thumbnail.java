package final_project_2.API;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Thumbnail {

    @JsonProperty("url")
    private String url;

}

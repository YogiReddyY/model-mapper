package eye2web.modelmapper.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ModelARequest {

    private int id;

    private String firstName;
    private String lastName;

    private SimpleNestedModel simpleNestedModel;
}

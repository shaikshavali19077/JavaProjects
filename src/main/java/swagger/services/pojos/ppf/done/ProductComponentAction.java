
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productComponent"
})
public class ProductComponentAction {

    @JsonProperty("productComponent")
    private ProductComponent productComponent;

    @JsonProperty("productComponent")
    public ProductComponent getProductComponent() {
        return productComponent;
    }

    @JsonProperty("productComponent")
    public void setProductComponent(ProductComponent productComponent) {
        this.productComponent = productComponent;
    }

}

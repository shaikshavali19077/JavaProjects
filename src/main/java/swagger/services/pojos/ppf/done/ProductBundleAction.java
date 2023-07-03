
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productBundle"
})
public class ProductBundleAction {

    @JsonProperty("productBundle")
    private ProductBundle productBundle;

    @JsonProperty("productBundle")
    public ProductBundle getProductBundle() {
        return productBundle;
    }

    @JsonProperty("productBundle")
    public void setProductBundle(ProductBundle productBundle) {
        this.productBundle = productBundle;
    }

}

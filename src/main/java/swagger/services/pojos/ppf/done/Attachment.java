
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "documentId",
    "objectId",
    "objectType",
    "status",
    "statusWho",
    "documentDependencyReason",
    "createDate",
    "statusDate"
})
public class Attachment {

    @JsonProperty("documentId")
    private Integer documentId;
    @JsonProperty("objectId")
    private String objectId;
    @JsonProperty("objectType")
    private String objectType;
    @JsonProperty("status")
    private String status;
    @JsonProperty("statusWho")
    private String statusWho;
    @JsonProperty("documentDependencyReason")
    private DocumentDependencyReason documentDependencyReason;
    @JsonProperty("createDate")
    private String createDate;
    @JsonProperty("statusDate")
    private String statusDate;

    @JsonProperty("documentId")
    public Integer getDocumentId() {
        return documentId;
    }

    @JsonProperty("documentId")
    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    @JsonProperty("objectId")
    public String getObjectId() {
        return objectId;
    }

    @JsonProperty("objectId")
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @JsonProperty("objectType")
    public String getObjectType() {
        return objectType;
    }

    @JsonProperty("objectType")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("statusWho")
    public String getStatusWho() {
        return statusWho;
    }

    @JsonProperty("statusWho")
    public void setStatusWho(String statusWho) {
        this.statusWho = statusWho;
    }

    @JsonProperty("documentDependencyReason")
    public DocumentDependencyReason getDocumentDependencyReason() {
        return documentDependencyReason;
    }

    @JsonProperty("documentDependencyReason")
    public void setDocumentDependencyReason(DocumentDependencyReason documentDependencyReason) {
        this.documentDependencyReason = documentDependencyReason;
    }

    @JsonProperty("createDate")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("createDate")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @JsonProperty("statusDate")
    public String getStatusDate() {
        return statusDate;
    }

    @JsonProperty("statusDate")
    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

}

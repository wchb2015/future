package future.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"contract_name,current_price,opening_price,average_price,the_highest_price,the_lowest_price"})
public class FutureDailyPriceDO {

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String contractName;

    private Date date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long openingPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long closingPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long theHighestPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long theLowestPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long averagePrice;

    private Long ocSpread;
    private Long hlSpread;
    private Long openInterest;
    private Long volume;
    private Date createdAt;
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("contract_name")
    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @JsonProperty("opening_price")
    public Long getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(Long openingPrice) {
        this.openingPrice = openingPrice;
    }

    @JsonProperty("current_price")
    public Long getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(Long closingPrice) {
        this.closingPrice = closingPrice;
    }

    @JsonProperty("the_highest_price")
    public Long getTheHighestPrice() {
        return theHighestPrice;
    }

    public void setTheHighestPrice(Long theHighestPrice) {
        this.theHighestPrice = theHighestPrice;
    }

    @JsonProperty("the_lowest_price")
    public Long getTheLowestPrice() {
        return theLowestPrice;
    }

    public void setTheLowestPrice(Long theLowestPrice) {
        this.theLowestPrice = theLowestPrice;
    }

    @JsonProperty("average_price")
    public Long getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Long averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Long getOcSpread() {

        if (openingPrice > closingPrice) {
            ocSpread = openingPrice - closingPrice;
        } else {
            ocSpread = closingPrice - openingPrice;
        }

        return ocSpread;
    }

    public void setOcSpread(Long ocSpread) {
        this.ocSpread = ocSpread;
    }

    public Long getHlSpread() {
        return theHighestPrice - theLowestPrice;
    }

    public void setHlSpread(Long hlSpread) {
        this.hlSpread = hlSpread;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(Long openInterest) {
        this.openInterest = openInterest;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "FutureDailyPrice{" +
                "id=" + id +
                ", contractName='" + contractName + '\'' +
                ", date=" + date +
                ", openingPrice=" + openingPrice +
                ", closingPrice=" + closingPrice +
                ", theHighestPrice=" + theHighestPrice +
                ", theLowestPrice=" + theLowestPrice +
                ", averagePrice=" + averagePrice +
                ", ocSpread=" + ocSpread +
                ", hlSpread=" + hlSpread +
                ", openInterest=" + openInterest +
                ", volume=" + volume +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
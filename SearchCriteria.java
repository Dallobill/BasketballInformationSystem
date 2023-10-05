
public class SearchCriteria {
    private Integer targetAge;
    private Double minHeight;
    private Double maxHeight;
    private Double minWeight;
    private Double maxWeight;
    
    public SearchCriteria(Integer targetAge, Double minHeight, Double maxHeight, Double minWeight, Double maxWeight, String playerName) {
        this.targetAge = targetAge;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    public Integer getTargetAge(){
        return targetAge;
    }

    public void setTargetAge(Integer targetAge) {
        this.targetAge = targetAge;
    }

    public Double getMinHeight(){
        return minHeight;
    }

    public void setMinHeight(Double minHeight) {
        this.minHeight = minHeight;

    }

    public Double getMaxHeight(){
        return maxHeight;
    }

    public void setMaxHeight(Double maxHeight){
        this.maxHeight = maxHeight;

    }

    public Double getMinWeight(){
        return minWeight;
    }

    public void setMinWeight(Double minWeight) {
        this.minWeight = minWeight;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }


}

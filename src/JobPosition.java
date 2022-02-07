public class JobPosition {
    private int positionId;
    private String positionName;

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public JobPosition(int positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }
}

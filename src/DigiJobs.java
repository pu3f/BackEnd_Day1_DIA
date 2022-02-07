public class DigiJobs {
    private int jobId;
    private String jobAddress;

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public DigiJobs(int jobId, String jobAddress) {
        this.jobId = jobId;
        this.jobAddress = jobAddress;
    }
}

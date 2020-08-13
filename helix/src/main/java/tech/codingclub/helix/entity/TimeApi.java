package tech.codingclub.helix.entity;

public class TimeApi {

    public String getTime_str() {
        return time_str;
    }

    public Long getEpoch_time() {
        return epoch_time;
    }

    private String time_str;
    private Long epoch_time;

    public TimeApi(String time_str, Long epoch_time) {
        this.time_str = time_str;
        this.epoch_time = epoch_time;
    }

    public TimeApi()
    {
        
    }

}

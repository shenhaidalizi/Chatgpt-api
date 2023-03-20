package cn.feimaotudou.chatgpt.api.domain.zsxq.model.aggregates;

import cn.feimaotudou.chatgpt.api.domain.zsxq.model.res.ResData;

public class UnAnsweredQuestionsAggregates {

    private boolean succeeded;
    private ResData resp_data;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public ResData getResp_data() {
        return resp_data;
    }

    public void setResp_data(ResData resp_data) {
        this.resp_data = resp_data;
    }
}

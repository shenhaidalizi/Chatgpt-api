package cn.feimaotudou.chatgpt.api.domain.zsxq.model.vo;

import cn.feimaotudou.chatgpt.api.domain.zsxq.model.res.ResData;

public class Root
{
    private boolean succeeded;

    private ResData resp_data;

    public void setSucceeded(boolean succeeded){
        this.succeeded = succeeded;
    }
    public boolean getSucceeded(){
        return this.succeeded;
    }
    public void setResp_data(ResData resp_data){
        this.resp_data = resp_data;
    }
    public ResData getResp_data(){
        return this.resp_data;
    }
}


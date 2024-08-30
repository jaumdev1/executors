package com.example.executors;

import com.example.domain.BaseModel;
import com.example.executors.contract.BaseExecutor;

public class ExecutorRuleTwo implements BaseExecutor {
    @Override
    public void execute(BaseModel.BaseModelBuilder baseModel) {
    baseModel.amount(10);
    }
}

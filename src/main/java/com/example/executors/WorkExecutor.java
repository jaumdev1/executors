package com.example.executors;

import com.example.domain.BaseModel;
import com.example.executors.contract.BaseExecutor;
import jakarta.inject.Inject;

import java.util.List;

public class WorkExecutor {
    private final List<BaseExecutor> executors;
    @Inject
    public WorkExecutor(List<BaseExecutor> executors){
        this.executors = executors;
    }
    public BaseModel build(BaseModel.BaseModelBuilder baseModel){
     for(BaseExecutor baseExecutor : executors){
        baseExecutor.execute(baseModel);
     }
     return baseModel.build();
    }
}

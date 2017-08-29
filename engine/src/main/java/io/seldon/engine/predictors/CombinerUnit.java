package io.seldon.engine.predictors;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import io.seldon.protos.PredictionProtos.PredictionRequestDef;

@Component
public class CombinerUnit extends PredictiveUnitBean{
	
	public CombinerUnit() {
		super();
	}

	@Override
	protected List<PredictiveUnitState> forwardPass(PredictionRequestDef request, PredictiveUnitState state){
		return state.children;
	}

}

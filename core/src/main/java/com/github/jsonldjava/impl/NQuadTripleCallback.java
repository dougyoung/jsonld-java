package com.github.jsonldjava.impl;

import java.util.Map;

import com.github.jsonldjava.core.JSONLDTripleCallback;
import com.github.jsonldjava.core.RDFDatasetUtils;


public class NQuadTripleCallback implements JSONLDTripleCallback {
	@Override
	public Object call(Map<String, Object> dataset) {
		return RDFDatasetUtils.toNQuads(dataset);
	}
}
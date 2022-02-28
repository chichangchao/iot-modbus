package com.takeoff.iot.modbus.common.bytes.factory;

public class MiiBarcodeBytesFactory extends MiiInteger2BytesFactory<Integer> implements MiiBytesFactory<Integer> {

    private static final int INTEGER_BYTES = 1,INTEGER_COUNT = 6;
	
	public MiiBarcodeBytesFactory() {
		this(0);
	}
	
	public MiiBarcodeBytesFactory(int startPos) {
		super(INTEGER_BYTES, INTEGER_COUNT, startPos);
	}
}

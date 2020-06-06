package com.algorand.algosdk.logic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;


@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class StateSchema {
    @JsonProperty("nui")
    BigInteger numUint = BigInteger.ZERO;

    @JsonProperty("nbs")
    BigInteger numByteSlice = BigInteger.ZERO;

    // Used by Jackson to figure out the default value.
    private StateSchema() { }

    public StateSchema(BigInteger numUint, BigInteger numByteSlice) {
        this.numUint = numUint;
        this.numByteSlice = numByteSlice;
    }

    public StateSchema(Long numUint, Long numByteSlice) {
        this(BigInteger.valueOf(numUint), BigInteger.valueOf(numByteSlice));
    }
}
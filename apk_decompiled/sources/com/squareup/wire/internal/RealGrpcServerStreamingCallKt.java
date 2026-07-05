package com.squareup.wire.internal;

import com.squareup.wire.GrpcStreamingCall;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\u0000¨\u0006\u0006"}, d2 = {"asGrpcServerStreamingCall", "Lcom/squareup/wire/internal/RealGrpcServerStreamingCall;", "S", "R", "", "Lcom/squareup/wire/GrpcStreamingCall;", "wire-grpc-client"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class RealGrpcServerStreamingCallKt {
    public static final <S, R> RealGrpcServerStreamingCall<S, R> asGrpcServerStreamingCall(GrpcStreamingCall<S, R> grpcStreamingCall) {
        grpcStreamingCall.getClass();
        return new RealGrpcServerStreamingCall<>(grpcStreamingCall, grpcStreamingCall.getMethod());
    }
}

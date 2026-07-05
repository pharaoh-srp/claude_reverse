package com.squareup.wire;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.squareup.wire.internal.RealGrpcCall;
import com.squareup.wire.internal.RealGrpcClientStreamingCallKt;
import com.squareup.wire.internal.RealGrpcServerStreamingCallKt;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import defpackage.mdj;
import defpackage.t82;
import defpackage.vs8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJC\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0000\u0010\f*\u00020\u000b\"\b\b\u0001\u0010\r*\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\"\b\b\u0000\u0010\f*\u00020\u000b\"\b\b\u0001\u0010\r*\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\"\b\b\u0000\u0010\f*\u00020\u000b\"\b\b\u0001\u0010\r*\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\"\b\b\u0000\u0010\f*\u00020\u000b\"\b\b\u0001\u0010\r*\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/squareup/wire/WireGrpcClient;", "Lcom/squareup/wire/GrpcClient;", "Lt82;", "client", "Lvs8;", "Lcom/squareup/wire/GrpcHttpUrl;", "baseUrl", "", "minMessageToCompress", "<init>", "(Lt82;Lvs8;J)V", "", "S", "R", "Lcom/squareup/wire/GrpcMethod;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "Lcom/squareup/wire/GrpcCall;", "newCall", "(Lcom/squareup/wire/GrpcMethod;)Lcom/squareup/wire/GrpcCall;", "Lcom/squareup/wire/GrpcStreamingCall;", "newStreamingCall", "(Lcom/squareup/wire/GrpcMethod;)Lcom/squareup/wire/GrpcStreamingCall;", "Lcom/squareup/wire/GrpcClientStreamingCall;", "newClientStreamingCall", "(Lcom/squareup/wire/GrpcMethod;)Lcom/squareup/wire/GrpcClientStreamingCall;", "Lcom/squareup/wire/GrpcServerStreamingCall;", "newServerStreamingCall", "(Lcom/squareup/wire/GrpcMethod;)Lcom/squareup/wire/GrpcServerStreamingCall;", "Lt82;", "getClient$wire_grpc_client", "()Lt82;", "Lvs8;", "getBaseUrl$wire_grpc_client", "()Lvs8;", "J", "getMinMessageToCompress$wire_grpc_client", "()J", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class WireGrpcClient extends GrpcClient {
    private final vs8 baseUrl;
    private final t82 client;
    private final long minMessageToCompress;

    public WireGrpcClient(t82 t82Var, vs8 vs8Var, long j) {
        t82Var.getClass();
        vs8Var.getClass();
        this.client = t82Var;
        this.baseUrl = vs8Var;
        this.minMessageToCompress = j;
    }

    /* JADX INFO: renamed from: getBaseUrl$wire_grpc_client, reason: from getter */
    public final vs8 getBaseUrl() {
        return this.baseUrl;
    }

    /* JADX INFO: renamed from: getClient$wire_grpc_client, reason: from getter */
    public final t82 getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: getMinMessageToCompress$wire_grpc_client, reason: from getter */
    public final long getMinMessageToCompress() {
        return this.minMessageToCompress;
    }

    @Override // com.squareup.wire.GrpcClient
    public <S, R> GrpcCall<S, R> newCall(GrpcMethod<S, R> method) {
        method.getClass();
        return new RealGrpcCall(this, method);
    }

    @Override // com.squareup.wire.GrpcClient
    public <S, R> GrpcClientStreamingCall<S, R> newClientStreamingCall(GrpcMethod<S, R> method) {
        method.getClass();
        return RealGrpcClientStreamingCallKt.asGrpcClientStreamingCall(new RealGrpcStreamingCall(this, method));
    }

    @Override // com.squareup.wire.GrpcClient
    public <S, R> GrpcServerStreamingCall<S, R> newServerStreamingCall(GrpcMethod<S, R> method) {
        method.getClass();
        return RealGrpcServerStreamingCallKt.asGrpcServerStreamingCall(new RealGrpcStreamingCall(this, method));
    }

    @Override // com.squareup.wire.GrpcClient
    public <S, R> GrpcStreamingCall<S, R> newStreamingCall(GrpcMethod<S, R> method) {
        method.getClass();
        return new RealGrpcStreamingCall(this, method);
    }
}

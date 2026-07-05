package com.squareup.wire;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.d6e;
import defpackage.l45;
import defpackage.mdj;
import defpackage.tp4;
import java.util.Map;
import kotlin.Metadata;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H&¢\u0006\u0004\b\u0013\u0010\tJ\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H&¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR(\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"Lcom/squareup/wire/GrpcServerStreamingCall;", "", "S", "R", "Liei;", "cancel", "()V", "", "isCanceled", "()Z", "Ll45;", "scope", "request", "Ld6e;", "executeIn", "(Ll45;Ljava/lang/Object;Ltp4;)Ljava/lang/Object;", "Lcom/squareup/wire/MessageSource;", "executeBlocking", "(Ljava/lang/Object;)Lcom/squareup/wire/MessageSource;", "isExecuted", "clone", "()Lcom/squareup/wire/GrpcServerStreamingCall;", "Lcom/squareup/wire/GrpcMethod;", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "timeout", "", "", "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", "requestMetadata", "getResponseMetadata", "responseMetadata", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public interface GrpcServerStreamingCall<S, R> {
    void cancel();

    GrpcServerStreamingCall<S, R> clone();

    MessageSource<R> executeBlocking(S request);

    Object executeIn(l45 l45Var, S s, tp4<? super d6e> tp4Var);

    GrpcMethod<S, R> getMethod();

    Map<String, String> getRequestMetadata();

    Map<String, String> getResponseMetadata();

    Timeout getTimeout();

    boolean isCanceled();

    boolean isExecuted();

    void setRequestMetadata(Map<String, String> map);
}

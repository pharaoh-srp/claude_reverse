package com.squareup.wire;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.mdj;
import defpackage.tp4;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001'J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H&¢\u0006\u0004\b\u0013\u0010\tJ\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H&¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR(\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Lcom/squareup/wire/GrpcCall;", "", "S", "R", "Liei;", "cancel", "()V", "", "isCanceled", "()Z", "request", "execute", "(Ljava/lang/Object;Ltp4;)Ljava/lang/Object;", "executeBlocking", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/squareup/wire/GrpcCall$Callback;", "callback", "enqueue", "(Ljava/lang/Object;Lcom/squareup/wire/GrpcCall$Callback;)V", "isExecuted", "clone", "()Lcom/squareup/wire/GrpcCall;", "Lcom/squareup/wire/GrpcMethod;", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "timeout", "", "", "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", "requestMetadata", "getResponseMetadata", "responseMetadata", "Callback", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public interface GrpcCall<S, R> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\r\u001a\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00042\u0006\u0010\f\u001a\u00028\u0003H&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/squareup/wire/GrpcCall$Callback;", "", "S", "R", "Lcom/squareup/wire/GrpcCall;", "call", "Ljava/io/IOException;", "Lokio/IOException;", "exception", "Liei;", "onFailure", "(Lcom/squareup/wire/GrpcCall;Ljava/io/IOException;)V", "response", "onSuccess", "(Lcom/squareup/wire/GrpcCall;Ljava/lang/Object;)V", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public interface Callback<S, R> {
        void onFailure(GrpcCall<S, R> call, IOException exception);

        void onSuccess(GrpcCall<S, R> call, R response);
    }

    void cancel();

    GrpcCall<S, R> clone();

    void enqueue(S request, Callback<S, R> callback);

    Object execute(S s, tp4<? super R> tp4Var);

    R executeBlocking(S request);

    GrpcMethod<S, R> getMethod();

    Map<String, String> getRequestMetadata();

    Map<String, String> getResponseMetadata();

    Timeout getTimeout();

    boolean isCanceled();

    boolean isExecuted();

    void setRequestMetadata(Map<String, String> map);
}

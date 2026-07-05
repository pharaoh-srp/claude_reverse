package com.squareup.wire;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.cpc;
import defpackage.l45;
import defpackage.lz5;
import defpackage.mdj;
import java.util.Map;
import kotlin.Metadata;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e0\fH'¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00140\fH&¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0007H&¢\u0006\u0004\b\u0016\u0010\tJ\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H&¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR(\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!8&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006*À\u0006\u0001"}, d2 = {"Lcom/squareup/wire/GrpcStreamingCall;", "", "S", "R", "Liei;", "cancel", "()V", "", "isCanceled", "()Z", "Ll45;", "scope", "Lcpc;", "Lmkf;", "Ld6e;", "executeIn", "(Ll45;)Lcpc;", "execute", "()Lcpc;", "Lcom/squareup/wire/MessageSink;", "Lcom/squareup/wire/MessageSource;", "executeBlocking", "isExecuted", "clone", "()Lcom/squareup/wire/GrpcStreamingCall;", "Lcom/squareup/wire/GrpcMethod;", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "timeout", "", "", "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", "requestMetadata", "getResponseMetadata", "responseMetadata", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public interface GrpcStreamingCall<S, R> {
    void cancel();

    GrpcStreamingCall<S, R> clone();

    @lz5
    cpc execute();

    cpc executeBlocking();

    cpc executeIn(l45 scope);

    GrpcMethod<S, R> getMethod();

    Map<String, String> getRequestMetadata();

    Map<String, String> getResponseMetadata();

    Timeout getTimeout();

    boolean isCanceled();

    boolean isExecuted();

    void setRequestMetadata(Map<String, String> map);
}

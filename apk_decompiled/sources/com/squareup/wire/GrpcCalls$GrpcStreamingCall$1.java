package com.squareup.wire;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.cpc;
import defpackage.ft5;
import defpackage.g86;
import defpackage.gb9;
import defpackage.gh2;
import defpackage.iei;
import defpackage.l45;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.nm6;
import defpackage.py3;
import defpackage.rz7;
import defpackage.sta;
import defpackage.sz6;
import defpackage.u78;
import defpackage.vr5;
import defpackage.wd6;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import okio.ByteString;
import okio.Timeout;

/* JADX INFO: Add missing generic type declarations: [R, S] */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000i\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007J'\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\tH\u0017¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\tH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R.\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R&\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.8VX\u0096\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0004\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"com/squareup/wire/GrpcCalls$GrpcStreamingCall$1", "Lcom/squareup/wire/GrpcStreamingCall;", "Liei;", "cancel", "()V", "", "isCanceled", "()Z", "isExecuted", "Lcpc;", "Lmkf;", "Ld6e;", "execute", "()Lcpc;", "Ll45;", "scope", "executeIn", "(Ll45;)Lcpc;", "Lcom/squareup/wire/MessageSink;", "Lcom/squareup/wire/MessageSource;", "executeBlocking", "clone", "()Lcom/squareup/wire/GrpcStreamingCall;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "canceled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "", "requestMetadata", "Ljava/util/Map;", "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", "responseMetadata", "getResponseMetadata", "Lgh2;", "requestChannel", "Lgh2;", "responseChannel", "Lokio/Timeout;", "timeout", "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "Lcom/squareup/wire/GrpcMethod;", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", "getMethod$annotations", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class GrpcCalls$GrpcStreamingCall$1<R, S> implements GrpcStreamingCall<S, R> {
    final /* synthetic */ rz7 $function;
    private final Map<String, String> responseMetadata;
    private AtomicBoolean canceled = new AtomicBoolean();
    private AtomicBoolean executed = new AtomicBoolean();
    private Map<String, String> requestMetadata = nm6.E;
    private final gh2 requestChannel = wd6.P(1, 6, null);
    private final gh2 responseChannel = wd6.P(1, 6, null);
    private final Timeout timeout = Timeout.e;

    public GrpcCalls$GrpcStreamingCall$1(rz7 rz7Var) {
        this.$function = rz7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei executeIn$lambda$1(GrpcCalls$GrpcStreamingCall$1 grpcCalls$GrpcStreamingCall$1, Throwable th) {
        grpcCalls$GrpcStreamingCall$1.requestChannel.m(th);
        grpcCalls$GrpcStreamingCall$1.responseChannel.m(th);
        return iei.a;
    }

    public static /* synthetic */ void getMethod$annotations() {
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public void cancel() {
        if (this.canceled.compareAndSet(false, true)) {
            this.requestChannel.d(null);
            this.responseChannel.d(null);
        }
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public GrpcStreamingCall<S, R> clone() {
        GrpcStreamingCall<S, R> grpcStreamingCall = GrpcCalls.grpcStreamingCall(this.$function);
        grpcStreamingCall.setRequestMetadata(sta.l0(grpcStreamingCall.getRequestMetadata(), getRequestMetadata()));
        return grpcStreamingCall;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    @lz5
    public cpc execute() {
        return executeIn(u78.E);
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public cpc executeBlocking() {
        executeIn(u78.E);
        return new cpc(GrpcCalls.toMessageSink(this.requestChannel), GrpcCalls.toMessageSource(this.responseChannel));
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public cpc executeIn(l45 scope) {
        scope.getClass();
        if (!this.executed.compareAndSet(false, true)) {
            sz6.j("already executed");
            return null;
        }
        ft5 ft5Var = g86.a;
        gb9.D(scope, vr5.G, null, new GrpcCalls$GrpcStreamingCall$1$executeIn$job$1(this.$function, this, null), 2).D0(new py3(27, this));
        return new cpc(this.requestChannel, this.responseChannel);
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public GrpcMethod<S, R> getMethod() {
        ProtoAdapter<ByteString> protoAdapter = ProtoAdapter.BYTES;
        return new GrpcMethod<>("/wire/AnonymousEndpoint", protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public Map<String, String> getRequestMetadata() {
        return this.requestMetadata;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public Map<String, String> getResponseMetadata() {
        return this.responseMetadata;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public Timeout getTimeout() {
        return this.timeout;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public boolean isCanceled() {
        return this.canceled.get();
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public boolean isExecuted() {
        return this.executed.get();
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public void setRequestMetadata(Map<String, String> map) {
        map.getClass();
        this.requestMetadata = map;
    }
}

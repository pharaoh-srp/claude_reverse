package com.squareup.wire.internal;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.GrpcStreamingCall;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireGrpcClient;
import defpackage.cpc;
import defpackage.e4e;
import defpackage.f2d;
import defpackage.f4e;
import defpackage.ft5;
import defpackage.g86;
import defpackage.gb9;
import defpackage.gh2;
import defpackage.iei;
import defpackage.l45;
import defpackage.lz5;
import defpackage.m45;
import defpackage.mdj;
import defpackage.nm6;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sta;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.u78;
import defpackage.v82;
import defpackage.vr5;
import defpackage.wd6;
import defpackage.wn5;
import defpackage.xzg;
import defpackage.zy1;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okio.ForwardingTimeout;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00160\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00160\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e0\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0013J\u001b\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R.\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:RF\u0010<\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204\u0018\u0001032\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204\u0018\u0001038\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:¨\u0006?"}, d2 = {"Lcom/squareup/wire/internal/RealGrpcStreamingCall;", "", "S", "R", "Lcom/squareup/wire/GrpcStreamingCall;", "Lcom/squareup/wire/WireGrpcClient;", "grpcClient", "Lcom/squareup/wire/GrpcMethod;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "<init>", "(Lcom/squareup/wire/WireGrpcClient;Lcom/squareup/wire/GrpcMethod;)V", "Lv82;", "initCall", "()Lv82;", "Liei;", "cancel", "()V", "", "isCanceled", "()Z", "Lcpc;", "Lmkf;", "Ld6e;", "execute", "()Lcpc;", "Ll45;", "scope", "executeIn", "(Ll45;)Lcpc;", "Lcom/squareup/wire/MessageSink;", "Lcom/squareup/wire/MessageSource;", "executeBlocking", "isExecuted", "clone", "()Lcom/squareup/wire/GrpcStreamingCall;", "Lcom/squareup/wire/WireGrpcClient;", "Lcom/squareup/wire/GrpcMethod;", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", "Lcom/squareup/wire/internal/PipeDuplexRequestBody;", "requestBody", "Lcom/squareup/wire/internal/PipeDuplexRequestBody;", "call", "Lv82;", "canceled", "Z", "Lokio/Timeout;", "timeout", "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "", "", "requestMetadata", "Ljava/util/Map;", "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", ExperienceToggle.DEFAULT_PARAM_KEY, "responseMetadata", "getResponseMetadata", "setResponseMetadata$wire_grpc_client", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class RealGrpcStreamingCall<S, R> implements GrpcStreamingCall<S, R> {
    private v82 call;
    private boolean canceled;
    private final WireGrpcClient grpcClient;
    private final GrpcMethod<S, R> method;
    private final PipeDuplexRequestBody requestBody;
    private Map<String, String> requestMetadata;
    private Map<String, String> responseMetadata;
    private final Timeout timeout;

    /* JADX INFO: renamed from: com.squareup.wire.internal.RealGrpcStreamingCall$executeIn$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll45;", "Liei;", "<anonymous>", "(Ll45;)V"}, k = 3, mv = {2, 0, 0})
    @wn5(c = "com.squareup.wire.internal.RealGrpcStreamingCall$executeIn$2", f = "RealGrpcStreamingCall.kt", l = {86}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends xzg implements pz7 {
        final /* synthetic */ v82 $call;
        final /* synthetic */ gh2 $requestChannel;
        int label;
        final /* synthetic */ RealGrpcStreamingCall<S, R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(gh2 gh2Var, RealGrpcStreamingCall<S, R> realGrpcStreamingCall, v82 v82Var, tp4<? super AnonymousClass2> tp4Var) {
            super(2, tp4Var);
            this.$requestChannel = gh2Var;
            this.this$0 = realGrpcStreamingCall;
            this.$call = v82Var;
        }

        @Override // defpackage.vd1
        public final tp4<iei> create(Object obj, tp4<?> tp4Var) {
            return new AnonymousClass2(this.$requestChannel, this.this$0, this.$call, tp4Var);
        }

        @Override // defpackage.pz7
        public final Object invoke(l45 l45Var, tp4<? super iei> tp4Var) {
            return ((AnonymousClass2) create(l45Var, tp4Var)).invokeSuspend(iei.a);
        }

        @Override // defpackage.vd1
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                sf5.h0(obj);
                gh2 gh2Var = this.$requestChannel;
                PipeDuplexRequestBody pipeDuplexRequestBody = ((RealGrpcStreamingCall) this.this$0).requestBody;
                long minMessageToCompress$wire_grpc_client = ((RealGrpcStreamingCall) this.this$0).grpcClient.getMinMessageToCompress();
                ProtoAdapter<S> requestAdapter = this.this$0.getMethod().getRequestAdapter();
                v82 v82Var = this.$call;
                this.label = 1;
                Object objWriteToRequestBody = GrpcKt.writeToRequestBody(gh2Var, pipeDuplexRequestBody, minMessageToCompress$wire_grpc_client, requestAdapter, v82Var, this);
                m45 m45Var = m45.E;
                if (objWriteToRequestBody == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
            }
            return iei.a;
        }
    }

    public RealGrpcStreamingCall(WireGrpcClient wireGrpcClient, GrpcMethod<S, R> grpcMethod) {
        wireGrpcClient.getClass();
        grpcMethod.getClass();
        this.grpcClient = wireGrpcClient;
        this.method = grpcMethod;
        this.requestBody = GrpcKt.newDuplexRequestBody();
        Timeout timeout = new Timeout();
        ForwardingTimeout forwardingTimeout = new ForwardingTimeout();
        forwardingTimeout.f = timeout;
        this.timeout = forwardingTimeout;
        getTimeout().d();
        getTimeout().c();
        this.requestMetadata = nm6.E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei executeIn$lambda$0(gh2 gh2Var, v82 v82Var, gh2 gh2Var2, Throwable th) {
        if (gh2Var.a()) {
            ((f4e) v82Var).cancel();
            gh2Var2.d(null);
        }
        return iei.a;
    }

    private final v82 initCall() {
        if (this.call != null) {
            sz6.j("already executed");
            return null;
        }
        v82 v82VarNewCall$wire_grpc_client = this.grpcClient.newCall$wire_grpc_client(getMethod(), getRequestMetadata(), this.requestBody, getTimeout());
        this.call = v82VarNewCall$wire_grpc_client;
        if (this.canceled) {
            ((f4e) v82VarNewCall$wire_grpc_client).cancel();
        }
        Timeout timeout = getTimeout();
        timeout.getClass();
        e4e e4eVar = ((f4e) v82VarNewCall$wire_grpc_client).J;
        e4eVar.getClass();
        ((ForwardingTimeout) timeout).f = e4eVar;
        return v82VarNewCall$wire_grpc_client;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public void cancel() {
        this.canceled = true;
        v82 v82Var = this.call;
        if (v82Var != null) {
            ((f4e) v82Var).cancel();
        }
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public GrpcStreamingCall<S, R> clone() {
        RealGrpcStreamingCall realGrpcStreamingCall = new RealGrpcStreamingCall(this.grpcClient, getMethod());
        Timeout timeout = getTimeout();
        Timeout timeout2 = realGrpcStreamingCall.getTimeout();
        timeout2.i(timeout.getC(), TimeUnit.NANOSECONDS);
        if (timeout.getA()) {
            timeout2.f(timeout.e());
        } else {
            timeout2.c();
        }
        realGrpcStreamingCall.setRequestMetadata(sta.l0(realGrpcStreamingCall.getRequestMetadata(), getRequestMetadata()));
        return realGrpcStreamingCall;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    @lz5
    public cpc execute() {
        return executeIn(u78.E);
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public cpc executeBlocking() {
        v82 v82VarInitCall = initCall();
        BlockingMessageSource blockingMessageSource = new BlockingMessageSource(this, getMethod().getResponseAdapter(), v82VarInitCall);
        GrpcMessageSink grpcMessageSinkMessageSink = GrpcKt.messageSink(this.requestBody, this.grpcClient.getMinMessageToCompress(), getMethod().getRequestAdapter(), v82VarInitCall);
        ((f4e) v82VarInitCall).d(blockingMessageSource.readFromResponseBodyCallback());
        return new cpc(grpcMessageSinkMessageSink, blockingMessageSource);
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public cpc executeIn(l45 scope) {
        scope.getClass();
        zy1 zy1VarP = wd6.P(1, 6, null);
        zy1 zy1VarP2 = wd6.P(1, 6, null);
        v82 v82VarInitCall = initCall();
        zy1VarP2.C(new f2d(zy1VarP2, v82VarInitCall, zy1VarP, 7));
        ft5 ft5Var = g86.a;
        gb9.D(scope, vr5.G, null, new AnonymousClass2(zy1VarP, this, v82VarInitCall, null), 2);
        ((f4e) v82VarInitCall).d(GrpcKt.readFromResponseBodyCallback(zy1VarP2, this, getMethod().getResponseAdapter()));
        return new cpc(zy1VarP, zy1VarP2);
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public GrpcMethod<S, R> getMethod() {
        return this.method;
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
        v82 v82Var;
        return this.canceled || ((v82Var = this.call) != null && ((f4e) v82Var).V);
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public boolean isExecuted() {
        v82 v82Var = this.call;
        if (v82Var != null) {
            return ((f4e) v82Var).K.get();
        }
        return false;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public void setRequestMetadata(Map<String, String> map) {
        map.getClass();
        this.requestMetadata = map;
    }

    public void setResponseMetadata$wire_grpc_client(Map<String, String> map) {
        this.responseMetadata = map;
    }
}

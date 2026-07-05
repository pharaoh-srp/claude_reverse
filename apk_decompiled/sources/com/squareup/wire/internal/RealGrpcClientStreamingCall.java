package com.squareup.wire.internal;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.squareup.wire.GrpcClientStreamingCall;
import com.squareup.wire.GrpcDeferredResponse;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.GrpcStreamingCall;
import com.squareup.wire.MessageSink;
import com.squareup.wire.MessageSource;
import defpackage.cpc;
import defpackage.d1;
import defpackage.d6d;
import defpackage.d6e;
import defpackage.g86;
import defpackage.iei;
import defpackage.l45;
import defpackage.m45;
import defpackage.mdj;
import defpackage.mkf;
import defpackage.nw9;
import defpackage.o45;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.wdi;
import defpackage.wn5;
import defpackage.xzg;
import defpackage.zni;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00150\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R<\u0010.\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0'2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00100\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+¨\u00061"}, d2 = {"Lcom/squareup/wire/internal/RealGrpcClientStreamingCall;", "", "S", "R", "Lcom/squareup/wire/GrpcClientStreamingCall;", "Lcom/squareup/wire/GrpcStreamingCall;", "callDelegate", "Lcom/squareup/wire/GrpcMethod;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "<init>", "(Lcom/squareup/wire/GrpcStreamingCall;Lcom/squareup/wire/GrpcMethod;)V", "Liei;", "cancel", "()V", "", "isCanceled", "()Z", "Ll45;", "scope", "Lcpc;", "Lmkf;", "Lyv5;", "executeIn", "(Ll45;)Lcpc;", "Lcom/squareup/wire/MessageSink;", "Lcom/squareup/wire/GrpcDeferredResponse;", "executeBlocking", "()Lcpc;", "isExecuted", "clone", "()Lcom/squareup/wire/internal/RealGrpcClientStreamingCall;", "Lcom/squareup/wire/GrpcStreamingCall;", "Lcom/squareup/wire/GrpcMethod;", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "timeout", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", "requestMetadata", "getResponseMetadata", "responseMetadata", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class RealGrpcClientStreamingCall<S, R> implements GrpcClientStreamingCall<S, R> {
    private final GrpcStreamingCall<S, R> callDelegate;
    private final GrpcMethod<S, R> method;

    /* JADX INFO: renamed from: com.squareup.wire.internal.RealGrpcClientStreamingCall$executeIn$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", "R", "Ll45;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @wn5(c = "com.squareup.wire.internal.RealGrpcClientStreamingCall$executeIn$1", f = "RealGrpcClientStreamingCall.kt", l = {60}, m = "invokeSuspend")
    public static final class C00231 extends xzg implements pz7 {
        final /* synthetic */ d6e $receiveChannel;
        final /* synthetic */ mkf $sendChannel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00231(mkf mkfVar, d6e d6eVar, tp4<? super C00231> tp4Var) {
            super(2, tp4Var);
            this.$sendChannel = mkfVar;
            this.$receiveChannel = d6eVar;
        }

        @Override // defpackage.vd1
        public final tp4<iei> create(Object obj, tp4<?> tp4Var) {
            return new C00231(this.$sendChannel, this.$receiveChannel, tp4Var);
        }

        @Override // defpackage.pz7
        public final Object invoke(l45 l45Var, tp4<? super R> tp4Var) {
            return ((C00231) create(l45Var, tp4Var)).invokeSuspend(iei.a);
        }

        @Override // defpackage.vd1
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                this.$sendChannel.m(null);
                d6e d6eVar = this.$receiveChannel;
                this.label = 1;
                Object objP = d6eVar.p(this);
                m45 m45Var = m45.E;
                return objP == m45Var ? m45Var : objP;
            } catch (ClosedReceiveChannelException e) {
                throw new IllegalStateException("missing expected response", e);
            }
        }
    }

    public RealGrpcClientStreamingCall(GrpcStreamingCall<S, R> grpcStreamingCall, GrpcMethod<S, R> grpcMethod) {
        grpcStreamingCall.getClass();
        grpcMethod.getClass();
        this.callDelegate = grpcStreamingCall;
        this.method = grpcMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei executeIn$lambda$1$lambda$0(RealGrpcClientStreamingCall realGrpcClientStreamingCall, Throwable th) {
        if (th instanceof CancellationException) {
            realGrpcClientStreamingCall.callDelegate.cancel();
        }
        return iei.a;
    }

    @Override // com.squareup.wire.GrpcClientStreamingCall
    public void cancel() {
        this.callDelegate.cancel();
    }

    @Override // com.squareup.wire.GrpcClientStreamingCall
    public RealGrpcClientStreamingCall<S, R> clone() {
        return new RealGrpcClientStreamingCall<>(this.callDelegate.clone(), getMethod());
    }

    @Override // com.squareup.wire.GrpcClientStreamingCall
    public cpc executeBlocking() {
        cpc cpcVarExecuteBlocking = this.callDelegate.executeBlocking();
        final MessageSink messageSink = (MessageSink) cpcVarExecuteBlocking.E;
        final MessageSource messageSource = (MessageSource) cpcVarExecuteBlocking.F;
        return new cpc(messageSink, new GrpcDeferredResponse<R>() { // from class: com.squareup.wire.internal.RealGrpcClientStreamingCall.executeBlocking.1
            private final ReentrantLock lock = new ReentrantLock();
            private R response;

            @Override // com.squareup.wire.GrpcDeferredResponse
            public void close() throws IOException {
                messageSource.close();
            }

            @Override // com.squareup.wire.GrpcDeferredResponse
            public R get() throws IOException {
                messageSink.close();
                R r = this.response;
                if (r != null) {
                    return r;
                }
                ReentrantLock reentrantLock = this.lock;
                MessageSource<R> messageSource2 = messageSource;
                reentrantLock.lock();
                try {
                    R r2 = this.response;
                    if (r2 == null) {
                        r2 = messageSource2.read();
                        if (r2 != null) {
                            this.response = r2;
                        } else {
                            r2 = null;
                        }
                    }
                    if (r2 != null) {
                        return r2;
                    }
                    throw new IllegalStateException("expecting a single response");
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
    }

    @Override // com.squareup.wire.GrpcClientStreamingCall
    public cpc executeIn(l45 scope) {
        scope.getClass();
        cpc cpcVarExecuteIn = this.callDelegate.executeIn(scope);
        mkf mkfVar = (mkf) cpcVarExecuteIn.E;
        d6e d6eVar = (d6e) cpcVarExecuteIn.F;
        wdi wdiVar = g86.b;
        C00231 c00231 = new C00231(mkfVar, d6eVar, null);
        d1 nw9Var = new nw9(zni.P(scope, wdiVar), c00231);
        nw9Var.w0(o45.F, nw9Var, c00231);
        nw9Var.D0(new d6d(5, this));
        return new cpc(mkfVar, nw9Var);
    }

    @Override // com.squareup.wire.GrpcClientStreamingCall
    public GrpcMethod<S, R> getMethod() {
        return this.method;
    }

    @Override // com.squareup.wire.GrpcClientStreamingCall
    public Map<String, String> getRequestMetadata() {
        return this.callDelegate.getRequestMetadata();
    }

    @Override // com.squareup.wire.GrpcClientStreamingCall
    public Map<String, String> getResponseMetadata() {
        return this.callDelegate.getResponseMetadata();
    }

    @Override // com.squareup.wire.GrpcClientStreamingCall
    public Timeout getTimeout() {
        return this.callDelegate.getTimeout();
    }

    @Override // com.squareup.wire.GrpcClientStreamingCall
    public boolean isCanceled() {
        return this.callDelegate.isCanceled();
    }

    @Override // com.squareup.wire.GrpcClientStreamingCall
    public boolean isExecuted() {
        return this.callDelegate.isExecuted();
    }

    @Override // com.squareup.wire.GrpcClientStreamingCall
    public void setRequestMetadata(Map<String, String> map) {
        map.getClass();
        this.callDelegate.setRequestMetadata(map);
    }
}

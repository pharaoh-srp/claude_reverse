package com.squareup.wire.internal;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.GrpcServerStreamingCall;
import com.squareup.wire.GrpcStreamingCall;
import com.squareup.wire.MessageSink;
import com.squareup.wire.MessageSource;
import defpackage.cpc;
import defpackage.mdj;
import defpackage.tp4;
import defpackage.vp4;
import defpackage.wd6;
import defpackage.wn5;
import java.util.Map;
import kotlin.Metadata;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R<\u0010,\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010.\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)¨\u0006/"}, d2 = {"Lcom/squareup/wire/internal/RealGrpcServerStreamingCall;", "", "S", "R", "Lcom/squareup/wire/GrpcServerStreamingCall;", "Lcom/squareup/wire/GrpcStreamingCall;", "callDelegate", "Lcom/squareup/wire/GrpcMethod;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "<init>", "(Lcom/squareup/wire/GrpcStreamingCall;Lcom/squareup/wire/GrpcMethod;)V", "Liei;", "cancel", "()V", "", "isCanceled", "()Z", "isExecuted", "clone", "()Lcom/squareup/wire/internal/RealGrpcServerStreamingCall;", "Ll45;", "scope", "request", "Ld6e;", "executeIn", "(Ll45;Ljava/lang/Object;Ltp4;)Ljava/lang/Object;", "Lcom/squareup/wire/MessageSource;", "executeBlocking", "(Ljava/lang/Object;)Lcom/squareup/wire/MessageSource;", "Lcom/squareup/wire/GrpcStreamingCall;", "Lcom/squareup/wire/GrpcMethod;", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "timeout", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", "requestMetadata", "getResponseMetadata", "responseMetadata", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class RealGrpcServerStreamingCall<S, R> implements GrpcServerStreamingCall<S, R> {
    private final GrpcStreamingCall<S, R> callDelegate;
    private final GrpcMethod<S, R> method;

    /* JADX INFO: renamed from: com.squareup.wire.internal.RealGrpcServerStreamingCall$executeIn$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = mdj.f)
    @wn5(c = "com.squareup.wire.internal.RealGrpcServerStreamingCall", f = "RealGrpcServerStreamingCall.kt", l = {54}, m = "executeIn")
    public static final class AnonymousClass1 extends vp4 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RealGrpcServerStreamingCall<S, R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RealGrpcServerStreamingCall<S, R> realGrpcServerStreamingCall, tp4<? super AnonymousClass1> tp4Var) {
            super(tp4Var);
            this.this$0 = realGrpcServerStreamingCall;
        }

        @Override // defpackage.vd1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.executeIn(null, null, this);
        }
    }

    public RealGrpcServerStreamingCall(GrpcStreamingCall<S, R> grpcStreamingCall, GrpcMethod<S, R> grpcMethod) {
        grpcStreamingCall.getClass();
        grpcMethod.getClass();
        this.callDelegate = grpcStreamingCall;
        this.method = grpcMethod;
    }

    @Override // com.squareup.wire.GrpcServerStreamingCall
    public void cancel() {
        this.callDelegate.cancel();
    }

    @Override // com.squareup.wire.GrpcServerStreamingCall
    public RealGrpcServerStreamingCall<S, R> clone() {
        return new RealGrpcServerStreamingCall<>(this.callDelegate.clone(), getMethod());
    }

    @Override // com.squareup.wire.GrpcServerStreamingCall
    public MessageSource<R> executeBlocking(S request) {
        request.getClass();
        cpc cpcVarExecuteBlocking = this.callDelegate.executeBlocking();
        MessageSink messageSink = (MessageSink) cpcVarExecuteBlocking.E;
        MessageSource<R> messageSource = (MessageSource) cpcVarExecuteBlocking.F;
        try {
            messageSink.write(request);
            wd6.Z(messageSink, null);
            return messageSource;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [l45] */
    /* JADX WARN: Type inference failed for: r5v1, types: [mkf] */
    /* JADX WARN: Type inference failed for: r5v4, types: [mkf] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.squareup.wire.GrpcServerStreamingCall
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object executeIn(defpackage.l45 r5, S r6, defpackage.tp4<? super defpackage.d6e> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.squareup.wire.internal.RealGrpcServerStreamingCall.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.squareup.wire.internal.RealGrpcServerStreamingCall$executeIn$1 r0 = (com.squareup.wire.internal.RealGrpcServerStreamingCall.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.squareup.wire.internal.RealGrpcServerStreamingCall$executeIn$1 r0 = new com.squareup.wire.internal.RealGrpcServerStreamingCall$executeIn$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 != r3) goto L30
            java.lang.Object r4 = r0.L$1
            d6e r4 = (defpackage.d6e) r4
            java.lang.Object r5 = r0.L$0
            mkf r5 = (defpackage.mkf) r5
            defpackage.sf5.h0(r7)     // Catch: java.lang.Throwable -> L2e
            goto L56
        L2e:
            r4 = move-exception
            goto L5a
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L36:
            defpackage.sf5.h0(r7)
            com.squareup.wire.GrpcStreamingCall<S, R> r4 = r4.callDelegate
            cpc r4 = r4.executeIn(r5)
            java.lang.Object r5 = r4.E
            mkf r5 = (defpackage.mkf) r5
            java.lang.Object r4 = r4.F
            d6e r4 = (defpackage.d6e) r4
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2e
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L2e
            r0.label = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r5.b(r0, r6)     // Catch: java.lang.Throwable -> L2e
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L56
            return r7
        L56:
            r5.m(r2)
            return r4
        L5a:
            r5.m(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.internal.RealGrpcServerStreamingCall.executeIn(l45, java.lang.Object, tp4):java.lang.Object");
    }

    @Override // com.squareup.wire.GrpcServerStreamingCall
    public GrpcMethod<S, R> getMethod() {
        return this.method;
    }

    @Override // com.squareup.wire.GrpcServerStreamingCall
    public Map<String, String> getRequestMetadata() {
        return this.callDelegate.getRequestMetadata();
    }

    @Override // com.squareup.wire.GrpcServerStreamingCall
    public Map<String, String> getResponseMetadata() {
        return this.callDelegate.getResponseMetadata();
    }

    @Override // com.squareup.wire.GrpcServerStreamingCall
    public Timeout getTimeout() {
        return this.callDelegate.getTimeout();
    }

    @Override // com.squareup.wire.GrpcServerStreamingCall
    public boolean isCanceled() {
        return this.callDelegate.isCanceled();
    }

    @Override // com.squareup.wire.GrpcServerStreamingCall
    public boolean isExecuted() {
        return this.callDelegate.isExecuted();
    }

    @Override // com.squareup.wire.GrpcServerStreamingCall
    public void setRequestMetadata(Map<String, String> map) {
        map.getClass();
        this.callDelegate.setRequestMetadata(map);
    }
}

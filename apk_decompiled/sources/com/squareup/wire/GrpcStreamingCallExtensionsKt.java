package com.squareup.wire;

import defpackage.bz7;
import defpackage.cpc;
import defpackage.d6e;
import defpackage.l45;
import defpackage.mdj;
import defpackage.mkf;
import defpackage.pz7;
import defpackage.rz7;
import defpackage.tp4;
import defpackage.vp4;
import defpackage.wn5;
import defpackage.yv5;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ah\u0010\u000b\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042*\b\u0004\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0086H¢\u0006\u0004\b\u000b\u0010\f\u001aS\u0010\u000f\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u001a\b\u0004\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\t0\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001az\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u000426\b\u0004\u0010\n\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0012H\u0086H¢\u0006\u0004\b\u0014\u0010\u0015\u001ae\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112&\b\u0004\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\t0\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"", "S", "R", "Lcom/squareup/wire/GrpcClientStreamingCall;", "Ll45;", "scope", "Lkotlin/Function2;", "Lmkf;", "Ltp4;", "Liei;", "block", "clientStream", "(Lcom/squareup/wire/GrpcClientStreamingCall;Ll45;Lpz7;Ltp4;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcom/squareup/wire/MessageSink;", "clientStreamBlocking", "(Lcom/squareup/wire/GrpcClientStreamingCall;Lbz7;)Ljava/lang/Object;", "Lcom/squareup/wire/GrpcStreamingCall;", "Lkotlin/Function3;", "Ld6e;", "bidirectionalStream", "(Lcom/squareup/wire/GrpcStreamingCall;Ll45;Lrz7;Ltp4;)Ljava/lang/Object;", "Lcom/squareup/wire/MessageSource;", "bidirectionalStreamBlocking", "(Lcom/squareup/wire/GrpcStreamingCall;Lpz7;)Lcom/squareup/wire/MessageSource;", "wire-grpc-client"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class GrpcStreamingCallExtensionsKt {

    /* JADX INFO: renamed from: com.squareup.wire.GrpcStreamingCallExtensionsKt$bidirectionalStream$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    @wn5(c = "com.squareup.wire.GrpcStreamingCallExtensionsKt", f = "GrpcStreamingCallExtensions.kt", l = {84}, m = "bidirectionalStream")
    public static final class AnonymousClass1<S, R> extends vp4 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(tp4<? super AnonymousClass1> tp4Var) {
            super(tp4Var);
        }

        @Override // defpackage.vd1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcStreamingCallExtensionsKt.bidirectionalStream(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.squareup.wire.GrpcStreamingCallExtensionsKt$clientStream$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    @wn5(c = "com.squareup.wire.GrpcStreamingCallExtensionsKt", f = "GrpcStreamingCallExtensions.kt", l = {38, 42}, m = "clientStream")
    public static final class C00011<S, R> extends vp4 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00011(tp4<? super C00011> tp4Var) {
            super(tp4Var);
        }

        @Override // defpackage.vd1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcStreamingCallExtensionsKt.clientStream(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [l45] */
    /* JADX WARN: Type inference failed for: r5v1, types: [mkf] */
    /* JADX WARN: Type inference failed for: r5v4, types: [mkf] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [rz7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, R> java.lang.Object bidirectionalStream(com.squareup.wire.GrpcStreamingCall<S, R> r4, defpackage.l45 r5, defpackage.rz7 r6, defpackage.tp4<? super defpackage.d6e> r7) {
        /*
            boolean r0 = r7 instanceof com.squareup.wire.GrpcStreamingCallExtensionsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.squareup.wire.GrpcStreamingCallExtensionsKt$bidirectionalStream$1 r0 = (com.squareup.wire.GrpcStreamingCallExtensionsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.squareup.wire.GrpcStreamingCallExtensionsKt$bidirectionalStream$1 r0 = new com.squareup.wire.GrpcStreamingCallExtensionsKt$bidirectionalStream$1
            r0.<init>(r7)
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
            goto L54
        L2e:
            r4 = move-exception
            goto L58
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L36:
            defpackage.sf5.h0(r7)
            cpc r4 = r4.executeIn(r5)
            java.lang.Object r5 = r4.E
            mkf r5 = (defpackage.mkf) r5
            java.lang.Object r4 = r4.F
            d6e r4 = (defpackage.d6e) r4
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2e
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L2e
            r0.label = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.invoke(r5, r4, r0)     // Catch: java.lang.Throwable -> L2e
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L54
            return r7
        L54:
            r5.m(r2)
            return r4
        L58:
            r5.m(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.GrpcStreamingCallExtensionsKt.bidirectionalStream(com.squareup.wire.GrpcStreamingCall, l45, rz7, tp4):java.lang.Object");
    }

    private static final <S, R> Object bidirectionalStream$$forInline(GrpcStreamingCall<S, R> grpcStreamingCall, l45 l45Var, rz7 rz7Var, tp4<? super d6e> tp4Var) {
        cpc cpcVarExecuteIn = grpcStreamingCall.executeIn(l45Var);
        mkf mkfVar = (mkf) cpcVarExecuteIn.E;
        Object obj = (d6e) cpcVarExecuteIn.F;
        try {
            rz7Var.invoke(mkfVar, obj, tp4Var);
            return obj;
        } finally {
            mkfVar.m(null);
        }
    }

    public static final <S, R> MessageSource<R> bidirectionalStreamBlocking(GrpcStreamingCall<S, R> grpcStreamingCall, pz7 pz7Var) throws IOException {
        grpcStreamingCall.getClass();
        pz7Var.getClass();
        cpc cpcVarExecuteBlocking = grpcStreamingCall.executeBlocking();
        MessageSink messageSink = (MessageSink) cpcVarExecuteBlocking.E;
        MessageSource<R> messageSource = (MessageSource) cpcVarExecuteBlocking.F;
        try {
            pz7Var.invoke(messageSink, messageSource);
            return messageSource;
        } finally {
            messageSink.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [l45] */
    /* JADX WARN: Type inference failed for: r7v1, types: [mkf] */
    /* JADX WARN: Type inference failed for: r7v4, types: [mkf] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [pz7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, R> java.lang.Object clientStream(com.squareup.wire.GrpcClientStreamingCall<S, R> r6, defpackage.l45 r7, defpackage.pz7 r8, defpackage.tp4<? super R> r9) {
        /*
            boolean r0 = r9 instanceof com.squareup.wire.GrpcStreamingCallExtensionsKt.C00011
            if (r0 == 0) goto L13
            r0 = r9
            com.squareup.wire.GrpcStreamingCallExtensionsKt$clientStream$1 r0 = (com.squareup.wire.GrpcStreamingCallExtensionsKt.C00011) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.squareup.wire.GrpcStreamingCallExtensionsKt$clientStream$1 r0 = new com.squareup.wire.GrpcStreamingCallExtensionsKt$clientStream$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.sf5.h0(r9)
            return r9
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L31:
            java.lang.Object r6 = r0.L$1
            yv5 r6 = (defpackage.yv5) r6
            java.lang.Object r7 = r0.L$0
            mkf r7 = (defpackage.mkf) r7
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L3d
            goto L5b
        L3d:
            r6 = move-exception
            goto L6c
        L3f:
            defpackage.sf5.h0(r9)
            cpc r6 = r6.executeIn(r7)
            java.lang.Object r7 = r6.E
            mkf r7 = (defpackage.mkf) r7
            java.lang.Object r6 = r6.F
            yv5 r6 = (defpackage.yv5) r6
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L3d
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L3d
            r0.label = r3     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r8 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L3d
            if (r8 != r5) goto L5b
            goto L6a
        L5b:
            r7.m(r4)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r2
            java.lang.Object r6 = r6.B0(r0)
            if (r6 != r5) goto L6b
        L6a:
            return r5
        L6b:
            return r6
        L6c:
            r7.m(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.GrpcStreamingCallExtensionsKt.clientStream(com.squareup.wire.GrpcClientStreamingCall, l45, pz7, tp4):java.lang.Object");
    }

    private static final <S, R> Object clientStream$$forInline(GrpcClientStreamingCall<S, R> grpcClientStreamingCall, l45 l45Var, pz7 pz7Var, tp4<? super R> tp4Var) {
        cpc cpcVarExecuteIn = grpcClientStreamingCall.executeIn(l45Var);
        mkf mkfVar = (mkf) cpcVarExecuteIn.E;
        yv5 yv5Var = (yv5) cpcVarExecuteIn.F;
        try {
            pz7Var.invoke(mkfVar, tp4Var);
            mkfVar.m(null);
            return yv5Var.B0(tp4Var);
        } catch (Throwable th) {
            mkfVar.m(null);
            throw th;
        }
    }

    public static final <S, R> R clientStreamBlocking(GrpcClientStreamingCall<S, R> grpcClientStreamingCall, bz7 bz7Var) throws IOException {
        grpcClientStreamingCall.getClass();
        bz7Var.getClass();
        cpc cpcVarExecuteBlocking = grpcClientStreamingCall.executeBlocking();
        MessageSink messageSink = (MessageSink) cpcVarExecuteBlocking.E;
        GrpcDeferredResponse grpcDeferredResponse = (GrpcDeferredResponse) cpcVarExecuteBlocking.F;
        try {
            bz7Var.invoke(messageSink);
            messageSink.close();
            return (R) grpcDeferredResponse.get();
        } catch (Throwable th) {
            messageSink.close();
            throw th;
        }
    }
}

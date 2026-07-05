package com.squareup.wire;

import defpackage.d6e;
import defpackage.iei;
import defpackage.mkf;
import defpackage.rz7;
import defpackage.tp4;
import defpackage.wn5;
import defpackage.xzg;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "S", "R", "Ld6e;", "requests", "Lmkf;", "responses", "Liei;", "<anonymous>", "(Ld6e;Lmkf;)V"}, k = 3, mv = {2, 0, 0})
@wn5(c = "com.squareup.wire.GrpcCalls$GrpcServerStreamingCall$1", f = "GrpcCalls.kt", l = {237, 237}, m = "invokeSuspend")
public final class GrpcCalls$GrpcServerStreamingCall$1 extends xzg implements rz7 {
    final /* synthetic */ rz7 $function;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrpcCalls$GrpcServerStreamingCall$1(rz7 rz7Var, tp4<? super GrpcCalls$GrpcServerStreamingCall$1> tp4Var) {
        super(3, tp4Var);
        this.$function = rz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(d6e d6eVar, mkf mkfVar, tp4<? super iei> tp4Var) {
        GrpcCalls$GrpcServerStreamingCall$1 grpcCalls$GrpcServerStreamingCall$1 = new GrpcCalls$GrpcServerStreamingCall$1(this.$function, tp4Var);
        grpcCalls$GrpcServerStreamingCall$1.L$0 = d6eVar;
        grpcCalls$GrpcServerStreamingCall$1.L$1 = mkfVar;
        return grpcCalls$GrpcServerStreamingCall$1.invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r3.invoke(r0, r7, r6) == r4) goto L16;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 0
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r0 == 0) goto L23
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.sf5.h0(r7)
            goto L4b
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r1
        L17:
            java.lang.Object r0 = r6.L$1
            mkf r0 = (defpackage.mkf) r0
            java.lang.Object r3 = r6.L$0
            rz7 r3 = (defpackage.rz7) r3
            defpackage.sf5.h0(r7)
            goto L3e
        L23:
            defpackage.sf5.h0(r7)
            java.lang.Object r7 = r6.L$0
            d6e r7 = (defpackage.d6e) r7
            java.lang.Object r0 = r6.L$1
            mkf r0 = (defpackage.mkf) r0
            rz7 r5 = r6.$function
            r6.L$0 = r5
            r6.L$1 = r0
            r6.label = r3
            java.lang.Object r7 = r7.p(r6)
            if (r7 != r4) goto L3d
            goto L4a
        L3d:
            r3 = r5
        L3e:
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r6 = r3.invoke(r0, r7, r6)
            if (r6 != r4) goto L4b
        L4a:
            return r4
        L4b:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.GrpcCalls$GrpcServerStreamingCall$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

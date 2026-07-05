package com.squareup.wire;

import defpackage.d6e;
import defpackage.iei;
import defpackage.m45;
import defpackage.mkf;
import defpackage.pz7;
import defpackage.rz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.wn5;
import defpackage.x44;
import defpackage.xzg;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "S", "R", "Ld6e;", "requests", "Lmkf;", "responses", "Liei;", "<anonymous>", "(Ld6e;Lmkf;)V"}, k = 3, mv = {2, 0, 0})
@wn5(c = "com.squareup.wire.GrpcCalls$GrpcClientStreamingCall$1", f = "GrpcCalls.kt", l = {226, 228}, m = "invokeSuspend")
public final class GrpcCalls$GrpcClientStreamingCall$1 extends xzg implements rz7 {
    final /* synthetic */ pz7 $function;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrpcCalls$GrpcClientStreamingCall$1(pz7 pz7Var, tp4<? super GrpcCalls$GrpcClientStreamingCall$1> tp4Var) {
        super(3, tp4Var);
        this.$function = pz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(d6e d6eVar, mkf mkfVar, tp4<? super iei> tp4Var) {
        GrpcCalls$GrpcClientStreamingCall$1 grpcCalls$GrpcClientStreamingCall$1 = new GrpcCalls$GrpcClientStreamingCall$1(this.$function, tp4Var);
        grpcCalls$GrpcClientStreamingCall$1.L$0 = d6eVar;
        grpcCalls$GrpcClientStreamingCall$1.L$1 = mkfVar;
        return grpcCalls$GrpcClientStreamingCall$1.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        mkf mkfVar;
        int i = this.label;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        if (i == 0) {
            sf5.h0(obj);
            d6e d6eVar = (d6e) this.L$0;
            mkfVar = (mkf) this.L$1;
            pz7 pz7Var = this.$function;
            this.L$0 = mkfVar;
            this.label = 1;
            obj = pz7Var.invoke(d6eVar, this);
            if (obj != m45Var) {
            }
            return m45Var;
        }
        if (i != 1) {
            if (i == 2) {
                sf5.h0(obj);
                return ieiVar;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mkfVar = (mkf) this.L$0;
        sf5.h0(obj);
        if (!x44.r(obj, ieiVar)) {
            this.L$0 = null;
            this.label = 2;
            if (mkfVar.b(this, obj) == m45Var) {
                return m45Var;
            }
        }
        return ieiVar;
    }
}

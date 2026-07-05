package com.squareup.wire;

import defpackage.gh2;
import defpackage.iei;
import defpackage.l45;
import defpackage.m45;
import defpackage.pz7;
import defpackage.rz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.wn5;
import defpackage.xzg;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll45;", "Liei;", "<anonymous>", "(Ll45;)V"}, k = 3, mv = {2, 0, 0})
@wn5(c = "com.squareup.wire.GrpcCalls$GrpcStreamingCall$1$executeIn$job$1", f = "GrpcCalls.kt", l = {194}, m = "invokeSuspend")
public final class GrpcCalls$GrpcStreamingCall$1$executeIn$job$1 extends xzg implements pz7 {
    final /* synthetic */ rz7 $function;
    int label;
    final /* synthetic */ GrpcCalls$GrpcStreamingCall$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrpcCalls$GrpcStreamingCall$1$executeIn$job$1(rz7 rz7Var, GrpcCalls$GrpcStreamingCall$1 grpcCalls$GrpcStreamingCall$1, tp4<? super GrpcCalls$GrpcStreamingCall$1$executeIn$job$1> tp4Var) {
        super(2, tp4Var);
        this.$function = rz7Var;
        this.this$0 = grpcCalls$GrpcStreamingCall$1;
    }

    @Override // defpackage.vd1
    public final tp4<iei> create(Object obj, tp4<?> tp4Var) {
        return new GrpcCalls$GrpcStreamingCall$1$executeIn$job$1(this.$function, this.this$0, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(l45 l45Var, tp4<? super iei> tp4Var) {
        return ((GrpcCalls$GrpcStreamingCall$1$executeIn$job$1) create(l45Var, tp4Var)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                sf5.h0(obj);
                rz7 rz7Var = this.$function;
                gh2 gh2Var = this.this$0.requestChannel;
                gh2 gh2Var2 = this.this$0.responseChannel;
                this.label = 1;
                Object objInvoke = rz7Var.invoke(gh2Var, gh2Var2, this);
                m45 m45Var = m45.E;
                this = objInvoke;
                if (objInvoke == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                this = this;
            }
        } catch (Exception e) {
            this.this$0.requestChannel.m(e);
            this.this$0.responseChannel.m(e);
        }
        return iei.a;
    }
}

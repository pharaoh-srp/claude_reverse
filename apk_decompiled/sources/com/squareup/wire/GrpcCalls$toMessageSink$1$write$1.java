package com.squareup.wire;

import defpackage.gh2;
import defpackage.iei;
import defpackage.l45;
import defpackage.m45;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.wn5;
import defpackage.xzg;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll45;", "Liei;", "<anonymous>", "(Ll45;)V"}, k = 3, mv = {2, 0, 0})
@wn5(c = "com.squareup.wire.GrpcCalls$toMessageSink$1$write$1", f = "GrpcCalls.kt", l = {262}, m = "invokeSuspend")
public final class GrpcCalls$toMessageSink$1$write$1 extends xzg implements pz7 {
    final /* synthetic */ E $message;
    final /* synthetic */ gh2 $this_toMessageSink;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrpcCalls$toMessageSink$1$write$1(gh2 gh2Var, E e, tp4<? super GrpcCalls$toMessageSink$1$write$1> tp4Var) {
        super(2, tp4Var);
        this.$this_toMessageSink = gh2Var;
        this.$message = e;
    }

    @Override // defpackage.vd1
    public final tp4<iei> create(Object obj, tp4<?> tp4Var) {
        return new GrpcCalls$toMessageSink$1$write$1(this.$this_toMessageSink, this.$message, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(l45 l45Var, tp4<? super iei> tp4Var) {
        return ((GrpcCalls$toMessageSink$1$write$1) create(l45Var, tp4Var)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws IOException {
        int i = this.label;
        try {
            if (i == 0) {
                sf5.h0(obj);
                gh2 gh2Var = this.$this_toMessageSink;
                Object obj2 = this.$message;
                this.label = 1;
                Object objB = gh2Var.b(this, obj2);
                m45 m45Var = m45.E;
                if (objB == m45Var) {
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
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}

package com.squareup.wire;

import defpackage.ai2;
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
import defpackage.yh2;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", "E", "Ll45;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@wn5(c = "com.squareup.wire.GrpcCalls$toMessageSource$1$read$1", f = "GrpcCalls.kt", l = {244}, m = "invokeSuspend")
public final class GrpcCalls$toMessageSource$1$read$1 extends xzg implements pz7 {
    final /* synthetic */ gh2 $this_toMessageSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrpcCalls$toMessageSource$1$read$1(gh2 gh2Var, tp4<? super GrpcCalls$toMessageSource$1$read$1> tp4Var) {
        super(2, tp4Var);
        this.$this_toMessageSource = gh2Var;
    }

    @Override // defpackage.vd1
    public final tp4<iei> create(Object obj, tp4<?> tp4Var) {
        return new GrpcCalls$toMessageSource$1$read$1(this.$this_toMessageSource, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(l45 l45Var, tp4<? super E> tp4Var) {
        return ((GrpcCalls$toMessageSource$1$read$1) create(l45Var, tp4Var)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objS;
        Throwable thA;
        int i = this.label;
        try {
            if (i == 0) {
                sf5.h0(obj);
                gh2 gh2Var = this.$this_toMessageSource;
                this.label = 1;
                objS = gh2Var.s(this);
                m45 m45Var = m45.E;
                if (objS == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                objS = ((ai2) obj).a;
            }
            if ((objS instanceof yh2) && (thA = ai2.a(objS)) != null) {
                throw thA;
            }
            return ai2.b(objS);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}

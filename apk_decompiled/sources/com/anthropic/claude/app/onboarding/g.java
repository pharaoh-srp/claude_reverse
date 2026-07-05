package com.anthropic.claude.app.onboarding;

import defpackage.ggc;
import defpackage.iei;
import defpackage.m45;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.vt6;
import defpackage.xzg;
import defpackage.zy1;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ggc G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ggc ggcVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = ggcVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        g gVar = new g(this.G, tp4Var);
        gVar.F = obj;
        return gVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((vt6) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        vt6 vt6Var = (vt6) this.F;
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            zy1 zy1Var = this.G.a.m;
            this.F = null;
            this.E = 1;
            Object objB = zy1Var.b(this, vt6Var);
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
    }
}

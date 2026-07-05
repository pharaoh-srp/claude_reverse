package com.anthropic.claude.app.onboarding;

import defpackage.ggc;
import defpackage.iei;
import defpackage.l45;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.tec;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends xzg implements pz7 {
    public final /* synthetic */ ggc E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ggc ggcVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = ggcVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new c(this.E, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        cVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        tec tecVar = this.E.a;
        if (((Boolean) tecVar.p.getValue()) == null) {
            tecVar.p.setValue(Boolean.TRUE);
        }
        return iei.a;
    }
}

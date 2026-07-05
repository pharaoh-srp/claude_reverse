package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination;
import defpackage.bz7;
import defpackage.iei;
import defpackage.sf5;
import defpackage.t4g;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends xzg implements bz7 {
    public final /* synthetic */ t4g E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(t4g t4gVar, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = t4gVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new y0(this.E, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        y0 y0Var = (y0) create((tp4) obj);
        iei ieiVar = iei.a;
        y0Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        t4g t4gVar = this.E;
        if (t4gVar.b()) {
            t4gVar.d(CollapsedToolsSheetDestination.Summary.INSTANCE);
        }
        return iei.a;
    }
}

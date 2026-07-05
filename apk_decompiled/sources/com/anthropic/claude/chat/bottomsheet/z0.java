package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination;
import defpackage.bz7;
import defpackage.iei;
import defpackage.sf5;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends xzg implements bz7 {
    public final /* synthetic */ bz7 E;
    public final /* synthetic */ CollapsedToolsSheetDestination F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(bz7 bz7Var, CollapsedToolsSheetDestination collapsedToolsSheetDestination, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = bz7Var;
        this.F = collapsedToolsSheetDestination;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new z0(this.E, this.F, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        z0 z0Var = (z0) create((tp4) obj);
        iei ieiVar = iei.a;
        z0Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        this.E.invoke(new Integer(((CollapsedToolsSheetDestination.Sources) this.F).getSources().size()));
        return iei.a;
    }
}

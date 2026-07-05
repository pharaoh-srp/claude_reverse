package com.anthropic.claude.chat.bottomsheet.tool.approval.appuse;

import com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.MobileAppUseDestination;
import defpackage.bz7;
import defpackage.iei;
import defpackage.sf5;
import defpackage.t4g;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends xzg implements bz7 {
    public final /* synthetic */ t4g E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t4g t4gVar, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = t4gVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new b(this.E, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        b bVar = (b) create((tp4) obj);
        iei ieiVar = iei.a;
        bVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        t4g t4gVar = this.E;
        if (t4gVar.b()) {
            t4gVar.d(MobileAppUseDestination.Approval.INSTANCE);
        }
        return iei.a;
    }
}

package com.anthropic.claude.chat.menu;

import com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination;
import defpackage.bf3;
import defpackage.iei;
import defpackage.l45;
import defpackage.mr9;
import defpackage.pz7;
import defpackage.qx2;
import defpackage.sf5;
import defpackage.tp4;
import defpackage.x44;
import defpackage.xzg;

/* JADX INFO: loaded from: classes.dex */
public final class c extends xzg implements pz7 {
    public final /* synthetic */ qx2 E;
    public final /* synthetic */ b F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qx2 qx2Var, b bVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = qx2Var;
        this.F = bVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new c(this.E, this.F, tp4Var);
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
        iei ieiVar = iei.a;
        qx2 qx2Var = this.E;
        if (qx2Var != null) {
            b bVar = this.F;
            if (x44.r(((bf3) bVar.a.F.getValue()).a.a, ChatItemMenuDialogDestination.Dismissed.INSTANCE)) {
                int iOrdinal = qx2Var.ordinal();
                if (iOrdinal == 0) {
                    bVar.b();
                    return ieiVar;
                }
                if (iOrdinal == 1) {
                    bVar.a();
                    return ieiVar;
                }
                mr9.b();
                return null;
            }
        }
        return ieiVar;
    }
}

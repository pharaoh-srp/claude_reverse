package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import defpackage.ie3;
import defpackage.iei;
import defpackage.l45;
import defpackage.nwb;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.te3;
import defpackage.tp4;
import defpackage.x44;
import defpackage.xzg;
import defpackage.zqc;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends xzg implements pz7 {
    public final /* synthetic */ zqc E;
    public final /* synthetic */ nwb F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(zqc zqcVar, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = zqcVar;
        this.F = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new c0(this.E, this.F, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        c0 c0Var = (c0) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        c0Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        nwb nwbVar = this.F;
        if (((ClaudeAppDestination.Detail.CodeRemoteSession) nwbVar.getValue()) != null) {
            ArrayList arrayList = ((te3) this.E.F.getValue()).b;
            if (arrayList.isEmpty()) {
                nwbVar.setValue(null);
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (x44.r(((ie3) it.next()).a, (ClaudeAppDestination.Detail.CodeRemoteSession) nwbVar.getValue())) {
                        break;
                    }
                }
                nwbVar.setValue(null);
            }
        }
        return iei.a;
    }
}

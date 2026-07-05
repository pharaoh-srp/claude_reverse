package com.anthropic.claude.chat.bottomsheet.tool.approval.appuse;

import com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.MobileAppUseDestination;
import defpackage.iei;
import defpackage.l45;
import defpackage.m45;
import defpackage.mc;
import defpackage.nwb;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.t4g;
import defpackage.tp4;
import defpackage.xzg;
import defpackage.zvc;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ mc F;
    public final /* synthetic */ zvc G;
    public final /* synthetic */ t4g H;
    public final /* synthetic */ zy7 I;
    public final /* synthetic */ nwb J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mc mcVar, zvc zvcVar, t4g t4gVar, zy7 zy7Var, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = mcVar;
        this.G = zvcVar;
        this.H = t4gVar;
        this.I = zy7Var;
        this.J = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new c(this.F, this.G, this.H, this.I, this.J, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            this.E = 1;
            obj = this.F.c("android.permission.READ_CALENDAR", this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.J.setValue(this.G);
            this.H.d(MobileAppUseDestination.CalendarSelection.INSTANCE);
        } else {
            this.I.a();
        }
        return iei.a;
    }
}

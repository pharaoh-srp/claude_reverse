package com.anthropic.claude.app.main;

import android.content.Context;
import com.anthropic.claude.app.main.MainAppScreens;
import com.anthropic.claude.types.strings.AccountId;
import defpackage.gmf;
import defpackage.iei;
import defpackage.j9;
import defpackage.jx2;
import defpackage.mr9;
import defpackage.ppa;
import defpackage.pz7;
import defpackage.r7;
import defpackage.rwe;
import defpackage.s7;
import defpackage.sf5;
import defpackage.t7;
import defpackage.tp4;
import defpackage.u3a;
import defpackage.u7;
import defpackage.x44;
import defpackage.xah;
import defpackage.xzg;
import defpackage.zy7;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ MainAppScreens F;
    public final /* synthetic */ j9 G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ rwe I;
    public final /* synthetic */ Context J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MainAppScreens mainAppScreens, j9 j9Var, zy7 zy7Var, rwe rweVar, Context context, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = mainAppScreens;
        this.G = j9Var;
        this.H = zy7Var;
        this.I = rweVar;
        this.J = context;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        j jVar = new j(this.F, this.G, this.H, this.I, this.J, tp4Var);
        jVar.E = obj;
        return jVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((u7) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        jVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        rwe rweVar = this.I;
        gmf gmfVar = rweVar.E;
        u7 u7Var = (u7) this.E;
        sf5.h0(obj);
        boolean z = u7Var instanceof t7;
        iei ieiVar = iei.a;
        MainAppScreens mainAppScreens = this.F;
        if (!z) {
            if (x44.r(u7Var, r7.a)) {
                gmfVar.m(new jx2(16, MainAppScreens.AddAccount.INSTANCE), new ppa(0));
                return ieiVar;
            }
            if (x44.r(u7Var, s7.a)) {
                gmfVar.m(new u3a(5, new MainAppScreens.StepUpReauth(((MainAppScreens.LoggedIn) mainAppScreens).m501getAccountIdislZJdo(), null)), new ppa(1));
                return ieiVar;
            }
            mr9.b();
            return null;
        }
        t7 t7Var = (t7) u7Var;
        if (AccountId.m946equalsimpl0(t7Var.a(), ((MainAppScreens.LoggedIn) mainAppScreens).m501getAccountIdislZJdo())) {
            return ieiVar;
        }
        List list = xah.a;
        xah.e(6, "Switching account to ".concat(t7Var.a()), null, null);
        this.G.a();
        this.H.a();
        l.d(this.J, rweVar, t7Var.a());
        return ieiVar;
    }
}

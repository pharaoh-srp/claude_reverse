package com.anthropic.claude.app.main;

import android.content.Context;
import android.content.SharedPreferences;
import com.anthropic.claude.app.main.MainAppScreens;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.be5;
import defpackage.fk0;
import defpackage.gmf;
import defpackage.iei;
import defpackage.jj;
import defpackage.lsc;
import defpackage.mdg;
import defpackage.mpk;
import defpackage.ppa;
import defpackage.rwe;
import defpackage.rz7;
import defpackage.v7;
import defpackage.w7;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements rz7 {
    public final /* synthetic */ MainAppScreens E;
    public final /* synthetic */ w7 F;
    public final /* synthetic */ rwe G;
    public final /* synthetic */ fk0 H;
    public final /* synthetic */ Context I;

    public k(MainAppScreens mainAppScreens, w7 w7Var, rwe rweVar, fk0 fk0Var, Context context) {
        this.E = mainAppScreens;
        this.F = w7Var;
        this.G = rweVar;
        this.H = fk0Var;
        this.I = context;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strM949unboximpl = ((AccountId) obj).m949unboximpl();
        String strM1071unboximpl = ((OrganizationId) obj2).m1071unboximpl();
        gmf gmfVar = this.G.E;
        strM949unboximpl.getClass();
        strM1071unboximpl.getClass();
        ((jj) obj3).getClass();
        boolean zM946equalsimpl0 = AccountId.m946equalsimpl0(strM949unboximpl, ((MainAppScreens.StepUpReauth) this.E).m506getCurrentAccountIdislZJdo());
        w7 w7Var = this.F;
        if (zM946equalsimpl0) {
            w7Var.a(v7.E);
            gmfVar.m(be5.S, new ppa(3));
        } else {
            w7Var.a(v7.F);
            this.H.a(strM949unboximpl, true);
            Context context = this.I;
            context.getClass();
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
            sharedPreferences.getClass();
            String string = sharedPreferences.getString("selected_org_id", null);
            String strM1066constructorimpl = string != null ? OrganizationId.m1066constructorimpl(string) : null;
            lsc lscVarP = mpk.P(strM1066constructorimpl != null ? OrganizationId.m1065boximpl(strM1066constructorimpl) : null);
            mpk.P(sharedPreferences.getString("display_email", null));
            mpk.P(sharedPreferences.getString("conway_saved_client_id", null));
            new mdg();
            new mdg();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("selected_org_id", strM1071unboximpl);
            editorEdit.apply();
            lscVarP.setValue(OrganizationId.m1065boximpl(strM1071unboximpl));
            w7Var.b(strM949unboximpl);
            gmfVar.m(be5.T, new ppa(4));
        }
        return iei.a;
    }
}

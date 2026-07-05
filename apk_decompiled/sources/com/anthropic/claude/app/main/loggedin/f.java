package com.anthropic.claude.app.main.loggedin;

import com.anthropic.claude.app.main.loggedin.BootstrapScreen;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.eu1;
import defpackage.g0;
import defpackage.iei;
import defpackage.jj;
import defpackage.mdg;
import defpackage.pz7;
import defpackage.rwe;
import defpackage.s79;
import defpackage.xah;
import defpackage.zy7;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements pz7 {
    public final /* synthetic */ eu1 E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ rwe G;

    public f(eu1 eu1Var, zy7 zy7Var, rwe rweVar) {
        this.E = eu1Var;
        this.F = zy7Var;
        this.G = rweVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String strM1071unboximpl = ((OrganizationId) obj).m1071unboximpl();
        jj jjVar = (jj) obj2;
        strM1071unboximpl.getClass();
        jjVar.getClass();
        List list = xah.a;
        xah.e(6, "User session loaded for " + OrganizationId.m1070toStringimpl(strM1071unboximpl) + " (ageSignals: " + jjVar + ")", null, null);
        eu1 eu1Var = this.E;
        eu1Var.getClass();
        mdg mdgVar = eu1Var.b;
        OrganizationId organizationIdM1065boximpl = OrganizationId.m1065boximpl(strM1071unboximpl);
        iei ieiVar = iei.a;
        mdgVar.put(organizationIdM1065boximpl, ieiVar);
        this.F.a();
        this.G.E.m(new g0(6, new BootstrapScreen[]{new BootstrapScreen.Bootstrapped(strM1071unboximpl, jjVar, null)}), new s79(14));
        return ieiVar;
    }
}

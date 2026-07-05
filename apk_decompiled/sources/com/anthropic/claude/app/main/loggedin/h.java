package com.anthropic.claude.app.main.loggedin;

import com.anthropic.claude.app.main.loggedin.BootstrapScreen;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.ae5;
import defpackage.bz7;
import defpackage.iei;
import defpackage.jga;
import defpackage.rwe;

/* JADX INFO: loaded from: classes.dex */
public final class h implements bz7 {
    public final /* synthetic */ rwe E;
    public final /* synthetic */ BootstrapScreen F;

    public h(rwe rweVar, BootstrapScreen bootstrapScreen) {
        this.E = rweVar;
        this.F = bootstrapScreen;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM1071unboximpl = ((OrganizationId) obj).m1071unboximpl();
        strM1071unboximpl.getClass();
        this.E.E.m(new jga(0, new BootstrapScreen[]{new BootstrapScreen.NeedsBootstrap(strM1071unboximpl, ((BootstrapScreen.Bootstrapped) this.F).getAgeSignalsResult(), null)}), new ae5(15));
        return iei.a;
    }
}

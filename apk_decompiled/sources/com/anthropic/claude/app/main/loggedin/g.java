package com.anthropic.claude.app.main.loggedin;

import com.anthropic.claude.app.main.loggedin.BootstrapScreen;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.ae5;
import defpackage.bz7;
import defpackage.fv;
import defpackage.iei;
import defpackage.ij0;
import defpackage.rwe;
import defpackage.xah;
import defpackage.zy7;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements bz7 {
    public final /* synthetic */ String E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ rwe G;
    public final /* synthetic */ BootstrapScreen H;

    public g(String str, zy7 zy7Var, rwe rweVar, BootstrapScreen bootstrapScreen) {
        this.E = str;
        this.F = zy7Var;
        this.G = rweVar;
        this.H = bootstrapScreen;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM1071unboximpl = ((OrganizationId) obj).m1071unboximpl();
        strM1071unboximpl.getClass();
        String str = this.E;
        if (str == null ? false : OrganizationId.m1068equalsimpl0(str, strM1071unboximpl)) {
            ij0.y("LoadingApp tried to change to the initial organization", null, false, 3);
            this.F.a();
        } else {
            List list = xah.a;
            xah.e(6, "Changing organization to " + OrganizationId.m1070toStringimpl(strM1071unboximpl), null, null);
            this.G.E.m(new fv(29, new BootstrapScreen[]{new BootstrapScreen.NeedsBootstrap(strM1071unboximpl, ((BootstrapScreen.NeedsBootstrap) this.H).getAgeSignalsResult(), null)}), new ae5(14));
        }
        return iei.a;
    }
}

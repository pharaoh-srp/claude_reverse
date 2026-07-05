package com.anthropic.claude.mainactivity;

import android.content.Intent;
import android.content.res.Configuration;
import defpackage.bj6;
import defpackage.d4c;
import defpackage.d54;
import defpackage.e1h;
import defpackage.el5;
import defpackage.eve;
import defpackage.fx7;
import defpackage.ij0;
import defpackage.jce;
import defpackage.kw9;
import defpackage.mc;
import defpackage.mpa;
import defpackage.npa;
import defpackage.okk;
import defpackage.opa;
import defpackage.q59;
import defpackage.w1a;
import defpackage.xah;
import defpackage.yb5;
import defpackage.yeg;
import defpackage.zp3;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends fx7 {
    public static final /* synthetic */ int h0 = 0;
    public final el5 e0 = new el5(jce.a.b(opa.class), new mpa(this, 2), new q59(29), new mpa(this, 3));
    public final kw9 f0;
    public final kw9 g0;

    public MainActivity() {
        mpa mpaVar = new mpa(this, 0);
        w1a w1aVar = w1a.E;
        this.f0 = yb5.w(w1aVar, mpaVar);
        this.g0 = yb5.w(w1aVar, new mpa(this, 1));
    }

    @Override // defpackage.ba4, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        long j = d54.g;
        bj6.b(this, new e1h(d4c.n0(j), d4c.n0(j), 0, new yeg(7)));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01ae  */
    @Override // defpackage.fx7, defpackage.ba4, defpackage.aa4, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mainactivity.MainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.fx7, android.app.Activity
    public final void onDestroy() {
        mc mcVarP;
        super.onDestroy();
        if (zp3.J == null || (mcVarP = p()) == null) {
            return;
        }
        mcVarP.a.clear();
        mcVarP.b.clear();
        mcVarP.c = null;
        mcVarP.d = null;
        mcVarP.e = null;
    }

    @Override // defpackage.ba4, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        ((npa) this.f0.getValue()).a(intent, this);
    }

    public final mc p() {
        Object objA = eve.z(this).a(jce.a.b(mc.class), null, null);
        mc mcVar = objA instanceof mc ? (mc) objA : null;
        if (mcVar != null) {
            return mcVar;
        }
        ij0.y("Failed to cast PermissionRequester to ActivityPermissionRequester", null, false, 3);
        return null;
    }

    @Override // defpackage.ba4, android.app.Activity
    public final void reportFullyDrawn() {
        try {
            super.reportFullyDrawn();
        } catch (SecurityException e) {
            if (okk.b()) {
                return;
            }
            List list = xah.a;
            xah.f(e, "Failed to call reportFullyDrawn", null, null, 28);
        }
    }
}

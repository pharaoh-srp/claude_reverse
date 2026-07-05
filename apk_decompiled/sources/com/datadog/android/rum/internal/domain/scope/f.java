package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import defpackage.bt9;
import defpackage.el5;
import defpackage.hr5;
import defpackage.i29;
import defpackage.jph;
import defpackage.jye;
import defpackage.k0j;
import defpackage.k2e;
import defpackage.k99;
import defpackage.knk;
import defpackage.lja;
import defpackage.nt5;
import defpackage.o29;
import defpackage.ov5;
import defpackage.sxe;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f implements jye {
    public static final Class[] v = {RumRawEvent.AddError.class, RumRawEvent.StartAction.class, RumRawEvent.StartResource.class, RumRawEvent.StartOperation.class, RumRawEvent.StopOperation.class};
    public static final Class[] w = {RumRawEvent.ApplicationStarted.class, RumRawEvent.ResetSession.class, RumRawEvent.StopView.class, RumRawEvent.ActionDropped.class, RumRawEvent.ActionSent.class, RumRawEvent.ErrorDropped.class, RumRawEvent.ErrorSent.class, RumRawEvent.LongTaskDropped.class, RumRawEvent.LongTaskSent.class, RumRawEvent.ResourceDropped.class, RumRawEvent.ResourceSent.class, RumRawEvent.UpdatePerformanceMetric.class, RumRawEvent.UpdateExternalRefreshRate.class};
    public final d a;
    public final k99 b;
    public final ov5 c;
    public final boolean d;
    public final boolean e;
    public final b f;
    public final hr5 g;
    public final k0j h;
    public final k0j i;
    public final k0j j;
    public boolean k;
    public final float l;
    public final o29 m;
    public final nt5 n;
    public final k2e o;
    public final i29 p;
    public final i29 q;
    public final lja r;
    public final el5 s;
    public final ArrayList t;
    public jph u;

    public f(d dVar, k99 k99Var, ov5 ov5Var, boolean z, boolean z2, b bVar, hr5 hr5Var, k0j k0jVar, k0j k0jVar2, k0j k0jVar3, boolean z3, float f, o29 o29Var, nt5 nt5Var, bt9 bt9Var, k2e k2eVar, i29 i29Var, i29 i29Var2, lja ljaVar) {
        hr5Var.getClass();
        k0jVar.getClass();
        k0jVar2.getClass();
        k0jVar3.getClass();
        o29Var.getClass();
        k2eVar.getClass();
        i29Var.getClass();
        i29Var2.getClass();
        ljaVar.getClass();
        this.a = dVar;
        this.b = k99Var;
        this.c = ov5Var;
        this.d = z;
        this.e = z2;
        this.f = bVar;
        this.g = hr5Var;
        this.h = k0jVar;
        this.i = k0jVar2;
        this.j = k0jVar3;
        this.k = z3;
        this.l = f;
        this.m = o29Var;
        this.n = nt5Var;
        this.o = k2eVar;
        this.p = i29Var;
        this.q = i29Var2;
        this.r = ljaVar;
        this.s = new el5(k99Var.t(), bt9Var);
        this.t = new ArrayList();
    }

    @Override // defpackage.jye
    public final jye a() {
        return this.a;
    }

    @Override // defpackage.jye
    public final Map b() {
        return knk.y(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.jye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jye c(com.datadog.android.rum.internal.domain.scope.RumRawEvent r37, defpackage.lj5 r38, defpackage.bz7 r39, defpackage.hi5 r40) {
        /*
            Method dump skipped, instruction units count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.f.c(com.datadog.android.rum.internal.domain.scope.RumRawEvent, lj5, bz7, hi5):jye");
    }

    @Override // defpackage.jye
    public final sxe d() {
        return this.a.d();
    }
}

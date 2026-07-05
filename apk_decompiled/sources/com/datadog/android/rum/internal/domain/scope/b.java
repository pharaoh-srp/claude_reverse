package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.rum.DdRumContentProvider;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import defpackage.ag5;
import defpackage.bt9;
import defpackage.bz7;
import defpackage.dch;
import defpackage.g99;
import defpackage.gmf;
import defpackage.hi5;
import defpackage.hr5;
import defpackage.i29;
import defpackage.jph;
import defpackage.jye;
import defpackage.k0j;
import defpackage.k2e;
import defpackage.k99;
import defpackage.lj5;
import defpackage.lja;
import defpackage.nt5;
import defpackage.nyj;
import defpackage.o29;
import defpackage.ov5;
import defpackage.qs7;
import defpackage.sxe;
import defpackage.t78;
import defpackage.w44;
import defpackage.wye;
import defpackage.x44;
import defpackage.xye;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b implements jye, wye {
    public final k99 a;
    public final nyj b;
    public final boolean c;
    public final boolean d;
    public final hr5 e;
    public final k0j f;
    public final k0j g;
    public final k0j h;
    public final ov5 i;
    public final gmf j;
    public final o29 k;
    public final bt9 l;
    public final nt5 m;
    public final k2e n;
    public final i29 o;
    public final i29 p;
    public final ag5 q;
    public final lja r;
    public sxe s;
    public final ArrayList t;
    public xye u;
    public boolean v;

    public b(String str, k99 k99Var, nyj nyjVar, boolean z, boolean z2, hr5 hr5Var, k0j k0jVar, k0j k0jVar2, k0j k0jVar3, ov5 ov5Var, gmf gmfVar, o29 o29Var, bt9 bt9Var, nt5 nt5Var, k2e k2eVar, i29 i29Var, i29 i29Var2, ag5 ag5Var, lja ljaVar) {
        str.getClass();
        hr5Var.getClass();
        k0jVar.getClass();
        k0jVar2.getClass();
        k0jVar3.getClass();
        o29Var.getClass();
        k2eVar.getClass();
        i29Var.getClass();
        i29Var2.getClass();
        ljaVar.getClass();
        this.a = k99Var;
        this.b = nyjVar;
        this.c = z;
        this.d = z2;
        this.e = hr5Var;
        this.f = k0jVar;
        this.g = k0jVar2;
        this.h = k0jVar3;
        this.i = ov5Var;
        this.j = gmfVar;
        this.k = o29Var;
        this.l = bt9Var;
        this.m = nt5Var;
        this.n = k2eVar;
        this.o = i29Var;
        this.p = i29Var2;
        this.q = ag5Var;
        this.r = ljaVar;
        this.s = new sxe(str, sxe.p, false, null, null, null, null, 1, 1, 1, null, null, 0L, 0L, false);
        this.t = x44.a0(new d(this, k99Var, ov5Var, nyjVar, z, z2, this, hr5Var, k0jVar, k0jVar2, k0jVar3, gmfVar, false, o29Var, bt9Var, nt5Var, k2eVar, i29Var, i29Var2, ag5Var, ljaVar));
    }

    @Override // defpackage.jye
    public final jye a() {
        return null;
    }

    @Override // defpackage.jye
    public final Map b() {
        return t78.a(this.a).getAttributes();
    }

    @Override // defpackage.jye
    public final jye c(RumRawEvent rumRawEvent, lj5 lj5Var, bz7 bz7Var, hi5 hi5Var) {
        bz7 bz7Var2;
        boolean z;
        ArrayList arrayList;
        lj5 lj5Var2;
        hi5 hi5Var2;
        xye xyeVar;
        rumRawEvent.getClass();
        lj5Var.getClass();
        bz7Var.getClass();
        hi5Var.getClass();
        if (rumRawEvent instanceof RumRawEvent.SetSyntheticsTestAttribute) {
            RumRawEvent.SetSyntheticsTestAttribute setSyntheticsTestAttribute = (RumRawEvent.SetSyntheticsTestAttribute) rumRawEvent;
            this.s = sxe.a(this.s, null, false, null, null, null, null, 0, 0, 0, setSyntheticsTestAttribute.a, setSyntheticsTestAttribute.b, 0L, 0L, false, 29695);
        }
        boolean z2 = rumRawEvent instanceof RumRawEvent.StartView;
        boolean z3 = z2 || (rumRawEvent instanceof RumRawEvent.StartAction);
        d dVarE = e();
        ArrayList arrayList2 = this.t;
        k99 k99Var = this.a;
        if (dVarE == null && z3) {
            d dVar = new d(this, k99Var, this.i, this.b, this.c, this.d, this, this.e, this.f, this.g, this.h, this.j, true, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
            arrayList = arrayList2;
            arrayList.add(dVar);
            if (z2 || (xyeVar = this.u) == null) {
                lj5Var2 = lj5Var;
                bz7Var2 = bz7Var;
                hi5Var2 = hi5Var;
            } else {
                RumRawEvent.StartView startView = new RumRawEvent.StartView(xyeVar.a, xyeVar.b, new jph());
                lj5Var2 = lj5Var;
                bz7Var2 = bz7Var;
                hi5Var2 = hi5Var;
                dVar.c(startView, lj5Var2, bz7Var2, hi5Var2);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (((d) obj).l) {
                    arrayList3.add(obj);
                }
            }
            z = true;
            if (arrayList3.size() > 1) {
                dch.H(k99Var.t(), 5, g99.G, qs7.j0, null, false, 56);
            }
        } else {
            bz7Var2 = bz7Var;
            z = true;
            arrayList = arrayList2;
            lj5Var2 = lj5Var;
            hi5Var2 = hi5Var;
        }
        if (!(rumRawEvent instanceof RumRawEvent.SdkInit) && !this.v) {
            jph a = rumRawEvent.getA();
            if (DdRumContentProvider.E == 100) {
                long jL = k99Var.l();
                long nanos = TimeUnit.MILLISECONDS.toNanos(a.a);
                long j = a.b;
                RumRawEvent.ApplicationStarted applicationStarted = new RumRawEvent.ApplicationStarted(new jph(((nanos - j) + jL) / 1000000, jL), j - jL);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((d) it.next()).c(applicationStarted, lj5Var2, bz7Var2, hi5Var2) == null) {
                        it.remove();
                    }
                }
                this.v = z;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((d) it2.next()).c(rumRawEvent, lj5Var2, bz7Var2, hi5Var2) == null) {
                it2.remove();
            }
        }
        return this;
    }

    @Override // defpackage.jye
    public final sxe d() {
        return this.s;
    }

    public final d e() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.t) {
            if (((d) obj).l) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            dch.H(this.a.t(), 5, g99.F, qs7.i0, null, false, 56);
        }
        return (d) w44.V0(arrayList);
    }
}

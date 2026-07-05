package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import defpackage.a1c;
import defpackage.ab;
import defpackage.b54;
import defpackage.bsg;
import defpackage.bz7;
import defpackage.csg;
import defpackage.dgj;
import defpackage.hi5;
import defpackage.jph;
import defpackage.jye;
import defpackage.k99;
import defpackage.lj5;
import defpackage.lja;
import defpackage.lxe;
import defpackage.mxe;
import defpackage.nxe;
import defpackage.oxe;
import defpackage.rog;
import defpackage.sta;
import defpackage.sxe;
import defpackage.us8;
import defpackage.vb7;
import defpackage.x44;
import defpackage.za;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements jye {
    public final r a;
    public final k99 b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final lja f;
    public final long g;
    public final long h;
    public final long i;
    public final String j;
    public oxe k;
    public String l;
    public final long m;
    public long n;
    public long o;
    public final a1c p;
    public final LinkedHashMap q;
    public final ArrayList r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;

    public a(r rVar, k99 k99Var, boolean z, jph jphVar, oxe oxeVar, String str, Map map, long j, lja ljaVar, boolean z2, float f, lja ljaVar2) {
        k99Var.getClass();
        str.getClass();
        ljaVar.getClass();
        ljaVar2.getClass();
        this.a = rVar;
        this.b = k99Var;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = ljaVar2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.g = timeUnit.toNanos(100L);
        this.h = timeUnit.toNanos(5000L);
        this.i = jphVar.a + j;
        this.j = vb7.i();
        this.k = oxeVar;
        this.l = str;
        long j2 = jphVar.b;
        this.m = j2;
        this.n = j2;
        this.o = j2;
        this.p = k99Var.g();
        this.q = new LinkedHashMap(map);
        this.r = new ArrayList();
    }

    @Override // defpackage.jye
    public final jye a() {
        return this.a;
    }

    @Override // defpackage.jye
    public final Map b() {
        return sta.l0(this.a.b(), this.q);
    }

    @Override // defpackage.jye
    public final jye c(RumRawEvent rumRawEvent, lj5 lj5Var, bz7 bz7Var, hi5 hi5Var) {
        Object next;
        Object next2;
        rumRawEvent.getClass();
        lj5Var.getClass();
        bz7Var.getClass();
        hi5Var.getClass();
        long j = rumRawEvent.getA().b;
        boolean z = false;
        boolean z2 = j - this.o > this.g;
        boolean z3 = j - this.m > this.h;
        lxe lxeVar = lxe.G;
        ArrayList arrayList = this.r;
        b54.w0(lxeVar, arrayList);
        if (this.c && !this.x) {
            z = true;
        }
        if (z2 && arrayList.isEmpty() && !z) {
            e(this.o, lj5Var, bz7Var, hi5Var);
        } else if (z3) {
            e(j, lj5Var, bz7Var, hi5Var);
        } else if (rumRawEvent instanceof RumRawEvent.SendCustomActionNow) {
            e(this.o, lj5Var, bz7Var, hi5Var);
        } else if ((rumRawEvent instanceof RumRawEvent.StartView) || (rumRawEvent instanceof RumRawEvent.StopView)) {
            arrayList.clear();
            e(j, lj5Var, bz7Var, hi5Var);
        } else if (rumRawEvent instanceof RumRawEvent.StopAction) {
            RumRawEvent.StopAction stopAction = (RumRawEvent.StopAction) rumRawEvent;
            oxe oxeVar = stopAction.a;
            if (oxeVar != null) {
                this.k = oxeVar;
            }
            this.l = "";
            this.q.putAll(stopAction.b);
            this.x = true;
            this.n = j;
            this.o = j;
        } else if (rumRawEvent instanceof RumRawEvent.StartResource) {
            this.o = j;
            this.s++;
            arrayList.add(new WeakReference(((RumRawEvent.StartResource) rumRawEvent).a));
        } else if (rumRawEvent instanceof RumRawEvent.StopResource) {
            RumRawEvent.StopResource stopResource = (RumRawEvent.StopResource) rumRawEvent;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (x44.r(((WeakReference) next2).get(), stopResource.a)) {
                    break;
                }
            }
            WeakReference weakReference = (WeakReference) next2;
            if (weakReference != null) {
                arrayList.remove(weakReference);
                this.o = j;
            }
        } else if (rumRawEvent instanceof RumRawEvent.AddError) {
            this.o = j;
            this.t++;
            if (((RumRawEvent.AddError) rumRawEvent).e) {
                this.u++;
                e(j, lj5Var, bz7Var, hi5Var);
            }
        } else if (rumRawEvent instanceof RumRawEvent.StopResourceWithError) {
            String str = ((RumRawEvent.StopResourceWithError) rumRawEvent).a;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (x44.r(((WeakReference) next).get(), str)) {
                    break;
                }
            }
            WeakReference weakReference2 = (WeakReference) next;
            if (weakReference2 != null) {
                arrayList.remove(weakReference2);
                this.o = j;
                this.s--;
                this.t++;
            }
        } else if (rumRawEvent instanceof RumRawEvent.AddLongTask) {
            this.o = j;
            this.v++;
        }
        if (this.w) {
            return null;
        }
        return this;
    }

    @Override // defpackage.jye
    public final sxe d() {
        return this.a.d();
    }

    public final void e(long j, lj5 lj5Var, bz7 bz7Var, hi5 hi5Var) {
        String str;
        za zaVar;
        if (this.w) {
            return;
        }
        oxe oxeVar = this.k;
        sxe sxeVarD = this.a.d();
        String str2 = sxeVarD.h;
        String str3 = this.l;
        long j2 = this.t;
        long j3 = this.u;
        long j4 = this.v;
        long j5 = this.s;
        long jMax = Math.max(j - this.m, 1L);
        String str4 = sxeVarD.i;
        if (str2 == null || bsg.I0(str2) || str4 == null || bsg.I0(str4)) {
            str = str3;
            zaVar = null;
        } else {
            str = str3;
            zaVar = new za(str2, str4, null, new LinkedHashMap());
        }
        int i = zaVar == null ? 1 : 2;
        ArrayList arrayList = new ArrayList();
        if (this.d && j2 > 0 && oxeVar == oxe.E) {
            arrayList.add(ab.ERROR_TAP);
        }
        us8 us8VarD = csg.D(this.b, lj5Var, bz7Var, hi5Var, 1, new mxe(lj5Var, this, sxeVarD, oxeVar, str, j2, j3, j4, j5, arrayList, jMax, i, zaVar));
        rog rogVar = new rog(arrayList.size(), dgj.T(oxeVar), this.n);
        us8VarD.h = new nxe(sxeVarD, rogVar, 0);
        us8VarD.i = new nxe(sxeVarD, rogVar, 1);
        us8VarD.k();
        this.w = true;
    }
}

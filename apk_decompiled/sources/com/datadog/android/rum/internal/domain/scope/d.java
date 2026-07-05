package com.datadog.android.rum.internal.domain.scope;

import defpackage.ag5;
import defpackage.bt9;
import defpackage.dch;
import defpackage.g99;
import defpackage.gmf;
import defpackage.hr5;
import defpackage.i29;
import defpackage.j4c;
import defpackage.jph;
import defpackage.jye;
import defpackage.k0j;
import defpackage.k2e;
import defpackage.k99;
import defpackage.knk;
import defpackage.lja;
import defpackage.mye;
import defpackage.nt5;
import defpackage.nyj;
import defpackage.o29;
import defpackage.ov5;
import defpackage.sq6;
import defpackage.sxe;
import defpackage.uxe;
import defpackage.vb7;
import defpackage.w44;
import defpackage.x44;
import defpackage.ypf;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class d implements jye {
    public final b a;
    public final k99 b;
    public final ov5 c;
    public final nyj d;
    public final boolean e;
    public final gmf f;
    public final ag5 g;
    public String h;
    public int i;
    public final float j;
    public int k;
    public final boolean l;
    public final AtomicLong m;
    public final AtomicLong n;
    public final j4c o;
    public mye p;
    public f q;

    public d(b bVar, k99 k99Var, ov5 ov5Var, nyj nyjVar, boolean z, boolean z2, b bVar2, hr5 hr5Var, k0j k0jVar, k0j k0jVar2, k0j k0jVar3, gmf gmfVar, boolean z3, o29 o29Var, bt9 bt9Var, nt5 nt5Var, k2e k2eVar, i29 i29Var, i29 i29Var2, ag5 ag5Var, lja ljaVar) {
        hr5Var.getClass();
        k0jVar.getClass();
        k0jVar2.getClass();
        k0jVar3.getClass();
        o29Var.getClass();
        k2eVar.getClass();
        i29Var.getClass();
        i29Var2.getClass();
        ljaVar.getClass();
        this.a = bVar;
        this.b = k99Var;
        this.c = ov5Var;
        this.d = nyjVar;
        this.e = z;
        this.f = gmfVar;
        this.g = ag5Var;
        this.h = sxe.p;
        this.i = 1;
        float fFloatValue = nyjVar.X().floatValue();
        this.j = fFloatValue;
        this.k = 1;
        this.l = true;
        k99Var.y().getClass();
        this.m = new AtomicLong(System.nanoTime());
        this.n = new AtomicLong(0L);
        this.o = new j4c();
        this.q = new f(this, k99Var, ov5Var, z, z2, bVar2, hr5Var, k0jVar, k0jVar2, k0jVar3, z3, fFloatValue, o29Var, nt5Var, bt9Var, k2eVar, i29Var, i29Var2, ljaVar);
    }

    @Override // defpackage.jye
    public final jye a() {
        return this.a;
    }

    @Override // defpackage.jye
    public final Map b() {
        return knk.y(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a8 A[LOOP:1: B:108:0x02a2->B:110:0x02a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0254 A[LOOP:0: B:97:0x024e->B:99:0x0254, LOOP_END] */
    @Override // defpackage.jye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jye c(com.datadog.android.rum.internal.domain.scope.RumRawEvent r41, defpackage.lj5 r42, defpackage.bz7 r43, defpackage.hi5 r44) {
        /*
            Method dump skipped, instruction units count: 1831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.d.c(com.datadog.android.rum.internal.domain.scope.RumRawEvent, lj5, bz7, hi5):jye");
    }

    @Override // defpackage.jye
    public final sxe d() {
        return sxe.a(this.a.s, this.h, this.l, null, null, null, null, this.i, this.k, 0, null, null, 0L, 0L, false, 32377);
    }

    public final r e() {
        f fVar;
        if (!this.l || (fVar = this.q) == null) {
            return null;
        }
        ArrayList arrayList = fVar.t;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((r) obj).X) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            dch.H(fVar.b.t(), 5, g99.F, uxe.W, null, false, 56);
        }
        return (r) w44.V0(arrayList2);
    }

    public final void f(jph jphVar, int i) {
        boolean z;
        String strI = vb7.i();
        boolean zF = this.d.f(strI);
        this.k = i;
        this.i = zF ? 2 : 1;
        this.h = strI;
        jph jphVar2 = jphVar;
        this.m.set(jphVar2.b);
        this.p = (mye) this.g.a();
        f fVar = this.q;
        if (fVar != null) {
            ArrayList<r> arrayList = fVar.t;
            ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
            for (r rVar : arrayList) {
                rVar.getClass();
                arrayList2.add(new r(rVar, rVar.b, rVar.c, rVar.d, jphVar2, rVar.e, rVar.f, rVar.g, rVar.h, rVar.i, rVar.j, rVar.k, rVar.f0, rVar.l, rVar.m, rVar.n, rVar.o, rVar.p, rVar.q, rVar.r, rVar.s, rVar.t, rVar.u));
                jphVar2 = jphVar;
                zF = zF;
            }
            z = zF;
            arrayList.clear();
            arrayList.addAll(arrayList2);
        } else {
            z = zF;
        }
        if (z) {
            String str = this.h;
            long j = this.b.a().d;
            str.getClass();
            sq6.a(i);
            this.c.b.put(str, new ypf(str, i, j, this.e));
        }
        this.f.q(this.h, !z);
    }
}

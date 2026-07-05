package com.datadog.android.rum.internal.domain.scope;

import android.util.Log;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import defpackage.aze;
import defpackage.bt9;
import defpackage.bz7;
import defpackage.bze;
import defpackage.cpc;
import defpackage.dpf;
import defpackage.e5c;
import defpackage.el5;
import defpackage.g99;
import defpackage.h99;
import defpackage.hi5;
import defpackage.hr5;
import defpackage.i0j;
import defpackage.i29;
import defpackage.isg;
import defpackage.jph;
import defpackage.jye;
import defpackage.k0j;
import defpackage.k2e;
import defpackage.k99;
import defpackage.kye;
import defpackage.lj5;
import defpackage.lja;
import defpackage.n1c;
import defpackage.nm6;
import defpackage.nt5;
import defpackage.nv5;
import defpackage.ov5;
import defpackage.rl;
import defpackage.sq6;
import defpackage.sta;
import defpackage.sxe;
import defpackage.vb7;
import defpackage.wye;
import defpackage.x44;
import defpackage.xye;
import defpackage.zy7;
import defpackage.zye;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r implements jye {
    public final String A;
    public final long B;
    public long C;
    public Long D;
    public final long E;
    public final long F;
    public a G;
    public final LinkedHashMap H;
    public long I;
    public long J;
    public int K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public final LinkedHashMap U;
    public final LinkedHashMap V;
    public boolean W;
    public boolean X;
    public Double Y;
    public final zye Z;
    public final jye a;
    public i0j a0;
    public final k99 b;
    public final aze b0;
    public final ov5 c;
    public i0j c0;
    public final kye d;
    public final aze d0;
    public final Map e;
    public final LinkedHashMap e0;
    public final wye f;
    public final int f0;
    public final hr5 g;
    public final k0j h;
    public final k0j i;
    public final k0j j;
    public final lja k;
    public final boolean l;
    public final float m;
    public final el5 n;
    public final n1c o;
    public final nt5 p;
    public final e5c q;
    public final k2e r;
    public final i29 s;
    public final i29 t;
    public final lja u;
    public final String v;
    public final LinkedHashMap w;
    public final LinkedHashMap x;
    public Map y;
    public final String z;

    public r(jye jyeVar, k99 k99Var, ov5 ov5Var, kye kyeVar, jph jphVar, Map map, wye wyeVar, hr5 hr5Var, k0j k0jVar, k0j k0jVar2, k0j k0jVar3, lja ljaVar, int i, boolean z, float f, el5 el5Var, n1c n1cVar, nt5 nt5Var, e5c e5cVar, k2e k2eVar, i29 i29Var, i29 i29Var2, lja ljaVar2) {
        k99Var.getClass();
        ov5Var.getClass();
        kyeVar.getClass();
        jphVar.getClass();
        map.getClass();
        hr5Var.getClass();
        k0jVar.getClass();
        k0jVar2.getClass();
        k0jVar3.getClass();
        ljaVar.getClass();
        sq6.a(i);
        el5Var.getClass();
        n1cVar.getClass();
        e5cVar.getClass();
        k2eVar.getClass();
        i29Var.getClass();
        i29Var2.getClass();
        ljaVar2.getClass();
        this.a = jyeVar;
        this.b = k99Var;
        this.c = ov5Var;
        this.d = kyeVar;
        this.e = map;
        this.f = wyeVar;
        this.g = hr5Var;
        this.h = k0jVar;
        this.i = k0jVar2;
        this.j = k0jVar3;
        this.k = ljaVar;
        this.f0 = i;
        this.l = z;
        this.m = f;
        this.n = el5Var;
        this.o = n1cVar;
        this.p = nt5Var;
        this.q = e5cVar;
        this.r = k2eVar;
        this.s = i29Var;
        this.t = i29Var2;
        this.u = ljaVar2;
        this.v = isg.o0(kyeVar.b, '.', '/');
        this.w = new LinkedHashMap(map);
        this.x = new LinkedHashMap();
        this.y = nm6.E;
        String strI = vb7.i();
        this.z = strI;
        sxe sxeVarD = jyeVar.d();
        if (sxeVarD.h != null) {
            g("_dd.application.id", sxeVarD.a);
            g("_dd.session.id", sxeVarD.b);
            g("_dd.view.id", strI);
        }
        this.A = sxeVarD.b;
        long j = jphVar.b;
        this.B = j;
        this.C = j;
        long j2 = k99Var.a().d;
        this.E = j2;
        this.F = jphVar.a + j2;
        this.H = new LinkedHashMap();
        this.T = 1L;
        this.U = new LinkedHashMap();
        this.V = new LinkedHashMap();
        zye zyeVar = new zye(this);
        this.Z = zyeVar;
        aze azeVar = new aze(this, 1);
        this.b0 = azeVar;
        aze azeVar2 = new aze(this, 0);
        this.d0 = azeVar2;
        this.e0 = new LinkedHashMap();
        k0jVar.a(zyeVar);
        k0jVar2.a(azeVar);
        k0jVar3.a(azeVar2);
        n1cVar.e = Long.valueOf(jphVar.b);
        n1cVar.h = new dpf(15);
        long j3 = jphVar.b;
        if (((bt9) el5Var.F) != null) {
            ((LinkedHashMap) el5Var.I).put(strI, Long.valueOf(j3));
            el5Var.D();
        }
        if (nt5Var != null) {
            nt5Var.G = strI;
            nt5Var.H = j;
            nt5Var.E.b.putIfAbsent(strI, new nv5());
        }
        kyeVar.b.getClass();
    }

    public static void g(String str, String str2) {
        Log.i("DatadogSynthetics", str + "=" + str2);
    }

    @Override // defpackage.jye
    public final jye a() {
        return this.a;
    }

    @Override // defpackage.jye
    public final Map b() {
        boolean z = this.X;
        LinkedHashMap linkedHashMap = this.w;
        return !z ? sta.l0(this.a.b(), linkedHashMap) : sta.l0(this.y, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x051a  */
    @Override // defpackage.jye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jye c(com.datadog.android.rum.internal.domain.scope.RumRawEvent r26, defpackage.lj5 r27, defpackage.bz7 r28, defpackage.hi5 r29) {
        /*
            Method dump skipped, instruction units count: 1650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.r.c(com.datadog.android.rum.internal.domain.scope.RumRawEvent, lj5, bz7, hi5):jye");
    }

    @Override // defpackage.jye
    public final sxe d() {
        sxe sxeVarD = this.a.d();
        String str = this.d.c;
        a aVar = this.G;
        if (aVar == null) {
            aVar = null;
        }
        return sxe.a(sxeVarD, null, false, this.z, str, this.v, aVar != null ? aVar.j : null, 0, 0, this.f0, null, null, this.F, this.E, this.W, 3463);
    }

    public final void e(RumRawEvent rumRawEvent, lj5 lj5Var, bz7 bz7Var, hi5 hi5Var) {
        Iterator it = this.H.entrySet().iterator();
        while (it.hasNext()) {
            if (((jye) ((Map.Entry) it.next()).getValue()).c(rumRawEvent, lj5Var, bz7Var, hi5Var) == null) {
                if (rumRawEvent instanceof RumRawEvent.StopResourceWithError) {
                    this.P--;
                    this.R++;
                }
                it.remove();
            }
        }
        a aVar = this.G;
        if (aVar == null || aVar.c(rumRawEvent, lj5Var, bz7Var, hi5Var) != null) {
            return;
        }
        this.G = null;
    }

    public final boolean f() {
        return this.X && this.H.isEmpty() && ((this.Q + this.P) + this.R) + this.S <= 0;
    }

    public final void h(RumRawEvent rumRawEvent) {
        long j = rumRawEvent.getA().b;
        this.C = j;
        long j2 = this.B;
        long j3 = j - j2;
        this.q.e = Long.valueOf(j3);
        kye kyeVar = this.d;
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.E;
        k99 k99Var = this.b;
        if (j3 != 0) {
            if (j3 < 0) {
                ((rl) k99Var.t()).M(4, x44.X(g99Var2, g99Var), new bze(this, 1), null, false, sta.h0(new cpc("view.start_ns", Long.valueOf(j2)), new cpc("view.end_ns", Long.valueOf(rumRawEvent.getA().b)), new cpc("view.name", kyeVar.c)));
                this.C = j2 + 1;
                return;
            }
            return;
        }
        if ((this.f0 != 3 || !(rumRawEvent instanceof RumRawEvent.AddError) || !((RumRawEvent.AddError) rumRawEvent).e) && !(rumRawEvent instanceof RumRawEvent.StartView)) {
            h99 h99VarT = k99Var.t();
            List listX = x44.X(g99Var2, g99Var);
            bze bzeVar = new bze(this, 0);
            Map mapSingletonMap = Collections.singletonMap("view.name", kyeVar.c);
            mapSingletonMap.getClass();
            ((rl) h99VarT).M(4, listX, bzeVar, null, false, mapSingletonMap);
        }
        this.C = j2 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.datadog.android.rum.internal.domain.scope.RumRawEvent r57, defpackage.lj5 r58, defpackage.bz7 r59, defpackage.hi5 r60, int r61) {
        /*
            Method dump skipped, instruction units count: 1243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.r.i(com.datadog.android.rum.internal.domain.scope.RumRawEvent, lj5, bz7, hi5, int):void");
    }

    public final void j(RumRawEvent rumRawEvent, lj5 lj5Var, bz7 bz7Var, hi5 hi5Var, zy7 zy7Var) {
        if (this.X) {
            return;
        }
        zy7Var.a();
        this.X = true;
        h(rumRawEvent);
        i(rumRawEvent, lj5Var, bz7Var, hi5Var, 1);
        e(rumRawEvent, lj5Var, bz7Var, hi5Var);
        wye wyeVar = this.f;
        if (wyeVar != null) {
            kye kyeVar = this.d;
            LinkedHashMap linkedHashMap = this.w;
            boolean z = this.X;
            xye xyeVar = new xye(kyeVar, linkedHashMap, !z);
            b bVar = (b) wyeVar;
            if (!z) {
                bVar.u = xyeVar;
            }
        }
        this.h.b(this.Z);
        this.i.b(this.b0);
        this.j.b(this.d0);
        n1c n1cVar = this.o;
        n1cVar.g = true;
        n1cVar.c.clear();
    }

    public r(f fVar, k99 k99Var, ov5 ov5Var, kye kyeVar, jph jphVar, Map map, b bVar, hr5 hr5Var, k0j k0jVar, k0j k0jVar2, k0j k0jVar3, int i, boolean z, float f, el5 el5Var, n1c n1cVar, nt5 nt5Var, e5c e5cVar, k2e k2eVar, i29 i29Var, i29 i29Var2, lja ljaVar) {
        this(fVar, k99Var, ov5Var, kyeVar, jphVar, map, bVar, hr5Var, k0jVar, k0jVar2, k0jVar3, new lja(19), i, z, f, el5Var, n1cVar, nt5Var, e5cVar, k2eVar, i29Var, i29Var2, ljaVar);
    }
}

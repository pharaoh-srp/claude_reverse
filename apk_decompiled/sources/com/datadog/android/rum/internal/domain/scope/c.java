package com.datadog.android.rum.internal.domain.scope;

import defpackage.a1c;
import defpackage.hr5;
import defpackage.jph;
import defpackage.jye;
import defpackage.k99;
import defpackage.lja;
import defpackage.n1c;
import defpackage.o1c;
import defpackage.sq6;
import defpackage.sta;
import defpackage.sxe;
import defpackage.vb7;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c implements jye {
    public final r a;
    public final k99 b;
    public final String c;
    public final int d;
    public final String e;
    public final hr5 f;
    public final lja g;
    public final float h;
    public final lja i;
    public final String j;
    public final LinkedHashMap k;
    public final sxe l;
    public final long m;
    public final long n;
    public final a1c o;
    public boolean p;

    public c(r rVar, k99 k99Var, String str, int i, String str2, jph jphVar, Map map, long j, hr5 hr5Var, lja ljaVar, float f, n1c n1cVar, lja ljaVar2) {
        k99Var.getClass();
        str.getClass();
        sq6.a(i);
        hr5Var.getClass();
        ljaVar.getClass();
        n1cVar.getClass();
        ljaVar2.getClass();
        this.a = rVar;
        this.b = k99Var;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = hr5Var;
        this.g = ljaVar;
        this.h = f;
        this.i = ljaVar2;
        String strI = vb7.i();
        this.j = strI;
        this.k = new LinkedHashMap(map);
        this.l = rVar.d();
        this.m = jphVar.a + j;
        this.n = jphVar.b;
        this.o = k99Var.g();
        long j2 = jphVar.b;
        if (n1cVar.g) {
            return;
        }
        ((AtomicInteger) n1cVar.h.F).incrementAndGet();
        if (n1cVar.a.d(new o1c(strI, j2, n1cVar.e))) {
            ((AtomicInteger) n1cVar.h.G).incrementAndGet();
            n1cVar.c.add(strI);
        }
    }

    @Override // defpackage.jye
    public final jye a() {
        return this.a;
    }

    @Override // defpackage.jye
    public final Map b() {
        return sta.l0(this.a.b(), this.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a6  */
    @Override // defpackage.jye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jye c(com.datadog.android.rum.internal.domain.scope.RumRawEvent r45, defpackage.lj5 r46, defpackage.bz7 r47, defpackage.hi5 r48) {
        /*
            Method dump skipped, instruction units count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.domain.scope.c.c(com.datadog.android.rum.internal.domain.scope.RumRawEvent, lj5, bz7, hi5):jye");
    }

    @Override // defpackage.jye
    public final sxe d() {
        return this.l;
    }
}

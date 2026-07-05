package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e64 extends pd1 {
    public final y54 b;
    public final float c;
    public final bz7 d;
    public final y9d e;
    public final ke2 f;
    public final ogg g;
    public final gq5 h;
    public final yl4 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;

    public e64(y54 y54Var, bz7 bz7Var, y9d y9dVar, ke2 ke2Var, ogg oggVar, gq5 gq5Var, yl4 yl4Var) {
        yl4Var.getClass();
        this.b = y54Var;
        this.c = 16.0f;
        this.d = bz7Var;
        this.e = y9dVar;
        this.f = ke2Var;
        this.g = oggVar;
        this.h = gq5Var;
        this.i = yl4Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.j = linkedHashMap;
        this.k = new LinkedHashMap();
        this.l = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object k(defpackage.e64 r4, defpackage.uub r5, float r6, defpackage.vp4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.d64
            if (r0 == 0) goto L13
            r0 = r7
            d64 r0 = (defpackage.d64) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            d64 r0 = new d64
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.G
            int r1 = r0.I
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            uub r5 = r0.F
            e64 r4 = r0.E
            defpackage.sf5.h0(r7)
            goto L44
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L30:
            defpackage.sf5.h0(r7)
            gq5 r7 = r4.h
            r0.E = r4
            r0.F = r5
            r0.I = r2
            ae2 r7 = r7.a(r6, r0)
            m45 r6 = defpackage.m45.E
            if (r7 != r6) goto L44
            return r6
        L44:
            g64 r7 = (defpackage.g64) r7
            if (r7 == 0) goto L4e
            yl4 r4 = r4.i
            r5.b(r4, r7)
            goto L5b
        L4e:
            yl4 r4 = r4.i
            r5.getClass()
            r4.getClass()
            java.util.LinkedHashMap r5 = r5.a
            r5.remove(r4)
        L5b:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e64.k(e64, uub, float, vp4):java.lang.Object");
    }

    @Override // defpackage.pd1
    public final void c(yd2 yd2Var, ee2 ee2Var) {
        float fB;
        lub lubVar;
        int i;
        double d;
        float f;
        float f2;
        float f3;
        float f4;
        Map map;
        e64 e64Var = this;
        yd2 yd2Var2 = yd2Var;
        m64 m64Var = (m64) ee2Var;
        yd2Var2.getClass();
        m64Var.getClass();
        LinkedHashMap linkedHashMap = e64Var.j;
        linkedHashMap.clear();
        ge2 ge2Var = yd2Var2.a;
        xd2 xd2VarD = ge2Var.d();
        g64 g64Var = (g64) ge2Var.e().a(e64Var.i);
        float f5 = yd2Var2.f;
        oub oubVar = yd2Var2.d;
        List list = m64Var.b;
        xd2VarD.getClass();
        lub lubVarE = xd2VarD.e(null);
        RectF rectF = yd2Var2.b;
        rectF.height();
        lubVarE.getClass();
        float fHeight = (rectF.height() * ((float) (lubVarE.a / lubVarE.a()))) + rectF.bottom;
        uub uubVar = m64Var.j;
        b64 b64Var = (b64) e64Var.d.invoke(uubVar);
        eq3 eq3VarE = xwj.e(yd2Var2);
        Canvas canvas = yd2Var2.c;
        float f6 = g64Var != null ? g64Var.G : 1.0f;
        canvas.getClass();
        canvas.saveLayerAlpha(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, canvas.getWidth(), canvas.getHeight(), mwa.L(f6 * 255.0f));
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            xd2 xd2Var = xd2VarD;
            LinkedHashMap linkedHashMap2 = e64Var.k;
            if (!zHasNext) {
                yd2Var2.c.restore();
                linkedHashMap2.clear();
                return;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                x44.n0();
                throw null;
            }
            List<ce2> list2 = (List) next;
            float f7 = f5;
            int size = list.size();
            b64Var.getClass();
            List list3 = list;
            boolean z = b64Var instanceof z54;
            a64 a64Var = a64.a;
            Iterator it2 = it;
            if (z) {
                fB = (i2 * ge2Var.b(8.0f)) + e64Var.j(yd2Var2, i2);
            } else {
                if (!b64Var.equals(a64Var)) {
                    wg6.i();
                    return;
                }
                fB = MTTypesetterKt.kLineSkipLimitMultiplier;
            }
            float fI = (((((fB - (e64Var.i(yd2Var2, size, b64Var) / 2.0f)) * f7) + oubVar.d()) * ge2Var.j()) + nkk.e(rectF, ge2Var.g())) - yd2Var2.e;
            double dB = xd2Var.b();
            double dA = xd2Var.a();
            lub lubVar2 = lubVarE;
            double d2 = eq3VarE.E;
            double d3 = eq3VarE.F;
            list2.getClass();
            eq3 eq3Var = eq3VarE;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            for (ce2 ce2Var : list2) {
                if (ce2Var.a() > dA) {
                    break;
                }
                lubVar = lubVar2;
                if (i4 == list2.size() - 1) {
                    break;
                }
                if (ce2Var.a() < dB) {
                    i5++;
                } else {
                    if (ce2Var.a() >= d2) {
                        if (ce2Var.a() <= d3) {
                        }
                        i4++;
                        lubVar2 = lubVar;
                    }
                    i7++;
                    i4++;
                    lubVar2 = lubVar;
                }
                i6++;
                i7++;
                i4++;
                lubVar2 = lubVar;
            }
            lubVar = lubVar2;
            int i8 = i6 - 1;
            if (i8 >= i5) {
                i5 = i8;
            }
            int i9 = i7 + 1;
            if (i9 <= i4) {
                i4 = i9;
            }
            Iterator it3 = list2.subList(i5, i4 + 1).iterator();
            while (it3.hasNext()) {
                k64 k64Var = (k64) it3.next();
                f64 f64Var = (g64Var == null || (map = (Map) w44.O0(i2, g64Var)) == null) ? null : (f64) map.get(Double.valueOf(k64Var.a));
                float fHeight2 = rectF.height() * (f64Var != null ? Float.valueOf(f64Var.a) : Double.valueOf(Math.abs(k64Var.b) / lubVar.a())).floatValue();
                double d4 = k64Var.a;
                double d5 = k64Var.b;
                float fB2 = (float) ((d4 - xd2Var.b()) / xd2Var.d());
                y54 y54Var = e64Var.b;
                y54Var.getClass();
                ArrayList arrayList = y54Var.a;
                uubVar.getClass();
                y5a y5aVar = (y5a) gok.h(i2, arrayList);
                float fB3 = (((ge2Var.b(((y5a) gok.h(i2, arrayList)).i / 2.0f) * f7) + (oubVar.a * fB2)) * ge2Var.j()) + fI;
                g64 g64Var2 = g64Var;
                Iterator it4 = it3;
                if (b64Var.equals(a64Var)) {
                    Double dValueOf = Double.valueOf(d4);
                    Object obj = linkedHashMap2.get(dValueOf);
                    if (obj == null) {
                        i = i2;
                        c64 c64Var = new c64();
                        c64Var.a = 0.0d;
                        c64Var.b = 0.0d;
                        d = 0.0d;
                        c64Var.c = MTTypesetterKt.kLineSkipLimitMultiplier;
                        c64Var.d = MTTypesetterKt.kLineSkipLimitMultiplier;
                        linkedHashMap2.put(dValueOf, c64Var);
                        obj = c64Var;
                    } else {
                        i = i2;
                        d = 0.0d;
                    }
                    c64 c64Var2 = (c64) obj;
                    float f8 = d5 >= d ? fHeight - c64Var2.c : fHeight + c64Var2.d + fHeight2;
                    f2 = f8 - fHeight2;
                    if (f2 > f8) {
                        f2 = f8;
                    }
                    if (d5 >= d) {
                        f4 = f8;
                        c64Var2.a += d5;
                        c64Var2.c += fHeight2;
                    } else {
                        f4 = f8;
                        c64Var2.b += d5;
                        c64Var2.d += fHeight2;
                    }
                    f = f4;
                } else {
                    i = i2;
                    d = 0.0d;
                    if (!z) {
                        wg6.i();
                        return;
                    } else {
                        f = fHeight + (d5 < 0.0d ? fHeight2 : MTTypesetterKt.kLineSkipLimitMultiplier);
                        f2 = f - fHeight2;
                    }
                }
                float f9 = d5 < d ? f : f2;
                y5aVar.getClass();
                float f10 = y5aVar.i;
                if (fB3 <= rectF.left - 1.0f || fB3 >= rectF.right + 1.0f) {
                    f3 = f;
                } else {
                    f3 = f;
                    float fD0 = wd6.d0(f9, rectF.top, rectF.bottom);
                    pk7 pk7Var = y5aVar.d;
                    if (((pk7Var.a >> 24) & 255) == 0) {
                        pk7Var = y5aVar.a;
                    }
                    ge2Var.b(f10);
                    int i10 = sk7.a;
                    i64 i64Var = new i64(k64Var, fD0, pk7Var.a);
                    if (z) {
                        Double dValueOf2 = Double.valueOf(d4);
                        Object arrayList2 = linkedHashMap.get(dValueOf2);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(dValueOf2, arrayList2);
                        }
                        ((Collection) arrayList2).add(new rub(d4, fB3, x44.a0(i64Var)));
                    } else {
                        if (!b64Var.equals(a64Var)) {
                            wg6.i();
                            return;
                        }
                        Double dValueOf3 = Double.valueOf(d4);
                        Object objA0 = linkedHashMap.get(dValueOf3);
                        if (objA0 == null) {
                            objA0 = x44.a0(new rub(d4, fB3, new ArrayList()));
                            linkedHashMap.put(dValueOf3, objA0);
                        }
                        ((rub) w44.L0((List) objA0)).c.add(i64Var);
                    }
                }
                float fB4 = (ge2Var.b(f10) * f7) / 2.0f;
                RectF rectF2 = rectF;
                b64 b64Var2 = b64Var;
                int i11 = i;
                y5aVar.a(yd2Var, fB3 - fB4, f2, fB3 + fB4, f3);
                if (z) {
                    list3.size();
                    if (i11 == 0) {
                        int i12 = (d4 > xd2Var.b() ? 1 : (d4 == xd2Var.b() ? 0 : -1));
                    }
                    if (i11 == list3.size() - 1) {
                        int i13 = (d4 > xd2Var.a() ? 1 : (d4 == xd2Var.a() ? 0 : -1));
                    }
                } else if (i11 == list3.size() - 1) {
                    list3.size();
                    c64 c64Var3 = (c64) sta.f0(Double.valueOf(d4), linkedHashMap2);
                    xd2Var.b();
                    xd2Var.a();
                    c64Var3.getClass();
                }
                rectF = rectF2;
                b64Var = b64Var2;
                i2 = i11;
                g64Var = g64Var2;
                it3 = it4;
                e64Var = this;
            }
            e64Var = this;
            yd2Var2 = yd2Var;
            xd2VarD = xd2Var;
            i2 = i3;
            f5 = f7;
            list = list3;
            it = it2;
            eq3VarE = eq3Var;
            lubVarE = lubVar;
        }
    }

    @Override // defpackage.pd1
    public final LinkedHashMap d() {
        return this.l;
    }

    @Override // defpackage.pd1
    public final void e(ee2 ee2Var, xd2 xd2Var, uub uubVar) {
        m64 m64Var = (m64) ee2Var;
        xd2Var.getClass();
        uubVar.getClass();
        gq5 gq5Var = this.h;
        ae2 ae2Var = (ae2) uubVar.a(this.i);
        g64 g64Var = null;
        if (m64Var != null) {
            List<List> list = m64Var.b;
            ArrayList arrayList = new ArrayList(x44.y(list, 10));
            for (List<k64> list2 : list) {
                int iD0 = tta.d0(x44.y(list2, 10));
                if (iD0 < 16) {
                    iD0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                for (k64 k64Var : list2) {
                    linkedHashMap.put(Double.valueOf(k64Var.a), new f64((float) (Math.abs(k64Var.b) / xd2Var.e(null).a())));
                }
                arrayList.add(linkedHashMap);
            }
            g64Var = new g64(arrayList, 1.0f);
        }
        synchronized (gq5Var) {
            gq5Var.b = ae2Var;
            gq5Var.c = g64Var;
            gq5Var.b();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e64)) {
            return false;
        }
        e64 e64Var = (e64) obj;
        return x44.r(this.b, e64Var.b) && this.c == e64Var.c && x44.r(this.d, e64Var.d) && this.e == e64Var.e && x44.r(this.f, e64Var.f) && x44.r(this.g, e64Var.g) && x44.r(this.h, e64Var.h);
    }

    @Override // defpackage.pd1
    public final Object f(uub uubVar, float f, tp4 tp4Var) {
        return k(this, uubVar, f, (vp4) tp4Var);
    }

    @Override // defpackage.pd1
    public final void g(mub mubVar, ee2 ee2Var) {
        m64 m64Var = (m64) ee2Var;
        mubVar.getClass();
        m64Var.getClass();
        uub uubVar = m64Var.j;
        b64 b64Var = (b64) this.d.invoke(uubVar);
        double dA = b64Var.a(m64Var);
        double dB = b64Var.b(m64Var);
        double d = m64Var.d;
        ogg oggVar = this.g;
        mubVar.f(oggVar.c(d, uubVar), oggVar.a(m64Var.e, uubVar), this.g.d(dA, dB, m64Var.j), this.g.b(dA, dB, m64Var.j));
    }

    @Override // defpackage.pd1
    public final void h(ge2 ge2Var, oub oubVar, ee2 ee2Var) {
        m64 m64Var = (m64) ee2Var;
        ge2Var.getClass();
        oubVar.getClass();
        m64Var.getClass();
        List list = m64Var.b;
        float fI = i(ge2Var, !list.isEmpty() ? list.size() : 1, (b64) this.d.invoke(m64Var.j));
        float fB = ge2Var.b(this.c) + fI;
        float f = fI / 2.0f;
        ge2Var.m().getClass();
        float fB2 = ge2Var.b(MTTypesetterKt.kLineSkipLimitMultiplier) + f;
        ge2Var.m().getClass();
        float fB3 = ge2Var.b(MTTypesetterKt.kLineSkipLimitMultiplier) + f;
        ge2Var.m().getClass();
        float fB4 = ge2Var.b(MTTypesetterKt.kLineSkipLimitMultiplier);
        ge2Var.m().getClass();
        oubVar.a(fB, fB2, fB3, fB4, ge2Var.b(MTTypesetterKt.kLineSkipLimitMultiplier));
    }

    public final int hashCode() {
        return Objects.hash(this.b, Float.valueOf(this.c), this.d, null, this.e, this.f, Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier), this.g, null, this.h);
    }

    public final float i(ge2 ge2Var, int i, b64 b64Var) {
        ge2Var.getClass();
        b64Var.getClass();
        if (!(b64Var instanceof a64)) {
            if (b64Var instanceof z54) {
                return (ge2Var.b(8.0f) * (i - 1)) + j(ge2Var, i);
            }
            wg6.i();
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        a79 a79Var = (a79) wd6.H0(0, i).iterator();
        if (!a79Var.G) {
            pmf.d();
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        int iNextInt = a79Var.nextInt();
        uub uubVar = ge2Var.i().d;
        y54 y54Var = this.b;
        y54Var.getClass();
        uubVar.getClass();
        float fMax = ((y5a) gok.h(iNextInt, y54Var.a)).i;
        while (a79Var.G) {
            int iNextInt2 = a79Var.nextInt();
            uub uubVar2 = ge2Var.i().d;
            y54Var.getClass();
            uubVar2.getClass();
            fMax = Math.max(fMax, ((y5a) gok.h(iNextInt2, y54Var.a)).i);
        }
        return ge2Var.b(fMax);
    }

    public final float j(ge2 ge2Var, int i) {
        ge2Var.getClass();
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        for (int i2 = 0; i2 < i; i2++) {
            uub uubVar = ge2Var.i().d;
            y54 y54Var = this.b;
            y54Var.getClass();
            uubVar.getClass();
            f += ((y5a) gok.h(i2, y54Var.a)).i;
        }
        return ge2Var.b(f);
    }
}

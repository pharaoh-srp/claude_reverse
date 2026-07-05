package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o5a extends pd1 {
    public final j5a b;
    public final float c;
    public final ogg d;
    public final gq5 e;
    public final yl4 f;
    public final LinkedHashMap g;
    public final Path h;
    public final Canvas i;
    public final Canvas j;
    public final Paint k;
    public final hj6 l;
    public final LinkedHashMap m;

    public o5a(j5a j5aVar, ogg oggVar, gq5 gq5Var, yl4 yl4Var) {
        yl4Var.getClass();
        this.b = j5aVar;
        this.c = 32.0f;
        this.d = oggVar;
        this.e = gq5Var;
        this.f = yl4Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.g = linkedHashMap;
        this.h = new Path();
        this.i = new Canvas();
        this.j = new Canvas();
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.k = paint;
        this.l = new hj6(27);
        this.m = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object j(defpackage.o5a r4, defpackage.uub r5, float r6, defpackage.vp4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.n5a
            if (r0 == 0) goto L13
            r0 = r7
            n5a r0 = (defpackage.n5a) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            n5a r0 = new n5a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.G
            int r1 = r0.I
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            uub r5 = r0.F
            o5a r4 = r0.E
            defpackage.sf5.h0(r7)
            goto L44
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L30:
            defpackage.sf5.h0(r7)
            gq5 r7 = r4.e
            r0.E = r4
            r0.F = r5
            r0.I = r2
            ae2 r7 = r7.a(r6, r0)
            m45 r6 = defpackage.m45.E
            if (r7 != r6) goto L44
            return r6
        L44:
            q5a r7 = (defpackage.q5a) r7
            if (r7 == 0) goto L4e
            yl4 r4 = r4.f
            r5.b(r4, r7)
            goto L5b
        L4e:
            yl4 r4 = r4.f
            r5.getClass()
            r4.getClass()
            java.util.LinkedHashMap r5 = r5.a
            r5.remove(r4)
        L5b:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5a.j(o5a, uub, float, vp4):java.lang.Object");
    }

    @Override // defpackage.pd1, defpackage.be2
    public final void a(ge2 ge2Var, sp0 sp0Var, oub oubVar, Object obj) {
        Float f;
        Float f2;
        Float fValueOf = Float.valueOf(8.0f);
        w5a w5aVar = (w5a) obj;
        ge2Var.getClass();
        sp0Var.getClass();
        oubVar.getClass();
        w5aVar.getClass();
        uub uubVar = w5aVar.h;
        b79 b79VarH0 = wd6.H0(0, w5aVar.b.size());
        ArrayList arrayList = new ArrayList();
        Iterator it = b79VarH0.iterator();
        while (true) {
            a79 a79Var = (a79) it;
            if (!a79Var.G) {
                break;
            }
            int iNextInt = a79Var.nextInt();
            j5a j5aVar = this.b;
            j5aVar.getClass();
            uubVar.getClass();
            i5a i5aVar = (i5a) gok.h(iNextInt, j5aVar.a);
            if (i5aVar != null) {
                arrayList.add(i5aVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            pmf.d();
            return;
        }
        i5a i5aVar2 = (i5a) it2.next();
        i5aVar2.b.getClass();
        if (i5aVar2.c != null) {
            uubVar.getClass();
            f = fValueOf;
        } else {
            f = null;
        }
        float fMax = Math.max(2.0f, f != null ? f.floatValue() : 0.0f);
        while (it2.hasNext()) {
            i5a i5aVar3 = (i5a) it2.next();
            i5aVar3.b.getClass();
            if (i5aVar3.c != null) {
                uubVar.getClass();
                f2 = fValueOf;
            } else {
                f2 = null;
            }
            fMax = Math.max(fMax, Math.max(2.0f, f2 != null ? f2.floatValue() : 0.0f));
        }
        float fB = ge2Var.b(fMax / 2.0f);
        sp0.a(sp0Var, fB, fB, 5);
    }

    @Override // defpackage.pd1
    public final void c(yd2 yd2Var, ee2 ee2Var) {
        o5a o5aVar = this;
        final yd2 yd2Var2 = yd2Var;
        w5a w5aVar = (w5a) ee2Var;
        yd2Var2.getClass();
        RectF rectF = yd2Var2.b;
        w5aVar.getClass();
        o5aVar.g.clear();
        Path path = o5aVar.h;
        path.rewind();
        ge2 ge2Var = yd2Var2.a;
        q5a q5aVar = (q5a) ge2Var.e().a(o5aVar.f);
        final int i = 0;
        for (Object obj : w5aVar.b) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            List list = (List) obj;
            Map map = q5aVar != null ? (Map) w44.O0(i, q5aVar) : null;
            path.rewind();
            uub uubVar = w5aVar.h;
            j5a j5aVar = o5aVar.b;
            j5aVar.getClass();
            uubVar.getClass();
            final i5a i5aVar = (i5a) gok.h(i, j5aVar.a);
            final aae aaeVar = new aae();
            aaeVar.E = nkk.e(rectF, ge2Var.g());
            final aae aaeVar2 = new aae();
            aaeVar2.E = rectF.bottom;
            float fE = (nkk.e(rectF, ge2Var.g()) + (yd2Var2.d.d() * ge2Var.j())) - yd2Var2.e;
            k5a k5aVar = i5aVar.b;
            final yd2 yd2Var3 = yd2Var2;
            tz7 tz7Var = new tz7() { // from class: f5a
                @Override // defpackage.tz7
                public final Object m(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    float fFloatValue = ((Float) obj3).floatValue();
                    float fFloatValue2 = ((Float) obj4).floatValue();
                    ((u5a) obj2).getClass();
                    Path path2 = this.E.h;
                    if (path2.isEmpty()) {
                        path2.moveTo(fFloatValue, fFloatValue2);
                    } else {
                        i5aVar.d.getClass();
                        yd2Var3.getClass();
                        path2.lineTo(fFloatValue, fFloatValue2);
                    }
                    aaeVar.E = fFloatValue;
                    aaeVar2.E = fFloatValue2;
                    return iei.a;
                }
            };
            yd2Var2 = yd2Var3;
            Map map2 = map;
            i(yd2Var2, list, fE, map2, tz7Var);
            Canvas canvas = yd2Var2.c;
            float f = q5aVar != null ? q5aVar.G : 1.0f;
            canvas.getClass();
            canvas.saveLayerAlpha(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, canvas.getWidth(), canvas.getHeight(), mwa.L(f * 255.0f));
            Object[] objArr = {Integer.valueOf(i), "line"};
            hj6 hj6Var = this.l;
            Bitmap bitmapE = tuj.e(yd2Var2, hj6Var, objArr);
            Canvas canvas2 = this.i;
            canvas2.setBitmap(bitmapE);
            final Bitmap bitmapE2 = tuj.e(yd2Var2, hj6Var, Integer.valueOf(i), "lineFill");
            Canvas canvas3 = this.j;
            canvas3.setBitmap(bitmapE2);
            k5a k5aVar2 = i5aVar.b;
            w5a w5aVar2 = w5aVar;
            Paint paint = i5aVar.e;
            k5aVar2.getClass();
            paint.getClass();
            paint.setStrokeWidth(ge2Var.b(2.0f));
            paint.setStrokeCap(k5aVar2.a);
            paint.setPathEffect(null);
            ge2Var.b(2.0f);
            canvas2.drawPath(path, paint);
            Canvas canvas4 = yd2Var2.c;
            yd2Var2.c = canvas3;
            u7g u7gVar = i5aVar.a;
            u7gVar.getClass();
            Paint paint2 = u7gVar.b;
            paint2.setShader(null);
            yd2Var2.c.drawPaint(paint2);
            canvas4.getClass();
            yd2Var2.c = canvas4;
            canvas2.drawBitmap(bitmapE2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, this.k);
            yd2Var2.c.drawBitmap(bitmapE, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (Paint) null);
            i(yd2Var2, list, fE, map2, new tz7() { // from class: g5a
                @Override // defpackage.tz7
                public final Object m(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    u5a u5aVar = (u5a) obj2;
                    float fFloatValue = ((Float) obj3).floatValue();
                    float fFloatValue2 = ((Float) obj4).floatValue();
                    u5aVar.getClass();
                    double d = u5aVar.a;
                    yd2 yd2Var4 = yd2Var2;
                    yd2Var4.getClass();
                    RectF rectF2 = yd2Var4.b;
                    if (fFloatValue > rectF2.left - 1.0f && fFloatValue < rectF2.right + 1.0f) {
                        float fD0 = wd6.d0(fFloatValue2, rectF2.top, rectF2.bottom);
                        LinkedHashMap linkedHashMap = this.E.g;
                        Double dValueOf = Double.valueOf(d);
                        Object objW = linkedHashMap.get(dValueOf);
                        if (objW == null) {
                            objW = x44.W(new avb(d, fFloatValue));
                            linkedHashMap.put(dValueOf, objW);
                        }
                        ((avb) w44.L0((List) objW)).c.add(new s5a(u5aVar, fD0, bitmapE2.getPixel(wd6.e0(mwa.L(fFloatValue), (int) Math.ceil(rectF2.left), ((int) rectF2.right) - 1), mwa.L(fD0))));
                    }
                    return iei.a;
                }
            });
            i(yd2Var2, list, fE, map2, new tz7(i, yd2Var2, this) { // from class: h5a
                public final /* synthetic */ yd2 F;

                {
                    this.F = yd2Var2;
                }

                @Override // defpackage.tz7
                public final Object m(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    l5a l5aVar;
                    u5a u5aVar = (u5a) obj2;
                    float fFloatValue = ((Float) obj3).floatValue();
                    float fFloatValue2 = ((Float) obj4).floatValue();
                    u5aVar.getClass();
                    double d = u5aVar.a;
                    m5a m5aVar = this.E.c;
                    yd2 yd2Var4 = this.F;
                    if (m5aVar != null) {
                        yd2Var4.a.i().d.getClass();
                        l5aVar = m5aVar.a;
                    } else {
                        l5aVar = null;
                    }
                    if (l5aVar != null) {
                        yd2Var4.getClass();
                        float fB = yd2Var4.a.b(4.0f);
                        l5aVar.a.a(yd2Var4, fFloatValue - fB, fFloatValue2 - fB, fFloatValue + fB, fFloatValue2 + fB);
                    }
                    ge2 ge2Var2 = yd2Var4.a;
                    oub oubVar = yd2Var4.d;
                    if ((d == ge2Var2.d().b() || d == ge2Var2.d().a()) && ((d != ge2Var2.d().b() || oubVar.d() <= MTTypesetterKt.kLineSkipLimitMultiplier) && d == ge2Var2.d().a())) {
                        float f2 = oubVar.c;
                    }
                    return iei.a;
                }
            });
            yd2Var2.c.restore();
            o5aVar = this;
            i = i2;
            w5aVar = w5aVar2;
            rectF = rectF;
            q5aVar = q5aVar;
        }
    }

    @Override // defpackage.pd1
    public final LinkedHashMap d() {
        return this.m;
    }

    @Override // defpackage.pd1
    public final void e(ee2 ee2Var, xd2 xd2Var, uub uubVar) {
        w5a w5aVar = (w5a) ee2Var;
        xd2Var.getClass();
        uubVar.getClass();
        gq5 gq5Var = this.e;
        ae2 ae2Var = (ae2) uubVar.a(this.f);
        q5a q5aVar = null;
        if (w5aVar != null) {
            lub lubVarE = xd2Var.e(null);
            List<List> list = w5aVar.b;
            ArrayList arrayList = new ArrayList(x44.y(list, 10));
            for (List<u5a> list2 : list) {
                int iD0 = tta.d0(x44.y(list2, 10));
                if (iD0 < 16) {
                    iD0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                for (u5a u5aVar : list2) {
                    linkedHashMap.put(Double.valueOf(u5aVar.a), new p5a((float) ((u5aVar.b - lubVarE.a) / lubVarE.a())));
                }
                arrayList.add(linkedHashMap);
            }
            q5aVar = new q5a(arrayList, 1.0f);
        }
        synchronized (gq5Var) {
            gq5Var.b = ae2Var;
            gq5Var.c = q5aVar;
            gq5Var.b();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5a)) {
            return false;
        }
        o5a o5aVar = (o5a) obj;
        return x44.r(this.b, o5aVar.b) && this.c == o5aVar.c && x44.r(this.d, o5aVar.d) && x44.r(this.e, o5aVar.e);
    }

    @Override // defpackage.pd1
    public final Object f(uub uubVar, float f, tp4 tp4Var) {
        return j(this, uubVar, f, (vp4) tp4Var);
    }

    @Override // defpackage.pd1
    public final void g(mub mubVar, ee2 ee2Var) {
        w5a w5aVar = (w5a) ee2Var;
        mubVar.getClass();
        w5aVar.getClass();
        double d = w5aVar.d;
        uub uubVar = w5aVar.h;
        ogg oggVar = this.d;
        mubVar.f(oggVar.c(d, uubVar), oggVar.a(w5aVar.e, uubVar), this.d.d(w5aVar.f, w5aVar.g, w5aVar.h), this.d.b(w5aVar.f, w5aVar.g, w5aVar.h));
    }

    @Override // defpackage.pd1
    public final void h(ge2 ge2Var, oub oubVar, ee2 ee2Var) {
        Float fValueOf = Float.valueOf(8.0f);
        w5a w5aVar = (w5a) ee2Var;
        ge2Var.getClass();
        oubVar.getClass();
        w5aVar.getClass();
        uub uubVar = w5aVar.h;
        a79 a79Var = (a79) wd6.H0(0, w5aVar.b.size()).iterator();
        if (!a79Var.G) {
            pmf.d();
            return;
        }
        int iNextInt = a79Var.nextInt();
        j5a j5aVar = this.b;
        j5aVar.getClass();
        ArrayList arrayList = j5aVar.a;
        uubVar.getClass();
        Float f = ((i5a) gok.h(iNextInt, arrayList)).c != null ? fValueOf : null;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        while (a79Var.G) {
            Float f2 = ((i5a) gok.h(a79Var.nextInt(), arrayList)).c != null ? fValueOf : null;
            fFloatValue = Math.max(fFloatValue, f2 != null ? f2.floatValue() : 0.0f);
        }
        float fB = ge2Var.b(fFloatValue);
        float fB2 = ge2Var.b(this.c) + fB;
        ge2Var.m().getClass();
        float fB3 = ge2Var.b(MTTypesetterKt.kLineSkipLimitMultiplier);
        ge2Var.m().getClass();
        float fB4 = ge2Var.b(MTTypesetterKt.kLineSkipLimitMultiplier);
        float f3 = fB / 2.0f;
        ge2Var.m().getClass();
        float fB5 = ge2Var.b(MTTypesetterKt.kLineSkipLimitMultiplier) + f3;
        ge2Var.m().getClass();
        oubVar.a(fB2, fB3, fB4, fB5, ge2Var.b(MTTypesetterKt.kLineSkipLimitMultiplier) + f3);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Float.valueOf(this.c), this.d, null, this.e);
    }

    public final void i(yd2 yd2Var, List list, float f, Map map, tz7 tz7Var) {
        ge2 ge2Var;
        double d;
        float fJ;
        Iterator it;
        RectF rectF;
        float fA;
        p5a p5aVar;
        List<ce2> list2 = list;
        yd2Var.getClass();
        oub oubVar = yd2Var.d;
        list2.getClass();
        ge2 ge2Var2 = yd2Var.a;
        double dB = ge2Var2.d().b();
        double dA = ge2Var2.d().a();
        double d2 = ge2Var2.d().d();
        RectF rectF2 = yd2Var.b;
        float fE = nkk.e(rectF2, ge2Var2.g());
        float fWidth = (rectF2.width() * ge2Var2.j()) + fE;
        int i = 0;
        int i2 = 0;
        for (ce2 ce2Var : list2) {
            if (ce2Var.a() >= dB) {
                if (ce2Var.a() > dA) {
                    break;
                }
            } else {
                i++;
            }
            i2++;
        }
        boolean z = true;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? i3 : 0;
        int i5 = i2 + 1;
        int size = list2.size() - 1;
        if (i5 > size) {
            i5 = size;
        }
        Iterator it2 = new b79(i4, i5, 1).iterator();
        Float f2 = null;
        Object obj = null;
        while (true) {
            a79 a79Var = (a79) it2;
            boolean z2 = z;
            if (!a79Var.G) {
                return;
            }
            int iNextInt = a79Var.nextInt();
            Object obj2 = list2.get(iNextInt);
            u5a u5aVar = (u5a) w44.O0(iNextInt + 1, list2);
            u5a u5aVar2 = (u5a) obj2;
            if (f2 != null) {
                fJ = f2.floatValue();
                ge2Var = ge2Var2;
                d = dB;
            } else {
                ge2Var = ge2Var2;
                d = dB;
                fJ = (ge2Var2.j() * oubVar.a * ((float) ((u5aVar2.a - d) / d2))) + f;
            }
            float f3 = fJ;
            Float fValueOf = u5aVar != null ? Float.valueOf((ge2Var.j() * oubVar.a * ((float) ((u5aVar.a - d) / d2))) + f) : null;
            Object objValueOf = Float.valueOf(f3);
            if (fValueOf == null || (((!ge2Var.g() || f3 >= fE) && (ge2Var.g() || f3 <= fE)) || ((!ge2Var.g() || fValueOf.floatValue() >= fE) && (ge2Var.g() || fValueOf.floatValue() <= fE)))) {
                Object objValueOf2 = Float.valueOf(f3);
                lub lubVarE = ge2Var.d().e(null);
                float f4 = rectF2.bottom;
                it = it2;
                if (map == null || (p5aVar = (p5a) map.get(Double.valueOf(u5aVar2.a))) == null) {
                    rectF = rectF2;
                    fA = (float) ((u5aVar2.b - lubVarE.a) / lubVarE.a());
                } else {
                    fA = p5aVar.a;
                    rectF = rectF2;
                }
                tz7Var.m(u5aVar2, objValueOf2, Float.valueOf(f4 - (rectF.height() * fA)), obj, fValueOf);
                if (ge2Var.g() && f3 > fWidth) {
                    return;
                }
                if (!ge2Var.g() && f3 < fWidth) {
                    return;
                }
            } else {
                rectF = rectF2;
                it = it2;
            }
            z = z2;
            it2 = it;
            list2 = list;
            obj = objValueOf;
            ge2Var2 = ge2Var;
            f2 = fValueOf;
            dB = d;
            rectF2 = rectF;
        }
    }
}

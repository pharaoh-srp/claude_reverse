package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.tasks.TaskResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ad2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ ad2(RectF rectF, oub oubVar, vc2 vc2Var, pub pubVar, eui euiVar, dui duiVar, ed2 ed2Var, l45 l45Var, gri griVar, ed2 ed2Var2) {
        this.E = 0;
        this.F = rectF;
        this.G = oubVar;
        this.H = vc2Var;
        this.I = pubVar;
        this.J = euiVar;
        this.K = duiVar;
        this.L = ed2Var;
        this.N = l45Var;
        this.O = griVar;
        this.M = ed2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.graphics.Paint, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v83 */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        iei ieiVar;
        l45 l45Var;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        vc2 vc2Var;
        gri griVar;
        Float fValueOf;
        ?? r4;
        float f;
        float fB;
        double dDoubleValue;
        float fB2;
        int i = this.E;
        iei ieiVar2 = iei.a;
        Object obj2 = this.O;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        Object obj8 = this.I;
        Object obj9 = this.H;
        Object obj10 = this.G;
        Object obj11 = this.F;
        switch (i) {
            case 0:
                RectF rectF = (RectF) obj11;
                oub oubVar = (oub) obj10;
                vc2 vc2Var2 = (vc2) obj9;
                ge2 ge2Var = (ge2) obj8;
                eui euiVar = (eui) obj7;
                dui duiVar = (dui) obj6;
                ed2 ed2Var = (ed2) obj5;
                l45 l45Var2 = (l45) obj3;
                gri griVar2 = (gri) obj2;
                ed2 ed2Var2 = (ed2) obj4;
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                Canvas canvasB = jz.b(xd6Var.B0().p());
                if (canvasB.getWidth() == 0 || canvasB.getHeight() == 0) {
                    ieiVar = ieiVar2;
                } else {
                    nkk.i(rectF, 0, 0, Float.valueOf(Float.intBitsToFloat((int) (xd6Var.g() >> 32))), Float.valueOf(Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L))));
                    oubVar.a = MTTypesetterKt.kLineSkipLimitMultiplier;
                    oubVar.b = MTTypesetterKt.kLineSkipLimitMultiplier;
                    oubVar.c = MTTypesetterKt.kLineSkipLimitMultiplier;
                    oubVar.d = MTTypesetterKt.kLineSkipLimitMultiplier;
                    oubVar.e = MTTypesetterKt.kLineSkipLimitMultiplier;
                    ro8 ro8Var = vc2Var2.b;
                    sa1 sa1Var = vc2Var2.j;
                    LinkedHashMap linkedHashMap2 = vc2Var2.f;
                    RectF rectF2 = vc2Var2.r;
                    ge2Var.getClass();
                    vc2Var2.k.clear();
                    sp0 sp0Var = vc2Var2.h;
                    sp0Var.b = MTTypesetterKt.kLineSkipLimitMultiplier;
                    sp0Var.c = MTTypesetterKt.kLineSkipLimitMultiplier;
                    sp0Var.d = MTTypesetterKt.kLineSkipLimitMultiplier;
                    sp0Var.e = MTTypesetterKt.kLineSkipLimitMultiplier;
                    int iHash = Objects.hash(null, ge2Var.i().d);
                    Integer num = vc2Var2.g;
                    if (num == null || iHash != num.intValue()) {
                        uub uubVar = ge2Var.i().d;
                        linkedHashMap2.clear();
                        vc2Var2.g = Integer.valueOf(iHash);
                    }
                    ed2 ed2VarI = ge2Var.i();
                    qb5 qb5Var = vc2Var2.m;
                    qb5Var.getClass();
                    qb5Var.E = ge2Var;
                    qb5Var.F = oubVar;
                    vc2Var2.c(ed2VarI, qb5Var);
                    od1 od1VarC = sa1Var.c();
                    ArrayList arrayList2 = sa1Var.a;
                    if (od1VarC != null) {
                        od1VarC.n(ge2Var, oubVar);
                    }
                    od1 od1VarD = sa1Var.d();
                    if (od1VarD != null) {
                        od1VarD.n(ge2Var, oubVar);
                    }
                    od1 od1VarB = sa1Var.b();
                    if (od1VarB != null) {
                        od1VarB.n(ge2Var, oubVar);
                    }
                    od1 od1VarA = sa1Var.a();
                    if (od1VarA != null) {
                        od1VarA.n(ge2Var, oubVar);
                    }
                    d8a d8aVarE = x44.E();
                    d8aVarE.add(vc2Var2);
                    d8aVarE.addAll(arrayList2);
                    ieiVar = ieiVar2;
                    d8aVarE.addAll(linkedHashMap2.values());
                    d8a d8aVarV = x44.v(d8aVarE);
                    ListIterator listIterator = d8aVarV.listIterator(0);
                    while (true) {
                        c8a c8aVar = (c8a) listIterator;
                        if (c8aVar.hasNext()) {
                            ((be2) c8aVar.next()).a(ge2Var, sp0Var, oubVar, ge2Var.i());
                            sa1Var = sa1Var;
                        } else {
                            sa1 sa1Var2 = sa1Var;
                            if (ro8Var != null) {
                                ArrayList arrayList3 = ro8Var.d;
                                float fWidth = ge2Var.h().width();
                                arrayList = arrayList2;
                                ArrayList arrayList4 = ro8Var.e;
                                linkedHashMap = linkedHashMap2;
                                h80 h80Var = ro8Var.c;
                                h80Var.getClass();
                                griVar = griVar2;
                                ArrayList arrayList5 = (ArrayList) h80Var.G;
                                int iHashCode = ge2Var.i().d.a.hashCode();
                                vc2Var = vc2Var2;
                                Integer num2 = (Integer) h80Var.I;
                                if (num2 != null && iHashCode == num2.intValue()) {
                                    l45Var = l45Var2;
                                } else {
                                    ((ArrayList) h80Var.F).clear();
                                    l45Var = l45Var2;
                                    ((pz7) h80Var.E).invoke((x2a) h80Var.H, ge2Var.i().d);
                                    h80Var.I = Integer.valueOf(iHashCode);
                                }
                                if (arrayList5.isEmpty()) {
                                    fB2 = 0.0f;
                                } else {
                                    arrayList4.clear();
                                    arrayList4.add(new ArrayList());
                                    float fMax = Math.max(((w2a) w44.L0(arrayList5)).a(ge2Var, 8.0f, 8.0f, fWidth), ge2Var.b(8.0f));
                                    arrayList3.add(Float.valueOf(fMax));
                                    arrayList4.clear();
                                    arrayList4.add(new ArrayList());
                                    Iterator it = arrayList5.iterator();
                                    float fB3 = fWidth;
                                    int i2 = 0;
                                    while (it.hasNext()) {
                                        float f2 = fMax;
                                        w2a w2aVar = (w2a) it.next();
                                        w2aVar.getClass();
                                        Iterator it2 = it;
                                        fB3 -= ge2Var.b(16.0f) + (ge2Var.b(16.0f) + w2aVar.b(ge2Var, 8.0f, 8.0f, fWidth));
                                        if (fB3 >= MTTypesetterKt.kLineSkipLimitMultiplier || fB3 == fWidth) {
                                            ((List) arrayList4.get(i2)).add(w2aVar);
                                            fMax = f2;
                                        } else {
                                            i2++;
                                            float fB4 = (fWidth - (ge2Var.b(16.0f) + w2aVar.b(ge2Var, 8.0f, 8.0f, fWidth))) - ge2Var.b(16.0f);
                                            arrayList4.add(x44.a0(w2aVar));
                                            float fMax2 = Math.max(w2aVar.a(ge2Var, 8.0f, 8.0f, fWidth), ge2Var.b(8.0f));
                                            arrayList3.add(Float.valueOf(fMax2));
                                            fMax = f2 + fMax2;
                                            fB3 = fB4;
                                        }
                                        it = it2;
                                    }
                                    float fB5 = (ge2Var.b(8.0f) * (arrayList4.size() - 1)) + fMax;
                                    e59 e59Var = ro8Var.b;
                                    fB2 = ge2Var.b(e59Var.b + e59Var.d) + fB5;
                                }
                                fValueOf = Float.valueOf(fB2);
                            } else {
                                l45Var = l45Var2;
                                arrayList = arrayList2;
                                linkedHashMap = linkedHashMap2;
                                vc2Var = vc2Var2;
                                griVar = griVar2;
                                fValueOf = null;
                            }
                            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
                            float fHeight = (ge2Var.h().height() - (sp0Var.c + sp0Var.e)) - fFloatValue;
                            ListIterator listIterator2 = d8aVarV.listIterator(0);
                            while (true) {
                                c8a c8aVar2 = (c8a) listIterator2;
                                if (c8aVar2.hasNext()) {
                                    ((be2) c8aVar2.next()).b(ge2Var, sp0Var, fHeight, ge2Var.i());
                                } else {
                                    rectF2.set((ge2Var.g() ? sp0Var.b : sp0Var.d) + ge2Var.h().left, ge2Var.h().top + sp0Var.c, ge2Var.h().right - (ge2Var.g() ? sp0Var.d : sp0Var.b), (ge2Var.h().bottom - sp0Var.e) - fFloatValue);
                                    RectF rectFH = ge2Var.h();
                                    rectFH.getClass();
                                    od1 od1VarC2 = sa1Var2.c();
                                    if (od1VarC2 != null) {
                                        od1VarC2.c(Float.valueOf(ge2Var.g() ? rectFH.left : rectFH.right - sp0Var.b), Float.valueOf(rectF2.top), Float.valueOf(ge2Var.g() ? rectFH.left + sp0Var.b : rectFH.right), Float.valueOf(rectF2.bottom));
                                    }
                                    od1 od1VarD2 = sa1Var2.d();
                                    if (od1VarD2 != null) {
                                        od1VarD2.c(Float.valueOf(rectFH.left + (ge2Var.g() ? sp0Var.b : sp0Var.d)), Float.valueOf(rectFH.top), Float.valueOf(rectFH.right - (ge2Var.g() ? sp0Var.d : sp0Var.b)), Float.valueOf(rectFH.top + sp0Var.c));
                                    }
                                    od1 od1VarB2 = sa1Var2.b();
                                    if (od1VarB2 != null) {
                                        od1VarB2.c(Float.valueOf(ge2Var.g() ? rectFH.right - sp0Var.d : rectFH.left), Float.valueOf(rectF2.top), Float.valueOf(ge2Var.g() ? rectFH.right : rectFH.left + sp0Var.d), Float.valueOf(rectF2.bottom));
                                    }
                                    od1 od1VarA2 = sa1Var2.a();
                                    if (od1VarA2 != null) {
                                        od1VarA2.c(Float.valueOf(rectFH.left + (ge2Var.g() ? sp0Var.b : sp0Var.d)), Float.valueOf(rectF2.bottom), Float.valueOf(rectFH.right - (ge2Var.g() ? sp0Var.d : sp0Var.b)), Float.valueOf(rectF2.bottom + sp0Var.e));
                                    }
                                    od1 od1VarC3 = sa1Var2.c();
                                    if (od1VarC3 != null) {
                                        od1 od1VarD3 = sa1Var2.d();
                                        RectF rectF3 = od1VarD3 != null ? od1VarD3.k : null;
                                        od1 od1VarB3 = sa1Var2.b();
                                        RectF rectF4 = od1VarB3 != null ? od1VarB3.k : null;
                                        od1 od1VarA3 = sa1Var2.a();
                                        od1VarC3.l(rectF3, rectF4, od1VarA3 != null ? od1VarA3.k : null);
                                    }
                                    od1 od1VarD4 = sa1Var2.d();
                                    if (od1VarD4 != null) {
                                        od1 od1VarC4 = sa1Var2.c();
                                        RectF rectF5 = od1VarC4 != null ? od1VarC4.k : null;
                                        od1 od1VarB4 = sa1Var2.b();
                                        RectF rectF6 = od1VarB4 != null ? od1VarB4.k : null;
                                        od1 od1VarA4 = sa1Var2.a();
                                        od1VarD4.l(rectF5, rectF6, od1VarA4 != null ? od1VarA4.k : null);
                                    }
                                    od1 od1VarB5 = sa1Var2.b();
                                    if (od1VarB5 != null) {
                                        od1 od1VarD5 = sa1Var2.d();
                                        RectF rectF7 = od1VarD5 != null ? od1VarD5.k : null;
                                        od1 od1VarC5 = sa1Var2.c();
                                        RectF rectF8 = od1VarC5 != null ? od1VarC5.k : null;
                                        od1 od1VarA5 = sa1Var2.a();
                                        od1VarB5.l(rectF7, rectF8, od1VarA5 != null ? od1VarA5.k : null);
                                    }
                                    od1 od1VarA6 = sa1Var2.a();
                                    if (od1VarA6 != null) {
                                        od1 od1VarD6 = sa1Var2.d();
                                        RectF rectF9 = od1VarD6 != null ? od1VarD6.k : null;
                                        od1 od1VarB6 = sa1Var2.b();
                                        RectF rectF10 = od1VarB6 != null ? od1VarB6.k : null;
                                        od1 od1VarC6 = sa1Var2.c();
                                        od1VarA6.l(rectF9, rectF10, od1VarC6 != null ? od1VarC6.k : null);
                                    }
                                    if (ro8Var != null) {
                                        ro8Var.c(Float.valueOf(ge2Var.h().left), Float.valueOf(rectF2.bottom + sp0Var.e), Float.valueOf(ge2Var.h().right), Float.valueOf(rectF2.bottom + sp0Var.e + fFloatValue));
                                    }
                                    if (!rectF2.isEmpty()) {
                                        duiVar.e.h();
                                        hsc hscVar = duiVar.e;
                                        hsc hscVar2 = duiVar.f;
                                        euiVar.getClass();
                                        lsc lscVar = euiVar.f;
                                        hsc hscVar3 = euiVar.e;
                                        fq3 fq3Var = new fq3(euiVar.b.a(ge2Var, oubVar, rectF2), euiVar.c.a(ge2Var, oubVar, rectF2));
                                        if (!fq3Var.equals((gq3) lscVar.getValue())) {
                                            lscVar.setValue(fq3Var);
                                            euiVar.a(hscVar3.h());
                                        }
                                        if (!euiVar.d) {
                                            euiVar.a(euiVar.a.a(ge2Var, oubVar, rectF2));
                                        }
                                        float fH = hscVar3.h();
                                        float f3 = oubVar.a * fH;
                                        float f4 = oubVar.b * fH;
                                        float f5 = fH * oubVar.c;
                                        float f6 = oubVar.d;
                                        float f7 = oubVar.e;
                                        oubVar.a = f3;
                                        oubVar.b = f4;
                                        oubVar.c = f5;
                                        oubVar.d = f6;
                                        oubVar.e = f7;
                                        duiVar.h = ge2Var;
                                        duiVar.i = oubVar;
                                        duiVar.j = rectF2;
                                        float fC = (((oubVar.d + oubVar.e) + oubVar.c(ge2Var)) - rectF2.width()) * ge2Var.j();
                                        if (!ge2Var.g() ? fC > MTTypesetterKt.kLineSkipLimitMultiplier : fC < MTTypesetterKt.kLineSkipLimitMultiplier) {
                                            fC = 0.0f;
                                        }
                                        float fCeil = (float) Math.ceil(fC);
                                        if (fCeil != hscVar2.h()) {
                                            hscVar2.i(fCeil);
                                            duiVar.b(hscVar.h());
                                        }
                                        if (!duiVar.g) {
                                            duiVar.b(duiVar.a.a(ge2Var, oubVar, rectF2, hscVar2.h()));
                                            duiVar.g = true;
                                        }
                                        int i3 = ed2Var.b;
                                        wn9[] wn9VarArr = dd2.a;
                                        wn9 wn9Var = wn9VarArr[0];
                                        griVar.getClass();
                                        wn9Var.getClass();
                                        gri griVar3 = griVar;
                                        if (i3 != ((Number) griVar3.a).intValue()) {
                                            r4 = 0;
                                            gb9.D(l45Var, null, null, new pb2(duiVar, ed2Var, ed2Var2, null, 1), 3);
                                            int i4 = ed2Var.b;
                                            wn9 wn9Var2 = wn9VarArr[0];
                                            Integer numValueOf = Integer.valueOf(i4);
                                            wn9Var2.getClass();
                                            griVar3.a = numValueOf;
                                        } else {
                                            r4 = 0;
                                        }
                                        yd2 yd2Var = new yd2(ge2Var, rectF2, canvasB, oubVar, hscVar.h(), hscVar3.h());
                                        vc2 vc2Var3 = vc2Var;
                                        TreeMap treeMap = vc2Var3.t;
                                        Canvas canvas = vc2Var3.i;
                                        List list = vc2Var3.c;
                                        Iterator it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            ((od1) it3.next()).e(yd2Var);
                                        }
                                        List list2 = list;
                                        Iterator it4 = list2.iterator();
                                        if (!it4.hasNext()) {
                                            Bitmap bitmapE = tuj.e(yd2Var, vc2.u, new Object[0]);
                                            canvas.setBitmap(bitmapE);
                                            Canvas canvas2 = yd2Var.c;
                                            yd2Var.c = canvas;
                                            ed2 ed2VarI2 = ge2Var.i();
                                            i49 i49Var = vc2Var3.l;
                                            i49Var.getClass();
                                            i49Var.F = yd2Var;
                                            vc2Var3.c(ed2VarI2, i49Var);
                                            canvas2.getClass();
                                            yd2Var.c = canvas2;
                                            Iterator it5 = linkedHashMap.entrySet().iterator();
                                            do {
                                                if (it5.hasNext()) {
                                                    Map.Entry entry = (Map.Entry) it5.next();
                                                    dDoubleValue = ((Number) entry.getKey()).doubleValue();
                                                    if (entry.getValue() != null) {
                                                        mr9.o();
                                                    }
                                                } else {
                                                    ge2Var.c();
                                                    yd2Var.c.drawBitmap(bitmapE, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, r4);
                                                    Iterator it6 = arrayList.iterator();
                                                    while (it6.hasNext()) {
                                                        ((od1) it6.next()).d(yd2Var);
                                                    }
                                                    Iterator it7 = list2.iterator();
                                                    if (it7.hasNext()) {
                                                        it7.next().getClass();
                                                        mr9.o();
                                                    } else {
                                                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                                            double dDoubleValue2 = ((Number) entry2.getKey()).doubleValue();
                                                            if (entry2.getValue() != null) {
                                                                mr9.o();
                                                            } else if (((List) treeMap.get(Double.valueOf(dDoubleValue2))) != null) {
                                                                throw r4;
                                                            }
                                                        }
                                                        ro8 ro8Var2 = vc2Var3.b;
                                                        if (ro8Var2 != null) {
                                                            RectF rectF11 = ro8Var2.f;
                                                            float f8 = rectF11.top;
                                                            e59 e59Var2 = ro8Var2.b;
                                                            float f9 = e59Var2.b;
                                                            float f10 = e59Var2.a;
                                                            ge2 ge2Var2 = yd2Var.a;
                                                            float fB6 = ge2Var2.b(f9) + f8;
                                                            float fB7 = ge2Var2.g() ? ge2Var2.b(f10) + rectF11.left : (rectF11.right - ge2Var2.b(f10)) - ge2Var2.b(8.0f);
                                                            float fWidth2 = rectF11.width();
                                                            float fB8 = fB6;
                                                            int i5 = 0;
                                                            ?? r42 = r4;
                                                            for (Object obj12 : ro8Var2.e) {
                                                                int i6 = i5 + 1;
                                                                if (i5 < 0) {
                                                                    ?? r22 = r42;
                                                                    x44.n0();
                                                                    throw r22;
                                                                }
                                                                List<w2a> list3 = (List) obj12;
                                                                ArrayList arrayList6 = ro8Var2.d;
                                                                float fFloatValue2 = ((Number) ((i5 < 0 || i5 >= arrayList6.size()) ? Float.valueOf(((w2a) w44.L0(list3)).a(yd2Var, 8.0f, 8.0f, fWidth2)) : arrayList6.get(i5))).floatValue();
                                                                float f11 = (fFloatValue2 / 2.0f) + fB8;
                                                                float fB9 = 0.0f;
                                                                ?? r43 = r42;
                                                                for (w2a w2aVar2 : list3) {
                                                                    ?? r222 = r43;
                                                                    yd2 yd2Var2 = yd2Var;
                                                                    w2aVar2.a.a(yd2Var2, fB7 + fB9, f11 - ge2Var2.b(4.0f), ge2Var2.b(8.0f) + fB7 + fB9, ge2Var2.b(4.0f) + f11);
                                                                    if (ge2Var2.g()) {
                                                                        f = 16.0f;
                                                                        fB = ge2Var2.b(16.0f);
                                                                    } else {
                                                                        f = 16.0f;
                                                                        fB = -ge2Var2.b(8.0f);
                                                                    }
                                                                    float f12 = fB9 + fB;
                                                                    wdh.a(w2aVar2.b, yd2Var2, w2aVar2.c, fB7 + f12, f11, x9d.G, y9d.F, (int) (rectF11.width() - ge2Var2.b(e59Var2.a() + f)), 0, MTTypesetterKt.kLineSkipLimitMultiplier, 384);
                                                                    fB9 = f12 + (ge2Var2.g() ? ge2Var2.b(16.0f) + w2aVar2.b(yd2Var2, 8.0f, 8.0f, fWidth2) : -(ge2Var2.b(8.0f) + ge2Var2.b(16.0f) + w2aVar2.b(yd2Var2, 8.0f, 8.0f, fWidth2)));
                                                                    yd2Var = yd2Var2;
                                                                    r43 = r222;
                                                                }
                                                                fB8 = ge2Var2.b(8.0f) + fFloatValue2 + fB8;
                                                                i5 = i6;
                                                                r42 = r43;
                                                            }
                                                        }
                                                        ge2Var.reset();
                                                    }
                                                }
                                            } while (((List) treeMap.get(Double.valueOf(dDoubleValue))) == null);
                                            throw r4;
                                        }
                                        it4.next().getClass();
                                        mr9.o();
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
                return ieiVar;
            case 1:
                String str = (String) obj11;
                nwb nwbVar = (nwb) obj10;
                nwb nwbVar2 = (nwb) obj9;
                o3f o3fVar = (o3f) obj8;
                Set set = (Set) obj7;
                nwb nwbVar3 = (nwb) obj6;
                hdc hdcVar = (hdc) obj5;
                String str2 = (String) obj4;
                Long l = (Long) obj3;
                nwb nwbVar4 = (nwb) obj2;
                Context context = (Context) obj;
                context.getClass();
                gj7 gj7Var = new gj7(context);
                Set setF0 = sf5.f0("*");
                if (q7j.a("WEB_MESSAGE_LISTENER")) {
                    j7j.a(gj7Var, "_claude_bridge", setF0, new i49(gj7Var, nwbVar, nwbVar2));
                } else {
                    gj7Var.addJavascriptInterface(new vbc(gj7Var, nwbVar, nwbVar2), "_claude_bridge");
                }
                gj7Var.setWebViewClient(new ubc(o3fVar, nwbVar, nwbVar2, set, nwbVar3, hdcVar, str2, l, nwbVar4));
                gj7Var.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
                return gj7Var;
            default:
                e8h e8hVar = (e8h) obj11;
                List list4 = (List) obj9;
                wlg wlgVar = (wlg) obj7;
                nwb nwbVar5 = (nwb) obj5;
                wlg wlgVar2 = (wlg) obj4;
                nwb nwbVar6 = (nwb) obj3;
                nwb nwbVar7 = (nwb) obj2;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                int i7 = 2;
                j0a.V(j0aVar, "meta", null, new ta4(-1476649116, true, new u3e((TaskResponse) obj10, 11, e8hVar)), 2);
                j0a.V(j0aVar, "header", null, new ta4(1199182349, true, new h9a(list4, (nwb) obj8, wlgVar, (wlg) obj6, 10)), 2);
                if (x44.r((z7h) e8hVar.d.getValue(), x7h.a)) {
                    j0a.V(j0aVar, "loading", null, vuk.b, 2);
                }
                if (!((Boolean) nwbVar5.getValue()).booleanValue() && !((List) wlgVar2.getValue()).isEmpty()) {
                    j0a.V(j0aVar, "mcp-summary", null, new ta4(-1327082030, true, new u3e(nwbVar6, 12, wlgVar2)), 2);
                }
                mva mvaVarD0 = w44.D0((List) wlgVar.getValue());
                j0aVar.W(mvaVarD0.size(), new zkd(new x2h(6), 13, mvaVarD0), new u3a(21, mvaVarD0), new ta4(802480018, true, new fr0(mvaVarD0, 7, nwbVar7)));
                j0a.V(j0aVar, "noise-footer", null, new ta4(-756964564, true, new t56(list4, nwbVar5, i7)), 2);
                return ieiVar2;
        }
    }

    public /* synthetic */ ad2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, wlg wlgVar, Object obj6, Object obj7, Object obj8, nwb nwbVar, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
        this.K = wlgVar;
        this.L = obj6;
        this.M = obj7;
        this.N = obj8;
        this.O = nwbVar;
    }
}

package defpackage;

import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pug extends qw5 implements pu9, vd6, p6i, oe4, lbc, ne4 {
    public lug U;
    public eug V;
    public jne X;
    public w1c Y;
    public ja8 Z;
    public p3f a0;
    public qwb c0;
    public w79 d0;
    public tz9 e0;
    public long f0;
    public fu9 g0;
    public e0g h0;
    public knk i0;
    public tzf[] j0;
    public InnerShadowPainter[] k0;
    public tzf[] l0;
    public DropShadowPainter[] m0;
    public fkg n0;
    public qvb o0;
    public jne p0;
    public boolean q0;
    public jne W = new jne();
    public final h80 b0 = new h80();

    public pug(qwb qwbVar, eug eugVar) {
        this.V = eugVar;
        this.c0 = qwbVar == null ? new qwb(null) : qwbVar;
        this.f0 = 9205357640488583168L;
    }

    public static jne u1(pug pugVar, int i) {
        jne jneVar = pugVar.W;
        w1c w1cVar = pugVar.Y;
        return (w1cVar == null || !w1cVar.e()) ? jneVar : w1cVar.j(i, yfd.W(pugVar).d0, jneVar, pugVar);
    }

    @Override // defpackage.lbc
    public final void F0() {
        v1(false);
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        boolean z;
        jne jneVar;
        ib2 ib2Var;
        float f;
        DropShadowPainter[] dropShadowPainterArr;
        knk knkVarA;
        float f2;
        int i;
        InnerShadowPainter[] innerShadowPainterArr;
        h80 h80Var;
        bz7 l6Var;
        bz7 ju1Var;
        ib2 ib2Var2 = cv9Var.E;
        jne jneVarU1 = u1(this, 2);
        long j = jneVarU1.i0;
        jy1 jy1Var = jneVarU1.j0;
        long j2 = jneVarU1.k0;
        jy1 jy1Var2 = jneVarU1.l0;
        long j3 = jneVarU1.g0;
        jy1 jy1Var3 = jneVarU1.h0;
        float f3 = jneVarU1.T;
        float f4 = f3 / 2.0f;
        e0g e0gVar = jneVarU1.m0;
        boolean z2 = f4 > MTTypesetterKt.kLineSkipLimitMultiplier;
        boolean z3 = (j == 16 && jy1Var == null) ? false : true;
        boolean z4 = (j2 == 16 && jy1Var2 == null) ? false : true;
        Object obj = jneVarU1.H0;
        if (obj == null) {
            ib2Var = ib2Var2;
            jneVar = jneVarU1;
            f = f3;
            z = z2;
        } else {
            z = z2;
            tzf[] tzfVarArr = this.l0;
            jneVar = jneVarU1;
            DropShadowPainter[] dropShadowPainterArr2 = this.m0;
            ib2Var = ib2Var2;
            boolean z5 = obj instanceof Object[];
            int length = z5 ? ((Object[]) obj).length : 1;
            f = f3;
            if (tzfVarArr == null || !x44.r(this.h0, e0gVar)) {
                tzf[] tzfVarArr2 = new tzf[length];
                for (int i2 = 0; i2 < length; i2++) {
                    tzfVarArr2[i2] = null;
                }
                this.l0 = tzfVarArr2;
                DropShadowPainter[] dropShadowPainterArr3 = new DropShadowPainter[length];
                for (int i3 = 0; i3 < length; i3++) {
                    dropShadowPainterArr3[i3] = null;
                }
                this.m0 = dropShadowPainterArr3;
            } else if (tzfVarArr.length != length) {
                this.l0 = (tzf[]) Arrays.copyOf(tzfVarArr, length);
                if (dropShadowPainterArr2 != null) {
                    dropShadowPainterArr = (DropShadowPainter[]) Arrays.copyOf(dropShadowPainterArr2, length);
                } else {
                    DropShadowPainter[] dropShadowPainterArr4 = new DropShadowPainter[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        dropShadowPainterArr4[i4] = null;
                    }
                    dropShadowPainterArr = dropShadowPainterArr4;
                }
                this.m0 = dropShadowPainterArr;
            }
            if (z5) {
                Object[] objArr = (Object[]) obj;
                int length2 = objArr.length;
                for (int i5 = 0; i5 < length2; i5++) {
                    Object obj2 = objArr[i5];
                    if (obj2 instanceof tzf) {
                        s1(cv9Var, i5, e0gVar, (tzf) obj2);
                    }
                }
            } else if (obj instanceof tzf) {
                s1(cv9Var, 0, e0gVar, (tzf) obj);
            }
        }
        long jG = ib2Var.g();
        if (k8g.b(this.f0, jG) && this.g0 == cv9Var.getLayoutDirection() && x44.r(this.h0, e0gVar)) {
            knkVarA = this.i0;
            knkVarA.getClass();
        } else {
            knkVarA = e0gVar.a(jG, cv9Var.getLayoutDirection(), cv9Var);
        }
        this.i0 = knkVarA;
        this.f0 = jG;
        this.g0 = cv9Var.getLayoutDirection();
        if (!z3) {
            f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
        } else if (jy1Var != null) {
            f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
            mpk.z(cv9Var, knkVarA, jy1Var, MTTypesetterKt.kLineSkipLimitMultiplier, 60);
        } else {
            f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
            mpk.A(cv9Var, knkVarA, j);
        }
        cv9Var.a();
        if (z4) {
            if (jy1Var2 != null) {
                mpk.z(cv9Var, knkVarA, jy1Var2, f2, 60);
            } else {
                mpk.A(cv9Var, knkVarA, j2);
            }
        }
        if (z) {
            jy1 eegVar = jy1Var3 == null ? new eeg(j3) : jy1Var3;
            mug mugVar = new mug(f);
            p3f p3fVar = this.a0;
            if (p3fVar == null) {
                p3fVar = new p3f(11, this);
                this.a0 = p3fVar;
            }
            final p3f p3fVar2 = p3fVar;
            final h80 h80Var2 = this.b0;
            h80Var2.F = mugVar;
            if (eegVar.equals((jy1) h80Var2.G) && x44.r(knkVarA, (knk) h80Var2.H) && ((bz7) h80Var2.I) != null) {
                h80Var = h80Var2;
                i = 1;
            } else {
                h80Var2.G = eegVar;
                h80Var2.H = knkVarA;
                if (knkVarA instanceof elc) {
                    final elc elcVar = (elc) knkVarA;
                    c40 c40Var = elcVar.k;
                    final l9e l9eVarE = c40Var.e();
                    float f5 = l9eVarE.b;
                    float f6 = l9eVarE.d;
                    float f7 = l9eVarE.a;
                    final float fMin = Math.min(Math.abs(l9eVarE.c - f7), Math.abs(f6 - f5));
                    c40 c40VarA = (c40) h80Var2.E;
                    if (c40VarA == null) {
                        c40VarA = f40.a();
                        h80Var2.E = c40VarA;
                    }
                    c40VarA.i();
                    c40.b(c40VarA, l9eVarE);
                    c40VarA.h(c40VarA, c40Var, 0);
                    final long jCeil = (((long) ((int) Math.ceil(r9 - f7))) << 32) | (((long) ((int) Math.ceil(f6 - f5))) & 4294967295L);
                    final jy1 jy1Var4 = eegVar;
                    final c40 c40Var2 = c40VarA;
                    l6Var = new bz7() { // from class: ku1
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj3) {
                            long j4 = jCeil;
                            final c40 c40Var3 = c40Var2;
                            xd6 xd6Var = (xd6) obj3;
                            mug mugVar2 = (mug) h80Var2.F;
                            mugVar2.getClass();
                            float fFloatValue = Float.valueOf(mugVar2.E).floatValue();
                            final float f8 = fFloatValue < MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : fFloatValue;
                            float f9 = 2.0f * f8;
                            float f10 = fMin;
                            final elc elcVar2 = elcVar;
                            final jy1 jy1Var5 = jy1Var4;
                            if (f9 > f10) {
                                xd6.Y0(xd6Var, elcVar2.k, jy1Var5, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 60);
                            } else {
                                ja8 ja8Var = (ja8) p3fVar2.a();
                                la8 la8Var = ja8Var.a;
                                if (la8Var.m() != 1) {
                                    la8Var.G(1);
                                }
                                final l9e l9eVar = l9eVarE;
                                float f11 = l9eVar.a;
                                float f12 = l9eVar.b;
                                ((efe) xd6Var.B0().E).G(f11, f12);
                                try {
                                    xd6Var.t(j4, new bz7() { // from class: hu1
                                        @Override // defpackage.bz7
                                        public final Object invoke(Object obj4) throws Throwable {
                                            xd6 xd6Var2;
                                            c40 c40Var4;
                                            ksg ksgVar;
                                            elc elcVar3 = elcVar2;
                                            jy1 jy1Var6 = jy1Var5;
                                            float f13 = f8;
                                            c40 c40Var5 = c40Var3;
                                            xd6 xd6Var3 = (xd6) obj4;
                                            l9e l9eVar2 = l9eVar;
                                            float f14 = -l9eVar2.a;
                                            float f15 = -l9eVar2.b;
                                            ((efe) xd6Var3.B0().E).G(f14, f15);
                                            try {
                                                c40Var4 = elcVar3.k;
                                                ksgVar = new ksg(f13 * 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30);
                                                xd6Var2 = xd6Var3;
                                            } catch (Throwable th) {
                                                th = th;
                                                xd6Var2 = xd6Var3;
                                            }
                                            try {
                                                xd6.Y0(xd6Var2, c40Var4, jy1Var6, MTTypesetterKt.kLineSkipLimitMultiplier, ksgVar, null, 0, 52);
                                                float fIntBitsToFloat = (Float.intBitsToFloat((int) (xd6Var2.g() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (xd6Var2.g() >> 32));
                                                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (xd6Var2.g() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (xd6Var2.g() & 4294967295L));
                                                long jP0 = xd6Var2.P0();
                                                fj0 fj0VarB0 = xd6Var2.B0();
                                                long jW = fj0VarB0.w();
                                                fj0VarB0.p().g();
                                                try {
                                                    ((efe) fj0VarB0.E).C(jP0, fIntBitsToFloat, fIntBitsToFloat2);
                                                    xd6.Y0(xd6Var2, c40Var5, jy1Var6, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 28);
                                                    ((efe) xd6Var2.B0().E).G(-f14, -f15);
                                                    return iei.a;
                                                } finally {
                                                    fj0VarB0.p().p();
                                                    fj0VarB0.N(jW);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                ((efe) xd6Var2.B0().E).G(-f14, -f15);
                                                throw th;
                                            }
                                        }
                                    }, ja8Var);
                                    csg.t(xd6Var, ja8Var);
                                } finally {
                                    ((efe) xd6Var.B0().E).G(-f11, -f12);
                                }
                            }
                            return iei.a;
                        }
                    };
                    h80Var = h80Var2;
                    i = 1;
                } else {
                    jy1 jy1Var5 = eegVar;
                    h80Var = h80Var2;
                    if (knkVarA instanceof glc) {
                        sve sveVar = ((glc) knkVarA).k;
                        if (gb9.A(sveVar)) {
                            i = 1;
                            ju1Var = new nf1(h80Var, sveVar, jy1Var5, i);
                        } else {
                            i = 1;
                            c40 c40VarA2 = (c40) h80Var.E;
                            if (c40VarA2 == null) {
                                c40VarA2 = f40.a();
                                h80Var.E = c40VarA2;
                            }
                            c40 c40Var3 = c40VarA2;
                            aae aaeVar = new aae();
                            aaeVar.E = Float.NaN;
                            ju1Var = new ju1(h80Var, sveVar, aaeVar, new dae(), c40Var3, jy1Var5, 0);
                        }
                        l6Var = ju1Var;
                    } else {
                        i = 1;
                        if (!(knkVarA instanceof flc)) {
                            mr9.b();
                            return;
                        }
                        l6Var = new l6(h80Var, ((flc) knkVarA).k, jy1Var5, 12);
                    }
                }
                h80Var.I = l6Var;
            }
            if (fcc.c(0L, 0L)) {
                bz7 bz7Var = (bz7) h80Var.I;
                bz7Var.getClass();
                bz7Var.invoke(cv9Var);
            } else {
                float fIntBitsToFloat = Float.intBitsToFloat(0);
                float fIntBitsToFloat2 = Float.intBitsToFloat(0);
                ib2 ib2Var3 = ib2Var;
                ((efe) ib2Var3.F.E).G(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    bz7 bz7Var2 = (bz7) h80Var.I;
                    bz7Var2.getClass();
                    bz7Var2.invoke(cv9Var);
                } finally {
                    ((efe) ib2Var3.F.E).G(-fIntBitsToFloat, -fIntBitsToFloat2);
                }
            }
        } else {
            i = 1;
        }
        jne jneVar2 = jneVar;
        Object obj3 = jneVar2.I0;
        if (obj3 != null) {
            e0g e0gVar2 = jneVar2.m0;
            tzf[] tzfVarArr3 = this.j0;
            InnerShadowPainter[] innerShadowPainterArr2 = this.k0;
            boolean z6 = obj3 instanceof Object[];
            int length3 = z6 ? ((Object[]) obj3).length : i;
            if (tzfVarArr3 == null || !x44.r(this.h0, e0gVar2)) {
                tzf[] tzfVarArr4 = new tzf[length3];
                for (int i6 = 0; i6 < length3; i6++) {
                    tzfVarArr4[i6] = null;
                }
                this.j0 = tzfVarArr4;
                InnerShadowPainter[] innerShadowPainterArr3 = new InnerShadowPainter[length3];
                for (int i7 = 0; i7 < length3; i7++) {
                    innerShadowPainterArr3[i7] = null;
                }
                this.k0 = innerShadowPainterArr3;
            } else if (tzfVarArr3.length != length3) {
                this.j0 = (tzf[]) Arrays.copyOf(tzfVarArr3, length3);
                if (innerShadowPainterArr2 != null) {
                    innerShadowPainterArr = (InnerShadowPainter[]) Arrays.copyOf(innerShadowPainterArr2, length3);
                } else {
                    innerShadowPainterArr = new InnerShadowPainter[length3];
                    for (int i8 = 0; i8 < length3; i8++) {
                        innerShadowPainterArr[i8] = null;
                    }
                }
                this.k0 = innerShadowPainterArr;
            }
            if (z6) {
                Object[] objArr2 = (Object[]) obj3;
                int length4 = objArr2.length;
                for (int i9 = 0; i9 < length4; i9++) {
                    Object obj4 = objArr2[i9];
                    if (obj4 instanceof tzf) {
                        t1(cv9Var, i9, e0gVar2, (tzf) obj4);
                    }
                }
            } else if (obj3 instanceof tzf) {
                t1(cv9Var, 0, e0gVar2, (tzf) obj3);
            }
        }
        this.h0 = e0gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    @Override // defpackage.pu9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p5b b(defpackage.q5b r14, defpackage.h5b r15, final long r16) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pug.b(q5b, h5b, long):p5b");
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void i1() {
        ja8 ja8Var = this.Z;
        if (ja8Var != null) {
            yfd.X(this).getGraphicsContext().a(ja8Var);
            this.Z = null;
        }
        this.a0 = null;
    }

    @Override // defpackage.p6i
    public final Object o() {
        return "StyleOuterNode";
    }

    public final void s1(cv9 cv9Var, int i, e0g e0gVar, tzf tzfVar) {
        tzf[] tzfVarArr = this.l0;
        tzf tzfVar2 = tzfVarArr != null ? (tzf) mp0.I0(i, tzfVarArr) : null;
        DropShadowPainter[] dropShadowPainterArr = this.m0;
        DropShadowPainter dropShadowPainter = dropShadowPainterArr != null ? (DropShadowPainter) mp0.I0(i, dropShadowPainterArr) : null;
        if (!x44.r(tzfVar2, tzfVar) || dropShadowPainter == null) {
            xv8 xv8VarB = yfd.X(this).getGraphicsContext().b();
            xv8VarB.getClass();
            dropShadowPainter = new DropShadowPainter(e0gVar, tzfVar, xv8VarB);
        }
        DropShadowPainter dropShadowPainter2 = dropShadowPainter;
        tzf[] tzfVarArr2 = this.l0;
        if (tzfVarArr2 != null) {
            tzfVarArr2[i] = tzfVar;
        }
        DropShadowPainter[] dropShadowPainterArr2 = this.m0;
        if (dropShadowPainterArr2 != null) {
            dropShadowPainterArr2[i] = dropShadowPainter2;
        }
        bpc.h(dropShadowPainter2, cv9Var, cv9Var.E.g(), null, 6);
    }

    public final void t1(cv9 cv9Var, int i, e0g e0gVar, tzf tzfVar) {
        tzf[] tzfVarArr = this.j0;
        tzf tzfVar2 = tzfVarArr != null ? (tzf) mp0.I0(i, tzfVarArr) : null;
        InnerShadowPainter[] innerShadowPainterArr = this.k0;
        InnerShadowPainter innerShadowPainter = innerShadowPainterArr != null ? (InnerShadowPainter) mp0.I0(i, innerShadowPainterArr) : null;
        if (!x44.r(tzfVar2, tzfVar) || innerShadowPainter == null) {
            xv8 xv8VarB = yfd.X(this).getGraphicsContext().b();
            xv8VarB.getClass();
            innerShadowPainter = new InnerShadowPainter(e0gVar, tzfVar, xv8VarB);
        }
        InnerShadowPainter innerShadowPainter2 = innerShadowPainter;
        tzf[] tzfVarArr2 = this.j0;
        if (tzfVarArr2 != null) {
            tzfVarArr2[i] = tzfVar;
        }
        InnerShadowPainter[] innerShadowPainterArr2 = this.k0;
        if (innerShadowPainterArr2 != null) {
            innerShadowPainterArr2[i] = innerShadowPainter2;
        }
        bpc.h(innerShadowPainter2, cv9Var, cv9Var.E.g(), null, 6);
    }

    @Override // defpackage.ne4
    public final Object u0(fvd fvdVar) {
        return yb5.o(this, fvdVar);
    }

    public final void v1(final boolean z) {
        jne jneVar;
        if (this.R) {
            tp4 tp4Var = null;
            final jne jneVar2 = z ? null : this.W;
            if (z) {
                jneVar = this.W;
            } else {
                if (this.X == null) {
                    this.X = new jne();
                }
                jneVar = this.X;
                jneVar.getClass();
            }
            final jne jneVar3 = jneVar;
            final cz5 cz5Var = yfd.W(this).d0;
            jneVar3.getClass();
            kne.a.e(jneVar3);
            w1c w1cVar = this.Y;
            if (w1cVar != null) {
                w1cVar.g();
            }
            final bae baeVar = new bae();
            d4c.a0(this, new zy7() { // from class: oug
                @Override // defpackage.zy7
                public final Object a() {
                    pug pugVar = this;
                    eug eugVar = pugVar.V;
                    jne jneVar4 = jneVar3;
                    cz5 cz5Var2 = cz5Var;
                    jneVar4.n(eugVar, pugVar, cz5Var2, false);
                    pugVar.W = jneVar4;
                    pugVar.X = jneVar2;
                    w1c w1cVar2 = pugVar.Y;
                    baeVar.E = w1cVar2 != null ? w1cVar2.f(pugVar, cz5Var2, !z) : 0;
                    return iei.a;
                }
            });
            int iF = baeVar.E | (jneVar2 != null ? jneVar2.f(jneVar3, -1) : jneVar3.H);
            if (!x44.r(this.c0.a, this.d0)) {
                fkg fkgVar = this.n0;
                if (fkgVar != null) {
                    fkgVar.d(null);
                }
                w79 w79Var = this.c0.a;
                this.d0 = w79Var;
                if (w79Var != null) {
                    this.n0 = gb9.D(d1(), null, null, new rrb(this, w79Var, tp4Var, 13), 3);
                }
            }
            if (z) {
                return;
            }
            if ((iF & 1) != 0) {
                lug lugVar = this.U;
                if (lugVar == null) {
                    sz6.j("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                yfd.W(lugVar).T();
            }
            if ((iF & 8) != 0) {
                yfd.W(this).T();
            }
            if ((iF & 2) != 0) {
                lug lugVar2 = this.U;
                if (lugVar2 == null) {
                    sz6.j("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                yfd.U(lugVar2, 2).o1();
            }
            if ((iF & 4) != 0) {
                tz9 tz9Var = this.e0;
                if (tz9Var == null) {
                    tz9Var = new tz9(29, this);
                    this.e0 = tz9Var;
                }
                dgj.V(this, tz9Var);
            }
            if ((iF & 32) != 0) {
                this.q0 = true;
                if (this.E.R) {
                    yfd.W(this).S();
                }
            }
            if ((iF & 64) != 0) {
                this.q0 = true;
                if (this.E.R) {
                    yfd.W(this).P(true);
                }
            }
        }
    }
}

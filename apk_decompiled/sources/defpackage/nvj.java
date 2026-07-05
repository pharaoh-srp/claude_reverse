package defpackage;

import android.os.Build;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nvj {
    public static final ta4 a = new ta4(-966998759, false, new ua4(11));
    public static final byte[] b = {48, 49, 53, 0};
    public static final byte[] c = {48, 49, 48, 0};
    public static final byte[] d = {48, 48, 57, 0};
    public static final byte[] e = {48, 48, 53, 0};
    public static final byte[] f = {48, 48, 49, 0};
    public static final byte[] g = {48, 48, 49, 0};
    public static final byte[] h = {48, 48, 50, 0};

    public static final j8g a(int i, int i2) {
        q46.a(i);
        q46 q46Var = new q46(i);
        q46.a(i2);
        return new j8g(q46Var, new q46(i2));
    }

    public static final void b(fnf fnfVar, z7d z7dVar) {
        c(fnfVar, z7dVar, 0L);
    }

    public static final void c(fnf fnfVar, z7d z7dVar, long j) {
        qv5 qv5Var = (qv5) fnfVar.F;
        qv5Var.getClass();
        ssi ssiVar = qv5Var.b;
        ssi ssiVar2 = qv5Var.a;
        boolean zH = hvj.h(z7dVar);
        long j2 = z7dVar.b;
        if (zH) {
            dg5[] dg5VarArr = ssiVar2.d;
            mp0.z0(0, dg5VarArr.length, null, dg5VarArr);
            ssiVar2.e = 0;
            dg5[] dg5VarArr2 = ssiVar.d;
            mp0.z0(0, dg5VarArr2.length, null, dg5VarArr2);
            ssiVar.e = 0;
            qv5Var.c = 0L;
        }
        if (!hvj.j(z7dVar)) {
            List listC = z7dVar.c();
            int i = 0;
            for (int size = listC.size(); i < size; size = size) {
                zm8 zm8Var = (zm8) listC.get(i);
                qv5Var.a(zm8Var.a, fcc.i(zm8Var.e, j));
                i++;
            }
            qv5Var.a(j2, fcc.i(z7dVar.n, j));
        }
        if (hvj.j(z7dVar) && j2 - qv5Var.c > 40) {
            dg5[] dg5VarArr3 = ssiVar2.d;
            mp0.z0(0, dg5VarArr3.length, null, dg5VarArr3);
            ssiVar2.e = 0;
            dg5[] dg5VarArr4 = ssiVar.d;
            mp0.z0(0, dg5VarArr4.length, null, dg5VarArr4);
            ssiVar.e = 0;
            qv5Var.c = 0L;
        }
        qv5Var.c = j2;
    }

    public static final float d(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
        for (int i = 0; i < length; i++) {
            f2 += fArr[i] * fArr2[i];
        }
        return f2;
    }

    public static final void e(j0a j0aVar, final eed eedVar, final int i, final pz7 pz7Var, List list, bz7 bz7Var, final float f2, ta4 ta4Var) {
        j0aVar.U("expandable_list_preview", "expandable_list_preview", new ta4(-1940686826, true, new rz7() { // from class: p72
            @Override // defpackage.rz7
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fqb fqbVar = fqb.E;
                    iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), f2, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var, z80Var, q64VarA);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var, z80Var2, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var, z80Var4, iqbVarE);
                    tjh.b(d4c.j0(R.string.calendar_requested_changes, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
                    kxk.g(e18Var, b.e(fqbVar, 8.0f));
                    iqb iqbVarN = gb9.N(idi.i(yfd.p(b.c(fqbVar, 1.0f), gm3.a(e18Var).p, xve.c(6.0f, 6.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier)), gm3.a(e18Var).u, true, false), 16.0f, 16.0f, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 8);
                    cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
                    int iHashCode2 = Long.hashCode(e18Var.T);
                    hyc hycVarL2 = e18Var.l();
                    iqb iqbVarE2 = kxk.E(e18Var, iqbVarN);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, cxeVarA);
                    d4c.i0(e18Var, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE2);
                    cv8.b(u00.D(i, 0, e18Var), null, b.o(fqbVar, 24.0f), 0L, e18Var, 440, 8);
                    kxk.g(e18Var, b.t(fqbVar, 8.0f));
                    tjh.b((String) pz7Var.invoke(e18Var, 0), new hw9(1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262140);
                    eed eedVar2 = eedVar;
                    boolean zF = e18Var.f(eedVar2);
                    Object objN = e18Var.N();
                    if (zF || objN == jd4.a) {
                        objN = new d7(15, eedVar2);
                        e18Var.k0(objN);
                    }
                    ez1.e((zy7) objN, null, false, null, null, fd9.q0(891852446, new fp(17, eedVar2), e18Var), e18Var, 1572864, 62);
                    e18Var.p(true);
                    e18Var.p(true);
                } else {
                    e18Var.T();
                }
                return iei.a;
            }
        }));
        j0aVar.W(list.size(), null, new s72(0, bz7Var, list), new ta4(802480018, true, new t72(list, eedVar, f2, ta4Var)));
        j0aVar.U("expandable_list_bottom_border", "expandable_list_bottom_border", new ta4(-999755009, true, new q72(0, f2)));
    }

    public static Set f() {
        return Build.VERSION.SDK_INT >= 34 ? nl6.a() : lvj.i();
    }

    public static final m5c g(d8d d8dVar) {
        return yfd.U(d8dVar, 16);
    }

    public static final int h(p0a p0aVar) {
        return (int) (p0aVar.p == ukc.E ? p0aVar.g() & 4294967295L : p0aVar.g() >> 32);
    }

    public static final boolean i(j8g j8gVar) {
        return x44.r(j8gVar, j8g.c);
    }

    public static final void j(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            b39.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fD = d(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fD);
                }
            }
            float fSqrt = (float) Math.sqrt(d(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f2 = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f2;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? MTTypesetterKt.kLineSkipLimitMultiplier : d(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fD2 = d(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fD2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fD2 / fArr11[i14];
        }
    }
}

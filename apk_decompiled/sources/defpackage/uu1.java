package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public final class uu1 {
    public static final uu1 a = new uu1();
    public static final float b = 640.0f;
    public static final float c = 56.0f;
    public static final float d = 125.0f;
    public static final float e = 125.0f;

    public final void a(iqb iqbVar, float f, float f2, e0g e0gVar, long j, ld4 ld4Var, final int i) {
        e18 e18Var;
        final iqb iqbVar2;
        final float f3;
        final float f4;
        final e0g e0gVar2;
        final long j2;
        e0g e0gVar3;
        long jD;
        final float f5;
        final float f6;
        iqb iqbVar3;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1364277227);
        int i2 = i | 9654;
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                float f7 = zh4.p;
                float f8 = zh4.o;
                e0gVar3 = ((gwa) e18Var2.j(jwa.a)).c.e;
                jD = p54.d(zh4.n, e18Var2);
                f5 = f8;
                f6 = f7;
                iqbVar3 = fqb.E;
            } else {
                e18Var2.T();
                iqbVar3 = iqbVar;
                f6 = f;
                f5 = f2;
                e0gVar3 = e0gVar;
                jD = j;
            }
            e18Var2.q();
            String strE = dch.E(R.string.m3c_bottom_sheet_drag_handle_description, e18Var2);
            iqb iqbVarL = gb9.L(iqbVar3, MTTypesetterKt.kLineSkipLimitMultiplier, q4g.a, 1);
            boolean zF = e18Var2.f(strE);
            Object objN = e18Var2.N();
            if (zF || objN == jd4.a) {
                objN = new o8(strE, 18);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            pzg.a(tjf.b(iqbVarL, false, (bz7) objN), e0gVar3, jD, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(-1039573072, new pz7() { // from class: su1
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var3 = (e18) ld4Var2;
                    if (e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        dw1.a(b.q(fqb.E, f6, f5), e18Var3, 0);
                    } else {
                        e18Var3.T();
                    }
                    return iei.a;
                }
            }, e18Var2), e18Var, 12582912, 120);
            f4 = f5;
            e0gVar2 = e0gVar3;
            j2 = jD;
            f3 = f6;
            iqbVar2 = iqbVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            f3 = f;
            f4 = f2;
            e0gVar2 = e0gVar;
            j2 = j;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(iqbVar2, f3, f4, e0gVar2, j2, i) { // from class: tu1
                public final /* synthetic */ iqb F;
                public final /* synthetic */ float G;
                public final /* synthetic */ float H;
                public final /* synthetic */ e0g I;
                public final /* synthetic */ long J;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(196609);
                    this.E.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }
}

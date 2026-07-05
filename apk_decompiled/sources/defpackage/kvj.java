package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kvj {
    public static final ta4 a = new ta4(-2114706107, false, new ua4(7));
    public static final ta4 b = new ta4(2851620, false, new ua4(8));
    public static final f7d c = new f7d(5);
    public static final qb4 d = new qb4(3);

    public static final void a(r7g r7gVar, boolean z, zy7 zy7Var, iqb iqbVar, e0g e0gVar, mnc mncVar, pl3 pl3Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        e0g e0gVar2;
        mnc mncVar2;
        e0g e0gVar3;
        int i3;
        int i4;
        iqb iqbVar3;
        mnc mncVar3;
        e0g e0gVar4;
        long j;
        int i5;
        long j2;
        View view;
        qu1 qu1VarA;
        r7gVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(473090695);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(r7gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i6 = i2 | 3072;
        if ((i & 24576) == 0) {
            i6 = i2 | 11264;
        }
        int i7 = 196608 | i6;
        if ((i & 1572864) == 0) {
            i7 |= (2097152 & i) == 0 ? e18Var.f(pl3Var) : e18Var.h(pl3Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i7 |= e18Var.h(ta4Var) ? 8388608 : 4194304;
        }
        boolean z2 = false;
        if (e18Var.Q(i7 & 1, (4793491 & i7) != 4793490)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                e0gVar3 = gm3.b(e18Var).r;
                i3 = 1572864;
                qnc qncVar = new qnc(12.0f, 4.0f, 12.0f, 4.0f);
                i4 = i7 & (-57345);
                iqbVar3 = fqb.E;
                mncVar3 = qncVar;
            } else {
                e18Var.T();
                e0gVar3 = e0gVar;
                i4 = i7 & (-57345);
                i3 = 1572864;
                iqbVar3 = iqbVar;
                mncVar3 = mncVar;
            }
            e18Var.q();
            View view2 = (View) e18Var.j(w00.f);
            if (z) {
                e18Var.a0(2057755563);
                e0gVar4 = e0gVar3;
                j = gm3.a(e18Var).o;
                e18Var.p(false);
            } else {
                e0gVar4 = e0gVar3;
                e18Var.a0(2057808914);
                e18Var.p(false);
                j = d54.g;
            }
            if (z) {
                e18Var.a0(2057888553);
                i5 = i4;
                j2 = gm3.a(e18Var).M;
                e18Var.p(false);
            } else {
                i5 = i4;
                e18Var.a0(2057944105);
                j2 = gm3.a(e18Var).O;
                e18Var.p(false);
            }
            if (z) {
                e18Var.a0(2058050156);
                view = view2;
                qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v);
                z2 = false;
                e18Var.p(false);
            } else {
                view = view2;
                e18Var.a0(2058134662);
                e18Var.p(false);
                int i8 = d54.i;
                qu1VarA = null;
            }
            iqb iqbVarA = b.a(r7gVar.a(iqbVar3, 1.0f, z2), 48.0f, 32.0f);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new z1g(6);
                e18Var.k0(objN);
            }
            iqb iqbVarB = tjf.b(iqbVarA, false, (bz7) objN);
            int i9 = i5;
            View view3 = view;
            boolean zH = ((i9 & 896) == 256) | ((((3670016 & i9) ^ i3) > 1048576 && e18Var.h(pl3Var)) || (i9 & i3) == 1048576) | e18Var.h(view3);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new uj1(zy7Var, pl3Var, view3);
                e18Var.k0(objN2);
            }
            iqb iqbVar4 = iqbVar3;
            e0g e0gVar5 = e0gVar4;
            pzg.b(z, (zy7) objN2, iqbVarB, false, e0gVar5, j, j2, MTTypesetterKt.kLineSkipLimitMultiplier, qu1VarA, null, fd9.q0(-590128207, new iv(z, mncVar3, ta4Var, 29), e18Var), e18Var, (i9 >> 3) & 14, 1416);
            iqbVar2 = iqbVar4;
            e0gVar2 = e0gVar5;
            mncVar2 = mncVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            e0gVar2 = e0gVar;
            mncVar2 = mncVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pq(r7gVar, z, zy7Var, iqbVar2, e0gVar2, mncVar2, pl3Var, ta4Var, i);
        }
    }

    public static final void b(iqb iqbVar, e0g e0gVar, long j, mnc mncVar, ta4 ta4Var, ld4 ld4Var, final int i) {
        ta4 ta4Var2;
        final long j2;
        final mnc mncVar2;
        long jB;
        mnc qncVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1006037033);
        int i2 = i | 3222;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                e0gVar = gm3.b(e18Var).s;
                jB = d54.b(0.07f, gm3.a(e18Var).t);
                qncVar = new qnc(2.0f, 2.0f, 2.0f, 2.0f);
                iqbVar = fqb.E;
            } else {
                e18Var.T();
                jB = j;
                qncVar = mncVar;
            }
            e18Var.q();
            wo1 wo1Var = lja.Q;
            iqb iqbVarI = gb9.I(ez1.t(yfd.p(tvk.f(iqbVar), jB, e0gVar), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).w, e0gVar), qncVar);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new r7g();
                e18Var.k0(objN);
            }
            ta4Var2 = ta4Var;
            ta4Var2.invoke((r7g) objN, e18Var, 54);
            e18Var.p(true);
            mncVar2 = qncVar;
            j2 = jB;
        } else {
            ta4Var2 = ta4Var;
            e18Var.T();
            j2 = j;
            mncVar2 = mncVar;
        }
        final iqb iqbVar2 = iqbVar;
        final e0g e0gVar2 = e0gVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final ta4 ta4Var3 = ta4Var2;
            r7eVarS.d = new pz7(e0gVar2, j2, mncVar2, ta4Var3, i) { // from class: q7g
                public final /* synthetic */ e0g F;
                public final /* synthetic */ long G;
                public final /* synthetic */ mnc H;
                public final /* synthetic */ ta4 I;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(24577);
                    kvj.b(this.E, this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static DateTimeFormatter c(String str, Locale locale, Map map) {
        String str2 = "P:" + str + locale.toLanguageTag();
        Object objWithDecimalStyle = map.get(str2);
        if (objWithDecimalStyle == null) {
            objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            map.put(str2, objWithDecimalStyle);
        }
        objWithDecimalStyle.getClass();
        return (DateTimeFormatter) objWithDecimalStyle;
    }

    public static final /* synthetic */ psi d(double d2) {
        ksi ksiVar = psi.G;
        return ksi.a(d2);
    }

    public static final boolean e(int i) {
        return (i & 1) != 0;
    }

    public static final int h(p0a p0aVar) {
        List list = p0aVar.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((q0a) list.get(i2)).q;
        }
        return (i / list.size()) + p0aVar.r;
    }

    public abstract void f(Throwable th);

    public abstract void g(c61 c61Var);
}

package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w49 {
    public static final long a = yb5.e(0.5f, 1.0f);

    public static final void a(final List list, final float f, final bz7 bz7Var, final zy7 zy7Var, iqb iqbVar, final bz7 bz7Var2, float f2, float f3, final ta4 ta4Var, ld4 ld4Var, final int i) {
        e18 e18Var;
        final iqb iqbVar2;
        final float f4;
        final float f5;
        list.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1821946471);
        int i2 = i | (e18Var2.f(list) ? 4 : 2) | (e18Var2.c(f) ? 32 : 16) | (e18Var2.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 14180352;
        if (e18Var2.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new swb(Boolean.FALSE);
                e18Var2.k0(objN);
            }
            swb swbVar = (swb) objN;
            swbVar.M0(Boolean.valueOf(true ^ list.isEmpty()));
            final float f6 = 240.0f;
            final float f7 = 8.0f;
            if (!((Boolean) swbVar.F.getValue()).booleanValue() && !((Boolean) swbVar.G.getValue()).booleanValue()) {
                r7e r7eVarS = e18Var2.s();
                if (r7eVarS != null) {
                    r7eVarS.d = new pz7(list, f, bz7Var, zy7Var, bz7Var2, f6, f7, ta4Var, i) { // from class: t49
                        public final /* synthetic */ List E;
                        public final /* synthetic */ float F;
                        public final /* synthetic */ bz7 G;
                        public final /* synthetic */ zy7 H;
                        public final /* synthetic */ bz7 I;
                        public final /* synthetic */ float J;
                        public final /* synthetic */ float K;
                        public final /* synthetic */ ta4 L;

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(100859905);
                            w49.a(this.E, this.F, this.G, this.H, fqb.E, this.I, this.J, this.K, this.L, (ld4) obj, iP0);
                            return iei.a;
                        }
                    };
                    return;
                }
                return;
            }
            int iM0 = ((cz5) e18Var2.j(ve4.h)).M0(8.0f);
            boolean zD = e18Var2.d(iM0);
            Object objN2 = e18Var2.N();
            if (zD || objN2 == lz1Var) {
                objN2 = new s(iM0);
                e18Var2.k0(objN2);
            }
            f4 = 240.0f;
            e18Var = e18Var2;
            u40.a((s) objN2, zy7Var, new v9d(false, 24), fd9.q0(1897518729, new yf0(swbVar, f, 240.0f, gm3.b(e18Var2).f, gm3.a(e18Var2), list, bz7Var2, bz7Var, ta4Var), e18Var2), e18Var, ((i2 >> 6) & 112) | 3456, 0);
            iqbVar2 = fqb.E;
            f5 = 8.0f;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            f4 = f2;
            f5 = f3;
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            r7eVarS2.d = new pz7(list, f, bz7Var, zy7Var, iqbVar2, bz7Var2, f4, f5, ta4Var, i) { // from class: u49
                public final /* synthetic */ List E;
                public final /* synthetic */ float F;
                public final /* synthetic */ bz7 G;
                public final /* synthetic */ zy7 H;
                public final /* synthetic */ iqb I;
                public final /* synthetic */ bz7 J;
                public final /* synthetic */ float K;
                public final /* synthetic */ float L;
                public final /* synthetic */ ta4 M;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(100859905);
                    w49.a(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }
}

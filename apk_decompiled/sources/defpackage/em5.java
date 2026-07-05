package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class em5 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;
    public final /* synthetic */ long G;
    public final /* synthetic */ qz7 H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ qz7 N;
    public final /* synthetic */ qz7 O;

    public /* synthetic */ em5(o72 o72Var, long j, b79 b79Var, iqb iqbVar, wl5 wl5Var, zy7 zy7Var, zy7 zy7Var2, bt7 bt7Var, bz7 bz7Var, xl5 xl5Var) {
        this.J = o72Var;
        this.G = j;
        this.K = b79Var;
        this.F = iqbVar;
        this.L = wl5Var;
        this.N = zy7Var;
        this.O = zy7Var2;
        this.M = bt7Var;
        this.H = bz7Var;
        this.I = xl5Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        qz7 qz7Var = this.H;
        Object obj4 = this.M;
        qz7 qz7Var2 = this.O;
        qz7 qz7Var3 = this.N;
        Object obj5 = this.L;
        Object obj6 = this.F;
        Object obj7 = this.K;
        Object obj8 = this.J;
        switch (i) {
            case 0:
                final o72 o72Var = (o72) obj8;
                final b79 b79Var = (b79) obj7;
                iqb iqbVar = (iqb) obj6;
                final wl5 wl5Var = (wl5) obj5;
                final zy7 zy7Var = (zy7) qz7Var3;
                final zy7 zy7Var2 = (zy7) qz7Var2;
                final bt7 bt7Var = (bt7) obj4;
                final bz7 bz7Var = (bz7) qz7Var;
                final xl5 xl5Var = (xl5) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    q62 q62VarD = o72Var.d();
                    final int i2 = o72Var.c(LocalDate.of(q62VarD.E, q62VarD.F, 1)).a;
                    final int i3 = o72Var.b(this.G).a;
                    lx9 lx9VarA = ox9.a(Math.max(0, (i3 - b79Var.E) - 3), 2, e18Var);
                    xa8 xa8Var = new xa8();
                    iqb iqbVarP = yfd.p(iqbVar, wl5Var.a, zni.b);
                    ho0 ho0Var = new ho0(cn5.b, true, new sz6(1));
                    boolean zH = e18Var.h(b79Var) | e18Var.h(o72Var) | e18Var.f(zy7Var) | e18Var.f(zy7Var2) | e18Var.d(i3) | e18Var.f(bt7Var) | e18Var.d(i2) | e18Var.f(bz7Var) | e18Var.f(xl5Var) | e18Var.f(wl5Var);
                    Object objN = e18Var.N();
                    if (zH || objN == jd4.a) {
                        bz7 bz7Var2 = new bz7() { // from class: gm5
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj9) {
                                int size;
                                yw9 yw9Var = (yw9) obj9;
                                final b79 b79Var2 = b79Var;
                                b79Var2.getClass();
                                if (!(b79Var2 instanceof Collection)) {
                                    Iterator it = b79Var2.iterator();
                                    int i4 = 0;
                                    do {
                                        a79 a79Var = (a79) it;
                                        if (a79Var.G) {
                                            a79Var.next();
                                            i4++;
                                        } else {
                                            size = i4;
                                        }
                                    } while (i4 >= 0);
                                    x44.m0();
                                    throw null;
                                }
                                size = ((Collection) b79Var2).size();
                                final o72 o72Var2 = o72Var;
                                final zy7 zy7Var3 = zy7Var;
                                final zy7 zy7Var4 = zy7Var2;
                                final int i5 = i3;
                                final bt7 bt7Var2 = bt7Var;
                                final int i6 = i2;
                                final bz7 bz7Var3 = bz7Var;
                                final xl5 xl5Var2 = xl5Var;
                                final wl5 wl5Var2 = wl5Var;
                                yw9Var.V(size, null, be5.L, new ta4(-1895584772, true, new sz7() { // from class: im5
                                    @Override // defpackage.sz7
                                    public final Object i(Object obj10, Object obj11, Object obj12, Object obj13) {
                                        int iIntValue2 = ((Integer) obj11).intValue();
                                        ld4 ld4Var2 = (ld4) obj12;
                                        int iIntValue3 = ((Integer) obj13).intValue();
                                        if ((iIntValue3 & 48) == 0) {
                                            iIntValue3 |= ((e18) ld4Var2).d(iIntValue2) ? 32 : 16;
                                        }
                                        e18 e18Var2 = (e18) ld4Var2;
                                        if (e18Var2.Q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                            int i7 = iIntValue2 + b79Var2.E;
                                            String strA = m72.a(i7, o72Var2.a);
                                            float f = gwk.z;
                                            float f2 = gwk.y;
                                            iqb iqbVarS = fqb.E;
                                            iqb iqbVarK = b.k(iqbVarS, f, f2);
                                            zy7 zy7Var5 = zy7Var3;
                                            boolean zF = e18Var2.f(zy7Var5);
                                            zy7 zy7Var6 = zy7Var4;
                                            boolean zF2 = zF | e18Var2.f(zy7Var6);
                                            Object objN2 = e18Var2.N();
                                            lz1 lz1Var = jd4.a;
                                            if (zF2 || objN2 == lz1Var) {
                                                objN2 = new z04(zy7Var5, 14, zy7Var6);
                                                e18Var2.k0(objN2);
                                            }
                                            iqb iqbVarM = dch.M(iqbVarK, (bz7) objN2);
                                            int i8 = i5;
                                            if (i7 == i8) {
                                                iqbVarS = iv1.s(iqbVarS, bt7Var2);
                                            }
                                            iqb iqbVarB = iqbVarM.B(iqbVarS);
                                            boolean z = i7 == i8;
                                            boolean z2 = i7 == i6;
                                            bz7 bz7Var4 = bz7Var3;
                                            boolean zF3 = e18Var2.f(bz7Var4) | e18Var2.d(i7);
                                            Object objN3 = e18Var2.N();
                                            if (zF3 || objN3 == lz1Var) {
                                                objN3 = new lm5(bz7Var4, i7, 0);
                                                e18Var2.k0(objN3);
                                            }
                                            xl5Var2.getClass();
                                            cn5.m(strA, iqbVarB, z, z2, (zy7) objN3, String.format(dch.E(R.string.m3c_date_picker_navigate_to_year_description, e18Var2), Arrays.copyOf(new Object[]{strA}, 1)), wl5Var2, e18Var2, 0);
                                        } else {
                                            e18Var2.T();
                                        }
                                        return iei.a;
                                    }
                                }));
                                return iei.a;
                            }
                        };
                        e18Var.k0(bz7Var2);
                        objN = bz7Var2;
                    }
                    yuj.a(xa8Var, iqbVarP, lx9VarA, null, ho0Var, ko0.f, null, false, null, (bz7) objN, e18Var, 1769472, 920);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                cn5.n((iqb) obj6, this.G, (bz7) qz7Var, (xl5) obj3, (o72) obj8, (b79) obj7, (wl5) obj5, (bt7) obj4, (zy7) qz7Var3, (zy7) qz7Var2, (ld4) obj, x44.p0(7));
                break;
            default:
                ((Integer) obj2).getClass();
                stj.f((r4g) obj8, this.G, (z4g) obj7, (a5g) obj6, (pz7) obj5, (pz7) qz7Var3, (pz7) qz7Var2, (pz7) obj4, (rz7) qz7Var, (ta4) obj3, (ld4) obj, x44.p0(9));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ em5(iqb iqbVar, long j, bz7 bz7Var, xl5 xl5Var, o72 o72Var, b79 b79Var, wl5 wl5Var, bt7 bt7Var, zy7 zy7Var, zy7 zy7Var2, int i) {
        this.F = iqbVar;
        this.G = j;
        this.H = bz7Var;
        this.I = xl5Var;
        this.J = o72Var;
        this.K = b79Var;
        this.L = wl5Var;
        this.M = bt7Var;
        this.N = zy7Var;
        this.O = zy7Var2;
    }

    public /* synthetic */ em5(r4g r4gVar, long j, z4g z4gVar, a5g a5gVar, pz7 pz7Var, pz7 pz7Var2, pz7 pz7Var3, pz7 pz7Var4, rz7 rz7Var, ta4 ta4Var, int i) {
        this.J = r4gVar;
        this.G = j;
        this.K = z4gVar;
        this.F = a5gVar;
        this.L = pz7Var;
        this.N = pz7Var2;
        this.O = pz7Var3;
        this.M = pz7Var4;
        this.H = rz7Var;
        this.I = ta4Var;
    }
}

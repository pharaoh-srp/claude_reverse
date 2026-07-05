package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class nc1 extends hqb implements pu9, vd6, ujf, d8d, mqb, nsc, yt9, r78, ds7, ys7, dt7, nmc, gz1 {
    public gqb S;
    public HashSet T;

    @Override // defpackage.pu9
    public final int A0(fma fmaVar, h5b h5bVar, int i) {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        return opk.i((mu9) gqbVar, fmaVar, h5bVar, i);
    }

    @Override // defpackage.d8d
    public final void C(t7d t7dVar, u7d u7dVar, long j) {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        ((g8d) ((c8d) gqbVar)).f().E(t7dVar, u7dVar);
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        ((e19) ((ud6) gqbVar)).c(cv9Var);
    }

    @Override // defpackage.ys7
    public final void K(us7 us7Var) {
        gqb gqbVar = this.S;
        b39.c("applyFocusProperties called on wrong node");
        ij0.x(gqbVar);
        throw null;
    }

    @Override // defpackage.ds7
    public final void N(ft7 ft7Var) {
        gqb gqbVar = this.S;
        b39.c("onFocusEvent called on wrong node");
        ij0.x(gqbVar);
        throw null;
    }

    @Override // defpackage.pu9
    public final int N0(fma fmaVar, h5b h5bVar, int i) {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        return opk.j((mu9) gqbVar, fmaVar, h5bVar, i);
    }

    @Override // defpackage.d8d
    public final void R() {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        ((g8d) ((c8d) gqbVar)).f().B();
    }

    @Override // defpackage.d8d
    public final boolean R0() {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        ((g8d) ((c8d) gqbVar)).f().getClass();
        return true;
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        qjf semanticsConfiguration = ((sjf) gqbVar).getSemanticsConfiguration();
        ekfVar.getClass();
        qjf qjfVar = (qjf) ekfVar;
        ewb ewbVar = qjfVar.E;
        if (semanticsConfiguration.G) {
            qjfVar.G = true;
        }
        if (semanticsConfiguration.H) {
            qjfVar.H = true;
        }
        ewb ewbVar2 = semanticsConfiguration.E;
        Object[] objArr = ewbVar2.b;
        Object[] objArr2 = ewbVar2.c;
        long[] jArr = ewbVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        dkf dkfVar = (dkf) obj;
                        if (!ewbVar.b(dkfVar)) {
                            ewbVar.m(dkfVar, obj2);
                        } else if (obj2 instanceof e5) {
                            Object objG = ewbVar.g(dkfVar);
                            objG.getClass();
                            e5 e5Var = (e5) objG;
                            String str = e5Var.a;
                            if (str == null) {
                                str = ((e5) obj2).a;
                            }
                            qz7 qz7Var = e5Var.b;
                            if (qz7Var == null) {
                                qz7Var = ((e5) obj2).b;
                            }
                            ewbVar.m(dkfVar, new e5(str, qz7Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.vd6
    public final void Y() {
        wd6.t0(this);
    }

    @Override // defpackage.d8d
    public final void Z() {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        ((g8d) ((c8d) gqbVar)).f().getClass();
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        return ((mu9) gqbVar).b(q5bVar, h5bVar, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [hqb] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [hqb] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.mqb
    public final Object b0(tk5 tk5Var) {
        g5c g5cVar;
        this.T.add(tk5Var);
        if (!this.E.R) {
            b39.c("visitAncestors called on an unattached node");
        }
        hqb hqbVar = this.E.I;
        av9 av9VarW = yfd.W(this);
        while (av9VarW != null) {
            if ((((hqb) av9VarW.k0.K).H & 32) != 0) {
                while (hqbVar != null) {
                    if ((hqbVar.G & 32) != 0) {
                        ?? J = hqbVar;
                        ?? wwbVar = 0;
                        while (J != 0) {
                            if (J instanceof mqb) {
                                mqb mqbVar = (mqb) J;
                                if (mqbVar.j0().q(tk5Var)) {
                                    return mqbVar.j0().x(tk5Var);
                                }
                            } else if ((J.G & 32) != 0 && (J instanceof qw5)) {
                                hqb hqbVar2 = ((qw5) J).T;
                                int i = 0;
                                J = J;
                                wwbVar = wwbVar;
                                while (hqbVar2 != null) {
                                    if ((hqbVar2.G & 32) != 0) {
                                        i++;
                                        wwbVar = wwbVar;
                                        if (i == 1) {
                                            J = hqbVar2;
                                        } else {
                                            if (wwbVar == 0) {
                                                wwbVar = new wwb(0, new hqb[16]);
                                            }
                                            if (J != 0) {
                                                wwbVar.b(J);
                                                J = 0;
                                            }
                                            wwbVar.b(hqbVar2);
                                        }
                                    }
                                    hqbVar2 = hqbVar2.J;
                                    J = J;
                                    wwbVar = wwbVar;
                                }
                                if (i == 1) {
                                }
                            }
                            J = yfd.j(wwbVar);
                        }
                    }
                    hqbVar = hqbVar.I;
                }
            }
            av9VarW = av9VarW.G();
            hqbVar = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
        }
        return ((zy7) tk5Var.F).a();
    }

    @Override // defpackage.yt9, defpackage.s5b
    public final void c(long j) {
    }

    @Override // defpackage.nsc
    public final Object d(cz5 cz5Var, Object obj) {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        return ((msc) gqbVar).d(cz5Var, obj);
    }

    @Override // defpackage.nw5
    public final void f() {
        if (this.S instanceof c8d) {
            R();
        }
    }

    @Override // defpackage.gz1
    public final long g() {
        return csg.T(yfd.U(this, FreeTypeConstants.FT_LOAD_PEDANTIC).G);
    }

    @Override // defpackage.gz1
    public final cz5 getDensity() {
        return yfd.W(this).d0;
    }

    @Override // defpackage.gz1
    public final fu9 getLayoutDirection() {
        return yfd.W(this).e0;
    }

    @Override // defpackage.pu9
    public final int h(fma fmaVar, h5b h5bVar, int i) {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        return opk.h((mu9) gqbVar, fmaVar, h5bVar, i);
    }

    @Override // defpackage.hqb
    public final void h1() {
        p1(true);
    }

    @Override // defpackage.hqb
    public final void i1() {
        if (!this.R) {
            b39.c("unInitializeModifier called on unattached node");
        }
        if ((this.G & 8) != 0) {
            ((AndroidComposeView) yfd.X(this)).B();
        }
    }

    @Override // defpackage.mqb
    public final kxk j0() {
        return om6.l;
    }

    @Override // defpackage.pu9
    public final int l0(fma fmaVar, h5b h5bVar, int i) {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        return opk.g((mu9) gqbVar, fmaVar, h5bVar, i);
    }

    @Override // defpackage.yt9
    public final void n(cu9 cu9Var) {
    }

    @Override // defpackage.r78
    public final void o0(m5c m5cVar) {
        gqb gqbVar = this.S;
        gqbVar.getClass();
        ((fhh) gqbVar).o0(m5cVar);
    }

    public final void p1(boolean z) {
        if (!this.R) {
            b39.c("initializeModifier called on unattached node");
        }
        gqb gqbVar = this.S;
        if ((this.G & 4) != 0 && !z) {
            yfd.U(this, 2).o1();
        }
        if ((this.G & 2) != 0) {
            j4h j4hVar = (j4h) yfd.W(this).k0.J;
            j4hVar.getClass();
            if (j4hVar.S) {
                m5c m5cVar = this.L;
                m5cVar.getClass();
                ((su9) m5cVar).K1(this);
                mmc mmcVar = m5cVar.r0;
                if (mmcVar != null) {
                    ((ma8) mmcVar).c();
                }
            }
            if (!z) {
                yfd.U(this, 2).o1();
                yfd.W(this).T();
            }
        }
        if (gqbVar instanceof iee) {
            ((iee) gqbVar).w(yfd.W(this));
        }
        if ((this.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 && (gqbVar instanceof fhh)) {
            j4h j4hVar2 = (j4h) yfd.W(this).k0.J;
            j4hVar2.getClass();
            if (j4hVar2.S) {
                yfd.W(this).T();
            }
        }
        if ((this.G & 16) != 0 && (gqbVar instanceof c8d)) {
            ((g8d) ((c8d) gqbVar)).f().G(this.L);
        }
        if ((this.G & 8) != 0) {
            ((AndroidComposeView) yfd.X(this)).B();
        }
    }

    public final String toString() {
        return this.S.toString();
    }

    @Override // defpackage.nmc
    public final boolean v() {
        return this.R;
    }
}

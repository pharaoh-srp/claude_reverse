package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iv9 implements gvg {
    public fu9 E = fu9.F;
    public float F;
    public float G;
    public final /* synthetic */ nv9 H;

    public iv9(nv9 nv9Var) {
        this.H = nv9Var;
    }

    @Override // defpackage.q5b
    public final p5b J0(int i, int i2, Map map, bz7 bz7Var, bz7 bz7Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            b39.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new hv9(i, i2, map, bz7Var, this, this.H, bz7Var2);
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.F;
    }

    @Override // defpackage.xa9
    public final fu9 getLayoutDirection() {
        return this.E;
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.G;
    }

    @Override // defpackage.xa9
    public final boolean n0() {
        av9 av9Var = this.H.E;
        return av9Var.w() == vu9.H || av9Var.w() == vu9.F;
    }

    @Override // defpackage.gvg
    public final List p(pz7 pz7Var, Object obj) {
        nv9 nv9Var = this.H;
        nv9Var.h();
        av9 av9Var = nv9Var.E;
        vu9 vu9VarW = av9Var.w();
        vu9 vu9Var = vu9.G;
        vu9 vu9Var2 = vu9.E;
        if (vu9VarW != vu9Var2 && vu9VarW != vu9Var && vu9VarW != vu9.F && vu9VarW != vu9.H) {
            b39.c("subcompose can only be used inside the measure or layout blocks");
        }
        ewb ewbVar = nv9Var.K;
        Object objG = ewbVar.g(obj);
        if (objG == null) {
            objG = (av9) nv9Var.N.k(obj);
            if (objG != null) {
                if (nv9Var.S <= 0) {
                    b39.c("Check failed.");
                }
                nv9Var.S--;
            } else {
                objG = nv9Var.o(obj);
                if (objG == null) {
                    int i = nv9Var.H;
                    av9 av9Var2 = new av9(2);
                    av9Var.V = true;
                    av9Var.O(i, av9Var2);
                    av9Var.V = false;
                    objG = av9Var2;
                }
            }
            ewbVar.m(obj, objG);
        }
        av9 av9Var3 = (av9) objG;
        if (w44.O0(nv9Var.H, av9Var.r()) != av9Var3) {
            int iK = ((vwb) av9Var.r()).E.k(av9Var3);
            if (iK < nv9Var.H) {
                b39.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = nv9Var.H;
            if (i2 != iK) {
                nv9Var.k(iK, i2);
            }
        }
        nv9Var.H++;
        nv9Var.n(av9Var3, obj, false, pz7Var);
        return (vu9VarW == vu9Var2 || vu9VarW == vu9Var) ? av9Var3.p() : av9Var3.o();
    }
}

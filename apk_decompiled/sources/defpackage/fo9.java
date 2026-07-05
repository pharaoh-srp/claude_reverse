package defpackage;

import java.lang.reflect.Array;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes.dex */
public final class fo9 implements eo9 {
    public static final /* synthetic */ wn9[] I;
    public final yr9 E;
    public final ece F;
    public final ece G;
    public final ece H;

    static {
        kce kceVar = jce.a;
        I = new wn9[]{kceVar.g(new mrd(kceVar.b(fo9.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), kceVar.g(new mrd(kceVar.b(fo9.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public fo9(yr9 yr9Var, zy7 zy7Var) {
        yr9Var.getClass();
        this.E = yr9Var;
        ece eceVar = zy7Var instanceof ece ? (ece) zy7Var : null;
        this.F = eceVar == null ? zy7Var != null ? csg.C(null, zy7Var) : null : eceVar;
        this.G = csg.C(null, new l4(24, this));
        this.H = csg.C(null, new mx1(this, zy7Var));
    }

    public final cm9 a(yr9 yr9Var) {
        yr9 yr9VarB;
        xh3 xh3VarA = yr9Var.O().a();
        if (xh3VarA instanceof qqb) {
            Class clsJ = vpi.j((qqb) xh3VarA);
            if (clsJ != null) {
                if (!clsJ.isArray()) {
                    if (fbi.e(yr9Var)) {
                        return new xl9(clsJ);
                    }
                    Class cls = (Class) yae.b.get(clsJ);
                    if (cls != null) {
                        clsJ = cls;
                    }
                    return new xl9(clsJ);
                }
                vai vaiVar = (vai) w44.g1(yr9Var.H());
                if (vaiVar == null || (yr9VarB = vaiVar.b()) == null) {
                    return new xl9(clsJ);
                }
                cm9 cm9VarA = a(yr9VarB);
                if (cm9VarA != null) {
                    return new xl9(Array.newInstance((Class<?>) ez1.I(kud.k(cm9VarA)), 0).getClass());
                }
                throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
            }
        } else {
            if (xh3VarA instanceof qai) {
                return new go9(null, (qai) xh3VarA);
            }
            if (xh3VarA instanceof q16) {
                throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    @Override // defpackage.eo9
    public final boolean e() {
        return this.E.b0();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fo9)) {
            return false;
        }
        fo9 fo9Var = (fo9) obj;
        return x44.r(this.E, fo9Var.E) && x44.r(h(), fo9Var.h()) && g().equals(fo9Var.g());
    }

    @Override // defpackage.eo9
    public final List g() {
        wn9 wn9Var = I[1];
        Object objA = this.H.a();
        objA.getClass();
        return (List) objA;
    }

    @Override // defpackage.eo9
    public final cm9 h() {
        wn9 wn9Var = I[0];
        return (cm9) this.G.a();
    }

    public final int hashCode() {
        int iHashCode = this.E.hashCode() * 31;
        cm9 cm9VarH = h();
        return g().hashCode() + ((iHashCode + (cm9VarH != null ? cm9VarH.hashCode() : 0)) * 31);
    }

    public final String toString() {
        g06 g06Var = pce.a;
        return pce.e(this.E);
    }
}

package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class oj9 implements yg3 {
    public static final vz8 d;
    public static final /* synthetic */ wn9[] e;
    public static final ww7 f;
    public static final sxb g;
    public static final gh3 h;
    public final uqb a;
    public final bz7 b;
    public final dfa c;

    static {
        kce kceVar = jce.a;
        e = new wn9[]{kceVar.g(new mrd(kceVar.b(oj9.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        d = new vz8(20);
        f = pkg.j;
        xw7 xw7Var = okg.c;
        sxb sxbVarF = xw7Var.f();
        sxbVarF.getClass();
        g = sxbVarF;
        h = gh3.j(xw7Var.g());
    }

    public oj9(gfa gfaVar, uqb uqbVar) {
        j06 j06Var = j06.X;
        this.a = uqbVar;
        this.b = j06Var;
        this.c = new dfa(gfaVar, new mx1(this, 6, gfaVar));
    }

    @Override // defpackage.yg3
    public final qqb a(gh3 gh3Var) {
        gh3Var.getClass();
        if (!gh3Var.equals(h)) {
            return null;
        }
        return (zg3) wd6.s0(this.c, e[0]);
    }

    @Override // defpackage.yg3
    public final Collection b(ww7 ww7Var) {
        ww7Var.getClass();
        if (!ww7Var.equals(f)) {
            return um6.E;
        }
        return sf5.f0((zg3) wd6.s0(this.c, e[0]));
    }

    @Override // defpackage.yg3
    public final boolean c(ww7 ww7Var, sxb sxbVar) {
        ww7Var.getClass();
        sxbVar.getClass();
        return sxbVar.equals(g) && ww7Var.equals(f);
    }
}

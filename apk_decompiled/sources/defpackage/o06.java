package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;

/* JADX INFO: loaded from: classes.dex */
public abstract class o06 {
    public static final /* synthetic */ int a = 0;

    static {
        sxb.e(ExperienceToggle.DEFAULT_PARAM_KEY);
    }

    public static final boolean a(eri eriVar) {
        Boolean boolF = ovk.f(x44.W(eriVar), pyk.J, n06.E);
        boolF.getClass();
        return boolF.booleanValue();
    }

    public static e92 b(e92 e92Var, bz7 bz7Var) {
        e92Var.getClass();
        return (e92) ovk.d(x44.W(e92Var), new cm4(), new gf5(bz7Var, new dae()));
    }

    public static final ww7 c(do5 do5Var) {
        do5Var.getClass();
        xw7 xw7VarG = m06.g(do5Var);
        xw7VarG.getClass();
        if (!xw7VarG.d()) {
            xw7VarG = null;
        }
        if (xw7VarG != null) {
            return xw7VarG.g();
        }
        return null;
    }

    public static final qqb d(jc0 jc0Var) {
        jc0Var.getClass();
        xh3 xh3VarA = jc0Var.getType().O().a();
        if (xh3VarA instanceof qqb) {
            return (qqb) xh3VarA;
        }
        return null;
    }

    public static final or9 e(bo5 bo5Var) {
        bo5Var.getClass();
        tqb tqbVarD = m06.d(bo5Var);
        tqbVarD.getClass();
        return tqbVarD.f();
    }

    public static final gh3 f(xh3 xh3Var) {
        bo5 bo5VarH;
        gh3 gh3VarF;
        if (xh3Var == null || (bo5VarH = xh3Var.h()) == null) {
            return null;
        }
        if (bo5VarH instanceof wmc) {
            return new gh3(((xmc) ((wmc) bo5VarH)).I, xh3Var.getName());
        }
        if (!(bo5VarH instanceof yh3) || (gh3VarF = f((xh3) bo5VarH)) == null) {
            return null;
        }
        return gh3VarF.d(xh3Var.getName());
    }

    public static final ww7 g(bo5 bo5Var) {
        bo5Var.getClass();
        ww7 ww7VarH = m06.h(bo5Var);
        return ww7VarH != null ? ww7VarH : m06.g(bo5Var.h()).b(bo5Var.getName()).g();
    }

    public static final void h(tqb tqbVar) {
        tqbVar.getClass();
        if (tqbVar.F(fs9.a) == null) {
            return;
        }
        mr9.o();
    }

    public static final e92 i(e92 e92Var) {
        e92Var.getClass();
        if (!(e92Var instanceof erd)) {
            return e92Var;
        }
        hrd hrdVarN0 = ((erd) e92Var).N0();
        hrdVarN0.getClass();
        return hrdVarN0;
    }
}

package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sx9 implements wc0 {
    public final el5 E;
    public final sd9 F;
    public final boolean G;
    public final efa H;

    public sx9(el5 el5Var, sd9 sd9Var, boolean z) {
        el5Var.getClass();
        sd9Var.getClass();
        this.E = el5Var;
        this.F = sd9Var;
        this.G = z;
        this.H = ((ke9) el5Var.E).a.c(new e0(21, this));
    }

    @Override // defpackage.wc0
    public final jc0 P(ww7 ww7Var) {
        jc0 jc0Var;
        ww7Var.getClass();
        sd9 sd9Var = this.F;
        zae zaeVarA = sd9Var.a(ww7Var);
        if (zaeVarA != null && (jc0Var = (jc0) this.H.invoke(zaeVarA)) != null) {
            return jc0Var;
        }
        sxb sxbVar = rd9.a;
        return rd9.a(ww7Var, sd9Var, this.E);
    }

    @Override // defpackage.wc0
    public final boolean isEmpty() {
        return this.F.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        sd9 sd9Var = this.F;
        l5i l5iVarB0 = bnf.b0(w44.E0(sd9Var.getAnnotations()), this.H);
        sxb sxbVar = rd9.a;
        return new al7(new bl7(bnf.X(mp0.m0(new ymf[]{l5iVarB0, new pp0(3, rd9.a(okg.m, sd9Var, this.E))})), false, new d6f(11)));
    }

    @Override // defpackage.wc0
    public final boolean x(ww7 ww7Var) {
        return bsk.d(this, ww7Var);
    }
}

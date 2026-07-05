package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v4g {
    public final boolean a;
    public final zy7 b;
    public final bz7 c;
    public final q28 d;
    public kl7 e;
    public kl7 f;

    public v4g(boolean z, zy7 zy7Var, b5g b5gVar, bz7 bz7Var) {
        this.a = z;
        this.b = zy7Var;
        this.c = bz7Var;
        if (z && b5gVar == b5g.G) {
            sz6.p("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        float f = q4g.a;
        this.d = new q28(b5gVar, null, null, bz7Var, 30);
        this.e = kxk.J();
        this.f = kxk.J();
    }

    public final Object a(b5g b5gVar, kl7 kl7Var, xzg xzgVar) {
        ry ryVar = (ry) this.d.F;
        Object objA = ryVar.a(b5gVar, zwb.E, new xx(ryVar, kl7Var, null), xzgVar);
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        if (objA != m45Var) {
            objA = ieiVar;
        }
        if (objA != m45Var) {
            objA = ieiVar;
        }
        return objA == m45Var ? objA : ieiVar;
    }

    public final Object b(xzg xzgVar) {
        Object objA;
        bz7 bz7Var = this.c;
        b5g b5gVar = b5g.F;
        return (((Boolean) bz7Var.invoke(b5gVar)).booleanValue() && (objA = a(b5gVar, this.e, xzgVar)) == m45.E) ? objA : iei.a;
    }

    public final b5g c() {
        return (b5g) this.d.p();
    }

    public final boolean d() {
        return ((ry) this.d.F).c().c(b5g.G);
    }

    public final Object e(xzg xzgVar) {
        Object objA;
        bz7 bz7Var = this.c;
        b5g b5gVar = b5g.E;
        return (((Boolean) bz7Var.invoke(b5gVar)).booleanValue() && (objA = a(b5gVar, this.f, xzgVar)) == m45.E) ? objA : iei.a;
    }

    public final boolean f() {
        return ((ry) this.d.F).g.getValue() != b5g.E;
    }

    public final Object g(xzg xzgVar) {
        Object objA;
        if (this.a) {
            sz6.j("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        bz7 bz7Var = this.c;
        b5g b5gVar = b5g.G;
        return (((Boolean) bz7Var.invoke(b5gVar)).booleanValue() && (objA = a(b5gVar, this.f, xzgVar)) == m45.E) ? objA : iei.a;
    }

    public final Object h(xzg xzgVar) {
        Object objA;
        b5g b5gVar = d() ? b5g.G : b5g.F;
        return (((Boolean) this.c.invoke(b5gVar)).booleanValue() && (objA = a(b5gVar, this.e, xzgVar)) == m45.E) ? objA : iei.a;
    }
}

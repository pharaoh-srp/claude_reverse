package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class an8 {
    public final cu9 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final qvb f = new qvb();
    public final w5c g = new w5c();
    public final evb h = new evb(10);

    public an8(cu9 cu9Var) {
        this.a = cu9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r19, java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an8.a(long, java.util.List, boolean):void");
    }

    public final boolean b(i99 i99Var, boolean z) {
        zka zkaVar = (zka) i99Var.F;
        cu9 cu9Var = this.a;
        w5c w5cVar = this.g;
        boolean zA = w5cVar.a(zkaVar, cu9Var, i99Var, z);
        wwb wwbVar = w5cVar.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = wwbVar.E;
        int i = wwbVar.G;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((d5c) objArr[i2]).e(i99Var, z) || z3;
        }
        Object[] objArr2 = wwbVar.E;
        int i3 = wwbVar.G;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((d5c) objArr2[i4]).d(i99Var) || z4;
        }
        w5cVar.b(i99Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            qvb qvbVar = this.f;
            int i5 = qvbVar.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((hqb) qvbVar.f(i6));
            }
            qvbVar.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            w5cVar.a.h();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        w5c w5cVar = this.g;
        wwb wwbVar = w5cVar.a;
        Object[] objArr = wwbVar.E;
        int i = wwbVar.G;
        for (int i2 = 0; i2 < i; i2++) {
            ((d5c) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            w5cVar.a.h();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(hqb hqbVar) {
        if (this.b) {
            this.e = true;
            this.f.a(hqbVar);
            return;
        }
        w5c w5cVar = this.g;
        qvb qvbVar = w5cVar.b;
        qvbVar.d();
        qvbVar.a(w5cVar);
        while (qvbVar.i()) {
            w5c w5cVar2 = (w5c) qvbVar.k(qvbVar.b - 1);
            int i = 0;
            while (true) {
                wwb wwbVar = w5cVar2.a;
                if (i < wwbVar.G) {
                    d5c d5cVar = (d5c) wwbVar.E[i];
                    if (x44.r(d5cVar.c, hqbVar)) {
                        w5cVar2.a.l(d5cVar);
                        d5cVar.c();
                    } else {
                        qvbVar.a(d5cVar);
                        i++;
                    }
                }
            }
        }
    }
}

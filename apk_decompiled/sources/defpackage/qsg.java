package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class qsg extends usg {
    public static final dke e = new dke(new ui2(7));
    public final boolean d;

    public qsg(av6 av6Var) {
        boolean z;
        super(av6Var);
        if (av6Var instanceof k74) {
            for (av6 av6Var2 : ((k74) av6Var).a) {
                if ((av6Var2 instanceof tsg) || (av6Var2 instanceof ssg)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.d = z;
    }

    @Override // defpackage.av6
    public final int a() {
        return this.a.a() * 10;
    }

    @Override // defpackage.usg, defpackage.av6
    public final boolean b(yj6 yj6Var, yj6 yj6Var2) {
        boolean z = this.d;
        av6 av6Var = this.a;
        if (z) {
            yj6 yj6Var3 = yj6Var2.E;
            for (yj6 yj6VarC0 = yj6Var3 != null ? yj6Var3.c0() : yj6Var2; yj6VarC0 != null; yj6VarC0 = yj6VarC0.y()) {
                if (yj6VarC0 != yj6Var2 && av6Var.b(yj6Var2, yj6VarC0)) {
                    return true;
                }
            }
        }
        dke dkeVar = e;
        r5c r5cVar = (r5c) dkeVar.z();
        if (r5cVar.J.isInstance(yj6Var2)) {
            r5cVar.F = yj6Var2;
        }
        r5cVar.G = yj6Var2;
        r5cVar.H = yj6Var2;
        r5cVar.E = yj6Var2;
        r5cVar.I = yj6Var2.G();
        while (r5cVar.hasNext()) {
            try {
                r5cVar.a();
                c5c c5cVar = r5cVar.F;
                if (c5cVar == null) {
                    throw new NoSuchElementException();
                }
                r5cVar.H = r5cVar.G;
                r5cVar.G = c5cVar;
                r5cVar.I = c5cVar.G();
                r5cVar.F = null;
                if (c5cVar != yj6Var2 && av6Var.d(yj6Var2, c5cVar)) {
                    return true;
                }
            } finally {
                dkeVar.D(r5cVar);
            }
        }
        dkeVar.D(r5cVar);
        return false;
    }

    @Override // defpackage.usg
    public final boolean g(yj6 yj6Var, c5c c5cVar) {
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}

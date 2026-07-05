package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qa9 implements u9i, v9i {
    public yr9 a;
    public final LinkedHashSet b;
    public final int c;

    public qa9(AbstractCollection abstractCollection) {
        abstractCollection.getClass();
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    @Override // defpackage.u9i
    public final xh3 a() {
        return null;
    }

    @Override // defpackage.u9i
    public final Collection b() {
        return this.b;
    }

    @Override // defpackage.u9i
    public final boolean c() {
        return false;
    }

    public final j7g e() {
        r9i.F.getClass();
        return yfd.e0(r9i.G, this, lm6.E, false, vkc.f("member scope for intersection type", this.b), new h4(19, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa9)) {
            return false;
        }
        return x44.r(this.b, ((qa9) obj).b);
    }

    @Override // defpackage.u9i
    public final or9 f() {
        or9 or9VarF = ((yr9) this.b.iterator().next()).O().f();
        or9VarF.getClass();
        return or9VarF;
    }

    public final String g(bz7 bz7Var) {
        bz7Var.getClass();
        return w44.S0(w44.i1(this.b, new pa9(0, bz7Var)), " & ", "{", "}", new fp6(2, bz7Var), 24);
    }

    @Override // defpackage.u9i
    public final List getParameters() {
        return lm6.E;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return g(f06.R);
    }
}

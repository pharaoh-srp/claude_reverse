package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m4 implements u9i {
    public int a;
    public final zea b;

    public m4(gfa gfaVar) {
        gfaVar.getClass();
        this.b = new zea(gfaVar, new l4(0, this), new e0(2, this));
    }

    public abstract Collection e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u9i) && obj.hashCode() == hashCode()) {
            u9i u9iVar = (u9i) obj;
            if (u9iVar.getParameters().size() == getParameters().size()) {
                xh3 xh3VarA = a();
                xh3 xh3VarA2 = u9iVar.a();
                if (xh3VarA2 == null || nu6.f(xh3VarA) || m06.o(xh3VarA) || nu6.f(xh3VarA2) || m06.o(xh3VarA2)) {
                    return false;
                }
                return j(xh3VarA2);
            }
        }
        return false;
    }

    public abstract yr9 g();

    public abstract zp3 h();

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        xh3 xh3VarA = a();
        int iIdentityHashCode = (nu6.f(xh3VarA) || m06.o(xh3VarA)) ? System.identityHashCode(this) : m06.g(xh3VarA).a.hashCode();
        this.a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // defpackage.u9i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final List b() {
        return ((k4) this.b.a()).b();
    }

    public abstract boolean j(xh3 xh3Var);

    public List k(List list) {
        return list;
    }
}

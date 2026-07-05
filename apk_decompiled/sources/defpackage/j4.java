package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j4 implements u9i {
    public final /* synthetic */ q16 a;

    public j4(q16 q16Var) {
        this.a = q16Var;
    }

    @Override // defpackage.u9i
    public final xh3 a() {
        return this.a;
    }

    @Override // defpackage.u9i
    public final Collection b() {
        Collection collectionB = this.a.P0().O().b();
        collectionB.getClass();
        return collectionB;
    }

    @Override // defpackage.u9i
    public final boolean c() {
        return true;
    }

    @Override // defpackage.u9i
    public final or9 f() {
        return o06.e(this.a);
    }

    @Override // defpackage.u9i
    public final List getParameters() {
        List list = this.a.T;
        if (list != null) {
            return list;
        }
        x44.o0("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.a.getName().b() + ']';
    }
}

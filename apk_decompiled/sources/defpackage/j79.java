package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class j79 implements u9i {
    public final Set a;
    public final u0h b;

    public j79(Set set) {
        r9i.F.getClass();
        r9i r9iVar = r9i.G;
        r9iVar.getClass();
        yfd.d0(nu6.a(2, true, "unknown integer literal type"), r9iVar, this, lm6.E, false);
        this.b = new u0h(new tnh(19, this));
        this.a = set;
    }

    @Override // defpackage.u9i
    public final xh3 a() {
        return null;
    }

    @Override // defpackage.u9i
    public final Collection b() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.u9i
    public final boolean c() {
        return false;
    }

    @Override // defpackage.u9i
    public final or9 f() {
        throw null;
    }

    @Override // defpackage.u9i
    public final List getParameters() {
        return lm6.E;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + w44.S0(this.a, ",", null, null, f06.Q, 30) + ']');
    }
}

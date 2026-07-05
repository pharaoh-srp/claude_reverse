package defpackage;

import androidx.health.platform.client.proto.UninitializedMessageException;
import androidx.health.platform.client.proto.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f28 implements Cloneable {
    public final n E;
    public n F;

    public f28(n nVar) {
        this.E = nVar;
        if (nVar.i()) {
            sz6.p("Default instance must be immutable.");
            throw null;
        }
        this.F = nVar.l();
    }

    public final n a() {
        boolean zI = this.F.i();
        n nVar = this.F;
        if (zI) {
            nVar.j();
            nVar = this.F;
        }
        nVar.getClass();
        if (n.h(nVar, true)) {
            return nVar;
        }
        throw new UninitializedMessageException();
    }

    public final void b() {
        if (this.F.i()) {
            return;
        }
        n nVarL = this.E.l();
        n nVar = this.F;
        oud oudVar = oud.c;
        oudVar.getClass();
        oudVar.a(nVarL.getClass()).a(nVarL, nVar);
        this.F = nVarL;
    }

    public final Object clone() {
        f28 f28Var = (f28) this.E.e(5);
        boolean zI = this.F.i();
        n nVar = this.F;
        if (zI) {
            nVar.j();
            nVar = this.F;
        }
        f28Var.F = nVar;
        return f28Var;
    }
}

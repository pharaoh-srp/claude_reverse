package defpackage;

import androidx.concurrent.futures.b;

/* JADX INFO: loaded from: classes.dex */
public final class n92 extends z3 {
    public final /* synthetic */ o92 L;

    public n92(o92 o92Var) {
        this.L = o92Var;
    }

    @Override // defpackage.z3
    public final String i() {
        b bVar = (b) this.L.E.get();
        if (bVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + bVar.a + "]";
    }
}

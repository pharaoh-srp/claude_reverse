package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e68 extends huk {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ f68 c;

    public e68(ArrayList arrayList, f68 f68Var) {
        this.b = arrayList;
        this.c = f68Var;
    }

    @Override // defpackage.huk
    public final void j(e92 e92Var) {
        e92Var.getClass();
        gmc.r(e92Var, null);
        this.b.add(e92Var);
    }

    @Override // defpackage.huk
    public final void l(e92 e92Var, e92 e92Var2) {
        e92Var2.getClass();
        throw new IllegalStateException(("Conflict in scope of " + this.c.b + ": " + e92Var + " vs " + e92Var2).toString());
    }
}

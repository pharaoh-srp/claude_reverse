package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xii implements a45 {
    public final xii E;
    public final bi5 F;

    public xii(xii xiiVar, bi5 bi5Var) {
        this.E = xiiVar;
        this.F = bi5Var;
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.c45
    public final /* bridge */ c45 S(b45 b45Var) {
        return nai.W(this, b45Var);
    }

    public final void a(vg5 vg5Var) {
        if (this.F == vg5Var) {
            sz6.j("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        xii xiiVar = this.E;
        if (xiiVar != null) {
            xiiVar.a(vg5Var);
        }
    }

    @Override // defpackage.a45
    public final b45 getKey() {
        return a5.O;
    }

    @Override // defpackage.c45
    public final /* bridge */ c45 r0(c45 c45Var) {
        return nai.Z(this, c45Var);
    }

    @Override // defpackage.c45
    public final /* bridge */ a45 x0(b45 b45Var) {
        return nai.C(this, b45Var);
    }
}

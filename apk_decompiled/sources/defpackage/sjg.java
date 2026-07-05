package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sjg implements tp4, n45 {
    public final nh2 E;
    public final c45 F;

    public sjg(nh2 nh2Var, c45 c45Var) {
        this.E = nh2Var;
        this.F = c45Var;
    }

    @Override // defpackage.n45
    public final n45 getCallerFrame() {
        return this.E;
    }

    @Override // defpackage.tp4
    public final c45 getContext() {
        return this.F;
    }

    @Override // defpackage.tp4
    public final void resumeWith(Object obj) {
        this.E.resumeWith(obj);
    }
}

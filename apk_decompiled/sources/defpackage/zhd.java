package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zhd implements nwb, l45 {
    public final /* synthetic */ nwb E;
    public final c45 F;

    public zhd(nwb nwbVar, c45 c45Var) {
        this.E = nwbVar;
        this.F = c45Var;
    }

    @Override // defpackage.l45
    public final c45 getCoroutineContext() {
        return this.F;
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        return this.E.getValue();
    }

    @Override // defpackage.nwb
    public final void setValue(Object obj) {
        this.E.setValue(obj);
    }
}

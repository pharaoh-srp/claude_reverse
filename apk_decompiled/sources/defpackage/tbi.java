package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tbi implements ubi {
    public final Object E;
    public final boolean F;

    public tbi(Object obj, boolean z) {
        this.E = obj;
        this.F = z;
    }

    @Override // defpackage.ubi
    public final boolean b() {
        return this.F;
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        return this.E;
    }
}

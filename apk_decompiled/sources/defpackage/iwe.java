package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwe implements y59 {
    public final mp4 a;

    public iwe(h86 h86Var) {
        h86Var.getClass();
        this.a = mwa.G(h86Var);
    }

    @Override // defpackage.y59
    public void onDestroy() {
        fd9.z(this.a, null);
    }
}

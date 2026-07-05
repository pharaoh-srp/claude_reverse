package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x38 implements fmg {
    public final j5h a;

    public x38(j5h j5hVar) {
        this.a = j5hVar;
    }

    @Override // defpackage.fmg
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.fmg
    public final boolean b(a91 a91Var) {
        int i = a91Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.d(a91Var.a);
        return true;
    }
}

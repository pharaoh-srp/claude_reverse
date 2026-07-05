package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qcg implements vh6 {
    public final int a;

    public qcg(int i) {
        this.a = i;
    }

    @Override // defpackage.kl7, defpackage.mb0
    public final fsi a(c9i c9iVar) {
        return new x9c(this.a, 9);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qcg) && ((qcg) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}

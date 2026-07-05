package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a9i implements ypc {
    public final ooh a;
    public final ooh b;

    public a9i(ooh oohVar, ooh oohVar2) {
        this.a = oohVar;
        this.b = oohVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a9i a9iVar = obj instanceof a9i ? (a9i) obj : null;
        return a9iVar != null && this.a == a9iVar.a && this.b == a9iVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class quf implements fvf {
    public final int a;
    public final zpf b;

    public quf(int i, zpf zpfVar) {
        this.a = i;
        this.b = zpfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quf)) {
            return false;
        }
        quf qufVar = (quf) obj;
        return this.a == qufVar.a && this.b.equals(qufVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Insert(position=" + this.a + ", event=" + this.b + ")";
    }
}

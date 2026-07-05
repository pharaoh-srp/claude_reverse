package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vaa extends yaa {
    public final pf5 a;

    public vaa(pf5 pf5Var) {
        this.a = pf5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vaa.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((vaa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (vaa.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }

    public vaa() {
        this(pf5.b);
    }
}

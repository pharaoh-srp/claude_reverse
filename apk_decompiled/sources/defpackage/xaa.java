package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xaa extends yaa {
    public final pf5 a;

    public xaa(pf5 pf5Var) {
        this.a = pf5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xaa.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((xaa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (xaa.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}

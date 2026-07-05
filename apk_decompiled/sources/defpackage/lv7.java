package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lv7 implements sv7 {
    public final u56 a;

    public lv7(u56 u56Var) {
        this.a = u56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv7) && this.a.equals(((lv7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Disclaimer(text=" + this.a + ")";
    }
}

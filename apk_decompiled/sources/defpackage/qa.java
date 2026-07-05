package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qa {
    public final cb a;

    public qa(cb cbVar) {
        this.a = cbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qa) && x44.r(this.a, ((qa) obj).a);
    }

    public final int hashCode() {
        cb cbVar = this.a;
        if (cbVar == null) {
            return 0;
        }
        return cbVar.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.a + ")";
    }
}

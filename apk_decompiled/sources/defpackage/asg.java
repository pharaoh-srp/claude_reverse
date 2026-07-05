package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class asg {
    public final int a;

    public /* synthetic */ asg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof asg) {
            return this.a == ((asg) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.p("Strings(value=", this.a, ')');
    }
}

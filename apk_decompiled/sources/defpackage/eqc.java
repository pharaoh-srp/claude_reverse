package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eqc {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof eqc) {
            return this.a == ((eqc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaneMotion.Type[");
        int i = this.a;
        return vb7.s(sb, i == 0 ? "Hidden" : i == 1 ? "Exiting" : i == 2 ? "Entering" : i == 3 ? "Shown" : i == 5 ? "ExitingModal" : i == 6 ? "EnteringModal" : grc.p(i, "Unknown value="), ']');
    }
}

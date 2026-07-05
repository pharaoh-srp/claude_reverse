package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f0b implements j0b {
    public final Set a;

    public f0b(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0b) && this.a.equals(((f0b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Completed(seenIds=" + this.a + ")";
    }
}

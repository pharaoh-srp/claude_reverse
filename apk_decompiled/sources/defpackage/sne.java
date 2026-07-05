package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class sne {
    public final String a;
    public final Set b;

    public sne(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((sne) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

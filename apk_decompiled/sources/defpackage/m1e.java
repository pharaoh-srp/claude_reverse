package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m1e {
    public static final m1e c;
    public final l1e a;
    public final l1e b;

    static {
        l1e l1eVar = new l1e(-1, -1, -1);
        c = new m1e(l1eVar, l1eVar);
    }

    public m1e(l1e l1eVar, l1e l1eVar2) {
        this.a = l1eVar;
        this.b = l1eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m1e.class != obj.getClass()) {
            return false;
        }
        m1e m1eVar = (m1e) obj;
        if (this.a.equals(m1eVar.a)) {
            return this.b.equals(m1eVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a + "-" + this.b;
    }
}

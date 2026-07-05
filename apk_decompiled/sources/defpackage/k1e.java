package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k1e {
    public static final /* synthetic */ int c = 0;
    public final m1e a;
    public final m1e b;

    public k1e(m1e m1eVar, m1e m1eVar2) {
        this.a = m1eVar;
        this.b = m1eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k1e.class != obj.getClass()) {
            return false;
        }
        k1e k1eVar = (k1e) obj;
        if (this.a.equals(k1eVar.a)) {
            return this.b.equals(k1eVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        StringBuilder sbB = xrg.b();
        sbB.append(this.a);
        sbB.append('=');
        sbB.append(this.b);
        return xrg.k(sbB);
    }
}

package io.sentry;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m7 implements m2 {
    public static final m7 F = new m7("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));
    public final io.sentry.util.h E;

    public m7(String str) {
        Objects.requireNonNull(str, "value is required");
        this.E = new io.sentry.util.h(new l7(str, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m7.class != obj.getClass()) {
            return false;
        }
        return ((String) this.E.a()).equals(((m7) obj).E.a());
    }

    public final int hashCode() {
        return ((String) this.E.a()).hashCode();
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        ((y) q3Var).A((String) this.E.a());
    }

    public final String toString() {
        return (String) this.E.a();
    }

    public m7() {
        this.E = new io.sentry.util.h(new e0(7));
    }
}

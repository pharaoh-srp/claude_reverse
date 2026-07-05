package io.sentry.protocol;

import defpackage.sz6;
import io.sentry.a1;
import io.sentry.l7;
import io.sentry.m2;
import io.sentry.q3;

/* JADX INFO: loaded from: classes.dex */
public final class w implements m2 {
    public static final w F = new w("00000000-0000-0000-0000-000000000000".replace("-", ""));
    public final io.sentry.util.h E;

    public w(String str) {
        String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() != 32 && str2.length() != 36) {
            sz6.p("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
            throw null;
        }
        if (str2.length() == 36) {
            this.E = new io.sentry.util.h(new l7(this, str2));
        } else {
            this.E = new io.sentry.util.h(new l7(str2, 3));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        return ((String) this.E.a()).equals(((w) obj).E.a());
    }

    public final int hashCode() {
        return ((String) this.E.a()).hashCode();
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        ((io.sentry.y) q3Var).A(toString());
    }

    public final String toString() {
        return (String) this.E.a();
    }

    public w() {
        this.E = new io.sentry.util.h(new io.sentry.e0(21));
    }
}

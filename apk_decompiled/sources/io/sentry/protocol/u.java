package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.r5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class u implements m2 {
    public String E;
    public String F;
    public CopyOnWriteArraySet G;
    public CopyOnWriteArraySet H;
    public HashMap I;

    public u(String str, String str2) {
        this.E = str;
        this.F = str2;
    }

    public final String a() {
        return this.E;
    }

    public final String b() {
        return this.F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.E.equals(uVar.E) && this.F.equals(uVar.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        yVar.r("name");
        yVar.A(this.E);
        yVar.r("version");
        yVar.A(this.F);
        CopyOnWriteArraySet copyOnWriteArraySet = this.G;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = r5.d().b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.H;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = r5.d().a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            yVar.r("packages");
            yVar.x(a1Var, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            yVar.r("integrations");
            yVar.x(a1Var, copyOnWriteArraySet2);
        }
        HashMap map = this.I;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.I, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}

package io.sentry.rrweb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public c E;
    public long F = System.currentTimeMillis();

    public b(c cVar) {
        this.E = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.F == bVar.F && this.E == bVar.E;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, Long.valueOf(this.F)});
    }
}

package io.sentry.cache.tape;

import defpackage.vb7;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h c = new h(0, 0);
    public final long a;
    public final int b;

    public h(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("[position=");
        sb.append(this.a);
        sb.append(", length=");
        return vb7.l(this.b, "]", sb);
    }
}

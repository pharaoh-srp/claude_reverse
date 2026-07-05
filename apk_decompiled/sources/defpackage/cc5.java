package defpackage;

import org.chromium.net.CronetProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class cc5 {
    public CronetProvider a;
    public ub5 b;

    public final boolean equals(Object obj) {
        return (obj instanceof cc5) && this.a.equals(((cc5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

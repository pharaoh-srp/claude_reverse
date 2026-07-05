package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j5e {
    public final WeakReference a;
    public final Map b;
    public final long c;

    public j5e(WeakReference weakReference, Map map, long j) {
        this.a = weakReference;
        this.b = map;
        this.c = j;
    }

    public final Map a() {
        return this.b;
    }

    public final WeakReference b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }
}

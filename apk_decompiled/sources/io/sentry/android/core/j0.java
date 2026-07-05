package io.sentry.android.core;

import io.sentry.j5;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public io.sentry.internal.debugmeta.c a() {
        return (io.sentry.internal.debugmeta.c) this.c;
    }

    public io.sentry.internal.debugmeta.c b() {
        return (io.sentry.internal.debugmeta.c) this.d;
    }

    public j5 c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
        }
        return (j5) obj;
    }

    public File d() {
        return (File) this.c;
    }

    public io.sentry.hints.c e() {
        return (io.sentry.hints.c) this.d;
    }

    public Map f() {
        return (LinkedHashMap) this.d;
    }

    public io.sentry.n0 g() {
        return (io.sentry.n0) this.c;
    }

    public Long h() {
        return (Long) this.b;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "ReplayNetworkRequestOrResponse{size=" + ((Long) this.b) + ", body=" + ((io.sentry.internal.debugmeta.c) this.c) + ", headers=" + ((LinkedHashMap) this.d) + '}';
            default:
                return super.toString();
        }
    }
}

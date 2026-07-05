package io.sentry.util.network;

import io.sentry.android.core.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public final String a;
    public Integer b;
    public Long c;
    public Long d;
    public j0 e;
    public j0 f;

    public e(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final j0 b() {
        return this.e;
    }

    public final Long c() {
        return this.c;
    }

    public final j0 d() {
        return this.f;
    }

    public final Long e() {
        return this.d;
    }

    public final Integer f() {
        return this.b;
    }

    public final void g(j0 j0Var) {
        this.e = j0Var;
        this.c = (Long) j0Var.b;
    }

    public final void h(int i, j0 j0Var) {
        this.b = Integer.valueOf(i);
        this.f = j0Var;
        this.d = (Long) j0Var.b;
    }

    public final String toString() {
        return "NetworkRequestData{method='" + this.a + "', statusCode=" + this.b + ", requestBodySize=" + this.c + ", responseBodySize=" + this.d + ", request=" + this.e + ", response=" + this.f + '}';
    }
}

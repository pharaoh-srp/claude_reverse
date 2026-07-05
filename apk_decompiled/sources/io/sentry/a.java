package io.sentry;

import defpackage.mj5;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final byte[] a;
    public final io.sentry.protocol.k0 b;
    public final mj5 c;
    public final String d;
    public final String e;
    public final String f;

    public a(io.sentry.protocol.k0 k0Var) {
        this.a = null;
        this.b = k0Var;
        this.c = null;
        this.d = "view-hierarchy.json";
        this.e = "application/json";
        this.f = "event.view_hierarchy";
    }

    public a(String str, String str2, String str3, byte[] bArr) {
        this.a = bArr;
        this.b = null;
        this.c = null;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public a(byte[] bArr, String str, String str2) {
        this(str, str2, "event.attachment", bArr);
    }

    public a(mj5 mj5Var) {
        this.a = null;
        this.b = null;
        this.c = mj5Var;
        this.d = "screenshot.png";
        this.e = "image/png";
        this.f = "event.attachment";
    }
}

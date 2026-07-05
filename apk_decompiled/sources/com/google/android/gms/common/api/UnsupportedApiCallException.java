package com.google.android.gms.common.api;

import defpackage.jf7;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final jf7 E;

    public UnsupportedApiCallException(jf7 jf7Var) {
        this.E = jf7Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.E));
    }
}

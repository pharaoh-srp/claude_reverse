package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
final class zzdf extends TimeoutException {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

package com.google.common.util.concurrent;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends CycleDetectingLockFactory$ExampleStackTrace {
    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb = new StringBuilder(message);
        for (Throwable cause = null; cause != null; cause = cause.getCause()) {
            sb.append(", ");
            sb.append(cause.getMessage());
        }
        return sb.toString();
    }
}

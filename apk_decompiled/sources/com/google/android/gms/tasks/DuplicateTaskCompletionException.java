package com.google.android.gms.tasks;

import defpackage.r5l;

/* JADX INFO: loaded from: classes3.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public static IllegalStateException a(r5l r5lVar) {
        if (!r5lVar.f()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excD = r5lVar.d();
        return new DuplicateTaskCompletionException("Complete with: ".concat(excD != null ? "failure" : r5lVar.g() ? "result ".concat(String.valueOf(r5lVar.e())) : r5lVar.d ? "cancellation" : "unknown issue"), excD);
    }
}

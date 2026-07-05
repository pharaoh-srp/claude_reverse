package org.jsoup.helper;

import defpackage.pqi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ValidationException extends IllegalArgumentException {
    public static final String E = pqi.class.getName();

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        try {
            super.fillInStackTrace();
            StackTraceElement[] stackTrace = getStackTrace();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!stackTraceElement.getClassName().equals(E)) {
                    arrayList.add(stackTraceElement);
                }
            }
            setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}

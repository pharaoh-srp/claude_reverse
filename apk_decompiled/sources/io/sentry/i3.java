package io.sentry;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i3 implements n1 {
    public static final i3 a = new i3();

    @Override // io.sentry.n1
    public final void a(Object obj, Writer writer) {
    }

    @Override // io.sentry.n1
    public final String b(ConcurrentHashMap concurrentHashMap) {
        return "";
    }

    @Override // io.sentry.n1
    public final Object c(Reader reader, Class cls) {
        return null;
    }

    @Override // io.sentry.n1
    public final io.sentry.internal.debugmeta.c d(BufferedInputStream bufferedInputStream) {
        return null;
    }

    @Override // io.sentry.n1
    public final void e(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream) {
    }
}

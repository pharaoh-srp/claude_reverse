package io.sentry;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class u3 {
    public final io.sentry.protocol.w a;
    public final io.sentry.protocol.w b;
    public final ConcurrentHashMap c;
    public final File d;
    public final double e;
    public final String f = "android";

    public u3(io.sentry.protocol.w wVar, io.sentry.protocol.w wVar2, Map map, File file, a5 a5Var) {
        this.a = wVar;
        this.b = wVar2;
        this.c = new ConcurrentHashMap(map);
        this.d = file;
        this.e = a5Var.d() / 1.0E9d;
    }
}

package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class w4 {
    public io.sentry.protocol.w E;
    public final io.sentry.protocol.e F;
    public io.sentry.protocol.u G;
    public io.sentry.protocol.r H;
    public AbstractMap I;
    public String J;
    public String K;
    public String L;
    public io.sentry.protocol.i0 M;
    public transient Throwable N;
    public String O;
    public String P;
    public List Q;
    public io.sentry.protocol.f R;
    public AbstractMap S;

    public w4(io.sentry.protocol.w wVar) {
        this.F = new io.sentry.protocol.e();
        this.E = wVar;
    }

    public final String a() {
        AbstractMap abstractMap = this.I;
        if (abstractMap != null) {
            return (String) abstractMap.get("is_ant");
        }
        return null;
    }

    public final Throwable b() {
        Throwable th = this.N;
        return th instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th).c() : th;
    }

    public final void c(String str, String str2) {
        if (this.I == null) {
            this.I = new HashMap();
        }
        if (str == null) {
            return;
        }
        AbstractMap abstractMap = this.I;
        if (str2 != null) {
            abstractMap.put(str, str2);
        } else if (abstractMap != null) {
            abstractMap.remove(str);
        }
    }

    public final void d(HashMap map) {
        this.I = new HashMap(map);
    }

    public w4() {
        this(new io.sentry.protocol.w());
    }
}

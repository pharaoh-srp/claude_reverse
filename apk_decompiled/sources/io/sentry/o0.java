package io.sentry;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Callable {
    public final /* synthetic */ int E;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.E) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return null;
            case 2:
                return new ArrayList();
            default:
                return io.sentry.android.core.internal.util.g.c.a();
        }
    }
}

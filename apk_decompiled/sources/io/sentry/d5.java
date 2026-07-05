package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d5 implements Callable {
    public final /* synthetic */ int E;
    public final /* synthetic */ io.sentry.internal.debugmeta.c F;

    public /* synthetic */ d5(io.sentry.internal.debugmeta.c cVar, int i) {
        this.E = i;
        this.F = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.E;
        io.sentry.internal.debugmeta.c cVar = this.F;
        switch (i) {
            case 0:
                return Integer.valueOf(cVar.c().length);
            case 1:
                return cVar.c();
            case 2:
                return Integer.valueOf(cVar.c().length);
            case 3:
                return cVar.c();
            case 4:
                return Integer.valueOf(cVar.c().length);
            case 5:
                return cVar.c();
            case 6:
                return Integer.valueOf(cVar.c().length);
            case 7:
                return Integer.valueOf(cVar.c().length);
            case 8:
                return cVar.c();
            case 9:
                return Integer.valueOf(cVar.c().length);
            case 10:
                return cVar.c();
            case 11:
                return Integer.valueOf(cVar.c().length);
            case 12:
                return cVar.c();
            case 13:
                return cVar.c();
            case 14:
                return Integer.valueOf(cVar.c().length);
            case androidx.health.platform.client.proto.g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return cVar.c();
            case 16:
                return Integer.valueOf(cVar.c().length);
            default:
                return cVar.c();
        }
    }
}

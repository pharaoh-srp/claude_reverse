package io.sentry.android.replay.capture;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final AtomicReference a;
    public final /* synthetic */ c b;
    public final /* synthetic */ c c;

    public b(c cVar, c cVar2, int i) {
        switch (i) {
            case 2:
                this.b = cVar;
                this.c = cVar2;
                this.a = new AtomicReference(null);
                break;
            case 3:
                this.b = cVar;
                this.c = cVar2;
                this.a = new AtomicReference(null);
                break;
            case 4:
                this.b = cVar;
                this.c = cVar2;
                this.a = new AtomicReference(null);
                break;
            case 5:
                this.b = cVar;
                this.c = cVar2;
                this.a = new AtomicReference(null);
                break;
            default:
                this.b = cVar;
                this.c = cVar2;
                this.a = new AtomicReference(-1);
                break;
        }
    }

    public b(Object obj, c cVar, c cVar2) {
        this.b = cVar;
        this.c = cVar2;
        this.a = new AtomicReference(obj);
    }
}

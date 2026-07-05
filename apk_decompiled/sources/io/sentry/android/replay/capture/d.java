package io.sentry.android.replay.capture;

import defpackage.bz7;
import io.sentry.android.replay.y;
import io.sentry.protocol.w;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Date G;
    public final /* synthetic */ w H;
    public final /* synthetic */ y I;
    public final /* synthetic */ bz7 J;
    public final /* synthetic */ c K;

    public /* synthetic */ d(c cVar, long j, Date date, w wVar, y yVar, bz7 bz7Var, int i) {
        this.E = i;
        this.K = cVar;
        this.F = j;
        this.G = date;
        this.H = wVar;
        this.I = yVar;
        this.J = bz7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        bz7 bz7Var = this.J;
        y yVar = this.I;
        c cVar = this.K;
        switch (i) {
            case 0:
                f fVar = (f) cVar;
                bz7Var.invoke(c.c(fVar, this.F, this.G, this.H, fVar.e(), yVar.b, yVar.a, yVar.e, yVar.f));
                break;
            default:
                n nVar = (n) cVar;
                bz7Var.invoke(c.c(nVar, this.F, this.G, this.H, nVar.e(), yVar.b, yVar.a, yVar.e, yVar.f));
                break;
        }
    }
}

package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class toj implements Callable {
    public final /* synthetic */ int E;
    public /* synthetic */ cuj F;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.E) {
            case 0:
                ire ireVar = this.F.d;
                luk lukVar = new luk("internal.registerCallback");
                lukVar.H = ireVar;
                return lukVar;
            default:
                return new luk(this.F.c);
        }
    }
}

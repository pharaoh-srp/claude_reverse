package defpackage;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uaa implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ AtomicBoolean F;
    public final /* synthetic */ b G;
    public final /* synthetic */ zy7 H;

    public /* synthetic */ uaa(AtomicBoolean atomicBoolean, b bVar, zy7 zy7Var, int i) {
        this.E = i;
        this.F = atomicBoolean;
        this.G = bVar;
        this.H = zy7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        zy7 zy7Var = this.H;
        b bVar = this.G;
        AtomicBoolean atomicBoolean = this.F;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        bVar.a(zy7Var.a());
                    } catch (Throwable th) {
                        bVar.b(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        bVar.a(zy7Var.a());
                    } catch (Throwable th2) {
                        bVar.b(th2);
                    }
                    break;
                }
                break;
        }
    }
}

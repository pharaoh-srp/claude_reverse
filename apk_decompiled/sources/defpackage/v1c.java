package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class v1c {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ w1c c;

    public v1c(w1c w1cVar, xp5 xp5Var, Executor executor) {
        this.c = w1cVar;
        this.a = new WeakReference(xp5Var);
        this.b = executor;
    }
}

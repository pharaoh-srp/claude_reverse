package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes3.dex */
public final class cke {
    public final CronetEngine a;
    public final Executor b;
    public final sqe c;
    public final mvd d;
    public final am4 e;

    public cke(CronetEngine cronetEngine, ExecutorService executorService, mvd mvdVar, sqe sqeVar, am4 am4Var) {
        this.a = cronetEngine;
        this.b = executorService;
        this.d = mvdVar;
        this.c = sqeVar;
        this.e = am4Var;
    }
}

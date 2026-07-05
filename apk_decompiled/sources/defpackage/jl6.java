package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class jl6 extends kvj {
    public final /* synthetic */ kvj e;
    public final /* synthetic */ ThreadPoolExecutor f;

    public jl6(kvj kvjVar, ThreadPoolExecutor threadPoolExecutor) {
        this.e = kvjVar;
        this.f = threadPoolExecutor;
    }

    @Override // defpackage.kvj
    public final void f(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f;
        try {
            this.e.f(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.kvj
    public final void g(c61 c61Var) {
        ThreadPoolExecutor threadPoolExecutor = this.f;
        try {
            this.e.g(c61Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}

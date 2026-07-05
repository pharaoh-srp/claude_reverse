package kotlinx.coroutines;

import defpackage.c45;
import defpackage.e45;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class DispatchException extends Exception {
    public final Throwable E;

    public DispatchException(Throwable th, e45 e45Var, c45 c45Var) {
        super("Coroutine dispatcher " + e45Var + " threw an exception, context = " + c45Var, th);
        this.E = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.E;
    }
}

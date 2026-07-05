package kotlinx.coroutines;

import defpackage.lf9;
import defpackage.mdj;
import defpackage.vqh;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class TimeoutCancellationException extends CancellationException {
    public final transient lf9 E;

    public TimeoutCancellationException(String str, vqh vqhVar) {
        super(str);
        this.E = vqhVar;
    }
}

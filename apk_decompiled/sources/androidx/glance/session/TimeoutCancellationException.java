package androidx.glance.session;

import defpackage.mdj;
import defpackage.vb7;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/glance/session/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "glance_release"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class TimeoutCancellationException extends CancellationException {
    public final String E;
    public final int F;

    public TimeoutCancellationException(String str, int i) {
        super(str);
        this.E = str;
        this.F = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.E;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutCancellationException(");
        sb.append(this.E);
        sb.append(", ");
        return vb7.r(sb, this.F, ')');
    }
}

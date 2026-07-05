package okio;

import defpackage.mdj;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ForwardingTimeout;", "Lokio/Timeout;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public class ForwardingTimeout extends Timeout {
    public Timeout f;

    public ForwardingTimeout(Timeout timeout) {
        timeout.getClass();
        this.f = timeout;
    }

    @Override // okio.Timeout
    public final void a(Condition condition) {
        throw null;
    }

    @Override // okio.Timeout
    public final Timeout c() {
        return this.f.c();
    }

    @Override // okio.Timeout
    public final Timeout d() {
        return this.f.d();
    }

    @Override // okio.Timeout
    public final long e() {
        return this.f.e();
    }

    @Override // okio.Timeout
    public final Timeout f(long j) {
        return this.f.f(j);
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: g */
    public final boolean getA() {
        return this.f.getA();
    }

    @Override // okio.Timeout
    public final void h() throws InterruptedIOException {
        this.f.h();
    }

    @Override // okio.Timeout
    public final Timeout i(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f.i(j, timeUnit);
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: j */
    public final long getC() {
        return this.f.getC();
    }
}

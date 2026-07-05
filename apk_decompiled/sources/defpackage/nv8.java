package defpackage;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class nv8 extends ov8 {
    public final /* synthetic */ int b;
    public final Serializable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv8(boolean z, int i) {
        super(z);
        this.b = i;
        switch (i) {
            case 1:
                super(z);
                this.c = new AtomicLong(0L);
                return;
            default:
                try {
                    this.c = new SecureRandom();
                    return;
                } catch (Throwable th) {
                    throw new ExceptionInInitializerError(th);
                }
        }
    }

    @Override // defpackage.ov8
    public ef5 a() {
        switch (this.b) {
            case 1:
                return bf5.f(((AtomicLong) this.c).incrementAndGet());
            default:
                return super.a();
        }
    }

    @Override // defpackage.ov8
    public final long b() {
        int i = this.b;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                SecureRandom secureRandom = (SecureRandom) serializable;
                long jNextLong = secureRandom.nextLong();
                while (true) {
                    long j = jNextLong & Long.MAX_VALUE;
                    if (j != 0) {
                        return j;
                    }
                    jNextLong = secureRandom.nextLong();
                }
                break;
            default:
                return ((AtomicLong) serializable).incrementAndGet();
        }
    }
}

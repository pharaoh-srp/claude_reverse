package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ftb extends htb {
    private static final long P_LIMIT_OFFSET = pfi.fieldOffset(ftb.class, "producerLimit");
    protected final Object[] producerBuffer;
    private volatile long producerLimit;
    protected final long producerMask;

    public ftb(long j, Object[] objArr) {
        this.producerMask = j;
        this.producerBuffer = objArr;
    }

    public final boolean casProducerLimit(long j, long j2) {
        return pfi.UNSAFE.compareAndSwapLong(this, P_LIMIT_OFFSET, j, j2);
    }

    public final long lvProducerLimit() {
        return this.producerLimit;
    }

    public final void soProducerLimit(long j) {
        pfi.UNSAFE.putOrderedLong(this, P_LIMIT_OFFSET, j);
    }
}

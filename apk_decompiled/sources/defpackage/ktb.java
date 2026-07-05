package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ktb extends itb {
    private static final long P_INDEX_OFFSET = pfi.fieldOffset(ktb.class, "producerIndex");
    private volatile long producerIndex;

    public ktb(long j, Object[] objArr) {
        super(j, objArr);
    }

    public final boolean casProducerIndex(long j, long j2) {
        return pfi.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j, j2);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }
}

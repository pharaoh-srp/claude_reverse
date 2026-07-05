package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtb extends jtb {
    private volatile Thread blocked;
    protected final Object[] consumerBuffer;
    private volatile long consumerIndex;
    protected final long consumerMask;
    private static final long C_INDEX_OFFSET = pfi.fieldOffset(gtb.class, "consumerIndex");
    private static final long BLOCKED_OFFSET = pfi.fieldOffset(gtb.class, "blocked");

    public gtb(long j, Object[] objArr) {
        super(j, objArr);
        this.consumerMask = j;
        this.consumerBuffer = objArr;
    }

    public final long lpConsumerIndex() {
        return pfi.UNSAFE.getLong(this, C_INDEX_OFFSET);
    }

    public final Thread lvBlocked() {
        return this.blocked;
    }

    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    public final void soBlocked(Thread thread) {
        pfi.UNSAFE.putOrderedObject(this, BLOCKED_OFFSET, thread);
    }

    public final void soConsumerIndex(long j) {
        pfi.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j);
    }
}

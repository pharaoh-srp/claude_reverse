package com.squareup.wire.internal;

import defpackage.mdj;
import defpackage.mq5;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0005J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/squareup/wire/internal/LongArrayList;", "", "", "initialCapacity", "<init>", "(I)V", "minCapacity", "Liei;", "ensureCapacity", "", "toArray", "()[J", "", "long", "add", "(J)V", "", "isNotEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "data", "[J", "size", "I", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class LongArrayList {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long[] data;
    private int size;

    public LongArrayList(int i) {
        this.data = new long[i];
    }

    private final void ensureCapacity(int minCapacity) {
        long[] jArr = this.data;
        if (minCapacity > jArr.length) {
            this.data = Arrays.copyOf(jArr, Math.max(((jArr.length * 3) / 2) + 1, minCapacity));
        }
    }

    public final void add(long j) {
        ensureCapacity(this.size + 1);
        long[] jArr = this.data;
        int i = this.size;
        this.size = i + 1;
        jArr[i] = j;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final long[] toArray() {
        int i = this.size;
        long[] jArr = this.data;
        if (i < jArr.length) {
            this.data = Arrays.copyOf(jArr, i);
        }
        return this.data;
    }

    public String toString() {
        String string = Arrays.toString(Arrays.copyOf(this.data, this.size));
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/LongArrayList$Companion;", "", "<init>", "()V", "forDecoding", "Lcom/squareup/wire/internal/LongArrayList;", "minLengthInBytes", "", "minimumElementByteSize", "", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final LongArrayList forDecoding(long minLengthInBytes, long minimumElementByteSize) {
            long j = minLengthInBytes / minimumElementByteSize;
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return new LongArrayList((int) j);
        }

        private Companion() {
        }

        public final LongArrayList forDecoding(int minLengthInBytes, int minimumElementByteSize) {
            return new LongArrayList(minLengthInBytes / minimumElementByteSize);
        }
    }
}

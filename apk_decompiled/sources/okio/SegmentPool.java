package okio;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.mdj;
import defpackage.sz6;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/SegmentPool;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class SegmentPool {
    public static final Segment a = new Segment(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(Segment segment) {
        segment.getClass();
        if (segment.f != null || segment.g != null) {
            sz6.p("Failed requirement.");
            return;
        }
        if (segment.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        Segment segment2 = a;
        Segment segment3 = (Segment) atomicReference.getAndSet(segment2);
        if (segment3 == segment2) {
            return;
        }
        int i = segment3 != null ? segment3.c : 0;
        if (i >= 65536) {
            atomicReference.set(segment3);
            return;
        }
        segment.f = segment3;
        segment.b = 0;
        segment.c = i + FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        atomicReference.set(segment);
    }

    public static final Segment b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        Segment segment = a;
        Segment segment2 = (Segment) atomicReference.getAndSet(segment);
        if (segment2 == segment) {
            return new Segment();
        }
        if (segment2 == null) {
            atomicReference.set(null);
            return new Segment();
        }
        atomicReference.set(segment2.f);
        segment2.f = null;
        segment2.c = 0;
        return segment2;
    }
}

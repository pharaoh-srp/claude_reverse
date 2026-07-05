package okio;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class HashingSource extends ForwardingSource implements Source {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/HashingSource$Companion;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long A0(Buffer buffer, long j) {
        buffer.getClass();
        long jA0 = super.A0(buffer, j);
        if (jA0 != -1) {
            long j2 = buffer.F;
            long j3 = j2 - jA0;
            Segment segment = buffer.E;
            segment.getClass();
            while (j2 > j3) {
                segment = segment.g;
                segment.getClass();
                j2 -= (long) (segment.c - segment.b);
            }
            if (j2 < buffer.F) {
                throw null;
            }
        }
        return jA0;
    }
}

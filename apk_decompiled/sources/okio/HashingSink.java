package okio;

import defpackage.mdj;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class HashingSink extends ForwardingSink implements Sink {
    public final MessageDigest F;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/HashingSink$Companion;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public static HashingSink a(Sink sink) {
            return new HashingSink(sink);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(Sink sink) throws NoSuchAlgorithmException {
        super(sink);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.getClass();
        this.F = messageDigest;
    }

    public final ByteString c() {
        MessageDigest messageDigest = this.F;
        messageDigest.getClass();
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ByteString(bArrDigest);
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void c0(Buffer buffer, long j) {
        buffer.getClass();
        SegmentedByteString.b(buffer.F, 0L, j);
        Segment segment = buffer.E;
        segment.getClass();
        long j2 = 0;
        while (j2 < j) {
            int iMin = (int) Math.min(j - j2, segment.c - segment.b);
            MessageDigest messageDigest = this.F;
            messageDigest.getClass();
            messageDigest.update(segment.a, segment.b, iMin);
            j2 += (long) iMin;
            segment = segment.f;
            segment.getClass();
        }
        super.c0(buffer, j);
    }
}

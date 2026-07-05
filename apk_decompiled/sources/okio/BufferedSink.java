package okio;

import defpackage.mdj;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/Buffer;", "Lokio/RealBufferedSink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public interface BufferedSink extends Sink, WritableByteChannel {
    BufferedSink E(int i);

    OutputStream K0();

    BufferedSink W(String str);

    long f0(Source source);

    @Override // okio.Sink, java.io.Flushable
    void flush();

    BufferedSink i0(int i, int i2, String str);

    /* JADX INFO: renamed from: k */
    Buffer getF();

    BufferedSink write(byte[] bArr);

    BufferedSink write(byte[] bArr, int i, int i2);

    BufferedSink writeByte(int i);

    BufferedSink writeInt(int i);

    BufferedSink writeShort(int i);

    BufferedSink y(long j);

    BufferedSink z0(ByteString byteString);
}

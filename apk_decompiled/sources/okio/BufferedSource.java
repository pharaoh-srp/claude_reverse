package okio;

import defpackage.mdj;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lokio/BufferedSource;", "Lokio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/Buffer;", "Lokio/RealBufferedSource;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public interface BufferedSource extends Source, ReadableByteChannel {
    byte[] B();

    long C(ByteString byteString);

    long C0();

    boolean F();

    long F0(BufferedSink bufferedSink);

    void I0(long j);

    void J(Buffer buffer, long j);

    long L(ByteString byteString);

    InputStream M0();

    int N0(Options options);

    String O(long j);

    boolean Y(long j, ByteString byteString);

    String Z(Charset charset);

    boolean j0(long j);

    /* JADX INFO: renamed from: k */
    Buffer getF();

    String p0();

    RealBufferedSource peek();

    int q0();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    String s(long j);

    void skip(long j);

    ByteString t(long j);

    String t0();

    long u0(long j, ByteString byteString);
}

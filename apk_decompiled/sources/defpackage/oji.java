package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes3.dex */
public final class oji extends UploadDataProvider {
    public volatile FileChannel E;
    public final nji F;
    public final Object G = new Object();

    public oji(nji njiVar) {
        this.F = njiVar;
    }

    public final FileChannel c() {
        if (this.E == null) {
            synchronized (this.G) {
                try {
                    if (this.E == null) {
                        this.E = this.F.f();
                    }
                } finally {
                }
            }
        }
        return this.E;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.E;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return c().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            sz6.j("Cronet passed a buffer with no bytes remaining");
            return;
        }
        FileChannel fileChannelC = c();
        int i = 0;
        while (i == 0) {
            int i2 = fileChannelC.read(byteBuffer);
            if (i2 == -1) {
                break;
            } else {
                i += i2;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        c().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}

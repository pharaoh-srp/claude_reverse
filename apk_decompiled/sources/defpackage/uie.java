package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import okio.Buffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes3.dex */
public final class uie extends UploadDataProvider {
    public volatile boolean E = false;
    public final Buffer F = new Buffer();
    public final /* synthetic */ long G;
    public final /* synthetic */ tie H;

    public uie(long j, tie tieVar) {
        this.G = j;
        this.H = tieVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.G;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!this.E) {
            this.H.writeTo(this.F);
            this.F.getClass();
            this.E = true;
            long j = this.G;
            long j2 = this.F.F;
            if (j2 != j) {
                StringBuilder sbW = grc.w(j, "Expected ", " bytes but got ");
                sbW.append(j2);
                throw new IOException(sbW.toString());
            }
        }
        if (this.F.read(byteBuffer) != -1) {
            uploadDataSink.onReadSucceeded(false);
        } else {
            sz6.j("The source has been exhausted but we expected more!");
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new UnsupportedOperationException());
    }
}

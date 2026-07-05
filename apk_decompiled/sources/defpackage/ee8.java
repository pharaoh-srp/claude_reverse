package defpackage;

import okio.BufferedSink;
import okio.GzipSink;
import okio.RealBufferedSink;

/* JADX INFO: loaded from: classes.dex */
public final class ee8 extends tie {
    public final /* synthetic */ tie a;

    public ee8(tie tieVar) {
        this.a = tieVar;
    }

    @Override // defpackage.tie
    public final long contentLength() {
        return -1L;
    }

    @Override // defpackage.tie
    public final p8b contentType() {
        return this.a.contentType();
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) {
        bufferedSink.getClass();
        RealBufferedSink realBufferedSink = new RealBufferedSink(new GzipSink(bufferedSink));
        this.a.writeTo(realBufferedSink);
        realBufferedSink.close();
    }
}

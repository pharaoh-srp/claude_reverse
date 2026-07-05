package defpackage;

import okio.BufferedSink;
import okio.RealBufferedSink;

/* JADX INFO: loaded from: classes2.dex */
public final class vjd extends tie {
    public final tie a;
    public final bz7 b;

    public vjd(tie tieVar, bz7 bz7Var) {
        tieVar.getClass();
        bz7Var.getClass();
        this.a = tieVar;
        this.b = bz7Var;
    }

    @Override // defpackage.tie
    public final long contentLength() {
        return this.a.contentLength();
    }

    @Override // defpackage.tie
    public final p8b contentType() {
        return this.a.contentType();
    }

    @Override // defpackage.tie
    public final boolean isOneShot() {
        return this.a.isOneShot();
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) {
        bufferedSink.getClass();
        tie tieVar = this.a;
        long jContentLength = tieVar.contentLength();
        if (jContentLength <= 0) {
            tieVar.writeTo(bufferedSink);
            return;
        }
        cae caeVar = new cae();
        bae baeVar = new bae();
        baeVar.E = -1;
        RealBufferedSink realBufferedSink = new RealBufferedSink(new ujd(bufferedSink, caeVar, jContentLength, baeVar, this));
        tieVar.writeTo(realBufferedSink);
        realBufferedSink.flush();
    }
}

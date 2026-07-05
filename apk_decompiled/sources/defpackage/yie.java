package defpackage;

import okio.BufferedSink;

/* JADX INFO: loaded from: classes3.dex */
public final class yie extends tie {
    public final tie a;
    public final p8b b;

    public yie(tie tieVar, p8b p8bVar) {
        this.a = tieVar;
        this.b = p8bVar;
    }

    @Override // defpackage.tie
    public final long contentLength() {
        return this.a.contentLength();
    }

    @Override // defpackage.tie
    public final p8b contentType() {
        return this.b;
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) {
        this.a.writeTo(bufferedSink);
    }
}

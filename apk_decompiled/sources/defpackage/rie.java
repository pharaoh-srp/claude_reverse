package defpackage;

import okio.BufferedSink;

/* JADX INFO: loaded from: classes.dex */
public final class rie extends tie {
    public final /* synthetic */ p8b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public rie(p8b p8bVar, byte[] bArr, int i, int i2) {
        this.a = p8bVar;
        this.b = i;
        this.c = bArr;
        this.d = i2;
    }

    @Override // defpackage.tie
    public final long contentLength() {
        return this.b;
    }

    @Override // defpackage.tie
    public final p8b contentType() {
        return this.a;
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) {
        bufferedSink.getClass();
        bufferedSink.write(this.c, this.d, this.b);
    }
}

package defpackage;

import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class pie extends tie {
    public final /* synthetic */ p8b a;
    public final /* synthetic */ ByteString b;

    public pie(p8b p8bVar, ByteString byteString) {
        this.a = p8bVar;
        this.b = byteString;
    }

    @Override // defpackage.tie
    public final long contentLength() {
        return this.b.e();
    }

    @Override // defpackage.tie
    public final p8b contentType() {
        return this.a;
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) {
        bufferedSink.getClass();
        bufferedSink.z0(this.b);
    }
}

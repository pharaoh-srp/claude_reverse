package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes3.dex */
public final class m12 extends tie {
    public final /* synthetic */ p8b a;
    public final /* synthetic */ ByteArrayOutputStream b;

    public m12(p8b p8bVar, ByteArrayOutputStream byteArrayOutputStream) {
        this.a = p8bVar;
        this.b = byteArrayOutputStream;
    }

    @Override // defpackage.tie
    public final long contentLength() {
        return this.b.size();
    }

    @Override // defpackage.tie
    public final p8b contentType() {
        return this.a;
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        bufferedSink.getClass();
        this.b.writeTo(bufferedSink.K0());
    }
}

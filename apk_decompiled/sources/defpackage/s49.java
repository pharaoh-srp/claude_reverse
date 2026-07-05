package defpackage;

import java.io.IOException;
import java.io.InputStream;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public final class s49 extends tie {
    public final /* synthetic */ p8b a;
    public final /* synthetic */ long b;
    public final /* synthetic */ w95 c;

    public s49(p8b p8bVar, long j, w95 w95Var) {
        this.a = p8bVar;
        this.b = j;
        this.c = w95Var;
    }

    @Override // defpackage.tie
    public final long contentLength() {
        return this.b;
    }

    @Override // defpackage.tie
    /* JADX INFO: renamed from: contentType */
    public final p8b getContentType() {
        return this.a;
    }

    @Override // defpackage.tie
    public final boolean isOneShot() {
        return false;
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        bufferedSink.getClass();
        Source sourceG = Okio.g((InputStream) this.c.a());
        try {
            bufferedSink.f0(sourceG);
            sourceG.close();
        } finally {
        }
    }
}

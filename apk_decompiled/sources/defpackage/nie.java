package defpackage;

import java.io.File;
import java.io.IOException;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public final class nie extends tie {
    public final /* synthetic */ p8b a;
    public final /* synthetic */ File b;

    public nie(p8b p8bVar, File file) {
        this.a = p8bVar;
        this.b = file;
    }

    @Override // defpackage.tie
    public final long contentLength() {
        return this.b.length();
    }

    @Override // defpackage.tie
    /* JADX INFO: renamed from: contentType */
    public final p8b getContentType() {
        return this.a;
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        bufferedSink.getClass();
        Source sourceF = Okio.f(this.b);
        try {
            bufferedSink.f0(sourceF);
            sourceF.close();
        } finally {
        }
    }
}

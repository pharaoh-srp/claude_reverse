package defpackage;

import java.io.IOException;
import okio.BufferedSink;
import okio.FileSystem;
import okio.Path;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public final class oie extends tie {
    public final /* synthetic */ p8b a;
    public final /* synthetic */ FileSystem b;
    public final /* synthetic */ Path c;

    public oie(Path path, FileSystem fileSystem, p8b p8bVar) {
        this.a = p8bVar;
        this.b = fileSystem;
        this.c = path;
    }

    @Override // defpackage.tie
    public final long contentLength() {
        Long l = this.b.K(this.c).d;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // defpackage.tie
    /* JADX INFO: renamed from: contentType */
    public final p8b getContentType() {
        return this.a;
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        bufferedSink.getClass();
        Source sourceT = this.b.T(this.c);
        try {
            bufferedSink.f0(sourceT);
            sourceT.close();
        } finally {
        }
    }
}

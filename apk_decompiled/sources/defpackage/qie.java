package defpackage;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import okio.BufferedSink;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public final class qie extends tie {
    public final /* synthetic */ p8b a;
    public final /* synthetic */ FileDescriptor b;

    public qie(FileDescriptor fileDescriptor, p8b p8bVar) {
        this.a = p8bVar;
        this.b = fileDescriptor;
    }

    @Override // defpackage.tie
    /* JADX INFO: renamed from: contentType */
    public final p8b getContentType() {
        return this.a;
    }

    @Override // defpackage.tie
    public final boolean isOneShot() {
        return true;
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        bufferedSink.getClass();
        FileInputStream fileInputStream = new FileInputStream(this.b);
        try {
            bufferedSink.getF().f0(Okio.g(fileInputStream));
            fileInputStream.close();
        } finally {
        }
    }
}

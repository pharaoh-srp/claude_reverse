package okio;

import defpackage.mdj;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt", "okio/Okio__ZlibOkioKt"}, k = 4, mv = {2, 1, 0}, xi = mdj.f)
public final class Okio {
    public static final Sink a() {
        return new BlackholeSink();
    }

    public static final RealBufferedSink b(Sink sink) {
        sink.getClass();
        return new RealBufferedSink(sink);
    }

    public static final RealBufferedSource c(Source source) {
        source.getClass();
        return new RealBufferedSource(source);
    }

    public static final ZipFileSystem d(FileSystem fileSystem, Path path) {
        return Okio__ZlibOkioKt.a(fileSystem, path);
    }

    public static final Sink e(OutputStream outputStream) {
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static final Source f(File file) {
        file.getClass();
        return new InputStreamSource(new FileInputStream(file), Timeout.e);
    }

    public static final Source g(InputStream inputStream) {
        inputStream.getClass();
        return new InputStreamSource(inputStream, new Timeout());
    }
}

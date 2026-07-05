package defpackage;

import java.io.File;
import java.io.FileDescriptor;
import okio.BufferedSink;
import okio.ByteString;
import okio.FileSystem;
import okio.HashingSink;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;

/* JADX INFO: loaded from: classes.dex */
public abstract class tie {
    public static final sie Companion = new sie();
    public static final tie EMPTY;

    static {
        ByteString byteString = ByteString.H;
        byteString.getClass();
        EMPTY = new pie(null, byteString);
    }

    public static final tie create(Path path, FileSystem fileSystem, p8b p8bVar) {
        Companion.getClass();
        path.getClass();
        fileSystem.getClass();
        return new oie(path, fileSystem, p8bVar);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract p8b contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public final ByteString sha256() {
        HashingSink hashingSinkA = HashingSink.Companion.a(Okio.a());
        RealBufferedSink realBufferedSink = new RealBufferedSink(hashingSinkA);
        try {
            writeTo(realBufferedSink);
            realBufferedSink.close();
            return hashingSinkA.c();
        } finally {
        }
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    @lz5
    public static final tie create(p8b p8bVar, String str) {
        Companion.getClass();
        str.getClass();
        return sie.b(str, p8bVar);
    }

    @lz5
    public static final tie create(p8b p8bVar, ByteString byteString) {
        Companion.getClass();
        byteString.getClass();
        return new pie(p8bVar, byteString);
    }

    @lz5
    public static final tie create(p8b p8bVar, byte[] bArr) {
        Companion.getClass();
        bArr.getClass();
        return sie.a(p8bVar, bArr, 0, bArr.length);
    }

    @lz5
    public static final tie create(p8b p8bVar, byte[] bArr, int i) {
        Companion.getClass();
        bArr.getClass();
        return sie.a(p8bVar, bArr, i, bArr.length);
    }

    public static final tie create(FileDescriptor fileDescriptor, p8b p8bVar) {
        Companion.getClass();
        fileDescriptor.getClass();
        return new qie(fileDescriptor, p8bVar);
    }

    public static final tie create(String str, p8b p8bVar) {
        Companion.getClass();
        return sie.b(str, p8bVar);
    }

    @lz5
    public static final tie create(p8b p8bVar, File file) {
        Companion.getClass();
        file.getClass();
        return new nie(p8bVar, file);
    }

    public static final tie create(byte[] bArr) {
        sie sieVar = Companion;
        sieVar.getClass();
        bArr.getClass();
        return sie.c(sieVar, bArr, null, 0, 7);
    }

    public static final tie create(byte[] bArr, p8b p8bVar) {
        sie sieVar = Companion;
        sieVar.getClass();
        bArr.getClass();
        return sie.c(sieVar, bArr, p8bVar, 0, 6);
    }

    public static final tie create(byte[] bArr, p8b p8bVar, int i) {
        sie sieVar = Companion;
        sieVar.getClass();
        bArr.getClass();
        return sie.c(sieVar, bArr, p8bVar, i, 4);
    }

    public static final tie create(byte[] bArr, p8b p8bVar, int i, int i2) {
        Companion.getClass();
        return sie.a(p8bVar, bArr, i, i2);
    }

    public static final tie create(ByteString byteString, p8b p8bVar) {
        Companion.getClass();
        byteString.getClass();
        return new pie(p8bVar, byteString);
    }

    public static final tie create(File file, p8b p8bVar) {
        Companion.getClass();
        file.getClass();
        return new nie(p8bVar, file);
    }

    @lz5
    public static final tie create(p8b p8bVar, byte[] bArr, int i, int i2) {
        Companion.getClass();
        bArr.getClass();
        return sie.a(p8bVar, bArr, i, i2);
    }
}

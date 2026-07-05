package defpackage;

import okio.Buffer;
import okio.ByteString;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final ByteString a;
    public static final ByteString b;
    public static final ByteString c;
    public static final ByteString d;
    public static final ByteString e;

    static {
        ByteString byteString = ByteString.H;
        a = ByteString.Companion.b("/");
        b = ByteString.Companion.b("\\");
        c = ByteString.Companion.b("/\\");
        d = ByteString.Companion.b(".");
        e = ByteString.Companion.b("..");
    }

    public static final int a(Path path) {
        ByteString byteString = path.E;
        if (byteString.e() != 0) {
            if (byteString.j(0) != 47) {
                if (byteString.j(0) == 92) {
                    if (byteString.e() > 2 && byteString.j(1) == 92) {
                        ByteString byteString2 = b;
                        byteString2.getClass();
                        int iG = byteString.g(byteString2.getE(), 2);
                        return iG == -1 ? byteString.e() : iG;
                    }
                } else if (byteString.e() > 2 && byteString.j(1) == 58 && byteString.j(2) == 92) {
                    char cJ = (char) byteString.j(0);
                    if ('a' <= cJ && cJ < '{') {
                        return 3;
                    }
                    if ('A' <= cJ && cJ < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final Path b(Path path, Path path2, boolean z) {
        path2.getClass();
        if (a(path2) != -1 || path2.f() != null) {
            return path2;
        }
        ByteString byteStringC = c(path);
        if (byteStringC == null && (byteStringC = c(path2)) == null) {
            byteStringC = f(Path.F);
        }
        Buffer buffer = new Buffer();
        buffer.r0(path.E);
        if (buffer.F > 0) {
            buffer.r0(byteStringC);
        }
        buffer.r0(path2.E);
        return d(buffer, z);
    }

    public static final ByteString c(Path path) {
        ByteString byteString = path.E;
        ByteString byteString2 = a;
        if (ByteString.h(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = path.E;
        ByteString byteString4 = b;
        if (ByteString.h(byteString3, byteString4) != -1) {
            return byteString4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okio.Path d(okio.Buffer r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j.d(okio.Buffer, boolean):okio.Path");
    }

    public static final ByteString e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        sz6.p(grc.p(b2, "not a directory separator: "));
        return null;
    }

    public static final ByteString f(String str) {
        if (x44.r(str, "/")) {
            return a;
        }
        if (x44.r(str, "\\")) {
            return b;
        }
        sz6.p(ij0.i("not a directory separator: ", str));
        return null;
    }
}

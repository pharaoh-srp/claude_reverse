package okio;

import defpackage.j;
import defpackage.mdj;
import defpackage.poc;
import defpackage.x44;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/Path;", "", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class Path implements Comparable<Path> {
    public static final String F;
    public final ByteString E;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/Path$Companion;", "", "", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public static Path a(String str) {
            str.getClass();
            ByteString byteString = j.a;
            Buffer buffer = new Buffer();
            buffer.T0(str);
            return j.d(buffer, false);
        }

        public static Path b(File file) {
            String str = Path.F;
            String string = file.toString();
            string.getClass();
            return a(string);
        }
    }

    static {
        String str = File.separator;
        str.getClass();
        F = str;
    }

    public Path(ByteString byteString) {
        byteString.getClass();
        this.E = byteString;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = j.a(this);
        ByteString byteString = this.E;
        if (iA == -1) {
            iA = 0;
        } else if (iA < byteString.e() && byteString.j(iA) == 92) {
            iA++;
        }
        int iE = byteString.e();
        int i = iA;
        while (iA < iE) {
            if (byteString.j(iA) == 47 || byteString.j(iA) == 92) {
                arrayList.add(byteString.p(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < byteString.e()) {
            arrayList.add(byteString.p(i, byteString.e()));
        }
        return arrayList;
    }

    public final String b() {
        ByteString byteString = j.a;
        ByteString byteStringQ = this.E;
        int iL = ByteString.l(byteStringQ, byteString);
        if (iL == -1) {
            iL = ByteString.l(byteStringQ, j.b);
        }
        if (iL != -1) {
            byteStringQ = ByteString.q(byteStringQ, iL + 1, 0, 2);
        } else if (f() != null && byteStringQ.e() == 2) {
            byteStringQ = ByteString.H;
        }
        return byteStringQ.t();
    }

    public final Path c() {
        ByteString byteString = j.d;
        ByteString byteString2 = this.E;
        if (x44.r(byteString2, byteString)) {
            return null;
        }
        ByteString byteString3 = j.a;
        if (x44.r(byteString2, byteString3)) {
            return null;
        }
        ByteString byteString4 = j.b;
        if (x44.r(byteString2, byteString4)) {
            return null;
        }
        ByteString byteString5 = j.e;
        byteString2.getClass();
        byteString5.getClass();
        int iE = byteString2.e();
        byte[] bArr = byteString5.E;
        if (byteString2.n(byteString5, iE - bArr.length, bArr.length) && (byteString2.e() == 2 || byteString2.n(byteString3, byteString2.e() - 3, 1) || byteString2.n(byteString4, byteString2.e() - 3, 1))) {
            return null;
        }
        int iL = ByteString.l(byteString2, byteString3);
        if (iL == -1) {
            iL = ByteString.l(byteString2, byteString4);
        }
        if (iL == 2 && f() != null) {
            if (byteString2.e() == 3) {
                return null;
            }
            return new Path(ByteString.q(byteString2, 0, 3, 1));
        }
        if (iL == 1) {
            byteString4.getClass();
            if (byteString2.n(byteString4, 0, byteString4.e())) {
                return null;
            }
        }
        if (iL != -1 || f() == null) {
            return iL == -1 ? new Path(byteString) : iL == 0 ? new Path(ByteString.q(byteString2, 0, 1, 1)) : new Path(ByteString.q(byteString2, 0, iL, 1));
        }
        if (byteString2.e() == 2) {
            return null;
        }
        return new Path(ByteString.q(byteString2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Path path) {
        Path path2 = path;
        path2.getClass();
        return this.E.compareTo(path2.E);
    }

    public final Path d(Path path) {
        path.getClass();
        ByteString byteString = path.E;
        int iA = j.a(this);
        ByteString byteString2 = this.E;
        Path path2 = iA == -1 ? null : new Path(byteString2.p(0, iA));
        int iA2 = j.a(path);
        if (!x44.r(path2, iA2 == -1 ? null : new Path(byteString.p(0, iA2)))) {
            poc.o("Paths of different roots cannot be relative to each other: ", this, " and ", path);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = path.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && x44.r(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && byteString2.e() == byteString.e()) {
            return Companion.a(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(j.e) != -1) {
            poc.o("Impossible relative path to resolve: ", this, " and ", path);
            return null;
        }
        if (x44.r(byteString, j.d)) {
            return this;
        }
        Buffer buffer = new Buffer();
        ByteString byteStringC = j.c(path);
        if (byteStringC == null && (byteStringC = j.c(this)) == null) {
            byteStringC = j.f(F);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            buffer.r0(j.e);
            buffer.r0(byteStringC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            buffer.r0((ByteString) arrayListA.get(i));
            buffer.r0(byteStringC);
            i++;
        }
        return j.d(buffer, false);
    }

    public final Path e(String str) {
        str.getClass();
        Buffer buffer = new Buffer();
        buffer.T0(str);
        return j.b(this, j.d(buffer, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Path) && x44.r(((Path) obj).E, this.E);
    }

    public final Character f() {
        ByteString byteString = j.a;
        ByteString byteString2 = this.E;
        if (ByteString.h(byteString2, byteString) != -1 || byteString2.e() < 2 || byteString2.j(1) != 58) {
            return null;
        }
        char cJ = (char) byteString2.j(0);
        if (('a' > cJ || cJ >= '{') && ('A' > cJ || cJ >= '[')) {
            return null;
        }
        return Character.valueOf(cJ);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final File toFile() {
        return new File(this.E.t());
    }

    public final String toString() {
        return this.E.t();
    }
}

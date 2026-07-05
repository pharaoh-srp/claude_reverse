package defpackage;

import android.content.Context;
import okio.FileSystem;

/* JADX INFO: loaded from: classes2.dex */
public final class qjc {
    public final Context a;
    public final j8g b;
    public final k6f c;
    public final tad d;
    public final String e;
    public final FileSystem f;
    public final e52 g;
    public final e52 h;
    public final e52 i;
    public final be7 j;

    public qjc(Context context, j8g j8gVar, k6f k6fVar, tad tadVar, String str, FileSystem fileSystem, e52 e52Var, e52 e52Var2, e52 e52Var3, be7 be7Var) {
        this.a = context;
        this.b = j8gVar;
        this.c = k6fVar;
        this.d = tadVar;
        this.e = str;
        this.f = fileSystem;
        this.g = e52Var;
        this.h = e52Var2;
        this.i = e52Var3;
        this.j = be7Var;
    }

    public static qjc a(qjc qjcVar, be7 be7Var) {
        Context context = qjcVar.a;
        j8g j8gVar = qjcVar.b;
        k6f k6fVar = qjcVar.c;
        tad tadVar = qjcVar.d;
        String str = qjcVar.e;
        FileSystem fileSystem = qjcVar.f;
        e52 e52Var = qjcVar.g;
        e52 e52Var2 = qjcVar.h;
        e52 e52Var3 = qjcVar.i;
        qjcVar.getClass();
        return new qjc(context, j8gVar, k6fVar, tadVar, str, fileSystem, e52Var, e52Var2, e52Var3, be7Var);
    }

    public final Context b() {
        return this.a;
    }

    public final be7 c() {
        return this.j;
    }

    public final FileSystem d() {
        return this.f;
    }

    public final k6f e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjc)) {
            return false;
        }
        qjc qjcVar = (qjc) obj;
        return x44.r(this.a, qjcVar.a) && x44.r(this.b, qjcVar.b) && this.c == qjcVar.c && this.d == qjcVar.d && x44.r(this.e, qjcVar.e) && x44.r(this.f, qjcVar.f) && this.g == qjcVar.g && this.h == qjcVar.h && this.i == qjcVar.i && x44.r(this.j, qjcVar.j);
    }

    public final j8g f() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ")";
    }
}

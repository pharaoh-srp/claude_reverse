package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j7b {
    public final String a;
    public final g7b b;
    public final f7b c;
    public final n7b d;
    public final d7b e;
    public final h7b f;

    static {
        xm7 xm7Var = new xm7();
        iz8 iz8Var = nz8.F;
        vde vdeVar = vde.I;
        List list = Collections.EMPTY_LIST;
        vde vdeVar2 = vde.I;
        e7b e7bVar = new e7b();
        h7b h7bVar = h7b.a;
        xm7Var.a();
        e7bVar.a();
        n7b n7bVar = n7b.B;
        ebh.w(0, 1, 2, 3, 4);
        tpi.w(5);
    }

    public j7b(String str, d7b d7bVar, g7b g7bVar, f7b f7bVar, n7b n7bVar, h7b h7bVar) {
        this.a = str;
        this.b = g7bVar;
        this.c = f7bVar;
        this.d = n7bVar;
        this.e = d7bVar;
        this.f = h7bVar;
    }

    public static j7b a(String str) {
        xm7 xm7Var = new xm7();
        iz8 iz8Var = nz8.F;
        vde vdeVar = vde.I;
        List list = Collections.EMPTY_LIST;
        vde vdeVar2 = vde.I;
        e7b e7bVar = new e7b();
        h7b h7bVar = h7b.a;
        Uri uri = str == null ? null : Uri.parse(str);
        return new j7b("", new d7b(xm7Var), uri != null ? new g7b(uri, null, null, list, vdeVar2, -9223372036854775807L) : null, new f7b(e7bVar), n7b.B, h7bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7b)) {
            return false;
        }
        j7b j7bVar = (j7b) obj;
        return Objects.equals(this.a, j7bVar.a) && this.e.equals(j7bVar.e) && Objects.equals(this.b, j7bVar.b) && this.c.equals(j7bVar.c) && Objects.equals(this.d, j7bVar.d) && Objects.equals(this.f, j7bVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g7b g7bVar = this.b;
        int iHashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (g7bVar != null ? g7bVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return iHashCode2;
    }
}

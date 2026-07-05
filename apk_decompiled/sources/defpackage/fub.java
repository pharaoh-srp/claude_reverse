package defpackage;

import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class fub {
    public final ByteString a;
    public p8b b;
    public final ArrayList c;

    public fub() {
        String strI = vb7.i();
        ByteString byteString = ByteString.H;
        this.a = ByteString.Companion.b(strI);
        this.b = hub.e;
        this.c = new ArrayList();
    }

    public final void a(wg8 wg8Var, tie tieVar) {
        tieVar.getClass();
        if (wg8Var.a("Content-Type") != null) {
            sz6.p("Unexpected header: Content-Type");
        } else if (wg8Var.a("Content-Length") != null) {
            sz6.p("Unexpected header: Content-Length");
        } else {
            this.c.add(new gub(wg8Var, tieVar));
        }
    }

    public final hub b() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            sz6.j("Multipart body must have at least one part.");
            return null;
        }
        return new hub(this.a, this.b, blj.k(arrayList));
    }

    public final void c(p8b p8bVar) {
        p8bVar.getClass();
        if (p8bVar.b.equals("multipart")) {
            this.b = p8bVar;
        } else {
            mr9.t("multipart != ", p8bVar);
        }
    }
}

package defpackage;

import java.util.List;
import java.util.regex.Pattern;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class js8 {
    static {
        ByteString byteString = ByteString.H;
        ByteString.Companion.b("\"\\");
        ByteString.Companion.b("\t ,=");
    }

    public static final boolean a(pqe pqeVar) {
        if (x44.r(pqeVar.E.b, "HEAD")) {
            return false;
        }
        int i = pqeVar.H;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || blj.f(pqeVar) != -1) {
            return true;
        }
        String strA = pqeVar.J.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        return "chunked".equalsIgnoreCase(strA);
    }

    public static final void b(i25 i25Var, vs8 vs8Var, wg8 wg8Var) {
        i25Var.getClass();
        vs8Var.getClass();
        wg8Var.getClass();
        if (i25Var == i25.a) {
            return;
        }
        Pattern pattern = g25.k;
        List listM = eve.M(vs8Var, wg8Var);
        if (listM.isEmpty()) {
            return;
        }
        i25Var.a(vs8Var, listM);
    }
}

package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Locale;
import okio.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class gk7 implements hh7 {
    public final dli a;
    public final qjc b;

    public gk7(dli dliVar, qjc qjcVar) {
        this.a = dliVar;
        this.b = qjcVar;
    }

    @Override // defpackage.hh7
    public final Object a(io6 io6Var) {
        String str = Path.F;
        String strJ = kud.j(this.a);
        String mimeTypeFromExtension = null;
        if (strJ == null) {
            sz6.j("filePath == null");
            return null;
        }
        Path pathA = Path.Companion.a(strJ);
        qi7 qi7VarC = ouk.c(pathA, this.b.f, null, null, 28);
        String strD1 = bsg.d1('.', pathA.b(), "");
        if (!bsg.I0(strD1)) {
            String lowerCase = strD1.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            mimeTypeFromExtension = (String) hkb.a.get(lowerCase);
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            }
        }
        return new oeg(qi7VarC, mimeTypeFromExtension, sg5.G);
    }
}

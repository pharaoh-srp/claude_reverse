package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Locale;
import okio.Okio;
import okio.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class pd9 implements hh7 {
    public final dli a;
    public final qjc b;

    public pd9(dli dliVar, qjc qjcVar) {
        this.a = dliVar;
        this.b = qjcVar;
    }

    @Override // defpackage.hh7
    public final Object a(io6 io6Var) {
        dli dliVar = this.a;
        String str = dliVar.e;
        if (str == null) {
            str = "";
        }
        int iF0 = bsg.F0(str, '!', 0, 6);
        String mimeTypeFromExtension = null;
        if (iF0 == -1) {
            mr9.k("Invalid jar:file URI: ", dliVar);
            return null;
        }
        String str2 = Path.F;
        Path pathA = Path.Companion.a(str.substring(0, iF0));
        Path pathA2 = Path.Companion.a(str.substring(iF0 + 1, str.length()));
        qi7 qi7VarC = ouk.c(pathA2, Okio.d(this.b.f, pathA), null, null, 28);
        String strD1 = bsg.d1('.', pathA2.b(), "");
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

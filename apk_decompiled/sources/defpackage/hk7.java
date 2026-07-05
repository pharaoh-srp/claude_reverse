package defpackage;

import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public final class hk7 implements pp9 {
    @Override // defpackage.pp9
    public final String a(Object obj, qjc qjcVar) {
        String strJ;
        dli dliVar = (dli) obj;
        String str = dliVar.c;
        if ((str != null && !x44.r(str, "file")) || dliVar.e == null || jqi.e(dliVar) || !mx8.b(qjcVar) || (strJ = kud.j(dliVar)) == null) {
            return null;
        }
        FileSystem fileSystemD = qjcVar.d();
        String str2 = Path.F;
        return dliVar + "-" + fileSystemD.K(Path.Companion.a(strJ)).f;
    }
}

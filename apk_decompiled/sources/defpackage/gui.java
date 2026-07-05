package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gui implements no5 {
    @Override // defpackage.no5
    public final oo5 a(oeg oegVar, qjc qjcVar) {
        String strB = oegVar.b();
        if (strB == null || !isg.q0(strB, "video/", false)) {
            return null;
        }
        return new hui(oegVar.c(), qjcVar);
    }
}

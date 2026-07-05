package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class qmg implements no5 {
    public final jkf a;

    public qmg(jkf jkfVar) {
        this.a = jkfVar;
    }

    @Override // defpackage.no5
    public final oo5 a(oeg oegVar, qjc qjcVar) {
        ImageDecoder.Source sourceF;
        Bitmap.Config configF = nx8.f(qjcVar);
        if ((configF == Bitmap.Config.ARGB_8888 || configF == Bitmap.Config.HARDWARE) && (sourceF = bhk.f(oegVar.c(), qjcVar)) != null) {
            return new yq1(sourceF, oegVar.c(), qjcVar, this.a);
        }
        return null;
    }
}

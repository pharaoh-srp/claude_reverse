package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class fli implements qp9 {
    @Override // defpackage.qp9
    public final String a(Object obj, rjc rjcVar) {
        Uri uri = (Uri) obj;
        if (!x44.r(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = rjcVar.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = l.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}

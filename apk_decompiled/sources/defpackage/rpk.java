package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class rpk {
    public static final bp0 a = new bp0(0);

    public static synchronized Uri a(String str) {
        Uri uri;
        bp0 bp0Var = a;
        uri = (Uri) bp0Var.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            bp0Var.put(str, uri);
        }
        return uri;
    }
}

package defpackage;

import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class br3 extends m3f {
    public final Set d;

    public br3(String str, o3f o3fVar) {
        super(o3fVar);
        this.d = mp0.Z0(new String[]{rtk.d("text/html"), "https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.10.0/highlight.min.js", str});
    }

    @Override // defpackage.m3f
    public final boolean b(Uri uri) {
        return this.d.contains(uri.toString());
    }
}

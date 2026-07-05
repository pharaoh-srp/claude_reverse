package defpackage;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj5 implements c07 {
    @Override // defpackage.c07
    public final Object a(Object obj) {
        ppe ppeVar = (ppe) obj;
        ppeVar.getClass();
        List list = ck5.f;
        gpe gpeVar = ppeVar.w;
        String str = gpeVar.d;
        str.getClass();
        String host = Uri.parse(str).getHost();
        if (!(host == null ? true : sf5.K(host))) {
            gpeVar.d = "[redacted-third-party]";
        }
        return ppeVar;
    }
}

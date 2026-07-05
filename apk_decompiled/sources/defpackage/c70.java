package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public final class c70 {
    public final /* synthetic */ int a;

    public /* synthetic */ c70(int i) {
        this.a = i;
    }

    public final dli a(Object obj, qjc qjcVar) {
        switch (this.a) {
            case 0:
                return ybi.t((Uri) obj);
            case 1:
                return kud.c(((File) obj).getPath());
            case 2:
                return kud.c(((Path) obj).E.t());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                try {
                    if (qjcVar.b().getResources().getResourceEntryName(iIntValue) != null) {
                        return kud.p("android.resource://" + qjcVar.b().getPackageName() + "/" + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return kud.p((String) obj);
        }
    }
}

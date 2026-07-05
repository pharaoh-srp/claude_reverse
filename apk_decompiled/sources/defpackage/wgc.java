package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wgc implements rzb {
    public static final ide b = new ide("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
    public final lsc a = mpk.P(null);

    public static Uri a(Uri uri, String str) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        queryParameterNames.getClass();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!x44.r((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        ArrayList<cpc> arrayList2 = new ArrayList(x44.y(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(new cpc(str2, uri.getQueryParameter(str2)));
        }
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (cpc cpcVar : arrayList2) {
            builderClearQuery.appendQueryParameter((String) cpcVar.E, (String) cpcVar.F);
        }
        builderClearQuery.appendQueryParameter(str, "true");
        Uri uriBuild = builderClearQuery.build();
        uriBuild.getClass();
        return uriBuild;
    }
}

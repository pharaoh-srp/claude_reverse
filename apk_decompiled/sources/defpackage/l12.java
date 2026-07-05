package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l12 {
    public final /* synthetic */ int a;

    public /* synthetic */ l12(int i) {
        this.a = i;
    }

    public final Object a(Object obj, rjc rjcVar) throws PackageManager.NameNotFoundException {
        String authority;
        switch (this.a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (l.c(uri)) {
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null && !scheme.equals("file")) {
                    return null;
                }
                String path = uri.getPath();
                if (!bsg.a1(path != null ? path : "", '/') || ((String) w44.N0(uri.getPathSegments())) == null) {
                    return null;
                }
                if (!x44.r(uri.getScheme(), "file")) {
                    return new File(uri.toString());
                }
                String path2 = uri.getPath();
                if (path2 != null) {
                    return new File(path2);
                }
                return null;
            case 2:
                return ((vs8) obj).i;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = rjcVar.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) == null) {
                        return null;
                    }
                    return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            case 4:
                Uri uri2 = (Uri) obj;
                if (!x44.r(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || bsg.I0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                String str = authority2 != null ? authority2 : "";
                Resources resourcesForApplication = rjcVar.a.getPackageManager().getResourcesForApplication(str);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
                if (identifier == 0) {
                    mr9.k("Invalid android.resource URI: ", uri2);
                    return null;
                }
                return Uri.parse("android.resource://" + str + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}

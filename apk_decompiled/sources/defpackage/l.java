package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    public static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
    public static final Bitmap.Config b = Bitmap.Config.HARDWARE;
    public static final wg8 c = new wg8((String[]) new ArrayList(20).toArray(new String[0]));

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || bsg.I0(str)) {
            return null;
        }
        String strI1 = bsg.i1('#', str, str);
        String strI12 = bsg.i1('?', strI1, strI1);
        return mimeTypeMap.getMimeTypeFromExtension(bsg.d1('.', bsg.d1('/', strI12, strI12), ""));
    }

    public static final boolean c(Uri uri) {
        return x44.r(uri.getScheme(), "file") && x44.r((String) w44.N0(uri.getPathSegments()), "android_asset");
    }

    public static final int d(kud kudVar, j6f j6fVar) {
        if (kudVar instanceof r46) {
            return ((r46) kudVar).M;
        }
        int iOrdinal = j6fVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        wg6.i();
        return 0;
    }
}

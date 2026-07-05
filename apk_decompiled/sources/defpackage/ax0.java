package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ax0 implements gh7 {
    public final /* synthetic */ int a;

    public /* synthetic */ ax0(int i) {
        this.a = i;
    }

    @Override // defpackage.gh7
    public final ih7 a(Object obj, rjc rjcVar) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                if (l.c(uri)) {
                    return new cx0(uri, rjcVar, 0);
                }
                return null;
            case 1:
                return new fr1((Bitmap) obj, rjcVar, 0);
            case 2:
                return new fr1((ByteBuffer) obj, rjcVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (x44.r(uri2.getScheme(), "content")) {
                    return new cx0(uri2, rjcVar, 1);
                }
                return null;
            case 4:
                return new fr1((Drawable) obj, rjcVar, 2);
            case 5:
                return new li7((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (x44.r(uri3.getScheme(), "android.resource")) {
                    return new cx0(uri3, rjcVar, 2);
                }
                return null;
        }
    }
}

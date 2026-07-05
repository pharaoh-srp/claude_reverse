package defpackage;

import android.os.Build;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xw2 {
    public static final /* synthetic */ xw2 a = new xw2();
    public static final pwf b;
    public static final Set c;

    static {
        pwf pwfVar = new pwf();
        pwfVar.add("image/bmp");
        pwfVar.add("image/jpeg");
        pwfVar.add("image/jpg");
        pwfVar.add("image/png");
        pwfVar.add("image/webp");
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            pwfVar.add("image/heic");
            pwfVar.add("image/heif");
            pwfVar.add("image/vnd.android.heic");
        }
        if (i >= 34) {
            pwfVar.add("image/avif");
        }
        b = sf5.k(pwfVar);
        c = mp0.Z0(new String[]{"image/jpeg", "image/jpg", "image/png", "image/webp", "image/gif"});
    }
}

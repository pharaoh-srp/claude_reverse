package defpackage;

import android.os.ext.SdkExtensions;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zr {
    public static final Set a = mp0.Z0(new vr[]{ys1.q, ys1.s, ys1.r, ys1.n, ys1.p, ys1.o, te5.g, te5.i, te5.h, qac.I0, dig.h, dig.j, dig.i, mng.g, mng.i, mng.h});

    public static final boolean a(vr vrVar) {
        vrVar.getClass();
        return SdkExtensions.getExtensionVersion(34) >= 10 || !a.contains(vrVar);
    }
}

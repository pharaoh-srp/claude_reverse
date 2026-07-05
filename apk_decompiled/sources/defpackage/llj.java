package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class llj {
    public final zlj a;
    public final String b;
    public final Context c;
    public final byi d;
    public final flj e;

    public llj(Context context, zlj zljVar, byi byiVar) {
        this.b = context.getPackageName();
        this.a = zljVar;
        this.d = byiVar;
        this.c = context;
        zlj zljVar2 = glj.a;
        char c = 0;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (glj.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.e = new flj(context, zljVar, mlj.a, new yl4(c));
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zljVar2.b("Play Store package is not found.", new Object[0]);
                }
            } else {
                zljVar2.b("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            zljVar2.b("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        zljVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", zlj.c(zljVar.a, "Phonesky is not installed.", objArr));
        }
        this.e = null;
    }

    public static /* bridge */ /* synthetic */ Bundle a(llj lljVar, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", lljVar.b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        aok.e(arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(aok.b(arrayList)));
        return bundle;
    }
}

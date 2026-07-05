package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import com.segment.analytics.kotlin.core.Settings;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class e10 implements n7d {
    public static final d10 Companion = new d10();
    public gx E;
    public Context F;
    public oog G;
    public JsonObject H;
    public JsonObject I;
    public JsonObject J;
    public JsonObject K;

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    @Override // defpackage.n7d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.segment.analytics.kotlin.core.BaseEvent a(com.segment.analytics.kotlin.core.BaseEvent r12) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e10.a(com.segment.analytics.kotlin.core.BaseEvent):com.segment.analytics.kotlin.core.BaseEvent");
    }

    @Override // defpackage.n7d
    public final void b(gx gxVar) {
        JsonObject jsonObjectA;
        Context context;
        this.E = gxVar;
        this.F = gxVar.E.b;
        this.G = gxVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonPrimitive jsonPrimitiveC = ch9.c("Android");
        jsonPrimitiveC.getClass();
        JsonPrimitive jsonPrimitiveC2 = ch9.c(Build.VERSION.RELEASE);
        jsonPrimitiveC2.getClass();
        this.I = new JsonObject(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Context context2 = this.F;
        if (context2 == null) {
            x44.o0("context");
            throw null;
        }
        DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
        this.K = new JsonObject(linkedHashMap2);
        try {
            context = this.F;
        } catch (PackageManager.NameNotFoundException unused) {
            jsonObjectA = s47.a;
        }
        if (context == null) {
            x44.o0("context");
            throw null;
        }
        PackageManager packageManager = context.getPackageManager();
        Context context3 = this.F;
        if (context3 == null) {
            x44.o0("context");
            throw null;
        }
        PackageInfo packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
        rh9 rh9Var = new rh9();
        dj9.b(rh9Var, "name", packageInfo.applicationInfo.loadLabel(packageManager));
        dj9.b(rh9Var, "version", packageInfo.versionName);
        dj9.b(rh9Var, "namespace", packageInfo.packageName);
        mpk.U(rh9Var, "build", Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode));
        jsonObjectA = rh9Var.a();
        this.H = jsonObjectA;
        oog oogVar = this.G;
        if (oogVar == null) {
            x44.o0("storage");
            throw null;
        }
        String strA = oogVar.a(9);
        if (strA == null) {
            strA = "";
        }
        rh9 rh9Var2 = new rh9();
        mpk.U(rh9Var2, "id", strA);
        mpk.U(rh9Var2, "manufacturer", Build.MANUFACTURER);
        mpk.U(rh9Var2, "model", Build.MODEL);
        mpk.U(rh9Var2, "name", Build.DEVICE);
        mpk.U(rh9Var2, "type", "android");
        this.J = rh9Var2.a();
        if (strA.length() == 0) {
            gb9.D((mp4) e().F.I, (e45) e().F.F, null, new m0(this, null, 15), 2);
        }
    }

    @Override // defpackage.n7d
    public final void c(Settings settings, int i) {
        mwa.X(settings, i);
    }

    @Override // defpackage.n7d
    public final gx e() {
        gx gxVar = this.E;
        if (gxVar != null) {
            return gxVar;
        }
        x44.o0("analytics");
        throw null;
    }

    @Override // defpackage.n7d
    public final m7d getType() {
        return m7d.E;
    }
}

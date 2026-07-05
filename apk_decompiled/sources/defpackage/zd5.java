package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zd5 implements f89 {
    public final String E;
    public final kea F;
    public final String G;
    public final String H;

    public zd5(Context context, String str, kea keaVar, b4e b4eVar) {
        this.E = str;
        this.F = keaVar;
        this.G = "com.anthropic.claude";
        try {
            String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            str2.getClass();
            this.G = str2;
        } catch (Exception e) {
            List list = xah.a;
            xah.f(e, "Package info not found for header interceptor", null, null, 28);
        }
        this.H = sq6.u("Claude ", this.G, Build.VERSION.SDK_INT, "/1.260618.10 (Android ", ")");
    }

    @Override // defpackage.f89
    public final pqe c(v4e v4eVar) {
        String str;
        jie jieVarB = v4eVar.e.b();
        jieVarB.d("User-Agent", this.H);
        jieVarB.d("Anthropic-Client-Platform", "android");
        jieVarB.d("Anthropic-Client-App", this.G);
        jieVarB.d("Anthropic-Client-Version", "1.260618.10");
        jieVarB.d("Anthropic-Client-OS-Version", String.valueOf(Build.VERSION.SDK_INT));
        jieVarB.d("Anthropic-Device-ID", this.E);
        cpc cpcVar = yfd.r;
        ArrayList arrayList = this.F.a;
        if ((cpcVar != null ? (List) cpcVar.E : null) == arrayList) {
            str = (String) cpcVar.F;
        } else {
            int size = arrayList.size();
            if (size > 3) {
                size = 3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(((Locale) arrayList.get(0)).toLanguageTag());
            float f = 1.0f;
            for (int i = 1; i < size; i++) {
                f -= 0.1f;
                sb.append(", " + ((Locale) arrayList.get(i)).toLanguageTag() + ";q=" + f);
            }
            String string = sb.toString();
            yfd.r = new cpc(arrayList, string);
            str = string;
        }
        jieVarB.d("Accept-Language", str);
        return v4eVar.b(new kie(jieVarB));
    }
}

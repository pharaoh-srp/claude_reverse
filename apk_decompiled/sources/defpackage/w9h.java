package defpackage;

import android.app.Service;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.anthropic.claude.tool.model.UserLocationV0Input;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class w9h implements zdc, lp3, gsi, plj, de1, g1l {
    public final Object E;

    public w9h(float f, float f2, sb0 sb0Var) {
        int[] iArr = esi.a;
        this.E = new dpf(sb0Var != null ? new bnh(f, f2, sb0Var) : new cbi(f, f2));
    }

    @Override // defpackage.gsi, defpackage.dsi
    public boolean a() {
        ((dpf) this.E).getClass();
        return false;
    }

    @Override // defpackage.de1
    public void b(hh4 hh4Var) {
        ((i88) this.E).b(hh4Var);
    }

    @Override // defpackage.g1l
    public void c(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        jsk jskVar = (jsk) this.E;
        umk umkVar = (umk) jskVar.E;
        if (zIsEmpty) {
            umkVar.R.getClass();
            jskVar.X0("auto", "_err", bundle, true, true, System.currentTimeMillis());
        } else {
            umkVar.getClass();
            sz6.j("Unexpected call on client side");
        }
    }

    @Override // defpackage.qlj
    public /* bridge */ /* synthetic */ Object d() {
        return new hlj((llj) ((nlj) this.E).d());
    }

    @Override // defpackage.dsi
    public long e(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return ((dpf) this.E).e(sb0Var, sb0Var2, sb0Var3);
    }

    @Override // defpackage.dsi
    public sb0 f(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return ((dpf) this.E).f(j, sb0Var, sb0Var2, sb0Var3);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(android.content.Context r18, com.anthropic.claude.tool.model.UserLocationV0Input r19, defpackage.vp4 r20) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9h.g(android.content.Context, com.anthropic.claude.tool.model.UserLocationV0Input, vp4):java.lang.Object");
    }

    public void h(String str, Bundle bundle) {
        String string;
        umk umkVar = (umk) this.E;
        vik vikVar = umkVar.L;
        wlk wlkVar = umkVar.N;
        umk.d(wlkVar);
        wlkVar.K0();
        if (umkVar.e()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        umk.c(vikVar);
        vikVar.b0.h(string);
        umk.c(vikVar);
        kjk kjkVar = vikVar.c0;
        umkVar.R.getClass();
        kjkVar.b(System.currentTimeMillis());
    }

    public qgk i() {
        qgk qgkVar = umk.a((Service) this.E, null, null).M;
        umk.d(qgkVar);
        return qgkVar;
    }

    public boolean j() {
        vik vikVar = ((umk) this.E).L;
        umk.c(vikVar);
        return vikVar.c0.a() > 0;
    }

    public boolean l() {
        umk umkVar = (umk) this.E;
        if (!j()) {
            return false;
        }
        umkVar.R.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        vik vikVar = umkVar.L;
        umk.c(vikVar);
        return jCurrentTimeMillis - vikVar.c0.a() > umkVar.K.S0(null, zvj.V);
    }

    public void m(int i, Object obj, klk klkVar) {
        xak xakVar = (xak) this.E;
        h8k h8kVar = (h8k) obj;
        xakVar.j(i, 2);
        xakVar.l(h8kVar.c(klkVar));
        klkVar.c(h8kVar, this);
    }

    @Override // defpackage.zdc
    public void onComplete(d5h d5hVar) {
        Exception excD = d5hVar.d();
        if (excD != null) {
            ((ua2) this.E).resumeWith(new hre(excD));
            return;
        }
        boolean z = ((r5l) d5hVar).d;
        ua2 ua2Var = (ua2) this.E;
        if (z) {
            ua2Var.q(null);
        } else {
            ua2Var.resumeWith(d5hVar.e());
        }
    }

    @Override // defpackage.dsi
    public sb0 p(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return ((dpf) this.E).p(j, sb0Var, sb0Var2, sb0Var3);
    }

    @Override // defpackage.dsi
    public sb0 q(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return ((dpf) this.E).q(sb0Var, sb0Var2, sb0Var3);
    }

    @Override // defpackage.lp3
    public /* bridge */ /* synthetic */ Object w(Context context, Object obj, String str, cxh cxhVar) {
        return g(context, (UserLocationV0Input) obj, cxhVar);
    }

    public w9h(xak xakVar) {
        Charset charset = kfk.a;
        this.E = xakVar;
        xakVar.a = this;
    }

    public /* synthetic */ w9h(Object obj) {
        this.E = obj;
    }
}

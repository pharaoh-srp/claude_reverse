package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.anthropic.claude.sessions.types.SessionExternalMetadataV2;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class wk {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public wk(fj0 fj0Var) {
        km3 km3Var = (km3) fj0Var.G;
        xt7 xt7VarA = km3Var.b.a(28.0f);
        long jB = eve.B(28);
        dv7 dv7Var = dv7.F;
        this.d = new tkh(0L, jB, x44.S(), null, xt7VarA, 0L, 0L, 0, 3, eve.y(1.3d), km3Var.d, 15531993);
        this.e = new tkh(0L, eve.B(24), x44.S(), null, km3Var.b.a(24.0f), 0L, 0L, 0, 3, eve.y(1.3d), km3Var.d, 15531993);
        this.a = new tkh(0L, eve.B(20), x44.S(), null, km3Var.b.a(20.0f), 0L, 0L, 0, 3, eve.y(1.3d), km3Var.d, 15531993);
        xt7 xt7VarA2 = km3Var.b.a(17.0f);
        long jB2 = eve.B(17);
        dv7 dv7Var2 = dv7.J;
        tkh tkhVar = new tkh(0L, jB2, dv7Var2, null, xt7VarA2, 0L, 0L, 0, 3, eve.y(1.5d), km3Var.d, 15531993);
        this.f = tkhVar;
        this.g = tkh.b(tkhVar, 0L, 0L, x44.S(), null, null, 0L, null, 0, 0L, null, 0, 16777211);
        tkh tkhVar2 = new tkh(0L, eve.B(15), dv7Var2, null, km3Var.b.a(15.0f), 0L, 0L, 0, 3, eve.y(1.5d), km3Var.d, 15531993);
        this.h = tkhVar2;
        this.b = tkh.b(tkhVar2, 0L, 0L, x44.S(), null, null, 0L, null, 0, 0L, null, 0, 16777211);
        this.c = new tkh(0L, eve.B(15), dv7Var2, null, km3Var.c.a(13.0f), 0L, 0L, 0, 1, eve.y(1.5d), km3Var.d, 15531993);
        this.i = new tkh(0L, eve.B(13), dv7Var2, null, km3Var.c.a(11.0f), 0L, 0L, 0, 1, eve.y(1.5d), km3Var.d, 15531993);
    }

    public wk a(bo5 bo5Var, List list, txb txbVar, cbi cbiVar, zp3 zp3Var, wp1 wp1Var) {
        list.getClass();
        txbVar.getClass();
        zp3Var.getClass();
        wp1Var.getClass();
        r06 r06Var = (r06) this.d;
        int i = wp1Var.b;
        if ((i != 1 || wp1Var.c < 4) && i <= 1) {
            zp3Var = (zp3) this.g;
        }
        return new wk(r06Var, txbVar, bo5Var, cbiVar, zp3Var, wp1Var, (d16) this.b, (aai) this.c, list);
    }

    public void c() {
        lsc lscVar = (lsc) this.i;
        if (((Boolean) lscVar.getValue()).booleanValue()) {
            return;
        }
        ((pl) this.a).a.edit().putBoolean("dispatch_upsell_dismissed", true).apply();
        lscVar.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0077 -> B:21:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(boolean r13, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk.d(boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0360 A[Catch: IOException -> 0x0367, TryCatch #0 {IOException -> 0x0367, blocks: (B:64:0x0344, B:66:0x0360, B:76:0x0376, B:77:0x037b, B:78:0x0380), top: B:103:0x0344 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(defpackage.g91 r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk.e(g91, int):void");
    }

    public void f() {
        lsc lscVar = (lsc) this.b;
        if (((Boolean) lscVar.getValue()).booleanValue()) {
            return;
        }
        ((pl) this.a).a.edit().putBoolean("onboarding_completed", true).apply();
        lscVar.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(defpackage.vp4 r10) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk.g(vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        if (r10 == r8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(defpackage.vp4 r10) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk.h(vp4):java.lang.Object");
    }

    public void i(SessionExternalMetadataV2 sessionExternalMetadataV2) {
        String dispatch_agent_name;
        String string;
        String str = null;
        if (sessionExternalMetadataV2 != null && (dispatch_agent_name = sessionExternalMetadataV2.getDispatch_agent_name()) != null && (string = bsg.k1(dispatch_agent_name).toString()) != null && string.length() > 0) {
            str = string;
        }
        ((lsc) this.b).setValue(str);
        SharedPreferences.Editor editorEdit = ((pl) this.a).a.edit();
        if (str == null) {
            editorEdit.remove("dispatch_agent_name");
        } else {
            editorEdit.putString("dispatch_agent_name", str);
        }
        editorEdit.apply();
    }

    public wk(jwf jwfVar, qzb qzbVar, pl plVar, vl vlVar, dm dmVar, wl wlVar) {
        this.d = jwfVar;
        this.e = qzbVar;
        this.a = plVar;
        this.f = vlVar;
        this.g = dmVar;
        this.h = wlVar;
        this.b = mpk.P(plVar.a.getString("dispatch_agent_name", null));
        this.i = new mdg();
        this.c = mpk.P(null);
    }

    public wk(Context context, jjb jjbVar, sze szeVar, fj0 fj0Var, Executor executor, sze szeVar2, wp3 wp3Var, wp3 wp3Var2, sze szeVar3) {
        this.d = context;
        this.e = jjbVar;
        this.a = szeVar;
        this.f = fj0Var;
        this.g = executor;
        this.h = szeVar2;
        this.b = wp3Var;
        this.c = wp3Var2;
        this.i = szeVar3;
    }

    public wk(r06 r06Var, txb txbVar, bo5 bo5Var, cbi cbiVar, zp3 zp3Var, wp1 wp1Var, d16 d16Var, aai aaiVar, List list) {
        txbVar.getClass();
        bo5Var.getClass();
        zp3Var.getClass();
        wp1Var.getClass();
        list.getClass();
        this.d = r06Var;
        this.e = txbVar;
        this.a = bo5Var;
        this.f = cbiVar;
        this.g = zp3Var;
        this.h = wp1Var;
        this.b = d16Var;
        this.c = new aai(this, aaiVar, list, "Deserializer for \"" + bo5Var.getName() + '\"', d16Var != null ? d16Var.d() : "[container not found]");
        this.i = new bab(this);
    }

    public wk(mp4 mp4Var, pl plVar, i8c i8cVar, koi koiVar, z8c z8cVar, vl vlVar) {
        this.d = mp4Var;
        this.a = plVar;
        this.e = i8cVar;
        this.f = koiVar;
        this.g = z8cVar;
        this.h = vlVar;
        SharedPreferences sharedPreferences = plVar.a;
        this.b = sq6.l(sharedPreferences, "onboarding_completed", false);
        this.c = sq6.l(sharedPreferences, "intro_banner_dismissed", false);
        this.i = sq6.l(sharedPreferences, "dispatch_upsell_dismissed", false);
    }
}

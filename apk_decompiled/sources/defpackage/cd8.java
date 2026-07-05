package defpackage;

import com.anthropic.claude.api.account.GrowthBookSchema;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public final class cd8 implements rc8 {
    public final mdg a = new mdg();
    public final mdg b;
    public final LinkedHashMap c;
    public final boolean d;

    public cd8() {
        mdg mdgVar = new mdg();
        mdgVar.putAll(nm6.E);
        this.b = mdgVar;
        this.c = new LinkedHashMap();
        this.d = true;
    }

    @Override // defpackage.rc8
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.rc8
    public final Object c(GrowthBookSchema growthBookSchema, vp4 vp4Var) {
        return iei.a;
    }

    @Override // defpackage.rc8
    public final wlg d() {
        return mpk.P(null);
    }

    @Override // defpackage.rc8
    public final void e() {
    }

    @Override // defpackage.rc8
    public final wlg f(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        return mpk.w(new bd8(this, str, 1));
    }

    @Override // defpackage.rc8
    public final wlg g(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        return mpk.w(new bd8(this, str, 0));
    }

    @Override // defpackage.rc8
    public final void h(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
    }

    @Override // defpackage.rc8
    public final Object i(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.rc8
    public final void j(String str) {
        str.getClass();
    }

    @Override // defpackage.rc8
    public final void k(String str, boolean z) {
        str.getClass();
    }

    @Override // defpackage.rc8
    public final Object l(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        Object obj = this.b.get(str);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.rc8
    public final wlg m(String str) {
        this.c.put(str, Boolean.valueOf(x44.r(this.a.get(str), Boolean.TRUE)));
        return mpk.w(new bd8(this, str, 2));
    }

    @Override // defpackage.rc8
    public final pg7 n(String str) {
        str.getClass();
        return null;
    }

    @Override // defpackage.rc8
    public final boolean o(String str) {
        boolean zR = x44.r(this.a.get(str), Boolean.TRUE);
        this.c.put(str, Boolean.valueOf(zR));
        return zR;
    }

    @Override // defpackage.rc8
    public final void p() {
    }

    @Override // defpackage.rc8
    public final Set q() {
        return um6.E;
    }

    @Override // defpackage.rc8
    public final void r(k4i k4iVar) {
        k4iVar.getClass();
    }
}

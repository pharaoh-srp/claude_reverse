package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.types.strings.SessionId;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class otf {
    public final SharedPreferences a;
    public final bg9 b;
    public final lsc c = mpk.P(nm6.E);
    public final n2g d;
    public final n2g e;

    public otf(SharedPreferences sharedPreferences, bg9 bg9Var, loi loiVar, h86 h86Var) {
        this.a = sharedPreferences;
        this.b = bg9Var;
        n2g n2gVarB = o2g.b(32, 1, py1.F);
        this.d = n2gVarB;
        this.e = n2gVarB;
        gb9.D(loiVar, h86Var.b(), null, new l6b(this, null, 9), 2);
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (x44.r(b().get(str), str2)) {
            this.c.setValue(sta.i0(str, b()));
            d();
            this.d.f(SessionId.m1114boximpl(str));
        }
    }

    public final Map b() {
        return (Map) this.c.getValue();
    }

    public final void c(String str, String str2) {
        Map mapB;
        str.getClass();
        str2.getClass();
        if (x44.r(b().get(str), str2)) {
            return;
        }
        if (b().containsKey(str) || b().size() < 500) {
            mapB = b();
        } else {
            List<Map.Entry> listI0 = w44.I0(b().entrySet(), b().size() - 499);
            int iD0 = tta.d0(x44.y(listI0, 10));
            if (iD0 < 16) {
                iD0 = 16;
            }
            mapB = new LinkedHashMap(iD0);
            for (Map.Entry entry : listI0) {
                mapB.put(entry.getKey(), entry.getValue());
            }
        }
        this.c.setValue(sta.m0(mapB, new cpc(str, str2)));
        d();
    }

    public final void d() {
        SharedPreferences.Editor editorEdit = this.a.edit();
        Map mapB = b();
        srg srgVar = srg.a;
        editorEdit.putString("pending_acks", this.b.d(mapB, new f7a(srgVar, srgVar)));
        editorEdit.apply();
    }
}

package defpackage;

import com.anthropic.claude.api.sync.GHEConnectionStatus;
import com.anthropic.claude.code.remote.stores.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e58 {
    public final r0h a;
    public final String b;
    public final a c;
    public final h86 d;
    public final qi3 e;
    public final lsc f;
    public final lsc g;
    public final lsc h;
    public final lsc i;
    public final lsc j;
    public final lsc k;
    public final lsc l;
    public String m;

    public e58(r0h r0hVar, String str, a aVar, h86 h86Var, qi3 qi3Var) {
        str.getClass();
        this.a = r0hVar;
        this.b = str;
        this.c = aVar;
        this.d = h86Var;
        this.e = qi3Var;
        Boolean bool = Boolean.FALSE;
        this.f = mpk.P(bool);
        this.g = mpk.P(lm6.E);
        this.h = mpk.P(bool);
        this.i = mpk.P(bool);
        this.j = mpk.P(null);
        this.k = mpk.P(null);
        this.l = mpk.P(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r16, java.lang.String r17, java.lang.String r18, defpackage.vp4 r19) {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e58.a(java.lang.String, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public final boolean b() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, java.lang.String r9, defpackage.vp4 r10) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e58.c(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public final boolean d() {
        if (((Boolean) this.f.getValue()).booleanValue()) {
            return true;
        }
        List list = (List) this.g.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((GHEConnectionStatus) it.next()).is_connected()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.vp4 r12) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e58.e(vp4):java.lang.Object");
    }

    public final void f(boolean z) {
        this.l.setValue(Boolean.valueOf(z));
    }

    public final void g(Throwable th) {
        this.j.setValue(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r11, defpackage.vp4 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e58.h(java.lang.String, vp4):java.lang.Object");
    }
}

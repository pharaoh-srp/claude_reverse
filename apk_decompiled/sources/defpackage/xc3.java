package defpackage;

import android.content.Context;
import android.content.Intent;
import com.anthropic.claude.bell.BellModeService;
import com.anthropic.claude.types.strings.MessageId;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class xc3 {
    public final gj1 a;
    public final kdg b;
    public final l45 c;
    public final ub2 d;
    public final a33 e;
    public final a33 f;
    public final a33 g;
    public final en1 h;
    public final mdg i;
    public int j;
    public final ArrayList k;
    public fkg l;
    public boolean m;
    public boolean n;

    public xc3(Context context, koi koiVar, String str, String str2, String str3, String str4, String str5, boolean z, gj1 gj1Var, kdg kdgVar, mp4 mp4Var, ub2 ub2Var, a33 a33Var, a33 a33Var2, a33 a33Var3) {
        context.getClass();
        koiVar.getClass();
        str.getClass();
        gj1Var.getClass();
        kdgVar.getClass();
        mp4Var.getClass();
        this.a = gj1Var;
        this.b = kdgVar;
        this.c = mp4Var;
        this.d = ub2Var;
        this.e = a33Var;
        this.f = a33Var2;
        this.g = a33Var3;
        this.h = new en1(context, str, str2, str3, str4, str5, z, koiVar.d, koiVar.e, new v0(28, this), new d7(22, this));
        this.i = new mdg();
        this.k = new ArrayList();
    }

    public final void a() {
        if (this.m) {
            return;
        }
        boolean z = true;
        this.m = true;
        fkg fkgVar = this.l;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.l = null;
        en1 en1Var = this.h;
        Context context = en1Var.a;
        amg amgVar = en1Var.q;
        if (en1Var.l != null) {
            fn1 fn1Var = (fn1) amgVar.getValue();
            if (fn1Var != null) {
                en1Var.s = ((tn1) fn1Var).l();
            }
            BellModeService bellModeService = en1Var.m;
            if (bellModeService != null) {
                bellModeService.c();
            }
            fn1 fn1Var2 = (fn1) amgVar.getValue();
            if (fn1Var2 != null) {
                en1Var.t = ((tn1) fn1Var2).c0;
            }
            en1Var.p = true;
            if (en1Var.m == null) {
                context.stopService(new Intent(context, (Class<?>) BellModeService.class));
            }
            en1Var.b();
        }
        en1 en1Var2 = this.h;
        en1Var2.o = true;
        en1Var2.b();
        en1Var2.a.stopService(new Intent(en1Var2.a, (Class<?>) BellModeService.class));
        bz7 bz7Var = BellModeService.T;
        if (BellModeService.T == en1Var2.n) {
            BellModeService.T = null;
        }
        en1Var2.n = null;
        this.i.clear();
        this.d.invoke(Boolean.FALSE);
        this.e.invoke(null);
        this.g.invoke(this.h.t);
        a33 a33Var = this.f;
        if (!this.n && !this.h.s) {
            z = false;
        }
        a33Var.invoke(Boolean.valueOf(z));
    }

    public final en1 b() {
        return this.h;
    }

    public final mdg c() {
        return this.i;
    }

    public final String d(int i) {
        while (true) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > i) {
                return ((MessageId) arrayList.get(i)).m1057unboximpl();
            }
            String string = UUID.randomUUID().toString();
            string.getClass();
            arrayList.add(MessageId.m1051boximpl(MessageId.m1052constructorimpl(string)));
        }
    }

    public final void e() {
        en1 en1Var = this.h;
        if (en1Var.l == null && !this.m) {
            en1Var.c();
        }
    }

    public final void f() {
        this.j = this.b.size();
        this.l = gb9.D(this.c, null, null, new nn1(this, new dae(), (tp4) null, 29), 3);
        this.h.c();
        if (this.m) {
            this.l = null;
        }
    }
}

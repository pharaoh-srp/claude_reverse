package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ay7 implements tf8, u5f, eyi {
    public final cx7 E;
    public final dyi F;
    public final fc G;
    public p4a H = null;
    public q28 I = null;

    public ay7(cx7 cx7Var, dyi dyiVar, fc fcVar) {
        this.E = cx7Var;
        this.F = dyiVar;
        this.G = fcVar;
    }

    @Override // defpackage.m4a
    public final c4a a() {
        b();
        return this.H;
    }

    public final void b() {
        if (this.H == null) {
            this.H = new p4a(this, true);
            t5f t5fVar = new t5f(this, new p3f(4, this));
            this.I = new q28(t5fVar, 29);
            t5fVar.a();
            this.G.run();
        }
    }

    @Override // defpackage.tf8
    public final sub d() {
        Application application;
        cx7 cx7Var = this.E;
        Context applicationContext = cx7Var.F().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        sub subVar = new sub(0);
        LinkedHashMap linkedHashMap = subVar.a;
        if (application != null) {
            linkedHashMap.put(yxi.d, application);
        }
        linkedHashMap.put(o5f.a, cx7Var);
        linkedHashMap.put(o5f.b, this);
        Bundle bundle = cx7Var.J;
        if (bundle != null) {
            linkedHashMap.put(o5f.c, bundle);
        }
        return subVar;
    }

    public final boolean e() {
        return this.H != null;
    }

    @Override // defpackage.eyi
    public final dyi f() {
        b();
        return this.F;
    }

    @Override // defpackage.u5f
    public final q28 g() {
        b();
        return (q28) this.I.G;
    }

    public final void h() {
        p4a p4aVar = this.H;
        p4aVar.e("setCurrentState");
        p4aVar.g(a4a.G);
    }
}

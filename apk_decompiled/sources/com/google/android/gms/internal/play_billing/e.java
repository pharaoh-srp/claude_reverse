package com.google.android.gms.internal.play_billing;

import defpackage.k5l;
import defpackage.p4l;
import defpackage.u4l;
import defpackage.x0l;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public Object a;
    public u4l b;
    public k5l c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        u4l u4lVar = this.b;
        if (u4lVar != null) {
            p4l p4lVar = u4lVar.F;
            p4lVar.getClass();
            if (obj == null) {
                obj = x0l.K;
            }
            if (x0l.J.p(p4lVar, null, obj)) {
                x0l.d(p4lVar);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        k5l k5lVar;
        u4l u4lVar = this.b;
        if (u4lVar != null) {
            p4l p4lVar = u4lVar.F;
            if (!p4lVar.isDone()) {
                if (x0l.J.p(p4lVar, null, new c(new zzq("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)))))) {
                    x0l.d(p4lVar);
                }
            }
        }
        if (this.d || (k5lVar = this.c) == null) {
            return;
        }
        k5lVar.i(null);
    }
}

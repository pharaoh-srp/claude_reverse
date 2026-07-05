package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.gs9;
import defpackage.iz5;
import defpackage.lr5;
import defpackage.o94;
import defpackage.or5;
import defpackage.p94;
import defpackage.pl7;
import defpackage.pv5;
import defpackage.ql8;
import defpackage.qzd;
import defpackage.rl8;
import defpackage.sl8;
import defpackage.sz6;
import defpackage.t81;
import defpackage.wb1;
import defpackage.x44;
import defpackage.xh6;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        o94 o94VarB = p94.b(pv5.class);
        o94VarB.a(new iz5(2, 0, t81.class));
        o94VarB.f = new sz6(27);
        arrayList.add(o94VarB.b());
        qzd qzdVar = new qzd(wb1.class, Executor.class);
        o94 o94Var = new o94(or5.class, new Class[]{rl8.class, sl8.class});
        o94Var.a(iz5.a(Context.class));
        o94Var.a(iz5.a(pl7.class));
        o94Var.a(new iz5(2, 0, ql8.class));
        o94Var.a(new iz5(1, 1, pv5.class));
        o94Var.a(new iz5(qzdVar, 1, 0));
        o94Var.f = new lr5(qzdVar, 0);
        arrayList.add(o94Var.b());
        arrayList.add(x44.D("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(x44.D("fire-core", "21.0.0"));
        arrayList.add(x44.D("device-name", a(Build.PRODUCT)));
        arrayList.add(x44.D("device-model", a(Build.DEVICE)));
        arrayList.add(x44.D("device-brand", a(Build.BRAND)));
        arrayList.add(x44.J("android-target-sdk", new xh6(11)));
        arrayList.add(x44.J("android-min-sdk", new xh6(12)));
        arrayList.add(x44.J("android-platform", new xh6(13)));
        arrayList.add(x44.J("android-installer", new xh6(14)));
        try {
            string = gs9.I.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(x44.D("kotlin", string));
        }
        return arrayList;
    }
}

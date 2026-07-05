package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.da4;
import defpackage.i6i;
import defpackage.iz5;
import defpackage.k6i;
import defpackage.lr5;
import defpackage.mr9;
import defpackage.mvg;
import defpackage.o94;
import defpackage.p94;
import defpackage.pl7;
import defpackage.pv5;
import defpackage.qzd;
import defpackage.sl8;
import defpackage.sz6;
import defpackage.x44;
import defpackage.yl7;
import defpackage.zl7;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(qzd qzdVar, da4 da4Var) {
        pl7 pl7Var = (pl7) da4Var.a(pl7.class);
        if (da4Var.a(zl7.class) == null) {
            return new FirebaseMessaging(pl7Var, da4Var.e(pv5.class), da4Var.e(sl8.class), (yl7) da4Var.a(yl7.class), da4Var.h(qzdVar), (mvg) da4Var.a(mvg.class));
        }
        mr9.o();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p94> getComponents() {
        qzd qzdVar = new qzd(i6i.class, k6i.class);
        o94 o94VarB = p94.b(FirebaseMessaging.class);
        o94VarB.a = LIBRARY_NAME;
        o94VarB.a(iz5.a(pl7.class));
        o94VarB.a(new iz5(0, 0, zl7.class));
        o94VarB.a(new iz5(0, 1, pv5.class));
        o94VarB.a(new iz5(0, 1, sl8.class));
        o94VarB.a(iz5.a(yl7.class));
        o94VarB.a(new iz5(qzdVar, 0, 1));
        o94VarB.a(iz5.a(mvg.class));
        o94VarB.f = new lr5(qzdVar, 1);
        if (o94VarB.d == 0) {
            o94VarB.d = 1;
            return Arrays.asList(o94VarB.b(), x44.D(LIBRARY_NAME, "24.0.1"));
        }
        sz6.j("Instantiation type has already been set.");
        return null;
    }
}

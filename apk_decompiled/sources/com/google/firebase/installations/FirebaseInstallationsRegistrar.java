package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.da4;
import defpackage.gnf;
import defpackage.iz5;
import defpackage.n94;
import defpackage.o94;
import defpackage.p94;
import defpackage.pl7;
import defpackage.ql8;
import defpackage.qzd;
import defpackage.rl8;
import defpackage.wb1;
import defpackage.x44;
import defpackage.xh6;
import defpackage.xl7;
import defpackage.xr1;
import defpackage.yl7;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static yl7 lambda$getComponents$0(da4 da4Var) {
        return new xl7((pl7) da4Var.a(pl7.class), da4Var.e(rl8.class), (ExecutorService) da4Var.i(new qzd(wb1.class, ExecutorService.class)), new gnf((Executor) da4Var.i(new qzd(xr1.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p94> getComponents() {
        o94 o94VarB = p94.b(yl7.class);
        o94VarB.a = LIBRARY_NAME;
        o94VarB.a(iz5.a(pl7.class));
        int i = 0;
        o94VarB.a(new iz5(0, 1, rl8.class));
        o94VarB.a(new iz5(new qzd(wb1.class, ExecutorService.class), 1, 0));
        o94VarB.a(new iz5(new qzd(xr1.class, Executor.class), 1, 0));
        o94VarB.f = new xh6(15);
        p94 p94VarB = o94VarB.b();
        ql8 ql8Var = new ql8(i);
        o94 o94VarB2 = p94.b(ql8.class);
        o94VarB2.e = 1;
        o94VarB2.f = new n94(i, ql8Var);
        return Arrays.asList(p94VarB, o94VarB2.b(), x44.D(LIBRARY_NAME, "18.0.0"));
    }
}

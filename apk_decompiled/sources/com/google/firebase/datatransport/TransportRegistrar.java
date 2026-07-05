package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.da4;
import defpackage.g42;
import defpackage.i6i;
import defpackage.iz5;
import defpackage.k6i;
import defpackage.n6i;
import defpackage.o2a;
import defpackage.o94;
import defpackage.p94;
import defpackage.pmf;
import defpackage.qzd;
import defpackage.x44;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k6i lambda$getComponents$0(da4 da4Var) {
        n6i.b((Context) da4Var.a(Context.class));
        return n6i.a().c(g42.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k6i lambda$getComponents$1(da4 da4Var) {
        n6i.b((Context) da4Var.a(Context.class));
        return n6i.a().c(g42.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k6i lambda$getComponents$2(da4 da4Var) {
        n6i.b((Context) da4Var.a(Context.class));
        return n6i.a().c(g42.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p94> getComponents() {
        o94 o94VarB = p94.b(k6i.class);
        o94VarB.a = LIBRARY_NAME;
        o94VarB.a(iz5.a(Context.class));
        o94VarB.f = new pmf(14);
        p94 p94VarB = o94VarB.b();
        o94 o94VarA = p94.a(new qzd(o2a.class, k6i.class));
        o94VarA.a(iz5.a(Context.class));
        o94VarA.f = new pmf(15);
        p94 p94VarB2 = o94VarA.b();
        o94 o94VarA2 = p94.a(new qzd(i6i.class, k6i.class));
        o94VarA2.a(iz5.a(Context.class));
        o94VarA2.f = new pmf(16);
        return Arrays.asList(p94VarB, p94VarB2, o94VarA2.b(), x44.D(LIBRARY_NAME, "18.2.0"));
    }
}

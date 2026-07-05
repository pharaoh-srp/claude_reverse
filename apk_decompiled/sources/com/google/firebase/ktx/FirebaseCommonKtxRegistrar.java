package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.c0l;
import defpackage.e45;
import defpackage.hj6;
import defpackage.iz5;
import defpackage.lyk;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.o94;
import defpackage.p94;
import defpackage.pyk;
import defpackage.qzd;
import defpackage.rdi;
import defpackage.wb1;
import defpackage.x44;
import defpackage.xr1;
import defpackage.z4a;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@lz5
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lp94;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p94> getComponents() {
        o94 o94VarA = p94.a(new qzd(wb1.class, e45.class));
        o94VarA.a(new iz5(new qzd(wb1.class, Executor.class), 1, 0));
        o94VarA.f = lyk.M;
        p94 p94VarB = o94VarA.b();
        o94 o94VarA2 = p94.a(new qzd(z4a.class, e45.class));
        o94VarA2.a(new iz5(new qzd(z4a.class, Executor.class), 1, 0));
        o94VarA2.f = pyk.K;
        p94 p94VarB2 = o94VarA2.b();
        o94 o94VarA3 = p94.a(new qzd(xr1.class, e45.class));
        o94VarA3.a(new iz5(new qzd(xr1.class, Executor.class), 1, 0));
        o94VarA3.f = c0l.L;
        p94 p94VarB3 = o94VarA3.b();
        o94 o94VarA4 = p94.a(new qzd(rdi.class, e45.class));
        o94VarA4.a(new iz5(new qzd(rdi.class, Executor.class), 1, 0));
        o94VarA4.f = hj6.K;
        return x44.X(p94VarB, p94VarB2, p94VarB3, o94VarA4.b());
    }
}

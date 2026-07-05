package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.iuj;
import defpackage.lw9;
import defpackage.o94;
import defpackage.p94;
import defpackage.pa4;
import defpackage.qzd;
import defpackage.rdi;
import defpackage.wb1;
import defpackage.xh6;
import defpackage.xr1;
import defpackage.z4a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final lw9 a = new lw9(new pa4(1));
    public static final lw9 b = new lw9(new pa4(2));
    public static final lw9 c = new lw9(new pa4(3));
    public static final lw9 d = new lw9(new pa4(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        qzd qzdVar = new qzd(wb1.class, ScheduledExecutorService.class);
        qzd[] qzdVarArr = {new qzd(wb1.class, ExecutorService.class), new qzd(wb1.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qzdVar);
        for (qzd qzdVar2 : qzdVarArr) {
            iuj.q("Null interface", qzdVar2);
        }
        Collections.addAll(hashSet, qzdVarArr);
        p94 p94Var = new p94(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new xh6(7), hashSet3);
        qzd qzdVar3 = new qzd(xr1.class, ScheduledExecutorService.class);
        qzd[] qzdVarArr2 = {new qzd(xr1.class, ExecutorService.class), new qzd(xr1.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qzdVar3);
        for (qzd qzdVar4 : qzdVarArr2) {
            iuj.q("Null interface", qzdVar4);
        }
        Collections.addAll(hashSet4, qzdVarArr2);
        p94 p94Var2 = new p94(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new xh6(8), hashSet6);
        qzd qzdVar5 = new qzd(z4a.class, ScheduledExecutorService.class);
        qzd[] qzdVarArr3 = {new qzd(z4a.class, ExecutorService.class), new qzd(z4a.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qzdVar5);
        for (qzd qzdVar6 : qzdVarArr3) {
            iuj.q("Null interface", qzdVar6);
        }
        Collections.addAll(hashSet7, qzdVarArr3);
        p94 p94Var3 = new p94(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new xh6(9), hashSet9);
        o94 o94VarA = p94.a(new qzd(rdi.class, Executor.class));
        o94VarA.f = new xh6(10);
        return Arrays.asList(p94Var, p94Var2, p94Var3, o94VarA.b());
    }
}

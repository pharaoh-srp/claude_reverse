package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class nzi {
    public static final l9e a;
    public static final Map b;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        a = new l9e(1.0f, 1.0f, 1.0f, 1.0f);
        cpc cpcVar = new cpc(dgj.g, fValueOf);
        cpc cpcVar2 = new cpc(dgj.m, fValueOf);
        cpc cpcVar3 = new cpc(dgj.l, fValueOf);
        cpc cpcVar4 = new cpc(dgj.f, Float.valueOf(0.01f));
        cpc cpcVar5 = new cpc(dgj.n, fValueOf);
        cpc cpcVar6 = new cpc(dgj.j, fValueOf);
        cpc cpcVar7 = new cpc(dgj.k, fValueOf);
        d9i d9iVar = dgj.h;
        Float fValueOf2 = Float.valueOf(0.4f);
        b = sta.h0(cpcVar, cpcVar2, cpcVar3, cpcVar4, cpcVar5, cpcVar6, cpcVar7, new cpc(d9iVar, fValueOf2), new cpc(dgj.i, fValueOf2));
    }
}

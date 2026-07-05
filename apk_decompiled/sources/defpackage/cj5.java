package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cj5 extends vp4 {
    public kmd E;
    public ArrayList F;
    public kwb G;
    public rcg H;
    public rcg I;
    public List J;
    public Iterator K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ jj5 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj5(jj5 jj5Var, vp4 vp4Var) {
        super(vp4Var);
        this.N = jj5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.g(null, this);
    }
}

package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class pwb extends vp4 {
    public v79 E;
    public qwb F;
    public Iterator G;
    public /* synthetic */ Object H;
    public final /* synthetic */ sh2 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwb(sh2 sh2Var, tp4 tp4Var) {
        super(tp4Var);
        this.I = sh2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.a(null, this);
    }
}

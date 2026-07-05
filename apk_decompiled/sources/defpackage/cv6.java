package defpackage;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class cv6 extends vp4 {
    public Iterator E;
    public File F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ ev6 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv6(ev6 ev6Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = ev6Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.a(this);
    }
}

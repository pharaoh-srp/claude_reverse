package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class xy5 implements ymf {
    public final CharSequence a;
    public final int b;
    public final pz7 c;

    public xy5(CharSequence charSequence, int i, pz7 pz7Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = pz7Var;
    }

    @Override // defpackage.ymf
    public final Iterator iterator() {
        return new wy5(this);
    }
}

package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class m3 extends h1e {
    @Override // defpackage.h1e
    public final int a(int i) {
        return wjk.u(l().nextInt(), i);
    }

    @Override // defpackage.h1e
    public final boolean b() {
        return l().nextBoolean();
    }

    @Override // defpackage.h1e
    public final double c() {
        return l().nextDouble();
    }

    @Override // defpackage.h1e
    public final float e() {
        return l().nextFloat();
    }

    @Override // defpackage.h1e
    public final int f() {
        return l().nextInt();
    }

    @Override // defpackage.h1e
    public final int g(int i) {
        return l().nextInt(i);
    }

    @Override // defpackage.h1e
    public final long i() {
        return l().nextLong();
    }

    public abstract Random l();
}

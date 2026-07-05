package defpackage;

import com.arkivanov.essenty.statekeeper.b;

/* JADX INFO: loaded from: classes.dex */
public final class lq5 implements ea4 {
    public final b4a a;
    public final b b;
    public final kd4 c;
    public final bb1 d;
    public final kq5 e;

    public lq5(b4a b4aVar, b bVar, kd4 kd4Var, bb1 bb1Var) {
        this.a = b4aVar;
        this.b = bVar;
        if (kd4Var == null) {
            kd4Var = new kd4();
            vkc.d(kd4Var, b4aVar);
        }
        this.c = kd4Var;
        this.d = bb1Var;
        this.e = kq5.E;
    }

    @Override // defpackage.ea4
    public final b4a a() {
        return this.a;
    }

    @Override // defpackage.ea4
    public final kd4 b() {
        return this.c;
    }

    @Override // defpackage.ea4
    public final b c() {
        return this.b;
    }

    @Override // defpackage.ea4
    public final bb1 d() {
        return this.d;
    }

    @Override // defpackage.ea4
    public final kq5 e() {
        return this.e;
    }
}

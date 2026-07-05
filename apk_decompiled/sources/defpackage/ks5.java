package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes2.dex */
public final class ks5 implements b6b {
    public final gkg E;
    public final d87 F;
    public pe1 G;
    public b6b H;
    public boolean I = true;
    public boolean J;

    public ks5(d87 d87Var, g1h g1hVar) {
        this.F = d87Var;
        this.E = new gkg(g1hVar);
    }

    @Override // defpackage.b6b
    public final void a(l6d l6dVar) {
        b6b b6bVar = this.H;
        if (b6bVar != null) {
            b6bVar.a(l6dVar);
            l6dVar = this.H.e();
        }
        this.E.a(l6dVar);
    }

    @Override // defpackage.b6b
    public final long b() {
        if (this.I) {
            return this.E.b();
        }
        b6b b6bVar = this.H;
        b6bVar.getClass();
        return b6bVar.b();
    }

    @Override // defpackage.b6b
    public final boolean c() {
        if (this.I) {
            this.E.getClass();
            return false;
        }
        b6b b6bVar = this.H;
        b6bVar.getClass();
        return b6bVar.c();
    }

    public final void d(pe1 pe1Var) {
        b6b b6bVar;
        b6b b6bVarJ = pe1Var.j();
        if (b6bVarJ == null || b6bVarJ == (b6bVar = this.H)) {
            return;
        }
        if (b6bVar != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.H = b6bVarJ;
        this.G = pe1Var;
        ((e6b) b6bVarJ).a((l6d) this.E.I);
    }

    @Override // defpackage.b6b
    public final l6d e() {
        b6b b6bVar = this.H;
        return b6bVar != null ? b6bVar.e() : (l6d) this.E.I;
    }
}

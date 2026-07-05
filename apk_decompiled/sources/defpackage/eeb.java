package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eeb implements v3a {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public eeb(im imVar, z3a z3aVar, hhe hheVar, im imVar2) {
        this.F = imVar;
        this.G = z3aVar;
        this.H = hheVar;
        this.I = imVar2;
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    @Override // defpackage.v3a
    public final void b() {
        switch (this.E) {
            case 0:
                break;
            default:
                if (((z3a) this.G) == z3a.H) {
                    ((im) this.I).a();
                }
                break;
        }
    }

    @Override // defpackage.v3a
    public final void c() {
        switch (this.E) {
            case 0:
                break;
            default:
                if (((z3a) this.G) == z3a.H) {
                    ((hhe) this.H).a();
                }
                break;
        }
    }

    @Override // defpackage.v3a
    public final void onCreate() {
        switch (this.E) {
            case 0:
                break;
            default:
                if (((z3a) this.G) == z3a.G) {
                    ((hhe) this.H).a();
                }
                break;
        }
    }

    @Override // defpackage.v3a
    public final void onDestroy() {
        int i = this.E;
        Object obj = this.F;
        Object obj2 = this.I;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                ((b4a) obj).d((hf3) obj3);
                ((q4a) obj2).d((hf3) this.H);
                break;
            default:
                if (((z3a) obj3) == z3a.G) {
                    ((im) obj2).a();
                }
                ((im) obj).a();
                break;
        }
    }

    @Override // defpackage.v3a
    public final void onPause() {
        switch (this.E) {
            case 0:
                break;
            default:
                if (((z3a) this.G) == z3a.I) {
                    ((im) this.I).a();
                }
                break;
        }
    }

    @Override // defpackage.v3a
    public final void onResume() {
        switch (this.E) {
            case 0:
                break;
            default:
                if (((z3a) this.G) == z3a.I) {
                    ((hhe) this.H).a();
                }
                break;
        }
    }

    public eeb(b4a b4aVar, hf3 hf3Var, q4a q4aVar, hf3 hf3Var2) {
        this.F = b4aVar;
        this.G = hf3Var;
        this.I = q4aVar;
        this.H = hf3Var2;
    }
}

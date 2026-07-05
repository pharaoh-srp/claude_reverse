package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g0a extends hqb implements ujf {
    public zy7 S;
    public a0a T;
    public ukc U;
    public boolean V;
    public boolean W;
    public v8f X;
    public final e0a Y = new e0a(this, 0);
    public e0a Z;

    public g0a(zy7 zy7Var, a0a a0aVar, ukc ukcVar, boolean z, boolean z2) {
        this.S = zy7Var;
        this.T = a0aVar;
        this.U = ukcVar;
        this.V = z;
        this.W = z2;
        p1();
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        ckf.y(ekfVar);
        ekfVar.a(akf.P, this.Y);
        ukc ukcVar = this.U;
        v8f v8fVar = this.X;
        if (ukcVar == ukc.E) {
            if (v8fVar == null) {
                x44.o0("scrollAxisRange");
                throw null;
            }
            dkf dkfVar = akf.w;
            wn9 wn9Var = ckf.a[13];
            ekfVar.a(dkfVar, v8fVar);
        } else {
            if (v8fVar == null) {
                x44.o0("scrollAxisRange");
                throw null;
            }
            dkf dkfVar2 = akf.v;
            wn9 wn9Var2 = ckf.a[12];
            ekfVar.a(dkfVar2, v8fVar);
        }
        e0a e0aVar = this.Z;
        if (e0aVar != null) {
            ekfVar.a(ojf.f, new e5(null, e0aVar));
        }
        ekfVar.a(ojf.C, new e5(null, new e0(29, new f0a(this, 2))));
        o44 o44VarE = this.T.e();
        dkf dkfVar3 = akf.f;
        wn9 wn9Var3 = ckf.a[24];
        ekfVar.a(dkfVar3, o44VarE);
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    public final void p1() {
        this.X = new v8f(new f0a(this, 0), new f0a(this, 1), this.W);
        this.Z = this.V ? new e0a(this, 1) : null;
    }
}

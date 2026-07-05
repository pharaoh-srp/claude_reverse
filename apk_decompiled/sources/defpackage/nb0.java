package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nb0 implements wlg {
    public final c9i E;
    public final lsc F;
    public sb0 G;
    public long H;
    public long I;
    public boolean J;

    public nb0(c9i c9iVar, Object obj, sb0 sb0Var, long j, long j2, boolean z) {
        sb0 sb0VarW;
        this.E = c9iVar;
        this.F = mpk.P(obj);
        if (sb0Var != null) {
            sb0VarW = j8.w(sb0Var);
        } else {
            sb0VarW = (sb0) c9iVar.a().invoke(obj);
            sb0VarW.d();
        }
        this.G = sb0VarW;
        this.H = j;
        this.I = j2;
        this.J = z;
    }

    public final Object a() {
        return this.E.b().invoke(this.G);
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        return this.F.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(this.F.getValue());
        sb.append(", velocity=");
        sb.append(a());
        sb.append(", isRunning=");
        sb.append(this.J);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.H);
        sb.append(", finishedTimeNanos=");
        return ebh.p(sb, this.I, ')');
    }

    public /* synthetic */ nb0(c9i c9iVar, Object obj, sb0 sb0Var, int i) {
        this(c9iVar, obj, (i & 4) != 0 ? null : sb0Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}

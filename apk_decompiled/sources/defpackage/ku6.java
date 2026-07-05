package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ku6 extends j7g {
    public final u9i F;
    public final gu6 G;
    public final mu6 H;
    public final List I;
    public final boolean J;
    public final String[] K;
    public final String L;

    public ku6(u9i u9iVar, gu6 gu6Var, mu6 mu6Var, List list, boolean z, String... strArr) {
        mu6Var.getClass();
        list.getClass();
        this.F = u9iVar;
        this.G = gu6Var;
        this.H = mu6Var;
        this.I = list;
        this.J = z;
        this.K = strArr;
        String str = mu6Var.E;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.L = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // defpackage.yr9
    public final fab G() {
        return this.G;
    }

    @Override // defpackage.yr9
    public final List H() {
        return this.I;
    }

    @Override // defpackage.yr9
    public final r9i K() {
        r9i.F.getClass();
        return r9i.G;
    }

    @Override // defpackage.yr9
    public final u9i O() {
        return this.F;
    }

    @Override // defpackage.yr9
    public final boolean b0() {
        return this.J;
    }

    @Override // defpackage.yr9
    /* JADX INFO: renamed from: j0 */
    public final yr9 m0(es9 es9Var) {
        es9Var.getClass();
        return this;
    }

    @Override // defpackage.fhi
    /* JADX INFO: renamed from: m0 */
    public final fhi j0(es9 es9Var) {
        es9Var.getClass();
        return this;
    }

    @Override // defpackage.j7g, defpackage.fhi
    public final fhi n0(r9i r9iVar) {
        r9iVar.getClass();
        return this;
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: o0 */
    public final j7g l0(boolean z) {
        String[] strArr = this.K;
        return new ku6(this.F, this.G, this.H, this.I, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: p0 */
    public final j7g n0(r9i r9iVar) {
        r9iVar.getClass();
        return this;
    }
}

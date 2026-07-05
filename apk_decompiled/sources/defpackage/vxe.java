package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vxe implements c07 {
    public final c07 E;
    public final c07 F;
    public final c07 G;
    public final c07 H;
    public final c07 I;
    public final c07 J;
    public final c07 K;
    public final c07 L;
    public final h99 M;

    public vxe(c07 c07Var, c07 c07Var2, c07 c07Var3, c07 c07Var4, c07 c07Var5, c07 c07Var6, c07 c07Var7, c07 c07Var8, h99 h99Var) {
        h99Var.getClass();
        this.E = c07Var;
        this.F = c07Var2;
        this.G = c07Var3;
        this.H = c07Var4;
        this.I = c07Var5;
        this.J = c07Var6;
        this.K = c07Var7;
        this.L = c07Var8;
        this.M = h99Var;
    }

    @Override // defpackage.c07
    public final Object a(Object obj) {
        Object objA;
        obj.getClass();
        boolean z = obj instanceof mxi;
        g99 g99Var = g99.E;
        if (z) {
            objA = this.E.a(obj);
        } else if (obj instanceof db) {
            objA = this.H.a(obj);
        } else if (obj instanceof kt6) {
            kt6 kt6Var = (kt6) obj;
            boolean zR = x44.r(kt6Var.w.a(), Boolean.TRUE);
            c07 c07Var = this.F;
            if (zR) {
                objA = (kt6) c07Var.a(obj);
                if (objA == null) {
                    dch.H(this.M, 4, g99Var, uxe.G, null, false, 56);
                    objA = kt6Var;
                }
            } else {
                objA = (kt6) c07Var.a(obj);
            }
        } else if (obj instanceof ppe) {
            objA = this.G.a(obj);
        } else if (obj instanceof zla) {
            objA = this.I.a(obj);
        } else if (obj instanceof n0j) {
            objA = this.J.a(obj);
        } else if (obj instanceof h0j) {
            objA = this.K.a(obj);
        } else if (obj instanceof hbh) {
            objA = this.L.a(obj);
        } else {
            if (!(obj instanceof qbh ? true : obj instanceof och ? true : obj instanceof zbh)) {
                dch.I(this.M, 4, x44.X(g99.F, g99.G), new ijd(1, obj), null, 56);
            }
            objA = obj;
        }
        if (z && (objA == null || objA != obj)) {
            dch.H(this.M, 5, g99Var, new ijd(2, obj), null, false, 56);
            return obj;
        }
        if (objA == null) {
            dch.H(this.M, 3, g99Var, new ijd(3, obj), null, false, 56);
            return null;
        }
        if (objA == obj) {
            return obj;
        }
        dch.H(this.M, 4, g99Var, new ijd(4, obj), null, false, 56);
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxe)) {
            return false;
        }
        vxe vxeVar = (vxe) obj;
        return this.E.equals(vxeVar.E) && this.F.equals(vxeVar.F) && this.G.equals(vxeVar.G) && this.H.equals(vxeVar.H) && this.I.equals(vxeVar.I) && this.J.equals(vxeVar.J) && this.K.equals(vxeVar.K) && this.L.equals(vxeVar.L) && x44.r(this.M, vxeVar.M);
    }

    public final int hashCode() {
        return this.M.hashCode() + ((this.L.hashCode() + ((this.K.hashCode() + ((this.J.hashCode() + ((this.I.hashCode() + ((this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + (this.E.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RumEventMapper(viewEventMapper=" + this.E + ", errorEventMapper=" + this.F + ", resourceEventMapper=" + this.G + ", actionEventMapper=" + this.H + ", longTaskEventMapper=" + this.I + ", vitalOperationStepEventMapper=" + this.J + ", vitalAppLaunchEventMapper=" + this.K + ", telemetryConfigurationMapper=" + this.L + ", internalLogger=" + this.M + ")";
    }
}

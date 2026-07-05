package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d7g extends hqb implements pu9, ujf {
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public long Z;
    public e0g a0;
    public boolean b0;
    public long c0;
    public long d0;
    public int e0;
    public int f0;
    public r1g g0;

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        if (this.b0) {
            ckf.u(ekfVar, this.a0);
        }
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        c3d c3dVarU = h5bVar.u(j);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new j40(c3dVarU, 9, this));
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.ujf
    public final boolean k() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.S);
        sb.append(", scaleY=");
        sb.append(this.T);
        sb.append(", alpha = ");
        sb.append(this.U);
        sb.append(", translationX=");
        sb.append(this.V);
        sb.append(", translationY=0.0, shadowElevation=");
        sb.append(this.W);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.X);
        sb.append(", cameraDistance=");
        sb.append(this.Y);
        sb.append(", transformOrigin=");
        sb.append((Object) d5i.d(this.Z));
        sb.append(", shape=");
        sb.append(this.a0);
        sb.append(", clip=");
        sb.append(this.b0);
        sb.append(", renderEffect=null, ambientShadowColor=");
        y6a.q(this.c0, ", spotShadowColor=", sb);
        y6a.q(this.d0, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.e0 + ')'));
        sb.append(", blendMode=");
        sb.append((Object) yb5.P(this.f0));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}

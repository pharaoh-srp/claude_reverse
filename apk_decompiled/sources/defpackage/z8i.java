package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z8i implements vh6 {
    public final int a;
    public final int b;
    public final vi6 c;

    public z8i(int i, int i2, vi6 vi6Var) {
        this.a = i;
        this.b = i2;
        this.c = vi6Var;
    }

    @Override // defpackage.mb0
    public final dsi a(c9i c9iVar) {
        return new gp1(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z8i) {
            z8i z8iVar = (z8i) obj;
            if (z8iVar.a == this.a && z8iVar.b == this.b && x44.r(z8iVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.vh6, defpackage.kl7, defpackage.mb0
    public final fsi a(c9i c9iVar) {
        return new gp1(this.a, this.b, this.c);
    }

    @Override // defpackage.kl7, defpackage.mb0
    public final gsi a(c9i c9iVar) {
        return new gp1(this.a, this.b, this.c);
    }
}

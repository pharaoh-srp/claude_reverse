package defpackage;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ez8 implements mf8, gof, byb {
    public boolean E;

    public ez8(boolean z) {
        this.E = z;
    }

    @Override // defpackage.gof
    public void a(pl9 pl9Var, bz7 bz7Var) {
    }

    @Override // defpackage.mf8
    public boolean b() {
        return this.E;
    }

    @Override // defpackage.gof
    public void c(pl9 pl9Var, bz7 bz7Var) {
    }

    @Override // defpackage.mf8
    public boolean d(j8g j8gVar) {
        return this.E;
    }

    @Override // defpackage.byb
    public boolean e() {
        return this.E;
    }

    @Override // defpackage.gof
    public void g(pl9 pl9Var, bz7 bz7Var) {
        pl9Var.getClass();
    }

    @Override // defpackage.gof
    public void h(pl9 pl9Var, pl9 pl9Var2, KSerializer kSerializer) {
        u00 kind = kSerializer.getDescriptor().getKind();
        if ((kind instanceof u8d) || x44.r(kind, lnf.l)) {
            sz6.m("Serializer for ", pl9Var2.f(), " can't be registered as a subclass for polymorphic serialization because its kind ", kind, " is not concrete. To work with multiple hierarchies, register it as a base class.");
            return;
        }
        if (this.E) {
            if (x44.r(kind, vsg.m) || x44.r(kind, vsg.n) || (kind instanceof kfd) || (kind instanceof mnf)) {
                sz6.m("Serializer for ", pl9Var2.f(), " of kind ", kind, " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }
}

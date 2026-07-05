package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gsh extends esh {
    public boolean k;

    @Override // defpackage.esh
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ esh f() {
        f();
        return this;
    }

    @Override // defpackage.esh, defpackage.hsh
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void f() {
        super.f();
        this.k = true;
    }

    public final String toString() {
        boolean z = this.k;
        String str = z ? "<!" : "<?";
        String str2 = z ? ">" : "?>";
        n31 n31Var = this.g;
        if (n31Var == null || n31Var.size() <= 0) {
            StringBuilder sbO = ij0.o(str);
            sbO.append(n());
            sbO.append(str2);
            return sbO.toString();
        }
        StringBuilder sbO2 = ij0.o(str);
        sbO2.append(n());
        sbO2.append(" ");
        sbO2.append(this.g.toString());
        sbO2.append(str2);
        return sbO2.toString();
    }
}

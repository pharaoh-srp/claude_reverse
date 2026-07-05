package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g38 implements fmg {
    public final aqi a;
    public final j5h b;

    public g38(aqi aqiVar, j5h j5hVar) {
        this.a = aqiVar;
        this.b = j5hVar;
    }

    @Override // defpackage.fmg
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.fmg
    public final boolean b(a91 a91Var) {
        if (a91Var.b == 4 && !this.a.a(a91Var)) {
            String str = a91Var.c;
            if (str != null) {
                this.b.b(new s81(str, a91Var.e, a91Var.f));
                return true;
            }
            mr9.h("Null token");
        }
        return false;
    }
}

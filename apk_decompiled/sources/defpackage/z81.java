package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class z81 {
    public final /* synthetic */ int a = 0;
    public String b;
    public int c;
    public Object d;
    public Object e;
    public Serializable f;
    public Serializable g;
    public Serializable h;

    /* JADX WARN: Multi-variable type inference failed */
    public z81(pr9 pr9Var, jk9 jk9Var, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        pr9Var.getClass();
        this.d = pr9Var;
        this.e = jk9Var;
        this.f = strArr;
        this.g = strArr2;
        this.h = strArr3;
        this.b = str;
        this.c = i;
    }

    public a91 a() {
        String strConcat = this.c == 0 ? " registrationStatus" : "";
        if (((Long) this.g) == null) {
            strConcat = strConcat.concat(" expiresInSecs");
        }
        if (((Long) this.h) == null) {
            strConcat = strConcat.concat(" tokenCreationEpochInSecs");
        }
        if (strConcat.isEmpty()) {
            return new a91(this.b, this.c, (String) this.d, (String) this.e, ((Long) this.g).longValue(), ((Long) this.h).longValue(), (String) this.f);
        }
        sz6.j("Missing required properties:".concat(strConcat));
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((pr9) this.d) + " version=" + ((jk9) this.e);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ z81() {
    }
}

package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a49 {
    public final /* synthetic */ int a;
    public final uo8 b;
    public final uo8 c;
    public final uo8 d;
    public final uo8 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public a49(a49[] a49VarArr) {
        int i = 0;
        this.a = 0;
        this.f = a49VarArr;
        int length = a49VarArr.length;
        uo8[] uo8VarArr = new uo8[length];
        for (int i2 = 0; i2 < length; i2++) {
            uo8VarArr[i2] = ((a49[]) this.f)[i2].b();
        }
        int i3 = 1;
        this.b = new uo8(1, new aui(uo8VarArr, i));
        int length2 = ((a49[]) this.f).length;
        uo8[] uo8VarArr2 = new uo8[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            uo8VarArr2[i4] = ((a49[]) this.f)[i4].d();
        }
        this.c = new uo8(0, new to8(uo8VarArr2, i));
        int length3 = ((a49[]) this.f).length;
        uo8[] uo8VarArr3 = new uo8[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            uo8VarArr3[i5] = ((a49[]) this.f)[i5].c();
        }
        this.d = new uo8(1, new aui(uo8VarArr3, i3));
        int length4 = ((a49[]) this.f).length;
        uo8[] uo8VarArr4 = new uo8[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            uo8VarArr4[i6] = ((a49[]) this.f)[i6].a();
        }
        this.e = new uo8(0, new to8(uo8VarArr4, i3));
    }

    public final uo8 a() {
        int i = this.a;
        return this.e;
    }

    public final uo8 b() {
        int i = this.a;
        return this.b;
    }

    public final uo8 c() {
        int i = this.a;
        return this.d;
    }

    public final uo8 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                return mp0.M0((a49[]) obj, null, "innermostOf(", ")", null, 57);
            default:
                return grc.n(')', "RectRulers(", (String) obj);
        }
    }

    public a49(String str) {
        this.a = 1;
        this.f = str;
        this.b = new uo8(1, null);
        this.c = new uo8(0, null);
        this.d = new uo8(1, null);
        this.e = new uo8(0, null);
    }
}

package defpackage;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class gw1 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final ssc f;
    public final ssc g;
    public int h;
    public int i;

    public gw1(ssc sscVar, ssc sscVar2, boolean z) throws ParserException {
        this.g = sscVar;
        this.f = sscVar2;
        this.e = z;
        sscVar2.M(12);
        this.a = sscVar2.D();
        sscVar.M(12);
        this.i = sscVar.D();
        xkk.d("first_chunk must be 1", sscVar.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        ssc sscVar = this.f;
        this.d = z ? sscVar.F() : sscVar.B();
        if (this.b == this.h) {
            ssc sscVar2 = this.g;
            this.c = sscVar2.D();
            sscVar2.N(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? sscVar2.D() - 1 : -1;
        }
        return true;
    }
}

package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j9g {
    public final bjj a;
    public final float b;
    public final ArrayList c;
    public final float d;

    public j9g(long j) {
        int i = (int) j;
        int i2 = (int) (j >> 32);
        int i3 = ~i;
        bjj bjjVar = new bjj();
        bjjVar.G = i;
        bjjVar.H = i2;
        bjjVar.I = 0;
        bjjVar.J = 0;
        bjjVar.K = i3;
        bjjVar.L = (i << 10) ^ (i2 >>> 4);
        if ((i2 | i | i3) == 0) {
            sz6.p("Initial state must have at least one non-zero element.");
            throw null;
        }
        for (int i4 = 0; i4 < 64; i4++) {
            bjjVar.f();
        }
        this.a = bjjVar;
        this.b = bjjVar.e();
        ArrayList<i9g> arrayList = new ArrayList(4);
        for (int i5 = 0; i5 < 4; i5++) {
            arrayList.add(new i9g((this.a.e() * 100.0f) + 60.0f, (this.a.e() * 0.35f) + 0.5f, this.a.b(), (this.a.e() * 8.0f) - 4.0f));
        }
        this.c = arrayList;
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        for (i9g i9gVar : arrayList) {
            f = f + i9gVar.a + (i9gVar.b * 100.0f);
        }
        this.d = f;
    }
}

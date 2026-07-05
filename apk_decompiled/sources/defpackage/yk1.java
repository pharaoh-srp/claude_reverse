package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yk1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;

    public /* synthetic */ yk1(long j, Object obj, int i) {
        this.E = i;
        this.F = j;
        this.G = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws IOException {
        int i = this.E;
        iei ieiVar = iei.a;
        long j = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                xd6Var.T0(this.F, 0L, (58 & 4) != 0 ? xd6.h0(xd6Var.g(), 0L) : 0L, (58 & 8) != 0 ? 1.0f : ((Number) ((zy7) obj2).a()).floatValue() * 0.2f, (58 & 16) != 0 ? qk7.a : null, (58 & 32) != 0 ? null : null, (58 & 64) != 0 ? 3 : 0);
                return ieiVar;
            case 1:
                xd6 xd6Var2 = (xd6) obj;
                xd6Var2.getClass();
                xd6Var2.T0(this.F, 0L, (58 & 4) != 0 ? xd6.h0(xd6Var2.g(), 0L) : 0L, (58 & 8) != 0 ? 1.0f : ((Number) ((wlg) obj2).getValue()).floatValue(), (58 & 16) != 0 ? qk7.a : null, (58 & 32) != 0 ? null : null, (58 & 64) != 0 ? 3 : 0);
                return ieiVar;
            case 2:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                wpg wpgVar = (wpg) obj;
                wpgVar.getClass();
                return Boolean.valueOf(wpgVar.a() < j && !linkedHashSet.contains(Long.valueOf(wpgVar.a())));
            case 3:
                bz9 bz9Var = (bz9) obj2;
                bz9Var.g(y69.c(((y69) ((a80) obj).e()).a, j));
                bz9Var.c.a();
                return ieiVar;
            default:
                w3h w3hVar = (w3h) obj2;
                t3h t3hVar = (t3h) obj;
                t3hVar.getClass();
                final ArrayList arrayList = t3hVar.a;
                final ArrayList arrayList2 = t3hVar.b;
                d54 d54Var = w3hVar.d;
                d54Var.getClass();
                long j2 = d54Var.a;
                final long j3 = j2 != 16 ? j2 : j;
                final float fFloatValue = w3hVar.e.floatValue();
                return zni.s(fqb.E, new bz7() { // from class: q3h
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj3) {
                        long j4;
                        float f;
                        xd6 xd6Var3 = (xd6) obj3;
                        xd6Var3.getClass();
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            j4 = j3;
                            f = fFloatValue;
                            if (!zHasNext) {
                                break;
                            }
                            float fFloatValue2 = ((Number) it.next()).floatValue();
                            xd6Var3.M(j4, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xd6Var3.g() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L), (504 & 8) != 0 ? 0.0f : f, (504 & 16) != 0 ? 0 : 0);
                        }
                        float f2 = f;
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            float fFloatValue3 = ((Number) it2.next()).floatValue();
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloatValue3)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var3.g() & 4294967295L));
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fFloatValue3);
                            xd6 xd6Var4 = xd6Var3;
                            long j5 = j4;
                            float f3 = f2;
                            xd6Var4.M(j5, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (jFloatToRawIntBits2 << 32), (504 & 8) != 0 ? 0.0f : f3, (504 & 16) != 0 ? 0 : 0);
                            j4 = j5;
                            f2 = f3;
                            xd6Var3 = xd6Var4;
                        }
                        return iei.a;
                    }
                });
        }
    }

    public /* synthetic */ yk1(Object obj, long j, int i) {
        this.E = i;
        this.G = obj;
        this.F = j;
    }
}

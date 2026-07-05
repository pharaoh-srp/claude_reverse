package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class np implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;

    public /* synthetic */ np(long j, int i, long j2) {
        this.E = i;
        this.F = j;
        this.G = j2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.E) {
            case 0:
                b52 b52Var = (b52) obj;
                b52Var.getClass();
                float density = b52Var.getDensity() * 32.0f;
                float density2 = b52Var.getDensity() * 1.0f;
                cpc[] cpcVarArr = {new cpc(Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier), new d54(d54.b(0.15f, this.F))), new cpc(Float.valueOf(0.7f), new d54(d54.g))};
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (b52Var.E.g() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (b52Var.E.g() & 4294967295L)))) & 4294967295L);
                float fMax = Math.max(Float.intBitsToFloat((int) (b52Var.E.g() >> 32)), Float.intBitsToFloat((int) (b52Var.E.g() & 4294967295L))) * 0.8f;
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    arrayList.add(new d54(((d54) cpcVarArr[i].F).a));
                }
                ArrayList arrayList2 = new ArrayList(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    arrayList2.add(Float.valueOf(((Number) cpcVarArr[i2].E).floatValue()));
                }
                return b52Var.a(new rp(this.G, density2, density, new w0e(arrayList, arrayList2, jFloatToRawIntBits, fMax, 0)));
            case 1:
                b52 b52Var2 = (b52) obj;
                b52Var2.getClass();
                float density3 = b52Var2.getDensity() * 8.0f;
                float density4 = b52Var2.getDensity() * 16.0f;
                float density5 = b52Var2.getDensity() * 8.0f;
                float density6 = b52Var2.getDensity() * 36.0f;
                final float density7 = b52Var2.getDensity() * 1.0f;
                final c40 c40VarA = f40.a();
                Path path = c40VarA.a;
                c40VarA.g(density3, density5);
                c40VarA.f(density6, density5);
                c40VarA.f((density4 / 2.0f) + density6, MTTypesetterKt.kLineSkipLimitMultiplier);
                c40VarA.f(density6 + density4, density5);
                c40VarA.f(Float.intBitsToFloat((int) (b52Var2.E.g() >> 32)) - density3, density5);
                float f = 2.0f * density3;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (b52Var2.E.g() >> 32)) - f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (b52Var2.E.g() >> 32));
                float f2 = density5 + f;
                if (c40VarA.b == null) {
                    c40VarA.b = new RectF();
                }
                RectF rectF = c40VarA.b;
                rectF.getClass();
                rectF.set(fIntBitsToFloat, density5, fIntBitsToFloat2, f2);
                RectF rectF2 = c40VarA.b;
                rectF2.getClass();
                path.arcTo(rectF2, -90.0f, 90.0f, false);
                c40VarA.f(Float.intBitsToFloat((int) (b52Var2.E.g() >> 32)), Float.intBitsToFloat((int) (b52Var2.E.g() & 4294967295L)) - density3);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (b52Var2.E.g() >> 32)) - f;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (b52Var2.E.g() & 4294967295L)) - f;
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (b52Var2.E.g() >> 32));
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (b52Var2.E.g() & 4294967295L));
                if (c40VarA.b == null) {
                    c40VarA.b = new RectF();
                }
                RectF rectF3 = c40VarA.b;
                rectF3.getClass();
                rectF3.set(fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6);
                RectF rectF4 = c40VarA.b;
                rectF4.getClass();
                path.arcTo(rectF4, MTTypesetterKt.kLineSkipLimitMultiplier, 90.0f, false);
                c40VarA.f(density3, Float.intBitsToFloat((int) (b52Var2.E.g() & 4294967295L)));
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (b52Var2.E.g() & 4294967295L)) - f;
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (b52Var2.E.g() & 4294967295L));
                if (c40VarA.b == null) {
                    c40VarA.b = new RectF();
                }
                RectF rectF5 = c40VarA.b;
                rectF5.getClass();
                rectF5.set(MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat7, f, fIntBitsToFloat8);
                RectF rectF6 = c40VarA.b;
                rectF6.getClass();
                path.arcTo(rectF6, 90.0f, 90.0f, false);
                c40VarA.f(MTTypesetterKt.kLineSkipLimitMultiplier, density3 + density5);
                if (c40VarA.b == null) {
                    c40VarA.b = new RectF();
                }
                RectF rectF7 = c40VarA.b;
                rectF7.getClass();
                rectF7.set(MTTypesetterKt.kLineSkipLimitMultiplier, density5, f, f2);
                RectF rectF8 = c40VarA.b;
                rectF8.getClass();
                path.arcTo(rectF8, 180.0f, 90.0f, false);
                path.close();
                final long j = this.F;
                final long j2 = this.G;
                return b52Var2.a(new bz7() { // from class: d46
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj2) {
                        xd6 xd6Var = (xd6) obj2;
                        xd6Var.getClass();
                        c40 c40Var = c40VarA;
                        xd6.c1(xd6Var, c40Var, j, MTTypesetterKt.kLineSkipLimitMultiplier, null, 60);
                        xd6.c1(xd6Var, c40Var, j2, MTTypesetterKt.kLineSkipLimitMultiplier, new ksg(density7, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30), 52);
                        return iei.a;
                    }
                });
            default:
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                float fD = k8g.d(xd6Var.g()) / 2.0f;
                xd6.C0(xd6Var, this.F, fD * 0.75f, 0L, null, 124);
                xd6.C0(xd6Var, this.G, fD * 0.25f, 0L, null, 124);
                return iei.a;
        }
    }
}

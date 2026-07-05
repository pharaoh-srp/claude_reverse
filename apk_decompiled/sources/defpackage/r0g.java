package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r0g extends ke1 {
    public final j0g h;
    public final Path i;
    public ArrayList j;

    public r0g(List list) {
        super(list);
        this.h = new j0g();
        this.i = new Path();
    }

    @Override // defpackage.ke1
    public final Object e(rp9 rp9Var, float f) {
        int i;
        j0g j0gVar;
        float f2;
        boolean z;
        j0g j0gVar2 = (j0g) rp9Var.b;
        j0g j0gVar3 = (j0g) rp9Var.c;
        if (j0gVar3 == null) {
            j0gVar3 = j0gVar2;
        }
        j0g j0gVar4 = this.h;
        ArrayList arrayList = j0gVar4.a;
        if (j0gVar4.b == null) {
            j0gVar4.b = new PointF();
        }
        boolean z2 = j0gVar2.c;
        ArrayList arrayList2 = j0gVar2.a;
        boolean z3 = true;
        j0gVar4.c = z2 || j0gVar3.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = j0gVar3.a;
        if (size != arrayList3.size()) {
            oga.a("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new bd5());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = j0gVar2.b;
        PointF pointF2 = j0gVar3.b;
        j0gVar4.a(vkb.e(pointF.x, pointF2.x, f), vkb.e(pointF.y, pointF2.y, f));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            bd5 bd5Var = (bd5) arrayList2.get(size4);
            bd5 bd5Var2 = (bd5) arrayList3.get(size4);
            PointF pointF3 = bd5Var.a;
            PointF pointF4 = bd5Var.b;
            PointF pointF5 = bd5Var.c;
            PointF pointF6 = bd5Var2.a;
            PointF pointF7 = bd5Var2.b;
            PointF pointF8 = bd5Var2.c;
            ((bd5) arrayList.get(size4)).a.set(vkb.e(pointF3.x, pointF6.x, f), vkb.e(pointF3.y, pointF6.y, f));
            ((bd5) arrayList.get(size4)).b.set(vkb.e(pointF4.x, pointF7.x, f), vkb.e(pointF4.y, pointF7.y, f));
            ((bd5) arrayList.get(size4)).c.set(vkb.e(pointF5.x, pointF8.x, f), vkb.e(pointF5.y, pointF8.y, f));
            size4--;
            z3 = z3;
        }
        boolean z4 = z3;
        ArrayList arrayList4 = this.j;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            while (true) {
                ArrayList arrayList5 = j0gVar4.a;
                if (size5 < 0) {
                    break;
                }
                bwe bweVar = (bwe) this.j.get(size5);
                bweVar.getClass();
                if (arrayList5.size() > 2) {
                    float fFloatValue = ((Float) bweVar.b.d()).floatValue();
                    if (fFloatValue != MTTypesetterKt.kLineSkipLimitMultiplier) {
                        boolean z5 = j0gVar4.c;
                        int size6 = arrayList5.size() - 1;
                        int i2 = 0;
                        while (size6 >= 0) {
                            bd5 bd5Var3 = (bd5) arrayList5.get(size6);
                            bd5 bd5Var4 = (bd5) arrayList5.get(bwe.d(size6 - 1, arrayList5.size()));
                            PointF pointF9 = (size6 != 0 || z5) ? bd5Var4.c : j0gVar4.b;
                            i2 = (((size6 != 0 || z5) ? bd5Var4.b : pointF9).equals(pointF9) && bd5Var3.a.equals(pointF9) && !((j0gVar4.c || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z4)) ? i2 + 2 : i2 + 1;
                            size6--;
                        }
                        j0g j0gVar5 = bweVar.c;
                        if (j0gVar5 == null || j0gVar5.a.size() != i2) {
                            ArrayList arrayList6 = new ArrayList(i2);
                            for (int i3 = 0; i3 < i2; i3++) {
                                arrayList6.add(new bd5());
                            }
                            i = 0;
                            bweVar.c = new j0g(new PointF(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier), false, arrayList6);
                        } else {
                            i = 0;
                        }
                        j0g j0gVar6 = bweVar.c;
                        j0gVar6.c = z5;
                        PointF pointF10 = j0gVar4.b;
                        j0gVar6.a(pointF10.x, pointF10.y);
                        ArrayList arrayList7 = j0gVar6.a;
                        boolean z6 = j0gVar4.c;
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < arrayList5.size()) {
                            bd5 bd5Var5 = (bd5) arrayList5.get(i4);
                            bd5 bd5Var6 = (bd5) arrayList5.get(bwe.d(i4 - 1, arrayList5.size()));
                            bd5 bd5Var7 = (bd5) arrayList5.get(bwe.d(i4 - 2, arrayList5.size()));
                            PointF pointF11 = (i4 != 0 || z6) ? bd5Var6.c : j0gVar4.b;
                            PointF pointF12 = (i4 != 0 || z6) ? bd5Var6.b : pointF11;
                            PointF pointF13 = bd5Var5.a;
                            PointF pointF14 = bd5Var7.c;
                            int i6 = size5;
                            PointF pointF15 = bd5Var5.c;
                            ArrayList arrayList8 = arrayList5;
                            boolean z7 = (j0gVar4.c || !(i4 == 0 || i4 == arrayList8.size() + (-1))) ? false : z4;
                            if (pointF12.equals(pointF11) && pointF13.equals(pointF11) && !z7) {
                                float f3 = pointF11.x;
                                float f4 = f3 - pointF14.x;
                                float f5 = pointF11.y;
                                float f6 = f5 - pointF14.y;
                                float f7 = pointF15.x - f3;
                                float f8 = pointF15.y - f5;
                                j0gVar = j0gVar4;
                                f2 = fFloatValue;
                                float fHypot = (float) Math.hypot(f4, f6);
                                float fHypot2 = (float) Math.hypot(f7, f8);
                                float fMin = Math.min(f2 / fHypot, 0.5f);
                                float fMin2 = Math.min(f2 / fHypot2, 0.5f);
                                float f9 = pointF11.x;
                                float fK = sq6.k(pointF14.x, f9, fMin, f9);
                                float f10 = pointF11.y;
                                float fK2 = sq6.k(pointF14.y, f10, fMin, f10);
                                float fK3 = sq6.k(pointF15.x, f9, fMin2, f9);
                                float fK4 = sq6.k(pointF15.y, f10, fMin2, f10);
                                float f11 = fK - ((fK - f9) * 0.5519f);
                                float f12 = fK2 - ((fK2 - f10) * 0.5519f);
                                float f13 = fK3 - ((fK3 - f9) * 0.5519f);
                                float f14 = fK4 - ((fK4 - f10) * 0.5519f);
                                bd5 bd5Var8 = (bd5) arrayList7.get(bwe.d(i5 - 1, arrayList7.size()));
                                bd5 bd5Var9 = (bd5) arrayList7.get(i5);
                                z = z6;
                                bd5Var8.b.set(fK, fK2);
                                bd5Var8.c.set(fK, fK2);
                                if (i4 == 0) {
                                    j0gVar6.a(fK, fK2);
                                }
                                bd5Var9.a.set(f11, f12);
                                bd5 bd5Var10 = (bd5) arrayList7.get(i5 + 1);
                                bd5Var9.b.set(f13, f14);
                                bd5Var9.c.set(fK3, fK4);
                                bd5Var10.a.set(fK3, fK4);
                                i5 += 2;
                            } else {
                                j0gVar = j0gVar4;
                                f2 = fFloatValue;
                                z = z6;
                                bd5 bd5Var11 = (bd5) arrayList7.get(bwe.d(i5 - 1, arrayList7.size()));
                                bd5 bd5Var12 = (bd5) arrayList7.get(i5);
                                PointF pointF16 = bd5Var6.b;
                                bd5Var11.b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = bd5Var6.c;
                                bd5Var11.c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = bd5Var5.a;
                                bd5Var12.a.set(pointF18.x, pointF18.y);
                                i5++;
                            }
                            i4++;
                            size5 = i6;
                            arrayList5 = arrayList8;
                            j0gVar4 = j0gVar;
                            fFloatValue = f2;
                            z6 = z;
                        }
                        j0gVar4 = j0gVar6;
                    }
                }
                size5--;
            }
        }
        Path path = this.i;
        path.reset();
        PointF pointF19 = j0gVar4.b;
        ArrayList arrayList9 = j0gVar4.a;
        path.moveTo(pointF19.x, pointF19.y);
        PointF pointF20 = vkb.a;
        pointF20.set(pointF19.x, pointF19.y);
        for (int i7 = 0; i7 < arrayList9.size(); i7++) {
            bd5 bd5Var13 = (bd5) arrayList9.get(i7);
            PointF pointF21 = bd5Var13.a;
            PointF pointF22 = bd5Var13.b;
            PointF pointF23 = bd5Var13.c;
            if (pointF21.equals(pointF20) && pointF22.equals(pointF23)) {
                path.lineTo(pointF23.x, pointF23.y);
            } else {
                path.cubicTo(pointF21.x, pointF21.y, pointF22.x, pointF22.y, pointF23.x, pointF23.y);
            }
            pointF20.set(pointF23.x, pointF23.y);
        }
        if (j0gVar4.c) {
            path.close();
        }
        return path;
    }

    @Override // defpackage.ke1
    public final boolean h() {
        ArrayList arrayList = this.j;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}

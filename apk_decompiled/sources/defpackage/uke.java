package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uke implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ int F;
    public final /* synthetic */ float G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ uke(int i, List list, float f, bz7 bz7Var) {
        this.F = i;
        this.H = list;
        this.G = f;
        this.I = bz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.F;
        Object obj3 = this.I;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xke.e((String) obj4, (String) obj3, this.F, this.G, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 1:
                List list = (List) obj4;
                final bz7 bz7Var = (bz7) obj3;
                final gvg gvgVar = (gvg) obj;
                rl4 rl4Var = (rl4) obj2;
                gvgVar.getClass();
                ArrayList<List> arrayListF0 = w44.F0(gvgVar.p(new ta4(-223867091, true, new ay3(list, i2, 7)), Boolean.FALSE), i2);
                if (arrayListF0.size() != list.size()) {
                    sz6.j("Check failed.");
                    return null;
                }
                long j = rl4Var.a;
                if (!rl4.d(j)) {
                    sz6.j("Table must have bounded width");
                    return null;
                }
                final float f = this.G;
                final float fH = (rl4.h(j) - ((i2 + 1) * f)) / i2;
                float size = (arrayListF0.size() + 1) * f;
                long jE = sl4.e(sl4.b(0, mwa.L(fH), 0, 0, 13), j);
                final ArrayList arrayList = new ArrayList(x44.y(arrayListF0, 10));
                for (List list2 : arrayListF0) {
                    ArrayList arrayList2 = new ArrayList(x44.y(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((h5b) it.next()).u(jE));
                    }
                    arrayList.add(arrayList2);
                }
                final ArrayList arrayList3 = new ArrayList(x44.y(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((List) it2.next()).iterator();
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (it3.hasNext()) {
                            int i3 = ((c3d) next).F;
                            do {
                                Object next2 = it3.next();
                                int i4 = ((c3d) next2).F;
                                if (i3 < i4) {
                                    next = next2;
                                    i3 = i4;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    next.getClass();
                    arrayList3.add(Integer.valueOf(((c3d) next).F));
                }
                final int iH = rl4.h(j);
                Iterator it4 = arrayList3.iterator();
                int iIntValue = 0;
                while (it4.hasNext()) {
                    iIntValue += ((Number) it4.next()).intValue();
                }
                final int iL = mwa.L(iIntValue + size);
                return gvgVar.U(iH, iL, nm6.E, new bz7() { // from class: i7g
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj5) {
                        b3d b3dVar = (b3d) obj5;
                        b3dVar.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        float f2 = f;
                        float fFloatValue = f2;
                        int i5 = 0;
                        for (Object obj6 : arrayList) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                x44.n0();
                                throw null;
                            }
                            float f3 = f2 / 2.0f;
                            arrayList4.add(Float.valueOf(fFloatValue - f3));
                            float f4 = f2;
                            for (c3d c3dVar : (List) obj6) {
                                if (i5 == 0) {
                                    arrayList5.add(Float.valueOf(f4 - f3));
                                }
                                b3dVar.f(c3dVar, mwa.L(f4), mwa.L(fFloatValue), MTTypesetterKt.kLineSkipLimitMultiplier);
                                f4 += fH + f2;
                            }
                            if (i5 == 0) {
                                arrayList5.add(Float.valueOf(f4 - f3));
                            }
                            fFloatValue += ((Number) arrayList3.get(i5)).floatValue() + f2;
                            i5 = i6;
                        }
                        arrayList4.add(Float.valueOf(fFloatValue - (f2 / 2.0f)));
                        t3h t3hVar = new t3h(arrayList4, arrayList5);
                        h5b h5bVar = (h5b) w44.e1(gvgVar.p(new ta4(-1387549559, true, new ufe(bz7Var, 8, t3hVar)), Boolean.TRUE));
                        int i7 = iH;
                        boolean z = i7 >= 0;
                        int i8 = iL;
                        if (!(z & (i8 >= 0))) {
                            d39.a("width and height must be >= 0");
                        }
                        b3d.k(b3dVar, h5bVar.u(sl4.h(i7, i7, i8, i8)), 0, 0);
                        return iei.a;
                    }
                });
            default:
                ((Integer) obj2).getClass();
                rsk.e((t3) obj4, this.G, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                return ieiVar;
        }
    }

    public /* synthetic */ uke(t3 t3Var, float f, iqb iqbVar, int i) {
        this.H = t3Var;
        this.G = f;
        this.I = iqbVar;
        this.F = i;
    }

    public /* synthetic */ uke(String str, String str2, int i, float f, int i2) {
        this.H = str;
        this.I = str2;
        this.F = i;
        this.G = f;
    }
}

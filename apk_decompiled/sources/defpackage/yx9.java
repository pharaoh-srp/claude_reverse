package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class yx9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ zx9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx9(zx9 zx9Var, int i) {
        super(0);
        this.F = i;
        this.G = zx9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        zx9 zx9Var = this.G;
        switch (i) {
            case 0:
                Collection collectionC = ((jbe) zx9Var.o).c();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionC) {
                    if (((qbe) obj).a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iD0 = tta.d0(x44.y(arrayList, 10));
                if (iD0 < 16) {
                    iD0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((qbe) obj2).d(), obj2);
                }
                return linkedHashMap;
            case 1:
                Class<?>[] declaredClasses = ((jbe) zx9Var.o).a.getDeclaredClasses();
                declaredClasses.getClass();
                return w44.t1(bnf.e0(bnf.c0(new bl7(mp0.m0(declaredClasses), false, p9d.N), p9d.O)));
            default:
                return dxf.p0(zx9Var.a(), zx9Var.f());
        }
    }
}

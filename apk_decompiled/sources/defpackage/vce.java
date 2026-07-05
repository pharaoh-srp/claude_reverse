package defpackage;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vce implements g9i {
    public final /* synthetic */ int E = 1;
    public final Object F;
    public final Object G;
    public final Object H;

    public vce(nyj nyjVar, f57 f57Var, v44 v44Var, ArrayList arrayList) {
        this.F = nyjVar;
        this.G = f57Var;
        this.H = arrayList;
    }

    @Override // defpackage.g9i
    public final f9i a(xd8 xd8Var, dbi dbiVar) {
        int i = this.E;
        Object obj = this.H;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                Class cls = dbiVar.a;
                if (!Object.class.isAssignableFrom(cls)) {
                    return null;
                }
                dch.A((ArrayList) obj);
                return oce.a.O(cls) ? new uce(cls, b(xd8Var, dbiVar, cls, true)) : new tce(((nyj) obj2).W(dbiVar), b(xd8Var, dbiVar, cls, false));
            default:
                Class cls2 = dbiVar.a;
                if (cls2 == ((Class) obj2) || cls2 == ((Class) this.G)) {
                    return (f9i) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedHashMap b(defpackage.xd8 r35, defpackage.dbi r36, java.lang.Class r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vce.b(xd8, dbi, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    public boolean c(Field field, boolean z) {
        f57 f57Var = (f57) this.G;
        Class<?> type = field.getType();
        f57Var.getClass();
        if (!f57.c(type)) {
            f57Var.b(z);
            if ((136 & field.getModifiers()) == 0 && !field.isSynthetic() && !f57.c(field.getType())) {
                List list = z ? f57Var.E : f57Var.F;
                if (list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    return true;
                }
                it.next().getClass();
                mr9.o();
                return false;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.E) {
            case 1:
                return "Factory[type=" + ((Class) this.G).getName() + "+" + ((Class) this.F).getName() + ",adapter=" + ((f9i) this.H) + "]";
            default:
                return super.toString();
        }
    }

    public vce(Class cls, Class cls2, f9i f9iVar) {
        this.F = cls;
        this.G = cls2;
        this.H = f9iVar;
    }
}

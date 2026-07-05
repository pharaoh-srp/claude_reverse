package defpackage;

import com.google.crypto.tink.shaded.protobuf.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t3 implements m6e, k80 {
    public final /* synthetic */ int E;
    public final Object F;

    public t3(int i) {
        this.E = i;
        switch (i) {
            case 4:
                this.F = new HashMap();
                break;
            case 5:
            default:
                this.F = new ArrayList();
                break;
            case 6:
                this.F = new u0h(new g2h(6, this));
                break;
        }
    }

    public static /* synthetic */ void d(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.k80
    public List b() {
        return (List) this.F;
    }

    @Override // defpackage.k80
    public boolean c() {
        List list = (List) this.F;
        return list.isEmpty() || (list.size() == 1 && ((rp9) list.get(0)).c());
    }

    public boolean e(int i, g18 g18Var, Object obj) {
        ArrayList arrayList = g18Var.a;
        if (arrayList == null) {
            f(i, g18Var, null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof y08)) {
                if (!(obj2 instanceof g18)) {
                    sz6.j(ij0.B("Unexpected child source info ", obj2));
                    break;
                }
                if (e(i, (g18) obj2, obj)) {
                    f(0, g18Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                f(0, g18Var, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    public void f(int i, g18 g18Var, Object obj) {
        ((ArrayList) this.F).add(new bd4(i, null, null));
    }

    public abstract Object g(Object obj);

    @Override // defpackage.m6e
    public yr9 getType() {
        yr9 yr9Var = (yr9) this.F;
        if (yr9Var != null) {
            return yr9Var;
        }
        d(1);
        throw null;
    }

    public abstract a h(a aVar);

    public Object i(Object obj) {
        synchronized (((HashMap) this.F)) {
            try {
                if (((HashMap) this.F).containsKey(obj)) {
                    return ((HashMap) this.F).get(obj);
                }
                Object objG = g(obj);
                ((HashMap) this.F).put(obj, objG);
                return objG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract long j();

    public abstract rqh k();

    public Map l() {
        return Collections.EMPTY_MAP;
    }

    public abstract a m(k22 k22Var);

    public void n(int i, Object obj, g18 g18Var, Object obj2) {
        if (x44.r(obj, jd4.a)) {
            f(i, g18Var, null);
        }
    }

    public abstract void o(a aVar);

    public String toString() {
        switch (this.E) {
            case 1:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.F;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public t3(yr9 yr9Var) {
        this.E = 0;
        if (yr9Var != null) {
            this.F = yr9Var;
        } else {
            d(0);
            throw null;
        }
    }

    public /* synthetic */ t3(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}

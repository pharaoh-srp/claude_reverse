package defpackage;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xg9 implements dn6 {
    public static final vg9 J;
    public static final vg9 K;
    public final HashMap E;
    public final HashMap F;
    public final ug9 G;
    public boolean H;
    public static final ug9 I = new ug9();
    public static final wg9 L = new wg9();

    /* JADX WARN: Type inference failed for: r0v1, types: [vg9] */
    /* JADX WARN: Type inference failed for: r0v2, types: [vg9] */
    static {
        final int i = 0;
        J = new uqi() { // from class: vg9
            @Override // defpackage.cn6
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((vqi) obj2).b((String) obj);
                        break;
                    default:
                        ((vqi) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        K = new uqi() { // from class: vg9
            @Override // defpackage.cn6
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((vqi) obj2).b((String) obj);
                        break;
                    default:
                        ((vqi) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public xg9() {
        HashMap map = new HashMap();
        this.E = map;
        HashMap map2 = new HashMap();
        this.F = map2;
        this.G = I;
        this.H = false;
        map2.put(String.class, J);
        map.remove(String.class);
        map2.put(Boolean.class, K);
        map.remove(Boolean.class);
        map2.put(Date.class, L);
        map.remove(Date.class);
    }

    @Override // defpackage.dn6
    public final dn6 e(Class cls, tac tacVar) {
        this.E.put(cls, tacVar);
        this.F.remove(cls);
        return this;
    }
}

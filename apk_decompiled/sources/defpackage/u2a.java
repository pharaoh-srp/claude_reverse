package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u2a {
    public final p2a a;
    public final fn0 b;
    public final lsc c = mpk.P(null);
    public final wz5 d;
    public final wz5 e;
    public boolean f;

    public u2a(p2a p2aVar, fn0 fn0Var) {
        this.a = p2aVar;
        this.b = fn0Var;
        final int i = 0;
        this.d = mpk.w(new zy7(this) { // from class: s2a
            public final /* synthetic */ u2a F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                u2a u2aVar = this.F;
                switch (i2) {
                    case 0:
                        Map map = (Map) u2aVar.c.getValue();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                String str = (String) entry.getKey();
                                String str2 = (String) entry.getValue();
                                t2a.F.getClass();
                                str.getClass();
                                t2a t2aVar = (t2a) t2a.G.get(str);
                                if (t2aVar != null) {
                                    linkedHashMap.put(t2aVar, str2);
                                }
                            }
                        }
                        return linkedHashMap;
                    default:
                        Map map2 = (Map) u2aVar.d.getValue();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tta.d0(map2.size()));
                        for (Map.Entry entry2 : map2.entrySet()) {
                            linkedHashMap2.put(entry2.getKey(), (String) w44.U0(bsg.Y0((String) entry2.getValue(), new String[]{":"}, 6)));
                        }
                        return linkedHashMap2;
                }
            }
        });
        final int i2 = 1;
        this.e = mpk.w(new zy7(this) { // from class: s2a
            public final /* synthetic */ u2a F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                u2a u2aVar = this.F;
                switch (i22) {
                    case 0:
                        Map map = (Map) u2aVar.c.getValue();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                String str = (String) entry.getKey();
                                String str2 = (String) entry.getValue();
                                t2a.F.getClass();
                                str.getClass();
                                t2a t2aVar = (t2a) t2a.G.get(str);
                                if (t2aVar != null) {
                                    linkedHashMap.put(t2aVar, str2);
                                }
                            }
                        }
                        return linkedHashMap;
                    default:
                        Map map2 = (Map) u2aVar.d.getValue();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tta.d0(map2.size()));
                        for (Map.Entry entry2 : map2.entrySet()) {
                            linkedHashMap2.put(entry2.getKey(), (String) w44.U0(bsg.Y0((String) entry2.getValue(), new String[]{":"}, 6)));
                        }
                        return linkedHashMap2;
                }
            }
        });
    }

    public final String a(t2a t2aVar) {
        String str = (String) ((Map) this.e.getValue()).get(t2aVar);
        return "https://www.anthropic.com/legal/".concat(str != null ? "archive/".concat(str) : t2aVar.E);
    }
}

package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zqg implements x5c {
    public final /* synthetic */ int a;
    public final ir8 b;
    public final c61 c;

    public zqg(c61 c61Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = (ir8) c61Var.F;
                this.c = c61Var;
                break;
            default:
                this.c = c61Var;
                this.b = (ir8) c61Var.F;
                break;
        }
    }

    @Override // defpackage.x5c
    public final Set a() {
        switch (this.a) {
            case 0:
                return Collections.singleton(wqg.class);
            default:
                return new HashSet(Arrays.asList(a3h.class, j3h.class, c3h.class, u3h.class, g3h.class));
        }
    }

    @Override // defpackage.x5c
    public final void b(b5c b5cVar) {
        LinkedHashMap linkedHashMapO;
        String str;
        int i = this.a;
        ir8 ir8Var = this.b;
        c61 c61Var = this.c;
        switch (i) {
            case 0:
                ir8Var.d("del", c61Var.o(Collections.EMPTY_MAP), false);
                b5c b5cVar2 = b5cVar.b;
                while (b5cVar2 != null) {
                    b5c b5cVar3 = b5cVar2.e;
                    c61Var.F(b5cVar2);
                    b5cVar2 = b5cVar3;
                }
                ir8Var.c("/del");
                break;
            default:
                if (b5cVar instanceof a3h) {
                    ir8Var.b();
                    ir8Var.d("table", c61Var.o(Collections.EMPTY_MAP), false);
                    c((a3h) b5cVar);
                    ir8Var.c("/table");
                    ir8Var.b();
                } else if (b5cVar instanceof j3h) {
                    ir8Var.b();
                    ir8Var.d("thead", c61Var.o(Collections.EMPTY_MAP), false);
                    c((j3h) b5cVar);
                    ir8Var.c("/thead");
                    ir8Var.b();
                } else if (b5cVar instanceof c3h) {
                    ir8Var.b();
                    ir8Var.d("tbody", c61Var.o(Collections.EMPTY_MAP), false);
                    c((c3h) b5cVar);
                    ir8Var.c("/tbody");
                    ir8Var.b();
                } else if (b5cVar instanceof u3h) {
                    ir8Var.b();
                    ir8Var.d("tr", c61Var.o(Collections.EMPTY_MAP), false);
                    c((u3h) b5cVar);
                    ir8Var.c("/tr");
                    ir8Var.b();
                } else if (b5cVar instanceof g3h) {
                    g3h g3hVar = (g3h) b5cVar;
                    String str2 = g3hVar.g ? "th" : "td";
                    ir8Var.b();
                    f3h f3hVar = g3hVar.h;
                    if (f3hVar != null) {
                        int iOrdinal = f3hVar.ordinal();
                        if (iOrdinal == 0) {
                            str = "left";
                        } else if (iOrdinal == 1) {
                            str = "center";
                        } else if (iOrdinal != 2) {
                            xh6.m("Unknown alignment: ", f3hVar);
                        } else {
                            str = "right";
                        }
                        linkedHashMapO = c61Var.o(Collections.singletonMap("align", str));
                    } else {
                        linkedHashMapO = c61Var.o(Collections.EMPTY_MAP);
                    }
                    ir8Var.d(str2, linkedHashMapO, false);
                    c(g3hVar);
                    ir8Var.c("/".concat(str2));
                    ir8Var.b();
                }
                break;
        }
    }

    public void c(b5c b5cVar) {
        b5c b5cVar2 = b5cVar.b;
        while (b5cVar2 != null) {
            b5c b5cVar3 = b5cVar2.e;
            this.c.F(b5cVar2);
            b5cVar2 = b5cVar3;
        }
    }
}

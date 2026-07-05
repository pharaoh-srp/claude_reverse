package defpackage;

import java.util.EnumSet;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class o91 implements rtc {
    public final /* synthetic */ int a;

    public /* synthetic */ o91(int i) {
        this.a = i;
    }

    @Override // defpackage.rtc
    public final void b(qtc qtcVar) {
        switch (this.a) {
            case 0:
                r91 r91Var = new r91();
                EnumSet.allOf(c7a.class);
                c7a c7aVar = c7a.E;
                c7a c7aVar2 = c7a.F;
                EnumSet enumSetOf = EnumSet.of(c7aVar, c7aVar2);
                if (enumSetOf == null) {
                    mr9.h("linkTypes must not be null");
                } else {
                    HashSet hashSet = new HashSet(enumSetOf);
                    r91Var.a = new fj0(hashSet.contains(c7aVar) ? new jli(0) : null, hashSet.contains(c7a.G) ? new cm4() : null, hashSet.contains(c7aVar2) ? new lja(18) : null);
                    qtcVar.c.add(r91Var);
                }
                break;
            default:
                qtcVar.a.add(new vr1(5));
                break;
        }
    }
}

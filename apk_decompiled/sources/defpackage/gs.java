package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gs implements fs {
    public final fs a;
    public final Instant b;
    public ZoneOffset c;
    public Instant d;

    public gs(fs fsVar, Instant instant) {
        fsVar.getClass();
        this.a = fsVar;
        this.b = instant;
    }

    @Override // defpackage.fs
    public final hs a() {
        return this.a.a();
    }

    @Override // defpackage.fs
    public final void b(y7e y7eVar) {
        Instant instantB;
        Instant instant;
        Instant instant2;
        Instant instant3;
        ZoneOffset zoneOffsetG;
        y7eVar.getClass();
        boolean z = y7eVar instanceof i69;
        if (z) {
            instantB = ((i69) y7eVar).a();
        } else if (y7eVar instanceof jof) {
            List listD = ((jof) y7eVar).d();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                obj.getClass();
                if (obj instanceof se5) {
                    instant3 = ((se5) obj).a;
                } else if (obj instanceof cig) {
                    instant3 = ((cig) obj).a;
                } else {
                    if (!(obj instanceof lng)) {
                        sz6.j(ij0.B("Unsupported type for time: ", obj));
                        return;
                    }
                    instant3 = ((lng) obj).a;
                }
                if (instant3.compareTo(this.b) >= 0) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                pmf.d();
                return;
            }
            Object next = it.next();
            next.getClass();
            if (next instanceof se5) {
                instant = ((se5) next).a;
            } else if (next instanceof cig) {
                instant = ((cig) next).a;
            } else {
                if (!(next instanceof lng)) {
                    sz6.j(ij0.B("Unsupported type for time: ", next));
                    return;
                }
                instant = ((lng) next).a;
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                next2.getClass();
                if (next2 instanceof se5) {
                    instant2 = ((se5) next2).a;
                } else if (next2 instanceof cig) {
                    instant2 = ((cig) next2).a;
                } else {
                    if (!(next2 instanceof lng)) {
                        sz6.j(ij0.B("Unsupported type for time: ", next2));
                        return;
                    }
                    instant2 = ((lng) next2).a;
                }
                if (instant.compareTo(instant2) > 0) {
                    instant = instant2;
                }
            }
            instantB = instant;
        } else {
            if (!(y7eVar instanceof sa9)) {
                xh6.d("Unsupported record ", y7eVar);
                return;
            }
            instantB = ((sa9) y7eVar).b();
        }
        if (z) {
            zoneOffsetG = ((i69) y7eVar).c();
        } else {
            if (!(y7eVar instanceof sa9)) {
                xh6.d("Unsupported record ", y7eVar);
                return;
            }
            zoneOffsetG = ((sa9) y7eVar).g();
        }
        Instant instant4 = this.d;
        if (instant4 == null || instantB.compareTo(instant4) < 0) {
            this.d = instantB;
            this.c = zoneOffsetG;
        }
        this.a.b(y7eVar);
    }
}

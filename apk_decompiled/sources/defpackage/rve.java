package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rve implements m96 {
    public static final long I;
    public final m96 E;
    public final long F;
    public final iuj G;
    public final LinkedHashMap H;

    static {
        lz1 lz1Var = uh6.F;
        I = v40.Q(30, zh6.MINUTES);
    }

    public rve(iuj iujVar) {
        iujVar.getClass();
        this.E = m96.h;
        this.F = I;
        this.G = iujVar;
        this.H = new LinkedHashMap();
    }

    @Override // defpackage.m96
    public final List b(String str) {
        List listP1;
        List listP12;
        str.getClass();
        qve qveVar = (qve) this.H.get(str);
        if (qveVar != null) {
            this.G.getClass();
            long jNanoTime = System.nanoTime();
            lz1 lz1Var = uh6.F;
            if (uh6.d(v40.R(jNanoTime - qveVar.c, zh6.NANOSECONDS), this.F) < 0 && !qveVar.b.isEmpty()) {
                synchronized (qveVar.b) {
                    InetAddress inetAddress = (InetAddress) b54.y0(qveVar.b);
                    if (inetAddress != null) {
                        qveVar.b.add(inetAddress);
                    }
                }
                ArrayList arrayList = qveVar.b;
                synchronized (arrayList) {
                    listP12 = w44.p1(arrayList);
                }
                return listP12;
            }
        }
        List listB = this.E.b(str);
        LinkedHashMap linkedHashMap = this.H;
        ArrayList arrayList2 = new ArrayList(listB);
        this.G.getClass();
        linkedHashMap.put(str, new qve(System.nanoTime(), str, arrayList2));
        synchronized (listB) {
            listP1 = w44.p1(listB);
        }
        return listP1;
    }
}

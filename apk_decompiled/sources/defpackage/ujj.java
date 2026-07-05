package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import okio.Buffer;
import okio.Path;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ujj {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = Path.F;
        Path pathA = Path.Companion.a("/");
        LinkedHashMap linkedHashMapJ0 = sta.j0(new cpc(pathA, new sjj(pathA, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (sjj sjjVar : w44.i1(arrayList, new x8e(20))) {
            if (((sjj) linkedHashMapJ0.put(sjjVar.a, sjjVar)) == null) {
                while (true) {
                    Path path = sjjVar.a;
                    Path pathC = path.c();
                    if (pathC != null) {
                        sjj sjjVar2 = (sjj) linkedHashMapJ0.get(pathC);
                        if (sjjVar2 != null) {
                            sjjVar2.q.add(path);
                            break;
                        }
                        sjj sjjVar3 = new sjj(pathC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMapJ0.put(pathC, sjjVar3);
                        sjjVar3.q.add(path);
                        sjjVar = sjjVar3;
                    }
                }
            }
        }
        return linkedHashMapJ0;
    }

    public static final String b(int i) {
        gb9.q(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:18|134|19|(3:21|(2:53|54)(4:24|146|25|(2:27|(2:36|37)(6:31|132|32|33|35|(1:49)(1:50)))(2:39|40))|(1:65)(1:66))|142|55|56|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b6 A[Catch: all -> 0x014a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:66:0x0149, B:62:0x0142, B:69:0x014e, B:97:0x01a9, B:100:0x01b6, B:95:0x01a4, B:107:0x01c2, B:110:0x01ce, B:111:0x01d5, B:112:0x01d6, B:113:0x01d9, B:114:0x01da, B:115:0x01ef, B:59:0x013d, B:92:0x019f, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:50:0x012c, B:46:0x0125, B:53:0x0130, B:54:0x0135, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:104:0x01ba, B:105:0x01bf), top: B:131:0x000d, inners: #0, #1, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149 A[Catch: all -> 0x014a, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:66:0x0149, B:62:0x0142, B:69:0x014e, B:97:0x01a9, B:100:0x01b6, B:95:0x01a4, B:107:0x01c2, B:110:0x01ce, B:111:0x01d5, B:112:0x01d6, B:113:0x01d9, B:114:0x01da, B:115:0x01ef, B:59:0x013d, B:92:0x019f, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:50:0x012c, B:46:0x0125, B:53:0x0130, B:54:0x0135, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:104:0x01ba, B:105:0x01bf), top: B:131:0x000d, inners: #0, #1, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a9 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:66:0x0149, B:62:0x0142, B:69:0x014e, B:97:0x01a9, B:100:0x01b6, B:95:0x01a4, B:107:0x01c2, B:110:0x01ce, B:111:0x01d5, B:112:0x01d6, B:113:0x01d9, B:114:0x01da, B:115:0x01ef, B:59:0x013d, B:92:0x019f, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:50:0x012c, B:46:0x0125, B:53:0x0130, B:54:0x0135, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:104:0x01ba, B:105:0x01bf), top: B:131:0x000d, inners: #0, #1, #6, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okio.ZipFileSystem c(okio.Path r24, okio.FileSystem r25, defpackage.bz7 r26) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujj.c(okio.Path, okio.FileSystem, bz7):okio.ZipFileSystem");
    }

    public static final sjj d(RealBufferedSource realBufferedSource) throws IOException {
        int iQ0 = realBufferedSource.q0();
        if (iQ0 != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iQ0));
        }
        realBufferedSource.skip(4L);
        short sD = realBufferedSource.d();
        int i = sD & 65535;
        if ((sD & 1) != 0) {
            xh6.c("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        int iD = realBufferedSource.d() & 65535;
        int iD2 = realBufferedSource.d() & 65535;
        int iD3 = realBufferedSource.d() & 65535;
        long jQ0 = ((long) realBufferedSource.q0()) & 4294967295L;
        cae caeVar = new cae();
        caeVar.E = ((long) realBufferedSource.q0()) & 4294967295L;
        cae caeVar2 = new cae();
        caeVar2.E = ((long) realBufferedSource.q0()) & 4294967295L;
        int iD4 = realBufferedSource.d() & 65535;
        int iD5 = realBufferedSource.d() & 65535;
        int iD6 = realBufferedSource.d() & 65535;
        realBufferedSource.skip(8L);
        cae caeVar3 = new cae();
        caeVar3.E = ((long) realBufferedSource.q0()) & 4294967295L;
        String strS = realBufferedSource.s(iD4);
        if (bsg.v0(strS, (char) 0)) {
            xh6.c("bad zip: filename contains 0x00");
            return null;
        }
        long j = caeVar2.E == 4294967295L ? 8L : 0L;
        if (caeVar.E == 4294967295L) {
            j += 8;
        }
        if (caeVar3.E == 4294967295L) {
            j += 8;
        }
        long j2 = j;
        dae daeVar = new dae();
        dae daeVar2 = new dae();
        dae daeVar3 = new dae();
        z9e z9eVar = new z9e();
        e(realBufferedSource, iD5, new vm5(z9eVar, j2, caeVar2, realBufferedSource, caeVar, caeVar3, daeVar, daeVar2, daeVar3));
        if (j2 > 0 && !z9eVar.E) {
            xh6.c("bad zip: zip64 extra required but absent");
            return null;
        }
        String strS2 = realBufferedSource.s(iD6);
        String str = Path.F;
        return new sjj(Path.Companion.a("/").e(strS), isg.h0(strS, "/", false), strS2, jQ0, caeVar.E, caeVar2.E, iD, caeVar3.E, iD3, iD2, (Long) daeVar.E, (Long) daeVar2.E, (Long) daeVar3.E, 57344);
    }

    public static final void e(RealBufferedSource realBufferedSource, int i, pz7 pz7Var) throws IOException {
        Buffer buffer = realBufferedSource.F;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                xh6.c("bad zip: truncated header in extra field");
                return;
            }
            int iD = realBufferedSource.d() & 65535;
            long jD = ((long) realBufferedSource.d()) & 65535;
            long j2 = j - 4;
            if (j2 < jD) {
                xh6.c("bad zip: truncated value in extra field");
                return;
            }
            realBufferedSource.I0(jD);
            long j3 = buffer.F;
            pz7Var.invoke(Integer.valueOf(iD), Long.valueOf(jD));
            long j4 = (buffer.F + jD) - j3;
            if (j4 < 0) {
                xh6.c(grc.p(iD, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    buffer.skip(j4);
                }
                j = j2 - jD;
            }
        }
    }

    public static final sjj f(RealBufferedSource realBufferedSource, sjj sjjVar) throws IOException {
        int iQ0 = realBufferedSource.q0();
        if (iQ0 != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iQ0));
        }
        realBufferedSource.skip(2L);
        short sD = realBufferedSource.d();
        int i = sD & 65535;
        if ((sD & 1) != 0) {
            xh6.c("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        realBufferedSource.skip(18L);
        long jD = ((long) realBufferedSource.d()) & 65535;
        int iD = realBufferedSource.d() & 65535;
        realBufferedSource.skip(jD);
        if (sjjVar == null) {
            realBufferedSource.skip(iD);
            return null;
        }
        dae daeVar = new dae();
        dae daeVar2 = new dae();
        dae daeVar3 = new dae();
        e(realBufferedSource, iD, new tjj(realBufferedSource, daeVar, daeVar2, daeVar3));
        return new sjj(sjjVar.a, sjjVar.b, sjjVar.c, sjjVar.d, sjjVar.e, sjjVar.f, sjjVar.g, sjjVar.h, sjjVar.i, sjjVar.j, sjjVar.k, sjjVar.l, sjjVar.m, (Integer) daeVar.E, (Integer) daeVar2.E, (Integer) daeVar3.E);
    }
}

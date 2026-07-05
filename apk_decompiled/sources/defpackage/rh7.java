package defpackage;

import androidx.health.platform.client.proto.CodedOutputStream$OutOfSpaceException;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.b;
import androidx.health.platform.client.proto.g;
import androidx.health.platform.client.proto.n;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rh7 {
    public static final /* synthetic */ int c = 0;
    public final dbg a = dbg.g();
    public boolean b;

    static {
        new rh7(0);
    }

    public rh7(int i) {
        a();
        a();
    }

    public static void b(b bVar, zej zejVar, int i, Object obj) throws CodedOutputStream$OutOfSpaceException {
        if (zejVar == zej.J) {
            bVar.r(i, 3);
            ((a) obj).c(bVar);
            bVar.r(i, 4);
        }
        bVar.r(i, zejVar.F);
        switch (zejVar.ordinal()) {
            case 0:
                bVar.n(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                bVar.l(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                bVar.v(((Long) obj).longValue());
                break;
            case 3:
                bVar.v(((Long) obj).longValue());
                break;
            case 4:
                bVar.p(((Integer) obj).intValue());
                break;
            case 5:
                bVar.n(((Long) obj).longValue());
                break;
            case 6:
                bVar.l(((Integer) obj).intValue());
                break;
            case 7:
                bVar.h(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof f22)) {
                    bVar.q((String) obj);
                } else {
                    bVar.j((f22) obj);
                }
                break;
            case 9:
                ((a) obj).c(bVar);
                break;
            case 10:
                a aVar = (a) obj;
                bVar.t(((n) aVar).b(null));
                aVar.c(bVar);
                break;
            case 11:
                if (!(obj instanceof f22)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    bVar.t(length);
                    bVar.i(bArr, 0, length);
                } else {
                    bVar.j((f22) obj);
                }
                break;
            case 12:
                bVar.t(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof rxc)) {
                    bVar.p(((Integer) obj).intValue());
                } else {
                    bVar.p(((rxc) obj).E);
                }
                break;
            case 14:
                bVar.l(((Integer) obj).intValue());
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                bVar.n(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                bVar.t((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                bVar.v((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        dbg dbgVar = this.a;
        int size = dbgVar.E.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryD = dbgVar.d(i);
            if (entryD.getValue() instanceof n) {
                ((n) entryD.getValue()).j();
            }
        }
        if (!dbgVar.G) {
            if (dbgVar.E.size() > 0) {
                dbgVar.d(0).getKey().getClass();
                mr9.o();
                return;
            } else {
                Iterator it = dbgVar.e().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    mr9.o();
                    return;
                }
            }
        }
        if (!dbgVar.G) {
            dbgVar.F = dbgVar.F.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(dbgVar.F);
            dbgVar.I = dbgVar.I.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(dbgVar.I);
            dbgVar.G = true;
        }
        this.b = true;
    }

    public final Object clone() {
        rh7 rh7Var = new rh7();
        dbg dbgVar = this.a;
        if (dbgVar.E.size() > 0) {
            Map.Entry entryD = dbgVar.d(0);
            if (entryD.getKey() != null) {
                mr9.o();
                return null;
            }
            entryD.getValue();
            throw null;
        }
        Iterator it = dbgVar.e().iterator();
        if (!it.hasNext()) {
            return rh7Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            mr9.o();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rh7) {
            return this.a.equals(((rh7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public rh7() {
    }
}
